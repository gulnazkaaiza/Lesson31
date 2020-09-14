package Task1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        String st = br.readLine();
        main.run(st);

    }
    public void run (String s) {
        if(isPalindrom(s)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
}
