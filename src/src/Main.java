import java.util.Scanner;

void main(){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    Scanner u = new Scanner(System.in);
    int []num = new int[n];
    for(int i=0;i<n;i++) {
        num[i] = u.nextInt();
    }
    for(int j=0;j<num.length-1;j++){
        for (int k = 0; k < num.length-j-1; k++) {
            if (num[k] > num[k + 1]) {
                int temp = num[k];
                num[k] = num[k + 1];
                num[k + 1] = temp;
            }
        }
    }
    for(int l=0;l<n;l++){
        IO.println(num[l]);
    }
}