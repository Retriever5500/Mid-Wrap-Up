import java.util.Random;


public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        Random rand = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String password = "";
        for(int i = 0; i < length; i++) {
            int randomNumber = rand.nextInt(alphabet.length);
            password += alphabet[randomNumber];
        }
        return password;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {
        if(length < 3) {
            throw new Exception();
        }

        Random rand = new Random();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] digits = "1234567890".toCharArray();
        char[] specialChars =  "!\"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~".toCharArray();
        char[] allChars = "abcdefghijklmnopqrstuvwxyz1234567890!\"#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~".toCharArray();
        String password = "";
        int digitIndex = rand.nextInt(length);
        int specialIndex = rand.nextInt(length);
        while(specialIndex == digitIndex) {
            specialIndex = rand.nextInt(length);
        }
        for(int i = 0; i < length; i++) {
            if(i == digitIndex) {
                password += digits[rand.nextInt(digits.length)];
            } else if(i == specialIndex) {
                password += specialChars[rand.nextInt(digits.length)];
            } else {
                password += allChars[rand.nextInt(digits.length)];
            }
        }
        return password;
    }
    

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        for(int i = 1; i <= n; i++) {
            long fibNum = fibonacci(i);
            String binRep = Integer.toBinaryString(i);
            long oneCount = 0;
            for(char j: binRep.toCharArray()) {
                if(j == '1') {
                    oneCount++;
                }
            }
            long sum = fibNum + oneCount;
            if(sum == n) {
                return true;
            }
        }
        return false;
    }

    // for the above method
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
}
