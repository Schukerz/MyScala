public class TestNull {
    public static void main(String[] args) {
        User100 u = new User100();
        System.out.println(u.age);
        addOne(u.age);


    }
    public static int addOne(int a){
        return a+1;
    }
}
class User100{
    public Integer age;

}
