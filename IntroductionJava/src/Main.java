import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextInt();
        double n2 = sc.nextInt();
        double n3 = sc.nextInt();
        double n4 = sc.nextInt();

        double media = (n1+n2+n3+n4)/4;

        if(media >= 7) {
            System.out.println("APROVADO");
        } else {
            if(media>=4){
                System.out.println("PROVA FINAL");
            }else {
                System.out.println("REPROVADO");
            }
        }
    }
}