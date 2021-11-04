package JAVAPOOBD2;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.Connection;
public class Main {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-J3VM4A85:1433;instanceName=SQLEXPRESSDB;databaseName=BD");
            System.out.println("Conexão concluída com sucesso ");
            Statement statement = conn.createStatement();
            // criando tabela
            statement.execute("CREATE TABLE IF NOT EXISTS teste (id INTEGER primary key autoincrement , Nome VARCHAR )");
            

            PreparedStatement preparedstatementinsert = conn.prepareStatement("INSERT into teste (id, Nome) values(?,?)");
            preparedstatementinsert.setString(1, "Beatriz");
            preparedstatementinsert.setString(2, "Bia");
            preparedstatementinsert.setString(3, "Bea");
            PreparedStatement preparedstatementdelete = conn.prepareStatement("delete from teste where id = ?");
            preparedstatementdelete.setString(3, "Bea");
            PreparedStatement preparedstatementupdate = conn.prepareStatement("update teste SET Nome = ? where id = ?");
            preparedstatementupdate.setString(2, "Beams");

			preparedstatementinsert.executeUpdate();
            preparedstatementdelete.executeUpdate();
            preparedstatementupdate.executeUpdate();


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}


