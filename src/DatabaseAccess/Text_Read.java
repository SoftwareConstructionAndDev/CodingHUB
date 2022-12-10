package DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Text_Read {

	int id;

	public static ArrayList<String> errorlist = new ArrayList<String>();
	public static ArrayList<String> errorlist2 = new ArrayList<String>();

	public void FetchingWords(ArrayList getWord) {
		errorlist.clear();

		try {
			Connection connectionString = DriverManager.getConnection("jdbc:mysql://localhost:3306/aqsababar", "root",
					"");

			for (int i = 0; i < getWord.size(); i++) {
				String sqlQuery1 = "SELECT * FROM word WHERE words LIKE '" + getWord.get(i) + "'";
				PreparedStatement preparedstatement = connectionString.prepareStatement(sqlQuery1);

				ResultSet executeQuery = preparedstatement.executeQuery();

				if (executeQuery.next()) {

				} else {

					errorlist.add((String) getWord.get(i));

				}
			}
			connectionString.close();
			System.out.println(errorlist.size());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void FetchingMutants(ArrayList words) {
		errorlist2.clear();

		try {
			Connection connectionString = DriverManager.getConnection("jdbc:mysql://localhost:3306/aqsababar", "root",
					"");

			for (int i = 0; i < words.size(); i++) {
				String sqlQuery2 = "SELECT * FROM mutant WHERE Word LIKE '" + words.get(i) + "'";
				PreparedStatement preparedstatement = connectionString.prepareStatement(sqlQuery2);

				ResultSet executeQuery = preparedstatement.executeQuery();

				if (executeQuery.next()) {

					errorlist2.add((String) words.get(i));

				} else {

				}
			}
			connectionString.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String FetchingAlternativeWords(String word) {

		int id = 0;
		String Nword = null;
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aqsababar", "root", "");

			PreparedStatement preparedstatment = con.prepareStatement("SELECT * FROM mutants WHERE Word LIKE '" + word + "'");

			ResultSet result = preparedstatment.executeQuery();

			if (result.next()) {
				id = (int) result.getObject("F_Key");

			} else {

			}

			PreparedStatement preparedstatment1 = con.prepareStatement("SELECT * FROM word WHERE word_id = '" + id + "'");

			ResultSet result1 = preparedstatment1.executeQuery();

			if (result1.next()) {

				Nword = (String) result1.getObject("words");

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
