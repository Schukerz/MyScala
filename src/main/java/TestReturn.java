public class TestReturn {
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static int test(){
        int i = 0;
        try{
            return i++;
        }finally{
            return ++i;
        }
    }
    //1.refVal = 0;
    //2.i=1;
    //3.returnVal=refVal
    //4.i=2;
    //5.refVal = 2
    //6.returnVal=refVal
}
