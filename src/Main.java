
// public class hello3 {
//     public static void main(String[] arguments) {
//         double score = 1.2 + 4.5 * 6.4;
//         System.out.println(score);
//         score = score / 2.0;
//         System.out.println(score);
//     }
// }
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
    double area, length, width;
    System.out.println("Enter length and width : ");
    length = input.nextDouble();
    width = input.nextDouble();
    area = length * width;
    System.out.println("The area of the rectangle =" + area);
    }
    }

}
