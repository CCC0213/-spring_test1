
import java.util.UUID;

public class uuidTest {
    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString().replace("-","");
        System.out.print(uuid);
    }



}
