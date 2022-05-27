import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı Gir: ");
        int num = sc.nextInt();
        int min = list[0];
        int max = num;
        for(int i : list){
            if(i<num){
                min = i;
            }
            if(i>num){
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :"+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+max);

    }
}
