import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BuySellStockOnce {

    /*
       6.6
    */

    public static int buySellStockOnceFirst(List<Integer> A) {
        int max=A.get(A.size()-1);
        int maxProfit=0;
        for(int i=A.size()-2; 0<=i; i--){
            maxProfit = Math.max(max-A.get(i),maxProfit);
            max=Math.max(A.get(i),max);
        }
        return maxProfit;
    }

    public static int buySellStockOnce(List<Integer> A) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<A.size(); i++){
            maxProfit = Math.max(A.get(i)-min,maxProfit);
            min=Math.min(A.get(i),min);
        }
        return maxProfit;
    }
}
