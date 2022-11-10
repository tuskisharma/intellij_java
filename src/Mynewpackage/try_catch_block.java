package Mynewpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class try_catch_block {
    public static void main(String[] args) throws IOException {
        int[] arr={2,4,5,5};
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int index=Integer.parseInt(br.readLine());
        System.out.println(arr[1]);
    }
}
