/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.extra.pkg1.integrador.a;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ExtrasGI {
    
    public static void EquivalenciaMinutos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int min = leer.nextInt();
        int horas = min / 60;
        int dias = horas / 24;
        if (horas >= 24){
            horas = horas - 24;
        }
        System.out.println(min + " = " + dias + " día/s y " + horas + " hora/s");
    }
    
    public static void Valorescambiados(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores de los siguientes elementos");
        System.out.print("A: ");
        int A = leer.nextInt();
        System.out.print("B: ");
        int B = leer.nextInt();
        System.out.print("C: ");
        int C = leer.nextInt();
        System.out.print("D: ");
        int D = leer.nextInt();
        System.out.println("Valores Iniciales");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        int auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = auxiliar;
        System.out.println("Valores Finales");
         System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
    public static void EsVocal(){
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingresar una letra");
         String letra = leer.next();
         int caracter = letra.length();
         if (caracter != 1){
             while (caracter != 1){
                 System.out.println("Se Ingreso mas de una letra");
                 letra = leer.next();
                 caracter = letra.length();}
             
         if (caracter == 1){
             letra = letra.toUpperCase();
             switch (letra){
                 case "A": 
                    System.out.println("Es Vocal");
                    break;
                 case "E": 
                     System.out.println("Es Vocal");
                     break;
                 case "I":
                     System.out.println("Es Vocal");
                     break;
                 case "O":
                     System.out.println("Es Vocal");
                     break;
                 case "U": 
                     System.out.println("Es Vocal");
                     break;
                 default:
                     System.out.println("No es Vocal");
                }
         }
    }
    
  }
    
    public static void NrosRomanos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int nro = leer.nextInt();
        if (nro < 1 || nro > 10){
            while (nro < 1 || nro > 10){
            System.out.println("El numero ingresado no es valido, Intentelo nuevamente");
            nro = leer.nextInt();}
            }
        switch (nro){
            case 1:
                System.out.println("Su equivalente en romano es: I");
                break;
            case 2:
                System.out.println("Su equivalente en romano es: II");
                break;
            case 3:
                System.out.println("Su equivalente en romano es: III");
                break;
            case 4:
                System.out.println("Su equivalente en romano es: IV");
                break;
            case 5:
                System.out.println("Su equivalente en romano es: V");
                break;
            case 6:
                System.out.println("Su equivalente en romano es: VI");
                break;
            case 7:
                System.out.println("Su equivalente en romano es: VII");
                break;
            case 8:
                System.out.println("Su equivalente en romano es: VIII");
                break;
            case 9:
                System.out.println("Su equivalente en romano es: IX");
                break;
            case 10:
                System.out.println("Su equivalente en romano es: X");
        }
    }
    
    public static void ObraSocial(){
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese la clase social");
         String claseS = leer.next();
         claseS = claseS.toUpperCase();
         if (claseS.equalsIgnoreCase("A")== false && claseS.equalsIgnoreCase("B")== false && claseS.equalsIgnoreCase("C")== false){
             while (claseS.equalsIgnoreCase("A")== false && claseS.equalsIgnoreCase("B")== false && claseS.equalsIgnoreCase("C")== false){
                 System.out.println("Dato ingresado invalido, Intentelo nuevamente");
                 claseS = leer.next();
                 claseS = claseS.toUpperCase();
                 
             }
         }
          System.out.println("Ingrese el costo del tratamiento");
          double costo = leer.nextDouble();
          switch (claseS){
              case "A":
                  costo = costo - ((costo * 50)/100);
                  System.out.println("El importe en efectivo a pagar es: $ " + costo);
                  break;
              case "B":
                   costo = costo - ((costo * 35)/100);
                   System.out.println("El importe en efectivo a pagar es: $ " + costo);
                   break;
              case "C":
                  System.out.println("El importe en efectivo a pagar es: $ " + costo);
                  break;
          }
    }
    
    public static void AlturaDePersonas(){
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de personas");
         int personas = leer.nextInt();
         double altura;
         int promedio = 0;
         double promedioG = 0;
         for (int i = 0;i < personas ; i++){
             System.out.println("Ingresar Altura");
             altura = leer.nextDouble();
             promedioG = promedioG + altura;
             if (altura < 1.60){
             promedio++;}
         }
         System.out.println("El promedio de estatura general es:" + promedioG/personas);
         System.out.println("El promedio de estatura por debajo de 1.60 es: " + (promedio/personas)*100);
    }
    
    
    public static void MinyMax(){
        /*Realice un método que calcule y visualice el valor máximo, el valor mínimo y el promedio de
n números (n>0). El valor de n se solicitará al principio del programa y los números serán
introducidos por el usuario. Realice dos versiones del método, una usando el bucle “while” y otra
con el bucle “do - while”.*/
        Scanner leer = new Scanner(System.in);
        int nro = 0;
        int mayor;
        int menor;
        double promedio = 0;
        int cant;
        double suma = 0;
        int i = 0;
        System.out.println("Cuantos numeros desea ingresar?");
        cant = leer.nextInt();
         if (cant < 0) {
                while (cant < 0) {
                    System.out.println("Numero ingresado es menor a cero");
                    cant = leer.nextInt();
                }
            }
         mayor = 0;
         menor = 999999999;
        /*do {
            System.out.println("Ingrese numero");
            i++;
            
          nro = leer.nextInt();
            
            if (nro < 0) {
                while (nro < 0) {
                    System.out.println("Numero ingresado es menor a cero");
                    nro = leer.nextInt();
                }
            }
                suma = suma + nro;
                if (nro > mayor) {
                    mayor = nro;
                }

                if (nro < menor) {
                    menor = nro;
                }
            
             } while ( i != cant); */
        
        while(i != cant){
            System.out.println("Ingrese numero");
            i++;
            
          nro = leer.nextInt();
            
            if (nro < 0) {
                while (nro < 0) {
                    System.out.println("Numero ingresado es menor a cero");
                    nro = leer.nextInt();
                }
            }
                suma = suma + nro;
                if (nro > mayor) {
                    mayor = nro;
                }

                if (nro < menor) {
                    menor = nro;
                }
        }
                
                System.out.println("El numero minimo ingresado es: " + menor);
                System.out.println("El numero maximo ingresado es: " + mayor);
                System.out.println("El promedio de los numeros ingresado es: " + suma/cant);
            }
     
    public static void ParyImpar(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numeros enteros que no sean multiplo de 5");
        int cont = 0;
        int nro;
        int par = 0;
        int impar = 0;
        do{
            nro = leer.nextInt();
            cont++;
           if(nro > 0){ 
              if (nro % 2 == 0){
                  par++;
              }else {
                  impar++;
            }    
           }
        
        }while(nro % 5 != 0);
        System.out.println("Cantidad de numeros leidos: " + cont );
        System.out.println("Cantidad de numeros pares: " + par);
        System.out.println("Cantidad de numeros impares: " + impar);
    }
    
    
       public static void DivisionResta(){
         /*  Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el
dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo,
y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:*/
         int nro1 = 50; 
         int nro2 = 13;
         int cont = 0;
         int resto = nro1;
         while(resto >= nro2){
             cont++;
             resto = resto - nro2;
         }
            System.out.println(nro1 + "/" + nro2);
           System.out.println("El cociente de la division es: " + cont);
           System.out.println("El resto de la division es: " + resto);
       }
       
       public static void NumeroMisterioso(){ //Adivina numero
         Scanner leer = new Scanner(System.in);
        int num1=(int)(Math.random()*10); 
        int num2=(int)(Math.random()*10);
        int multi=num1*num2;
        int cont=1;
        System.out.println("EL NUMERO MISTERIOSO");
        System.out.println("Cual es el numero misterioso?"); 
        int respuesta = leer.nextInt();
        while (multi!= respuesta && cont!=3){
           
            if ( multi<respuesta){
            System.out.println("El numero misterioso es menor");
             System.out.println("intente nuevamente");
             respuesta = leer.nextInt();
            }  else  {
                 System.out.println("El numero misterioso es mayor");
             System.out.println("intente nuevamente");
             respuesta = leer.nextInt();
               
            }
             cont++;
              
        }
       if (multi==respuesta){
           System.out.println("Correcto! Encontraste el Numero Misterioso ! Utilizaste "+cont+" intento/s");
       }else{System.out.println("Incorrecto. Seguí participando.");}
       }
       
      public static void Digitos(){
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese un numero ");
          int cont = 0;
          int nro = leer.nextInt();
          while(nro != 0){
              nro = nro / 10;
              cont++;
              }
          System.out.println("El numero de digitos que lo componen son: " + cont);
          
      } 
               
        
    
       public static void pressAnyKeyToContinue(){
    String seguir;
    Scanner teclado=new Scanner(System.in);
        System.out.println("Press any key to continue...");
        try{
        seguir=teclado.nextLine();
        }catch (Exception e)
        {}
    }
       public static void E_3version1(){
  
     for(int i=0;i<10;i++){
       for(int j=0;j<10;j++){
           for(int k=0;k<10;k++){
           if (i == 3 && j == 3 && k == 3) {
               System.out.println("E-E-E");
           }else if (i == 3 && j == 3){
               System.out.println("E-E-" + k);
           }else if(i == 3 && k == 3){
               System.out.println("E-"+j+"-E");
           }else if(j== 3 && k == 3){
               System.out.println(i+"-E-E");
           }else if(i==3 ){
               System.out.println("E-"+j+"-"+k);
           }else if(j==3){
               System.out.println(i+"-E-"+k);
           }else if(k==3){
               System.out.println(i+"-"+j+"-E");
           }else{
               
               System.out.println(i+"-"+j+"-"+k);//si esta no se imprime salen solo los de la E
           }
           }System.out.println(" ");
           ExtrasGI.pressAnyKeyToContinue();
       }
     }
    }
       
       public static void E_3version2() {
        String aux1 = " ";
        String aux3 = " ";
        String aux2 = " ";
        for (int k = 0; k <= 9; k++) {
            aux1 = Integer.toString(k);//Guardo el valor del numero en un aux del tipo String
            if (aux1.equals("3")) {//si el numero es 3 lo reemplazo por E
                aux1 = "E";
            }
            for (int j = 0; j <= 9; j++) {//2* numero. 2do bucle
                aux2 = Integer.toString(j);//Guardo el valor del numero en un aux del tipo String
                if (aux2.equals("3")) {
                    aux2 = "E";
                }
                for (int i = 0; i <= 9; i++) {//3* numero. 3er bucle.
                    //que puede tomar cada variable, si lo pongo en los bucles exteriores solo se queda con i=9 y no cumple lo pedido.
                    aux3 = Integer.toString(i);
                    if (aux3.equals("3")) {
                        aux3 = "E";
                    }
                    System.out.println(aux1 +"-"+ aux2+"-" + aux3);
                }

            }
        }
       }
 public static void MinyMaxversion2() {
     Scanner leer = new Scanner(System.in);   
     int minimo = 999999999;
        int maximo =0;
        double suma=0;
        int n2;
        int n;
        System.out.println("ingrese la cantidad de numero a calcular ");
        n=leer.nextInt();
        int conta = 0;
        while (n != conta) {
            System.out.println("ingrese un numero ");
            n2 = leer.nextInt();
            suma += n2;
            
            maximo = Math.max(maximo, n2);
            minimo = Math.min(minimo, n2);
            conta++;
        }
        double promedio = suma / n;
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
        System.out.println("El promedio es: " + promedio);
    }
  

       public static void EscalerasDeNumeros(){
           Scanner leer = new Scanner(System.in);
           System.out.println("Ingrese la altura de la escalera");
           int escalera = leer.nextInt();
           int h;
             for(h=1;h<= escalera;h++){
               for(int i = 1; i<= h;i++){
                   
                   System.out.print(i);
               }
           
               System.out.println(" ");
             }
           
       }
}

    
  
