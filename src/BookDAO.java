import java.sql.*;

public class BookDAO {

    public void addBook(Book book) throws SQLException {
        String sql = "INSERT INTO book(title, author, year) VALUES (?, ?, ?)";

        Connection conn = dbconnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, book.getTitle());
        ps.setString(2, book.getAuthor());
        ps.setInt(3, book.getYear());

        ps.executeUpdate();
        conn.close();
    }

    public void getAllBooks() throws SQLException {
        String sql = "SELECT * FROM book";

        Connection conn = dbconnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("title") + " | " +
                            rs.getString("author") + " | " +
                            rs.getInt("year")
            );
        }
        conn.close();
    }

    public void updateBook(int id, String newTitle) throws SQLException {
        String sql = "UPDATE book SET title = ? WHERE id = ?";

        Connection conn = dbconnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, newTitle);
        ps.setInt(2, id);

        ps.executeUpdate();
        conn.close();
    }

    public void deleteBook(int id) throws SQLException {
        String sql = "DELETE FROM book WHERE id = ?";

        Connection conn = dbconnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, id);
        ps.executeUpdate();
        conn.close();
    }
    public void sortBooks(String columnName, String order) throws Exception {
        String sql = "SELECT * FROM book ORDER BY " + columnName + " " + order;

        Connection conn = dbconnection.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println("Books sorted by " + columnName + " " + order + ":");
        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("title") + " | " +
                            rs.getString("author") + " | " +
                            rs.getInt("year")
            );
        }

        conn.close();
    }

    public void addColumn(String columnName, String columnType) throws Exception {
        String sql = "ALTER TABLE book ADD COLUMN " + columnName + " " + columnType;

        Connection conn = dbconnection.getConnection();
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        conn.close();

    }
}
