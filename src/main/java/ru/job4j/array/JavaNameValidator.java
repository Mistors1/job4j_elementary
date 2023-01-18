package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = false;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isSpecialSymbol(code)
                    && isUpperLatinLetter(code)
                    && isLowerLatinLetter(code)
                    && isLowerCase(code)
                    && !isEmpty()
                    || isDigit(code)) {
                result = true;
            } else if (!isLowerCase(code)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 && code <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 97 && code <= 122) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty() {
        return true;
    }

    public static boolean isLowerCase(int code) {
        return true;
    }

    public static boolean isDigit(int code) {
        return true;
    }

}
