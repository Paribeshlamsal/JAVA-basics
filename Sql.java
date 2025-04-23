import java.sql.*;

public class Sql {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("","","");
            Statement st=con.createStatement();
            int result=st.executeUpdate("insert into student value(1,'Ram','Chitwan')");
            System.out.println(result+"Row is inserted");
            st.close();
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    
}