package problems;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {

        ArrayList<Integer> result = new ArrayList<>();

        result.add(1);
        for (int i = 1; i <=rowIndex ; i++) {
            System.out.print(" i :" + i);
            for (int j = result.size()-2; j >=0; j--) {
                System.out.print(" j :" + j);
                result.set(j+1 , result.get(j) + result.get(j+1));
                System.out.println(" result in forj:" + result);
            }
            result.add(1);

        }
        System.out.println(" result final:" + result);
        return result;
    }
}
