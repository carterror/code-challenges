import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Main{
    
	public static void main(String[] args) {
		
		List<Integer> numbers1 = List.of(1, 2, 3, 4, 3, 1, 2);
		       
	}
	
	public static Integer duplicate( List<Integer> numbers ) {
	    Set<Integer> set = new HashSet<>();
        List<Object> duplicates = new ArrayList<>();
        
        for (int i=0; i<numbers.size(); i++) {
            if(!set.add(numbers.get(i))) {
                return numbers.get(i);
            }
        }

        // numbers.forEach(n -> {
        //   if (!set.add(n)) {
        //     duplicates.add(n);
        //   }
        // });

        return -1;
	}
}