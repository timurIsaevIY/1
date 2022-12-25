import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int array[] = new int[4];
        System.out.println("Insert 4 array elements:");

        for (int i = 0; i < 4; i++) {
            array[i] = input.nextInt();
        }
        int max =-10^6;
        for (int i = 0; i < 4; i++) {
            if(array[i]>max){
                max=array[i];
            }

        }
        System.out.println(max);
}}