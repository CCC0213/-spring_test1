import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import static java.util.Arrays.*;
/**
　　* @description:labada练习
　　* @return
　　* @throws
　　* @author cqt
　　* @date 20220727
　　*/
public class labada {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("zhangsan","lisi","wangwu");
        /*name.sort((a,b) -> a.compareTo(b));
        int[] aaa= new int[]{1,2,3,6,7};
        IntPredicate ppp  = s -> s>5;
        int[] aaa2 = Arrays.stream(aaa).filter(ppp).toArray();
        System.out.println(Arrays.toString(aaa2));*/
        //name.stream().filter(s -> s.endsWith("n")).forEach(System.out ::println);
        name.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}



