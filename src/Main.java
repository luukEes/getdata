import java.util.Scanner;
public class Main {
    public static void getData() {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to calculate a sum : ");
        while (true) {
            int nextint = Integer.parseInt(scanner.nextLine());
            i += nextint;
            System.out.println("Type another number");
            if ( nextint == 0) {
                i += nextint;
                System.out.println("your sum is : " + i);
                break; // need to find out why  int i is stil zeeeerooooo!!!!
            }
        }
        System.out.println(i);
    }
        public static void main(String[] args){
        getData();
    }
}
