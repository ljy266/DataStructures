public class StringBufferArrayExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("ok");
        StringBuffer[] sb2 = new StringBuffer[10];
        sb2[0] = new StringBuffer("ok2222");
        System.out.println(sb);
        System.out.println(sb2[1]);
    }
}