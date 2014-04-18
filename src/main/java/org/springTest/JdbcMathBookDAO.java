package org.springTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by moshiks on 4/18/14.
 */
public class JdbcMathBookDAO implements IMathBookDAO {
    private DataSource dataSource;

    @Override
    public void insertMathBook(MathBook mBook) {
        final String insertSql = "INSERT INTO mathBook " +
                "(titleName, author, pagesNumber, price, level, totalExerciseNum, isHasFormulas)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(insertSql);
            ps.setString(1, mBook.getTitleName());
            ps.setString(2, mBook.getAuthor());
            ps.setInt(3, mBook.getPagesNumber());
            ps.setDouble(4, mBook.getPrice());
            ps.setString(5, mBook.getLevel());
            ps.setInt(6, mBook.getTotalExerciseNum());
            ps.setBoolean(7, mBook.isHasFormulas());
            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
