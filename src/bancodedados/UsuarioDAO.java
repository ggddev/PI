package bancodedados;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class UsuarioDAO {
    Connection cxc;
    PreparedStatement ps = null;
    ResultSet rs;
    
    public boolean conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cxc = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PI", "ggdDev", "GuiProgramador21@!");
            return true;
        } catch(ClassNotFoundException | SQLException e){
            return false;
        }
    }
    
    public int inserir(Usuario usuario){
        int status;
        try{
            ps = cxc.prepareStatement("INSERT INTO usuario(nome, email, cpf, endereco, idade, numCard, senha, eAdm) VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getCpf());
            ps.setString(4, usuario.getEndereco());
            ps.setInt(5, usuario.getIdade());
            ps.setInt(6, usuario.getNumCard());
            ps.setString(7, usuario.getSenha());
            ps.setBoolean(8, usuario.iseAdm());
            status = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
            return status;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Falha ao inserir dados. Por favor, tente novamente. " + e.getMessage());
            return e.getErrorCode();
        }
    }
    
    public Usuario validarUsuario(Usuario u){
        Usuario user = null;
        try{
            ps = cxc.prepareStatement("SELECT * FROM Usuario WHERE email = ? AND senha = ?");
            ps.setString(1, u.getEmail());
            ps.setString(2, u.getSenha());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                user = new Usuario();
                user.setNome(rs.getString("nome"));
                user.setEmail(rs.getString("email"));
                user.setCpf(rs.getString("cpf"));
                user.setEndereco(rs.getString("endereco"));
                user.setIdade(rs.getInt("idade"));
                user.setNumCard(rs.getInt("numCard"));
                user.setSenha(rs.getString("senha"));
                user.seteAdm(rs.getBoolean("eAdm"));
            }
        } catch(SQLException e){
            System.out.println("Erro. Falha ao conectar.");
        }
        return user;
    }
            
    public void desconectar(){
        try{
            cxc.close();
        } catch(SQLException e){}
    }
}
