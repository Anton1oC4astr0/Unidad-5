package practica2u4u5_metodos;

public class Practica2U4U5_Metodos {

    public static void Suma(int x, int y) {
        int suma = x+y;
        System.out.println("El resultado al sumar los numeros ingresados es de: " + suma);
    }
    public static void Multiplicacion(int x, int y){
        int multiplicacion = x*y;
        System.out.println("El resultado al multiplicar los numeros ingresados es de: " + multiplicacion);
    }
    public static void Resta(int x, int y){
        int resta = x-y;
        System.out.println("El resultado al restar los numeros ingresados es de: " + resta);
    }
    public static void Division(int x, int y){
        int division = x/y;
        System.out.println("El resultado al dividir los numeros ingresados es de: " + division);
    }
    public static void main (String []args){
        int x = 20;
        int y = 10;
        
        Practica2U4U5_Metodos.Suma(x, y);
        Practica2U4U5_Metodos.Multiplicacion(x, y);
        Practica2U4U5_Metodos.Resta(x, y);
        Practica2U4U5_Metodos.Division(x, y);
    }

}
