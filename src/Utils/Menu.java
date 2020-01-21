package Utils;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public ArrayList<String> opciones=new ArrayList <>();
    Scanner scn=new Scanner(System.in);
    
    public Menu(String[] ops) {
        opciones.addAll(Arrays.asList(ops));
    }
    
    public int getOpcion() {
        int nops;
        int opc;
        
        nops=showMenu();
        System.out.println("Elixe Opcion: ");
        opc=Integer.parseInt(scn.nextLine());
        return opc;
    }
    
    private int showMenu() {
        int n=1;
        for(String s: opciones) {
            System.out.println(n+".- "+s);
            n++;
        }
        System.out.println();
        return n-1;
    }
}