package sk.kosickaakademia.stovcikova.piskorky;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PiskvorkPole {
    public int size;
    public char pole[][];
    public char prazdne = '_';
    private int x, y;
    public boolean kriz = true;

    PiskvorkPole(int s) { //konstruktor
        size = s;
        pole = new char[size][size];
        for (x = 0; x < size; x++) {
            for (y = 0; y < size; y++) {
                pole[x][y] = prazdne;
            }
        }

    }
    PiskvorkPole() { //pouzije sa, pokial neni zadana velkost)
        this(15);
    }

    public String toString() {
        char ascii = 'a';

        String out = new String("\n  \t|");
        for(char c=ascii;c<size+ascii;c++) out += (c+"|");
        out += "\n\n";
        for(x=0;x<size;x++) {
            out += (x+":\t|");
            for(y=0;y<size;y++) {
                out += pole[x][y]+"|";
            }
            out += "\n";
        }

        return out;
    }
    public void vykresliDoSuboru(String outputfile) {
        double x, y;
        FileOutputStream out;
        PrintStream p;


        try {
            out = new FileOutputStream(outputfile, true); //true znamena, ze se bude vzdy pridavat na koniec suboru
            p = new PrintStream(out);
            p.println(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()));
            p.println(this);
            p.close();
        } catch(Exception e) {
            System.err.println("Error writing to file");
        }
    }


    public void hrat() {
        char hrac;
        boolean chyba = false;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println(this);
            vykresliDoSuboru("piskvorky.txt");
            kriz = !kriz;
            hrac = 'O'; if(kriz) hrac = 'X';
            System.out.println("Hraje hrac s "+hrac);

            System.out.print("pismeno: ");
            y=(int)(sc.next().charAt(0)-'a');

            try {
                System.out.print("cisielko: ");
                x=sc.nextInt();
            } catch(Exception e) {
                chyba = true;
            }

            if(chyba || x < 0 || x >= size || y < 0 || y >= size || pole[x][y] != prazdne) {
                chyba = false;
                System.out.println("\t\t\tneplatne pole!");
                kriz = !kriz; continue; //dalsi pokus
            }
            pole[x][y]=hrac;
        }

    }
    public int isWinner(int[][] pole){
        int r=3;
        int s=3;
        int x = 1;
        int y = 2;
        int i,j;
        for(i=0;i<r;i++){
            for(j=0;j<s;j++){
                if(j<=10 && pole[i][j]*pole[i][j+1]*pole[i][j+2]*pole[i][j+3]*pole[i][j+4]==1)
                    return x;
                if(j<=10 && pole[i][j]*pole[i][j+1]*pole[i][j+2]*pole[i][j+3]*pole[i][j+4]==32)
                    return y;
                if(i<=10 && pole[i][j]*pole[i+1][j]*pole[i+2][j]*pole[i+3][j]*pole[i+4][j]==1)
                    return x;
                if(i<=10 && pole[i][j]*pole[i+1][j]*pole[i+2][j]*pole[i+3][j]*pole[i+4][j]==32)
                    return y;
                if(j<=10 && i<=10 && pole[i][j]*pole[i+1][j+1]*pole[i+2][j+2]*pole[i+3][j+3]*pole[i+4][j+4]==1)
                    return x;
                if(j<=10 && i<=10 && pole[i][j]*pole[i+1][j+1]*pole[i+2][j+2]*pole[i+3][j+3]*pole[i+4][j+4]==32)
                    return y;
                if(j>=4 && i<=10 && pole[i][j]*pole[i+1][j-1]*pole[i+2][j-2]*pole[i+3][j-3]*pole[i+4][j-4]==1)
                    return x;
                if(j>=4 && i<=10 && pole[i][j]*pole[i+1][j-1]*pole[i+2][j-2]*pole[i+3][j-3]*pole[i+4][j-4]==32)
                    return y;
            }
        }
        return 0;
    }
}

