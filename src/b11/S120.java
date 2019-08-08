package b11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.pool.OracleDataSource;

public class S120 {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
    private static final String USER = "me";
    private static final String PASSWORD = "password";

    private OracleDataSource ods;

    public S120() throws SQLException {
        ods = new OracleDataSource();

        ods.setURL(URL);
        ods.setUser(USER);
        ods.setPassword(PASSWORD);
    }

    public List<String> getCoderNames() throws SQLException {
        try (Connection conn = ods.getConnection(); //
                Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT first_name FROM coders ORDER BY 1");

            List<String> results = new ArrayList<String>();
            while (rs.next()) {
                results.add(rs.getString(1));
            }
            return results;
        }
    }

    public static void main(String[] args) {
        try {
            S120 sample = new S120();
            List<String> names = sample.getCoderNames();

            System.out.println("Coder names are: " + names);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

    }
}
