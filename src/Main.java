public class Main {
    public static void main(String[] args) {
        System.out.println("Задача N1");
//Задача 1
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("iOS");
                break;
            case 1:
                System.out.println("Android");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}