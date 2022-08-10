import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelAndUnderLineConverter {
    private static Pattern linePattern = Pattern.compile("_(\\w)");
              public static String lineToHump(String str) {
                 str = str.toLowerCase();
                 Matcher matcher = linePattern.matcher(str);
                 StringBuffer sb = new StringBuffer();
                 while (matcher.find()) {
                         matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
                     }
                 matcher.appendTail(sb);
                 return sb.toString();
             }

    public static void main(String[] args) {
        String a =CamelAndUnderLineConverter.lineToHump("prod_inst_id");
        System.out.println(a);

    }

}
