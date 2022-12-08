package DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Text_Read {
	static String Title;
	static String Author;
	static String Paragraph;
	int id;

	public static ArrayList<String> errorlist = new ArrayList<String>();
	public static ArrayList<String> errorlist2 = new ArrayList<String>();

	public void connection_FUN(ArrayList getWord) {
		errorlist.clear();

		try {
			Connection connectionString = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker", "root", "");
			String sqlQuery1 = "SELECT * FROM word WHERE words LIKE '" + getWord + "'";
			
			for (int i = 0; i < getWord.size(); i++) {
				PreparedStatement ps = connectionString
						.prepareStatement(sqlQuery1);

				ResultSet rs = ps.executeQuery();

				if (rs.next()) {

				} else {

					errorlist.add((String) getWord.get(i));

				}
			}
			

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void connection(ArrayList words) {
		errorlist2.clear();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker", "root", "");

			
			for (int i = 0; i < words.size(); i++) {
				String sqlQuery2 = "SELECT * FROM mutants WHERE Word LIKE '" + words.get(i) + "'";
				PreparedStatement ps = con.prepareStatement(sqlQuery2);

				ResultSet rs = ps.executeQuery();

				if (rs.next()) {

					errorlist2.add((String) words.get(i));

				} else {

				}
			}
			con.close();

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public String connection3(String word) {

		int id = 0;
		String Nword = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker", "root", "");
			String sqlQuery3 = "SELECT * FROM mutants WHERE Word LIKE '" + word + "'";
			PreparedStatement ps = con.prepareStatement(sqlQuery3);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				id = (int) rs.getObject("F_Key");

			} else {

			}
			String sqlQuery4 = "SELECT * FROM word WHERE word_id = '" + id + "'";
			
			PreparedStatement ps1 = con.prepareStatement(sqlQuery4);

			ResultSet rs1 = ps1.executeQuery();

			if (rs1.next()) {

				Nword = (String) rs1.getObject("words");

			}

			con.close();

		} catch (SQLException e) {
			System.out.println(e);
		}

		return Nword;
	}

	public ArrayList<String> ErrorList() {

		return errorlist;
	}

	public ArrayList<String> ErrorList2() {

		return errorlist2;
	}

}
