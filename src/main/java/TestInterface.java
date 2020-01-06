public class TestInterface {
    public static void main(String[] args){
        I i = new H();
        I ii = new J();
        System.out.println(ii.getClass().getInterfaces().length);
    }
}
class J extends H{

}
class H implements I{

}
interface I{

}
