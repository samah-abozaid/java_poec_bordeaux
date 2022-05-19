import jdk.dynalink.beans.StaticClass;

import java.util.regex.Pattern;

public class Validateur {
    public static boolean isEmail(String email) {
        return Pattern.matches(".+@.+\\..+", email);

    }
    public static boolean isLength(String motdepass){
        return Pattern.matches(".{8,20}", motdepass);

    }


}
