public class TestGc {
    public static void main(String[] args) {
        MyObject myObject1 = new MyObject();
        MyObject myObject2 = new MyObject();
        myObject1.ref = myObject2;
        myObject2.ref = myObject1;
        myObject1=null;
        myObject2 = null;
    }
}
class MyObject{
    public MyObject ref;
}