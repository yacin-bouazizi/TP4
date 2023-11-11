import java.util.Date;
public class magasin {
    int identif;
    String lib;
    String marque;
    double prix;
    Date date_ex;
    public magasin(){
    }
    public magasin(int identif,String lib,String marque,double prix,Date d){
        this.identif=identif;
        this.lib=lib;
        this.marque=marque;
        this.prix=prix;
        this.date_ex=d;
    }
    public void aff(){
        System.out.println("identifier :  "+identif+" "+"libelle : "+lib+" "+"la marque : "+marque+" "+"prix : "+prix+" "+"la date est :  "+date_ex);
        System.out.println(date_ex);
    }
    public String toString(){
        return
                "identifier :  "+identif+" "+"libelle :  "+lib+" "+"la marque :  "+marque +" "+"prix : "+prix;

    }

    public void setDate_ex(Date d) {
        this.date_ex =d;
    }
}
