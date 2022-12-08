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

	public void FetchingWords(ArrayList getWord) {
		errorlist.clear();

		try {
			Connection connectionString = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker",
					"root", "");
			String sqlQuery1 = "SELECT * FROM word WHERE words LIKE '" + getWord + "'";

			for (int i = 0; i < getWord.size(); i++) {
				PreparedStatement preparedstatement = connectionString.prepareStatement(sqlQuery1);

				ResultSet executeQuery = preparedstatement.executeQuery();

				if (executeQuery.next()) {

				} else {

					errorlist.add((String) getWord.get(i));

				}
			}
			connectionString.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void FetchingMutants(ArrayList words) {
		errorlist2.clear();

		try {
			Connection connectionString = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker",
					"root", "");

			for (int i = 0; i < words.size(); i++) {
				String sqlQuery2 = "SELECT * FROM mutants WHERE Word LIKE '" + words.get(i) + "'";
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
		String getWords = null;
		try {
			Connection connectionString = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker",
					"root", "");
			String sqlQuery3 = "SELECT * FROM mutants WHERE Word LIKE '" + word + "'";
			PreparedStatement preparedStatement = connectionString.prepareStatement(sqlQuery3);

			ResultSet executeQuery = preparedStatement.executeQuery();

			if (executeQuery.next()) {
				id = (int) executeQuery.getObject("F_Key");

			} else {

			}
			String sqlQuery4 = "SELECT * FROM word WHERE word_id = '" + id + "'";

			PreparedStatement statement = connectionString.prepareStatement(sqlQuery4);

			ResultSet executeQuery1 = statement.executeQuery();

			if (executeQuery1.next()) {

				getWords = (String) executeQuery1.getObject("words");

			}

			connectionString.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return getWords;
	}

	public ArrayList<String> ErrorList() {

		return errorlist;
	}

	public ArrayList<String> ErrorList2() {

		return errorlist2;
	}

}
