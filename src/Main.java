import javax.swing.plaf.nimbus.State;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String cardNumber = "13589549"; // WARUM STRING??
        boolean validCreditCardNumber = isValidCreditCardNumber(cardNumber);

        if (validCreditCardNumber) {
            System.out.println (cardNumber + "is valid");
        } else {
            System.out.println (cardNumber + "is invalid");
        }
    }

    public static boolean isValidCreditCardNumber(String cardNumber) {
        int[] CardIntArray = new int[cardNumber.length()];

        for (int i = 0; i < cardNumber.length(); i++) {
            char c = cardNumber.charAt(i);
            CardIntArray[i] = Integer.parseInt(" " + c);
        }
        for (int i = CardIntArray.length - 2; i >= 0; i = i - 2) {
            int num = CardIntArray[i];
            num = num * 2;
            if (num > 9) {
                num = num % 10 + num / 10;
            }
            CardIntArray[i] = num;
        }
        int sum = sumDigits(CardIntArray);
        System.out.println(sum);
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }
            public static int sumDigits (int[] arr)
            {
                return Arrays.stream(arr).sum();
            }
        }

