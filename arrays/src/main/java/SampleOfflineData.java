import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SampleOfflineData {

    /*
    6.11 Testing file had issues, and I resolved them based on my little understanding of the question…
    */

    public static void randomSampling(int k, List<Integer> list) {
        Random random = new Random();
        if(k>list.size()/2) k= list.size();

        for (int i=0; i<k; i++){
            Collections.swap(list, i,(i+random.nextInt(list.size()-i)));
        }
    }
}
