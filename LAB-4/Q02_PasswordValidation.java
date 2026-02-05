class Q02_PasswordValidation {

    static boolean checkPassword(String password) {

        if (password.length() < 5 || password.length() > 12)
            return false;

        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                return false;

            if (!((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')))
                return false;

            if (ch >= 'a' && ch <= 'z')
                hasLower = true;

            if (ch >= '0' && ch <= '9')
                hasDigit = true;

            if (i > 0 && ch == password.charAt(i - 1))
                return false;
        }

        return hasLower && hasDigit;
    }

    public static void main(String[] args) {

        String password = "Prince4";
        System.out.println(checkPassword(password));
    }
}
