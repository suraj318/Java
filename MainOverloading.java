public class MainOverloading {
    public static void main(double args) {
        System.out.println(args);
    }

    public static void main(int args) {
        System.out.println(args);
    }

    public static void main(String args) {
        System.err.println(args);
    }


    //Original Main Method
    public static void main(String[] args) {
        main(10);
        main(12.34);    
        main("suraj");
    }

}
