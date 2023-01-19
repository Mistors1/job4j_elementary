package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = true;
        if (name.isEmpty()) {
            return false;
        }
        for (int i = 0; i < 1; i++) {
            int first = name.codePointAt(i);
            if (Character.isUpperCase(first) || Character.isDigit(first)) {
                result = false;
            } else {
                for (int j = 0; j < name.length(); j++) {
                    int code = name.codePointAt(i);
                    if (isSpecialSymbol(code)
                            || isUpperLatinLetter(code)
                            || isLowerLatinLetter(code)
                            || Character.isDigit(code)) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
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

}
