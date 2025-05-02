import java.util.regex.*;

public class ValidadorEmail {
    public static void main(String[] args) {
        String email = "meuemail123@mymail.com";
        System.out.println(validarEmail(email));
    }

    public static String validarEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+(\\.[a-zA-Z]{2,})+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches() ? "Email válido" : "Email inválido";
    }
}