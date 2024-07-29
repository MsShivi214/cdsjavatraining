import java.security.SecureRandom;

public class PasswordGenerator {
    public static void main(String[] args) {
        int minLength = 8;
        String password = generatePassword(minLength);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length) {
        if (length < 8) {
            throw new IllegalArgumentException("Password length must be at least 8 characters.");
        }

        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String allCharacters = lowerCaseLetters + upperCaseLetters + numbers;

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        // Ensure at least one lowercase letter
        password.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));

        // Ensure at least one uppercase letter
        password.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));

        // Ensure at least one number
        password.append(numbers.charAt(random.nextInt(numbers.length())));

        // Fill the rest of the password length with random characters
        for (int i = 3; i < length; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        // Shuffle the characters in the password to ensure randomness
        for (int i = 0; i < password.length(); i++) {
            int randomIndex = random.nextInt(password.length());
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(randomIndex));
            password.setCharAt(randomIndex, temp);
        }

        return password.toString();
    }
}
