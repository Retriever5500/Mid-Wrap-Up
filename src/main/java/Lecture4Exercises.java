public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        long result = 1;
        for(int i = 1; i <= n; i++) {
            result *= (long)i;
        }
        return result;
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        long firstTerm = 1;
        long secondTerm = 1;
        for(int i = 1; i < n; i++) {
            long nextTerm = firstTerm + secondTerm;
            
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return firstTerm;
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        String reversedString = "";
        for(int i = word.length()-1; i >= 0; i--) {
            reversedString += word.charAt(i);
        }
        return reversedString;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        line = line.replaceAll(" ", "");
        line = line.toLowerCase();
        String reversedLine = reverse(line);
        if(reversedLine.equals(line)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char[][] dots = new char[str1.length()][str2.length()];
        for(int i = 0; i < str1.length(); i++) {
            for(int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    dots[i][j] = '*';
                } else {
                    dots[i][j] = ' ';
                }
            }
        }
        return dots;
    }
}
