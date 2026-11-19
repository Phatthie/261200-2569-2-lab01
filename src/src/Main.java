import java.util.Scanner;

int[] sort(int[] num){
    for(int j=0;j<num.length-1;j++){
        for (int k = 0; k < num.length-j-1; k++) {
            if (num[k] > num[k + 1]) {
                int temp = num[k];
                num[k] = num[k + 1];
                num[k + 1] = temp;
            }
        }
    }
    return num;
}

void main(){
    IO.print("Enter nonnegative integer: ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int []num = new int[n];
    for(int i=0;i<n;i++) {
        num[i] = s.nextInt();
    }
    sort(num);
    for(int l=0;l<n;l++){
        IO.println(num[l]);
    }
}