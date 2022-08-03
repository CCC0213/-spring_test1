public class testcontans {
    public static void main(String[] args) {

        String[] aaa ={"aaaa","ssss","scdcd","cccc"};
        String sss="cccc";
        Boolean b =isHave(aaa,sss);
        System.out.println(b);

    }

    public static boolean isHave(String[] s1,String s2){
        int i=s1.length;
        for (int j = 0; j < i; j++) {
            if (s1[j] == s2) {
                return true;
            }
        }
        return false;
    }


}
