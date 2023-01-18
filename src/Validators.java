

/**
 * Ordena la playlist, en este caso por duración o por fecha de las canciones
 * @author Ruben Campos Reymundis - Pablo Hernán Gatti
 *
 */

public class Validators {
    /**
     * Valida las entradas si son numeros o cadenas de caracteres
     */

   public static Boolean isInteger(String input){
      int number;

      try {
          number = Integer.parseInt(input);
          return true;
      } catch (NumberFormatException e) {
          // TODO: handle exception
          return false;
      }
   }
   

   public static Boolean optionRange(String input){
        
      int numero = Integer.parseInt(input); 
 
      if(numero >= 1 && numero <= 10){
         return true;
      }
         return false;
     } 
}
