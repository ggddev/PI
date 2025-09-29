package bancodedados;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class ProdutoDAO {
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
    
    public int inserir(Produto prod){
        int status;
        try{
            ps = cxc.prepareStatement("INSERT INTO Produto(titulo, preco, cor, descricao) VALUES(?,?,?,?)");
            ps.setString(1, prod.getTitulo());
            ps.setDouble(2, prod.getPreco());
            ps.setString(3, prod.getCor());
            ps.setString(4, prod.getDescricao());
            status = ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.");
            return status;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Falha ao inserir dados. Por favor, tente novamente. " + e.getMessage());
            return e.getErrorCode();
        }
    }
    
    public List<Produto> getProd(String produto){
        try{
            ps = this.cxc.prepareStatement("SELECT * FROM Produto WHERE titulo LIKE ?");
            ps.setString(1, "%" + produto + "%");
            rs = ps.executeQuery();
            List<Produto> listaProd = new ArrayList<>();
            
            while(rs.next()){
                Produto prod = new Produto();
                prod.setTitulo(rs.getString("titulo"));
                prod.setPreco(rs.getDouble("preco"));
                prod.setCor(rs.getString("cor"));
                prod.setDescricao(rs.getString("descricao"));
                
                listaProd.add(prod);
            }
            return listaProd;
        } catch(Exception e){
            return null;
        }
    }
    
    public boolean excluir(String titulo){
        try{
            ps = cxc.prepareStatement("DELETE FROM Produto WHERE titulo = ?");
            ps.setString(1, titulo);
            ps.executeUpdate();
            return true;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Falha ao deletar dados. Tente novamente. " + e.getMessage());
            return false;
        }
    }
    
    public void desconectar(){
        try{
            cxc.close();
        } catch(SQLException e){}
    }
}
