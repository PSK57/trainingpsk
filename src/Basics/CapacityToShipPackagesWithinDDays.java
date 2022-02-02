package Basics;

public class CapacityToShipPackagesWithinDDays {

	public static void main(String args[]) {
		int N = 3;
		int arr[] = {9,8,10};
		int D = 3;
		int a = 0;
        if(N%D==1){
            a = (N/D)+1;
        } else if(N%D==0){
            a = N/D;
        }
        int sum = 0;
        for(int i=0;i<N;i=i+a){
            int k = 0;
            for(int j=i;j<a+i;j++){
                if(j<N){
                    k = k + arr[j];
                }
            }
            if(sum<k){
                sum = k;
            }
        }
        System.out.println(sum);
	}
}