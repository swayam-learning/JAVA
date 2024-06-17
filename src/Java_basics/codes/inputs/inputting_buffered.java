package Java_basics.codes.inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputting_buffered {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println("the entered number is "+a);

    }
}
