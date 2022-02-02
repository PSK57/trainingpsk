package Practice;

import java.util.ArrayList;

public class ZAlgorithm {

	public static void main(String args[]) {
		String S = "aaaaaaaaaaaaaaaaaaaa";
		String pat = "aa";
		ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<S.length();i++){
            int j = i+pat.length();
            String str = null;
            if(j<S.length()){
                str = S.substring(i,j);
            } else {
                str = S.substring(i);
            }
            if(str.equals(pat)){
                arr.add(i+1);
            }
        }
        if(arr.size()==0){
            arr.add(-1);
        }
        System.out.println(arr);
	}
}