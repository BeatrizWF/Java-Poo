package JAVAPOOBD2;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.Connection;
public class Main {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-J3VM4A85:1433;instanceName=SQLEXPRESSDB;databaseName=BD");
            System.out.println("Conexão concluída com sucesso ");
            Statement statement = conn.createStatement();
            // criando tabela
            statement.execute("CREATE TABLE IF NOT EXISTS NOMES( ID INTEGER primary key autoincrement , NOME VARCHAR )");
            
            // inserindo registros

            statement.execute("INSERT  INTO NOMES (NOME) VALUES ('BIA')");
            statement.executeUpdate("Update NOMES set NOME = ('IZADORA')");// nomesc set nome = 'IZADORA' + where Idc =  3
            //lendo os registros
            PreparedStatement stmt = conn.prepareStatement("select * from NOMES");
            ResultSet resultSet = stmt.executeQuery();

            statement.execute("DELETE FROM NOMES\n" + "WHERE ID = 1");

            while (resultSet.next()) {
                Integer id = resultSet.getInt("ID");
                String nome = resultSet.getString("NOMES");
                System.out.println( id + " - " + nome);
            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
