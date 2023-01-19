

/**
 * Valida la entrada si es un nùmero o una cadena de caracteres.
 * @author Ruben Campos Reymundis - Pablo Hernán Gatti
 *
 */

public class Validators {
     /**
     * Mètodo que devuelve true si el dato ingresado es un numero, caso contrario false.
     * @param input El parámetro input es la variable que contiene las opciones del menu.
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
   
    /**
     * Mètodo que devuelve true si el dato ingresado esta dentro del rango 1-10, caso contrario false.
     * @param input El parámetro input es la variable que contiene las opciones del menu.
     */
   public static Boolean optionRange(String input){
        
      int numero = Integer.parseInt(input); 
 
      if(numero >= 1 && numero <= 10){
         return true;
      }
         return false;
     } 
}
