import java.util.List;

public class PermuteElements {

    /*
    6.9
    */

    public static void applyPermutation(List<Integer> perm, List<Integer> a) {
        /*
        a ->  a  b   c   d
        p ->  2  0   1   3 */
        //this means a is at index 2, b is at index 0, c is at index 1, d is at index 3
        //then order letters based on index in ascending order 0,1,2,3
        Integer temp;
        int i = 0;
        while(i<a.size()){
            if(perm.get(i)!=i){
                temp = a.get(perm.get(i)); //c
                a.set(perm.get(i), a.get(i));
                a.set(i,temp);
                temp = perm.get(i); //2
                perm.set(i,perm.get(perm.get(i)));
                perm.set(temp,temp);
            }else i++; //[150, 50, 100, 200]
        }
    }
}
