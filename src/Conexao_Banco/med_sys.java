
package Conexao_Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class med_sys {

     public Connection connection = null;
     private final String DRIVER = "com.mysql.cj.jdbc.Driver";
     private final String NOMEBANCO = "med_sys";
     private final String LOCAL = "jdbc:mysql://localhost:3306/" +NOMEBANCO;
     private final String LOGIN = "root";
     private final String SENHA = "root";

    /**
     metodo que faz conexão com o banco de dados
     retorna true se houve sucesso, false caso negativo
    */

     public boolean getConnection(){

        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(LOCAL, LOGIN, SENHA);
            System.out.println("Conectou");
            return true;
        }

        catch (ClassNotFoundException erro){
            System.out.println("Driver nao encontrado " + erro.toString());
            return false;
        }

        catch (SQLException erro){
            System.out.println("Falha ao conectar " + erro.toString());
            return false;
        }
    }
}
