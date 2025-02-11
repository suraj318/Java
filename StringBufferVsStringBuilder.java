public class StringBufferVsStringBuilder {

    public static void main(String[] args) {
        
        StringBuffer sb= new StringBuffer("Hello");

        sb.append( " World");
        System.out.println(sb);

        StringBuilder sbb= new StringBuilder("Hello");
        sbb.append(" World");
        System.out.println(sbb);
    }

}
