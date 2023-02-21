import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the list: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int index = 0;

        System.out.println("Dizinin boyutu n: " + length);
        System.out.println("Dizinin elemanlarını giriniz: ");

        while(index < length){
            System.out.println((index + 1) + ". elemanı giriniz: ");
            int element = scanner.nextInt();
            array[index] = element;
            index++;
        }

        Arrays.sort(array);

        System.out.println("Sıralama: " + Arrays.toString(array));

    }
}
