package Baekjoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No10998 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.printf("%d", A * B);

        /**
         * another version
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

         StringTokenizer st = new StringTokenizer(br.readLine());

         int A = Integer.parseInt(st.nextToken());
         int B = Integer.parseInt(st.nextToken());
         int result = A*B;
         br.close();

         bw.write(String.valueOf(result));
         bw.flush();
         bw.close();
        */
    }
}
