import java.util.Collections;
import java.util.List;

public class NextPermutation {

    /*
    6.10
    */

    public static List<Integer> nextPermutation(List<Integer> permutation) {

        int left = permutation.size()-1;
        while(left>0 && permutation.get(left)<=permutation.get(--left));
        if(left==0) return Collections.emptyList();

        int right = permutation.size()-1;
        while(permutation.get(left)>=permutation.get(right)) right--;
        int temp = permutation.get(right);
        permutation.set(right,permutation.get(left));
        permutation.set(left++,temp);
        right = permutation.size()-1;
        while(left<right){
            temp = permutation.get(right);
            permutation.set(right--,permutation.get(left));
            permutation.set(left++,temp);
        }
        //Expected :[2, 9, 4, 1, 3, 6, 8]
        return permutation;
    }
}
