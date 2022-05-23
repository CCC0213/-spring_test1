package util;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class jdbcUtil {
    private static DataSource dataSource;
    private static Connection conn;
    private static InputStream in =null;
    private final static String CONF_NAME="jdbcDruid.properties";


    static{

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


}
