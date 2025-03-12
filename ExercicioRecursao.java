import java.util.ArrayList;

public class ExercicioRecursao {
    
    public static double factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int sumToZero(int n) {
        if (n == 0) return 0;
        return n + sumToZero(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumBetween(int k, int j) {
        if (k > j) return 0;
        return k + sumBetween(k + 1, j);
    }

    public static boolean isPal(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPal(s.substring(1, s.length() - 1));
    }

    public static String convBase2(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return convBase2(n / 2) + (n % 2);
    }

    public static int sumArrayList(ArrayList<Integer> list) {
        if (list.isEmpty()) return 0;
        return list.remove(0) + sumArrayList(list);
    }

    public static int findBiggest(ArrayList<Integer> list) {
        if (list.size() == 1) return list.get(0);
        int first = list.remove(0);
        return Math.max(first, findBiggest(list));
    }

   
    public static boolean findSubStr(String str, String match) {
        if (str.length() < match.length()) return false;
        if (str.startsWith(match)) return true;
        return findSubStr(str.substring(1), match);
    }

    public static int nroDigit(int n) {
        if (n < 10) return 1;
        return 1 + nroDigit(n / 10);
    }

    public static ArrayList<String> permutations(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s.length() == 0) {
            result.add("");
            return result;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String rest = s.substring(0, i) + s.substring(i + 1);
            for (String perm : permutations(rest)) {
                result.add(c + perm);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Fatorial " + factorial(5));
        System.out.println("Somatório  " + sumToZero(5));
        System.out.println("Fibonacci " + fibonacci(6));
        System.out.println("Somatório  " + sumBetween(2, 5));
        System.out.println("'radar' é palíndromo? " + isPal("radar"));
        System.out.println("Número 10 em binário: " + convBase2(10));
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        System.out.println("Somatório da lista: " + sumArrayList(new ArrayList<>(list)));
        System.out.println("Maior elemento da lista: " + findBiggest(new ArrayList<>(list)));
        
        System.out.println("'cad' está em 'abracadabra'? " + findSubStr("abracadabra", "cad"));
        System.out.println("Número de dígitos de 12345: " + nroDigit(12345));
        
        System.out.println("Permutacao : " + permutations("abc"));
    }
}