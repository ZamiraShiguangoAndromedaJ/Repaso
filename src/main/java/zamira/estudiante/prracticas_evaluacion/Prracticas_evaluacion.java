package zamira.estudiante.prracticas_evaluacion;

import java.util.Scanner;

public class Prracticas_evaluacion {

    public static void main(String[] args) {
        //----------------Ejercicios de Estructuras Condicionales (if y switch)--------------------------

        //EJERCICIO 1
        /*Clasificació de notas: Escribe un programa que reciba una calificación numérica de un 
estudiante y muestre si ha aprobado o reprobado. Si la calificación es mayor o igual a 
90, debe mostrar "Excelente", entre 80 y 89 "Bueno", entre 70 y 79 "Regular", y menos 
de 70 "Insuficiente".*/
        //SWITCH
        /* int notas = 3;
        switch (notas) {

            case 90:
                System.out.println("EXELENTE");
                break;

            case 80, 89:
                System.out.println("Bueno");
                break;

            case 70, 79:
                System.out.println("regular");
                break;

            default:
                System.out.println("Insuficiente");

        }*/
//IF
        /*int lados = 69;
            if (lados == 90) {
                System.out.println("Exelente");
            }

            else if (lados >= 80) {
                System.out.println("Bueno");
            }

            else if (lados >= 70) {
                System.out.println("regular");
            }
            else {
                System.out.println("Insuficiente");
            }*/
        //EJERCICO 2           
/*Día de la semana: Solicita un número del 1 al 7 y utiliza una estructura switch para 
 imprimir el día de la semana correspondiente (1 para "Lunes", 2 para "Martes", etc.).*/
 /*int semanas= 6;
switch (semanas){
        
        case 1:
        System.out.println("Lunes");
        break;
        
        case 2:
            System.out.println("Martes");
            break;
         
        case 3:
            System.out.println("Miercoles");
            break;
            
        case 4:
        System.out.println("Jueves");
        break;
        
        case 5:
            System.out.println("Viernes");
            break;
         
        case 6:
            System.out.println("Sabado");
            break;
            
        case 7:
            System.out.println("Domingo");
            break;
        
    }*/
//EJERCICIO3
/*Tipo de triángulo: Pide al usuario tres longitudes de lados y determina si forman un 
triángulo equilátero, isósceles o escaleno. Usa estructuras condicionales if para verificar 
las condiciones*/
 /*  int lado2 = 0;

        if (lado2 == 3){
            System.out.println("Triángulo equilatero");
        } else if (lado2 == 2) {
            System.out.println("isósceles");
        } else if (lado2 == 0) {
            System.out.println("circulo");

        }*/
//EJERCIO 4
/*Calculadora simple: Crea un programa que reciba dos números y una operación (+, -, *, 
/) y use switch para realizar la operación correspondiente entre los dos números.*/

 /*int num1=23;
int num2=24;

int resul =2;

switch (resul){
    case 1:
        int resul1=num1+num2;
        System.out.println("la suma de dos numeros es:"+resul1);
        break;
    
    case 2:
        double resul2=num1/num2;
        System.out.println("la division de "+num1+" y "+num2+"es:"+resul2);
        break;
        
    case 3:
        int resul3=num1*num2;
        System.out.println("la multiplicacion de dos numeros es:"+resul3);
        break;
        
    case 4:
        int resul4=num1-num2;
        System.out.println("la resta de dos numeros es:"+resul4);
        break;
        

}*/
//EJERCICIO 5
/*Mes del año: Solicita al usuario un número entre 1 y 12 y usa switch para imprimir el 
nombre del mes correspondiente y la estación del año en que se encuentra.*/

 /*int mes=5;
switch (mes){
    
    case 1:
        System.out.println("Enero");
        break;
    case 2:
        System.out.println("Febrero");
        break;
    case 3:
        System.out.println("Marzo");
        break;
    case 4:
        System.out.println("Abril");
        break;
    case 5:
        System.out.println("Mayo");
        break;
    case 6:
        System.out.println("Junio");
        break;
    case 7:
        System.out.println("julio");
        break;
    case 8:
        System.out.println("Agosto");
        break;
    case 9:
        System.out.println("septiembre");
        break;
    case 10:
        System.out.println("Octubre");
        break;
    case 11:
        System.out.println("Noviembre");
        break;
    case 12:
        System.out.println("Diciembre");
        break;
}*/
//-------------Ejercicios de Estructuras Repetitivas (for, while, do-while)-----------------------
//EJERCIO 1
/*Contador de pares: Solicita un número positivo y muestra todos los números pares 
desde 0 hasta ese número usando un bucle for.*/
 /* int num1 = 20;
        System.out.println("numeros pares desde 0 al " + num1);
        for (int i = 0; i <= num1; i += 2) {
            System.out.println(i);
        }
         */
 /*   Scanner zamira = new Scanner(System.in);
        System.out.println("Ingresa un nuúmero positivo");
        int num3 = zamira.nextInt();

        for (int i = 0; i <= num3; i += 2) {
            System.out.print(i);
        }
         */
        //EJERCIO 2
        /*Tabla de multiplicar: Pide un número entero y muestra su tabla de multiplicar del 1 al 
10 usando un bucle while*/
 /*Scanner alex= new Scanner(System.in);
        System.out.println("Ingresa un numero entero del 1 al 10:");
        int num5 = alex.nextInt();
        int i=1;
        
        while(i<=10){
            System.out.println(num5+"x"+i+"="+(num5*i));
            i++;
            
        }*/
//EJERCICO 3
/*uma de dígitos: Solicita un número y utiliza un bucle while para calcular la suma de sus 
dígitos. Por ejemplo, si el usuario ingresa 123, el programa debería devolver 6.*/
        Scanner vela = new Scanner(System.in);
        System.out.println("Ingrese el numero que desee sumar");
        int num7 = vela.nextInt();

        int suma = 0;
        while (num7 != 0) {
            suma += num7 % 10; // Añadir el último dígito a la suma
            num7 /= 10; // Eliminar el último dígito del número
        }

        // Mostrar el resultado
        System.out.println("La suma de los dígitos es: " + suma);

    }
}
