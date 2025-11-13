import java.util.Scanner;

public class Ahoj {
    Scanner sc = new Scanner(System.in);
    public void prevod(){
        System.out.print("Zadejte jmeno ");
        String jmeno = sc.nextLine();
        for(int i=0;i<jmeno.length();i++){
            jmeno.toUpperCase();
        }
        System.out.print(jmeno);
    }
    public void pocet(){
        int znak = 0;
        int mezera = 0;
        System.out.print("Zadejte retezec: ");
        String retezec = sc.nextLine();
        for(int i=0;i<retezec.length();i++){
            if(retezec.charAt(i)==' '){
                mezera++;
            }
            if(retezec.charAt(i)!=' '){
                znak++;
            }
        }
        System.out.print("Pocet znaku: "+znak+", Pocet mezer: "+mezera);
    }
    public void zacatekAKonec(){
        System.out.print("Zadejte retezec: ");
        String retezec = sc.nextLine();
        for(int i=0;i<retezec.length();i++){
            if(i==0){
                System.out.print("První písmeno: "+retezec.charAt(i));
            }
            if(i==retezec.length()-1){
                System.out.print(", Poslední písmeno: "+retezec.charAt(i));
            }
        }
    }
    public void nalezSlovo() {
        System.out.print("Zadejte retezec: ");
        String retezec = sc.nextLine();
        System.out.print("Zadejte slovo, ktere chces najit: ");
        String hledaneSlovo = sc.nextLine();
        retezec = retezec.toLowerCase();
        hledaneSlovo = hledaneSlovo.toLowerCase();

            int pocatecniIndex = 0;
            int indexNalezenehoSlova = -1;
            int pocetVyskytu = 0;
            do {
                indexNalezenehoSlova = retezec.toLowerCase().indexOf(hledaneSlovo.toLowerCase(),  pocatecniIndex);
                pocatecniIndex = indexNalezenehoSlova+hledaneSlovo.length();
                System.out.println(indexNalezenehoSlova);
            } while (indexNalezenehoSlova != -1);
    }

    public void domeny(){
        System.out.print("Zadejte email: ");
        String email = sc.nextLine();
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                int cislo = i;
                System.out.println("Uzivatelske jmeno: "+email.substring(0,cislo));
                System.out.println("Domenova cast: "+email.substring(cislo+1));
            }
        }
    }


}
