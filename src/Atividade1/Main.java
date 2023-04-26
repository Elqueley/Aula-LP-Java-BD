package Atividade1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner (System.in);
		
		String dbURL = "jdbc:mysql://localhost:3306/ATIVIDADE";
		String username= "root";
		String password = "";
		
		Connection conn = null;
		conn = (Connection) DriverManager.getConnection(dbURL, username, password);
		
		if (conn != null) {
			System.out.println("Conectado");
		}
		
		
		System.out.println("Digite seu nome");
		String nome = sc.nextLine();
		
		System.out.println("Digite seu cpf");
		String cpf = sc.nextLine();
		
		System.out.println("Digite seu data de nascimento");
		String data = sc.nextLine();
		
		System.out.println("Digite seu endereco");
		String endereco = sc.nextLine();
		
		
		
		String sql = "INSERT INT PESSOA (NOME,CPF,DATA_NASCIMENTO,ENDERECO) VALUES (?,?,?,?)";
		PreparedStatement statement = conn.prepareStatement(sql); 
		
		statement.setString(1, nome);
		statement.setString(2, cpf);
		statement.setString(3, data);
		statement.setString(4, endereco);
		
		int rowsInserted = statement.executeUpdate();
		
	}

}
