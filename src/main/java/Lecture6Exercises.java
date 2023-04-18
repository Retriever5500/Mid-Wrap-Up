import java.util.ArrayList;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long sum = 0;
        for(int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length-i-1];
        }
        return reversedArray;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        if(m1[0].length != m2.length) {
            throw new RuntimeException();
        }

        double[][] matrixProduct = new double[m1.length][m2[0].length];
        for(int i = 0; i < m1.length; i++) {
            double[] matrixRow = new double[m2.length];
            for(int j = 0; j < m2[0].length; j++) {
                double element = 0;
                for(int k = 0; k < m2.length; k++) {
                    element += m1[i][k]*m2[k][j];
                }
                matrixRow[j] = element;
            }
            matrixProduct[i] = matrixRow;
        }


        return matrixProduct;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> stringList = new ArrayList<List<String>>();
        for(int i = 0; i < names.length; i++) {
            List<String> stringRow = new ArrayList<String>();
            for(int j = 0; j < names[i].length; j++) {
                stringRow.add(names[i][j]);
            }
            stringList.add(stringRow);
        }
        return stringList;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                boolean isPrime = true;
                for(int j = 2; j < i; j++) {
                    if(i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    primeFactors.add(i);
                }
            }
        }
        return primeFactors;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> words = new ArrayList<String>();
        String word = "";
        for(char letter: line.toCharArray()) {
            if(!alphabet.contains(String.valueOf(letter))) {
                if(word.length() != 0) {
                    words.add(word);
                    word = "";
                } else {
                    continue;
                }
            } else {
                word += letter;
            }
        }
        if(word.length() != 0) {
            words.add(word);
        }
        return words;
    }
}
