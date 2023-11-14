
package consumoagua;


public class Practica4U4U5_ConsumoAgua {
    
    public static void ConsumoCasa(int [][] ConsumoAgua) {
        for (int i = 0; i < ConsumoAgua.length; i++) {
            int sumaCA = 0; 
            for (int j = 0; j < ConsumoAgua[i].length; j++) {
                sumaCA += ConsumoAgua [i][j];
            }
            System.out.println("El consumo de agua a la semana de la casa " + (i+1) + " es de: " + sumaCA);
        }
    }
    public static void ConsumoDia(int [][] ConsumoAgua) {
        for (int j = 0; j < ConsumoAgua[0].length; j++) {
            int sumaCD = 0;
            for (int i = 0; i < ConsumoAgua.length; i++) {
                sumaCD += ConsumoAgua [i][j];
            }
            System.out.println("El consumo de agua del dia " + (j+1) + " es de: " + sumaCD);
        }
        
    }
    public static void main(String[] args) {
        int [][] ConsumoAgua ={
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40}
            
        };
        Practica4U4U5_ConsumoAgua.ConsumoCasa(ConsumoAgua);
        
        System.out.println("**********************************************************");
        
        Practica4U4U5_ConsumoAgua.ConsumoDia(ConsumoAgua);
    }
    
}
