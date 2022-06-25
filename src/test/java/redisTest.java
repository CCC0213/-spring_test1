import com.cqt.dao.user;
import redis.clients.jedis.Jedis;
import util.jdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class redisTest {
    private static Connection connection;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) {

        List<user> ls =new ArrayList<>();
        String sql1="select * from reportdb.user";
        connection=jdbcUtil.getConn();
        Jedis jedis =new Jedis("192.168.44.131",6379);
        try {
            preparedStatement=connection.prepareStatement(sql1);
            ResultSet rest= preparedStatement.executeQuery();
            jedis.auth("123456");
            while (rest.next()) {
                String a = rest.getString(1);
                String b = rest.getString(2);
                String c = rest.getString(3);

                jedis.set(a,b);

            }
            System.out.print(jedis.get("3"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
