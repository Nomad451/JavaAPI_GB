package seminars.seminar2;

public class Main {
    public static void main(String[] args) {
//        System.out.println(buildString(6, 'A', 'B'));

//        System.out.println(extractDomainName("manager@gb.com"));
//        System.out.println(extractDomainName("chief@google.com"));

//        System.out.println(compress("aaaabbbcdd"));


    }

    /**
     * Напишите метод, который сжимает строку.
     * Пример: aaaabbbcdd -> a4b3cd2
     * abcde -> abcde
     * aaaaaa -> a6
     */
    static String compress(String source) {
        String result = "";
        int count = 1;
        for (int i = 1; i < source.length(); i++) {
            if (source.charAt(i - 1) == source.charAt(i)) {
                count++;
            } else {
                result += source.charAt(i - 1);
                if (count > 1) {
                    result += count;
                }
                count = 1;
            }
        }
        result += source.charAt(source.length() - 1);
        if (count > 1) {
            result += count;
        }
        return result;
    }

    /**
     * Дано: электронная почта. Нужно найти доменное имя сотрудника.
     * [manager@gb.com] -> manager
     * [chief@google.com] -> chief
     */
    static String extractDomainName(String mail) {
        int indexOfAt = mail.indexOf("@");
        return mail.substring(0, indexOfAt);
    }

    /**
     * Дано четное число n, и символы с1 с1. Нужно создать строку с1с2с1с2...с1с2 длины n
     *
     */
    static String buildString(int n, char c1, char c2) {
        String append = String.valueOf(c1) + c2;
        return append.repeat(n / 2);

//        String str = "";
//        for (int i = 0; i < n / 2; i++) {
//            str += c1;
//            str += c2;
//        }
//        return str;
    }
}
