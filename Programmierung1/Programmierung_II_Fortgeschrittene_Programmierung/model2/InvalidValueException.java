package model2;


/**
 * InvalidValueException
 *
 * @author Daniel Appenmaier
 * @version 1.0
 *
 */
public class InvalidValueException extends Exception {

   private static final long serialVersionUID = 1L;

   public InvalidValueException(String parameter, Object value) {
      super("Invalid value " + value + " for parameter " + parameter);
   }

}
