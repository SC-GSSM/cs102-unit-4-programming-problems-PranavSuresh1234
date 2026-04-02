package unit4;

public class Unit4 {

    public static void main(String[] args) {
        Unit4 tester = new Unit4();

        System.out.println("sumNumbers(5): " + tester.sumNumbers(5)); // Expected: 15

        System.out.println("repeatString(\"abc\", 3): " + tester.repeatString("abc", 3)); // Expected: abcabcabc

        System.out.println("findFactorial(5): " + tester.findFactorial(5)); // Expected: 120

        System.out.println("countVowels(\"Hello World\"): " + tester.countVowels("Hello World")); // Expected: 3

        System.out.println("isPalindrome(\"racecar\"): " + tester.isPalindrome("racecar")); // Expected: true
        System.out.println("isPalindrome(\"hello\"): " + tester.isPalindrome("hello"));     // Expected: false

        tester.printAsteriskPatterns(3);

        tester.multiplicationTable(3);
}

    
    public int sumNumbers(int n) {
    
        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
        }

    
    public String repeatString(String str, int n) {
        if (n <= 0 || str.isEmpty()) {
            return "";
        }

        String result = "";

        for (int i = 0; i < n; i++) {
            result += str;
        }

        return result;
        }

    public int findFactorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public int countVowels(String str) {
        int count = 0;
    
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }
    
        return count;
    }

    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void printAsteriskPatterns(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void multiplicationTable(int n) {
        for (int row = 1; row <= n; row++) {
        
            for (int col = 1; col <= n; col++) {
                System.out.print((row * col) + "\t");
            }
        
            System.out.print("\n");
        }
    }

}