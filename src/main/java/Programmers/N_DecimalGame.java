package Programmers;

class N_DecimalGame {
    public static void main(String[] args) {

        int n = 2;
        int t = 4;
        int m= 2;
        int p = 1;

        String answer = "";
        String str = "";

        int i=0;
        while(t*m>str.length()){
            str +=Integer.toString(i++,n);
        }

        for(int j=0;j<t;j++){
            answer += String.valueOf(str.charAt(p-1 + j*m)).toUpperCase();
        }
        System.out.println(answer);
    }
}