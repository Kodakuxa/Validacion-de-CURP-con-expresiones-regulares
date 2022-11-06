package com.mycompany.curp;

   import java.util.Scanner;

public class Curp {
    public static void main (String []args){
        int opc;
        String curp;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("\tVALIDACION DE CURP");
        System.out.println("1. Validar CURP");
        System.out.println("2. Salir");
        opc=sc.nextInt();
        if(opc==1){
            Scanner s=new Scanner(System.in);
            System.out.println("Introduce una curp\n");
            curp=s.nextLine();
            if(RegexCurp(curp)==true)
                System.out.println(curp+" Es una CURP VALIDA\n\n");
            else
                System.out.println(curp+" NO es una CURP VALIDA\n\n");
        }
            else
        {       System.out.println("Adios\n");
            break;
        }
    }while(opc!=2);
    }
    public static boolean RegexCurp(String Vcurp){
    return Vcurp.matches("^[A-Z]{1}(A|E|I|O|U|X)[A-Z]{2}"+"[0-9]{2}(0[1-9]|1[0-2])(0[0-9]|1[0-9]|2[0-9]|3[0-1])"+ "(H|M)"+ "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"+ "[A-Z]{3}"+"[0-9]{2}$");
       }
}