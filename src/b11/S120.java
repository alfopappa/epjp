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

    public List<Coder> getCoders() throws SQLException {
        try (Connection conn = ods.getConnection(); //
                Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT first_name FROM coders ORDER BY 1");

            List <Coder> results = new ArrayList<>();
            while (rs.next()) {
            	results.add(new Coder(rs.getString(1), rs.getString(2), rs.getInt(3)));
            }
            return results;
        }
    }        

    public static void main(String[] args) {
        try {
            S120 sample = new S120();
            List<Coder> coders = sample.getCoders();

            System.out.println("Coder names are: " + coders);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

    }

}


class Coder{
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getSalary() {
		return salary;
	}
	private String firstName;
	private String lastName;
	private int salary;
	public Coder(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Coder [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
}
