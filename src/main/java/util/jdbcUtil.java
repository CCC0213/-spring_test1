package util;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class jdbcUtil {
    private static DataSource dataSource;
    private static Connection conn;
    private static InputStream in =null;
    private final static String CONF_NAME="jdbcDruid.properties";
    private static ThreadLocal<Connection> threadLocal;

    static{
        threadLocal=new ThreadLocal<Connection>();
        Properties pro =new Properties();

        try {
            pro.load(jdbcUtil.class.getClassLoader().getResourceAsStream(CONF_NAME));
            dataSource=DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static Connection getConn() {
        Connection conn=threadLocal.get();
        try {
            if(conn==null) {
                conn = dataSource.getConnection();
                threadLocal.set(conn);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }
    /**
     * 开启事务
     * @throws SQLException
     */
    public static void beginTranscation() throws SQLException {
        Connection connection=getConn();
        connection.setAutoCommit(false);
    }
    /**
     * 提交事务
     * @throws SQLException
     */
    public static void commitTranscation() throws SQLException {
        Connection connection=getConn();
        connection.commit();
    }
    /**
     * 回滚事务
     * @throws SQLException
     */
    public static void rollbackTranscation() throws SQLException{
        Connection connection=getConn();
        connection.rollback();
    }

    public static void closeAll(Connection conn, PreparedStatement pstm){

        if(pstm != null){
            try {
                pstm.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

}
