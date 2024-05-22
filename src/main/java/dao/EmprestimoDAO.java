package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import modelo.Emprestimo;
import utils.Utils;

// FEITO POR JOÃO
public class EmprestimoDAO {
    public static ArrayList<Emprestimo> minhaLista = new ArrayList<>();
    
      // retorna a lista com todos os emprestimos
    public ArrayList<Emprestimo> getMinhaLista() {
        minhaLista.clear();
        
         // usando o bloco try catch para tratar possíveis erros
        try {
            // instanciando interface Statement para utilizar métodos SQL
            Statement stmt = Utils.getConexao().createStatement();

            // usando a classe resultSet para utilizar métodos getters do SQL
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos");

            // loop para percorrer todas as linhas da tabela
            while (res.next()) {
                // vai buscar e retornar a lista com todos os objetos 'Emprestimo'
                int idEmprestimo = res.getInt("idEmprestimo");
                int idAmigo = res.getInt("idAmigo");
                int idFerramenta = res.getInt("idFerramenta");
                Date dataEmprestimo = res.getDate("dataEmprestimo");
                Date dataDevolucao = res.getDate("dataDevolucao");
                boolean pendente = res.getBoolean("pendente");

                Emprestimo objeto = new Emprestimo(idEmprestimo, idAmigo, idFerramenta, dataEmprestimo, dataDevolucao, pendente);
                minhaLista.add(objeto);

            }
            res.close();
            stmt.close();
        } catch (SQLException e) {
            // printando o erro específico no console 
            e.printStackTrace();
            return null;
        }
        return minhaLista;
    }
    
     // retorna o Emprestimo procurado pela id
    public Emprestimo carregaEmprestimoPorId(int id) {
        Emprestimo objeto = new Emprestimo();
        objeto.setIdEmprestimo(id);

         // usando o bloco try catch para tratar possíveis erros
        try {
            Statement stmt = Utils.getConexao().createStatement();

            // usando a classe resultSet para utilizar métodos getters referentes a tipos de dado do SQL
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos WHERE idEmprestimo = " + id);
            res.next();

            objeto.setIdAmigo(res.getInt("idAmigo"));
            objeto.setIdFerramenta(res.getInt("idFerramenta"));
            objeto.setDataEmprestimo(res.getDate("dataEmprestimo"));
            objeto.setDataDevolucao(res.getDate("dataDevolucao"));
            objeto.setPendente(res.getBoolean("pendente"));

            stmt.close();

        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }

        return objeto;
    }
    
     // Método para cadastrar novo Emprestimo
    public boolean inserirEmprestimoBD(Emprestimo objeto) {
        // variável para guardar o comando SQL a ser executado pelo método
        String sql = "INSERT INTO tb_emprestimos(idEmprestimo, idAmigo, idFerramenta, dataEmprestimo, dataDevolucao, pendente) VALUES (?,?,?,?,?,?)";

        // usando o bloco try catch para tratar possíveis erros
        try {
            //objeto que representa uma instrução SQL a ser executada
            PreparedStatement stmt = Utils.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getIdEmprestimo());
            stmt.setInt(2, objeto.getIdAmigo());
            stmt.setInt(3, objeto.getIdFerramenta());
            stmt.setDate(4, (java.sql.Date) objeto.getDataEmprestimo());
            stmt.setDate(5, (java.sql.Date) objeto.getDataDevolucao());
            stmt.setBoolean(6, objeto.getPendente());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Erro: " + e);
            throw new RuntimeException(e);
        }
    }
    
    public int maiorID() {
        int maiorID = 0;

        try {
            Statement stmt = Utils.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(idEmprestimo) idEmprestimo FROM tb_emprestimos");

            res.next();
            maiorID = res.getInt("idEmprestimo");
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        }
        
        return maiorID;
    }
    
     //Método para deletar Emprestimo da BD
    public boolean deletarEmprestimoBD (int id) {
         try {
            Statement stmt = Utils.getConexao().createStatement();
            stmt.executeUpdate("DELETE FROM tb_emprestimos WHERE idEmprestimo = " +  id);
            stmt.close();
            
            return true;

        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            throw new RuntimeException(e);
        }
    }
    
    public boolean atualizarEmprestimoBD (Emprestimo objeto) {
        String sql = "UPDATE tb_emprestimos set dataEmprestimo = ? ,dataDevolucao = ? ,pendente = ? WHERE idEmprestimo = ?";
        
        try {
            //objeto que representa uma instrução SQL a ser executada
            PreparedStatement stmt = Utils.getConexao().prepareStatement(sql);
            
            
            stmt.setDate(1,(java.sql.Date) objeto.getDataEmprestimo());
            stmt.setDate(2,(java.sql.Date) objeto.getDataDevolucao());
            stmt.setBoolean(3, objeto.getPendente());
            stmt.setInt(4, objeto.getIdEmprestimo());
            stmt.execute(); // Executando a operação
            
            stmt.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro:" + e);
            throw new RuntimeException(e);
        }
    }
}
