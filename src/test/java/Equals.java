public class Equals {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="李华";
        p1.age=16;
        Person p2=new Person();
        p2.name="zasxc";
        p2.age=18;
        /*System.out.println("p1==p2的结果为："+(p1==p2));
        System.out.println("p1.name.equals(p2.name)结果为："+p1.name.equals(p2.name));
        System.out.println("p1.equals(p2)结果为："+p1.equals(p2));*/
        System.out.println(p1);
        System.out.println(p2);
    }

}
class Person{
    static String name;
    int age;
    public String toString() {
        return "Name:" + name + ", Age:" + age;
    }
}
