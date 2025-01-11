package DSA;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

    private List<List<Integer>> triangle;



    public  List<List<Integer>> PascalTraian(int row){
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> list =new LinkedList<>();
        for(int i=0;i<row;i++){
            if(list.isEmpty()){
                list.addFirst(1);
            }
            list.addLast(1);
        }

        result.add(list);

       triangle  = result;
        return triangle;
    }


    @Override
    public String toString() {
        return "PascalTriangle{" +
                "triangle=" + triangle +
                '}';
    }
}
