public class TestFinally {
    public static void main(String[] args) {
        t();
    }
    public static void t(){
        new X().test();
    }
}
class X{
    public void test() {
        try {
            throw new RuntimeException();
        }catch(Exception e){
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement s: stackTrace) {
                if(s.getMethodName().equals("main")){
                    System.out.println(s.getClassName());
                }
            }
        }

    }
}