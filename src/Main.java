import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ahoj ahoj = new Ahoj();
        //ahoj.prevod();
        //ahoj.pocet();
        //ahoj.zacatekAKonec();
        //ahoj.nalezSlovo();
        //ahoj.domeny();

        /*Ukol 1
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" World");
        System.out.println(sb1);
        */
        /*UKOL 2
        StringBuffer sb2 =new StringBuffer("Javaprogramovani");
        sb2.insert(4,'-');
        System.out.println(sb2);
        */
        /*Ukol 3
        StringBuffer sb = new StringBuffer("NevimcoDelat");
        sb.delete(0,5);
        System.out.println(sb);

         */
        /*Ukol 4
        StringBuffer sb = new StringBuffer("program");
        sb.deleteCharAt(2);
        System.out.println(sb);
        */
        /*Ukol5
        StringBuffer sb1 = new StringBuffer("Jmeno: adam,");
        StringBuffer sb2 = new StringBuffer("vek: 18");
        System.out.println(sb1 +" "+ sb2);
        */
        /*Ukol6
        StringBuffer sb = new StringBuffer("Dobry den");
        sb.replace(0,5,"Dobrý");
        System.out.println(sb);
        */
        /*Ukol7
        StringBuffer sb = new StringBuffer("kocka");
        sb.replace(0,1,"K");
        System.out.println(sb);
    */

        /*Ukol8
        StringBuffer sb = new StringBuffer("ABCDE");
        sb.reverse();
        System.out.println(sb.toString());
    */
        /*Ukol9
        StringBuffer sb = new StringBuffer("Moje auto je modre auto");
        System.out.println(sb.indexOf("auto"));

         */
        /*Ukol10
        StringBuffer sb = new StringBuffer("Informatika");

        System.out.println(sb.substring(0,5));
         */
        /*Ukol11
        StringBuffer sb = new StringBuffer(3);
        sb.append("Hello");

        System.out.println(sb.toString());
         */
        /*Ukol12
        StringBuffer sb = new StringBuffer("Test");
        System.out.println(sb.length()+" "+ sb.capacity());
        sb.trimToSize();

        System.out.println(sb.length()+" "+ sb.capacity());
         */
        /*Ukol 13
        StringBuffer sb = new StringBuffer("Cena je 345 korun");

        char firstDigit = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                firstDigit = sb.charAt(i);
                break;
            }
        }

        System.out.println("První číslice v textu je: " + firstDigit);
         */
        /*Ukol14
        StringBuffer sb = new StringBuffer("Hodnota: 50 korun.");
        //sb.trimToSize();
        String cislo= "0123456789";
        String c ="";
        int zacatek=0;
        int konec=0;
        for(int i = 0; i < sb.length(); i++){
            if(Character.isDigit(sb.charAt(i))){
                c+=sb.charAt(i);
                zacatek=i;
                for(int j = i; j < sb.length(); j++){
                    if(Character.isAlphabetic(sb.charAt(j))){
                        konec=j-1;
                    }
                }
            }
        }
        int dvojnasobek =Integer.valueOf(c)*2;

        sb.replace(zacatek,konec,c);
        System.out.println(sb);*/


        //KOMPLIOVANE UKOLY

        /*Ukol1
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("");
        for (int i = 1; i <= 100000; i++) {
            sb.insert(0,'x');
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        long start1 = System.currentTimeMillis();
        String x="";
        for (int i = 1; i <= 100000; i++) {
            x=x+"x";
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start1);

         */

        /*Ukol2
        boolean power = true;
        while(power) {
            System.out.println("Zadejte slovo: ");
            String x = sc.nextLine();
            String z ="";
            String a="";
            StringBuffer sb = new StringBuffer(x);
            for (int i=0;i<sb.length();i++){
                if (i==sb.length()-1){
                    z = String.valueOf(sb.charAt(i));
                }
            }
            System.out.println(z);

            System.out.println("zadejte slovo: ");
            String y = sc.nextLine();
            StringBuffer sb1 = new StringBuffer(y);
            for (int j=0;j<sb1.length();j++){
                if(j==0){
                    a = String.valueOf(sb.charAt(j));
                }
            }
            System.out.println(a);

            if (z.equals(a)){
                System.out.println("jedeme dál");
            }
            else{power = false;}
        }
        */
        /*ukol1*/
        StringBuilder sb = new StringBuilder("java je objektovy jazyk");
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        for(int i = 0; i<sb.length(); i++){
            if(sb.charAt(i)==' '){
                sb.replace(i,i+1,"|");

            }
            if(sb.charAt(i)=='|'){
                sb.setCharAt(i+1,Character.valueOf(sb.charAt(i+1)).toUpperCase(sb.charAt(i+1)));
            }
        }System.out.println(sb);


        /*Ukol5

        StringBuffer sb = new StringBuffer("J4av8a 2S0t1r3i5n6g");
        for(int i = 0; i<sb.length(); i++){
            if(Character.isDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
        */
        /*Ukol6
        StringBuffer sb = new StringBuffer("((a+b)*(c+d");
        int oteviraci = 0;
        int uzaviraci = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                oteviraci++;
            }
            if (sb.charAt(i) == ')') {
                uzaviraci++;
            }
        }

        if (oteviraci > uzaviraci) {
            for (int i = 0; i < oteviraci-uzaviraci; i++) {
                sb.append(")");
            }
        }
        System.out.println(sb.toString());
        */
        /*ukol7
        StringBuilder sb = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder(sb);
        sb2.reverse();
        sb.append(sb2);
        System.out.println(sb);
        */
        /*ukol8*/
        /*ukol9
        StringBuilder sb = new StringBuilder("aaabbbcccca");
        StringBuilder sb1 = new StringBuilder();
        int pocet = 1;

        for (int i = 0; i < sb.length(); i++) {
            if (i + 1 < sb.length() && sb.charAt(i) == sb.charAt(i + 1)) {
                pocet++;
            } else {
                sb1.append(sb.charAt(i));
                sb1.append(pocet);
                pocet = 1;
            }
        }System.out.println(sb1);*/





    }
}
