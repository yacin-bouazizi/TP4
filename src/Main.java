import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        magasin p=new magasin();
        Date d=new Date("2000/4/13");
        Date d2=new Date();
        Date d3=new Date("31/4/2024");
        magasin p1=new magasin(1021,"lait","delice",0,d2);
        magasin p2=new magasin(2510,"yaourt","vitalait",0,d);
        magasin p3=new magasin(3250,"tomate","sicam",1.200,d);

        //saisie un produit
        System.out.println("donner identifer de la produit :");
        p.identif=reader.nextInt();

        System.out.println("donner libelle de la produit :");
        p.lib=reader.next();

        System.out.println("donner marque de la produit :");
        p.marque=reader.next();

        System.out.println("donner prix de la produit :");
        p.prix=reader.nextDouble();

        p1.aff();
        p2.aff();
        p3.aff();
        p.aff();//aff le produit saisie


    }

}