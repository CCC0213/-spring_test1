import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testarray {
    public static void main(String[] args) {
        String STLScode = "";
        List listSTLS = new ArrayList<>();
        listSTLS.add("124");//STLS_1
        listSTLS.add("104");//STLS_2
        listSTLS.add("");//STLS_3
        STLScode = listSTLS.size() > 0 ? Collections.max(listSTLS).toString() : "";
        System.out.println(STLScode);

    }
}

