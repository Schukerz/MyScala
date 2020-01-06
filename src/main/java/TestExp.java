public class TestExp {
    public static void main(String[] args){

        String[][][] s = new String[1024][1024][1024];
        System.out.println("最大堆内存: "+Runtime.getRuntime().maxMemory()/1024.0/1024 + "M");
        System.out.println("剩余堆内存: " + Runtime.getRuntime().freeMemory()/1024.0/1024 + "M");
        System.out.println("当前申请堆内存: " + Runtime.getRuntime().totalMemory()/1024.0/1024 + "M");
    }
}
