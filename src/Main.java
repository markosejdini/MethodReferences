import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

class PlainOld {
    private static int last_id = 1;

    private int id ;
    public PlainOld() {

        id = PlainOld.last_id++;
        System.out.println("Creating a plain object id: " +id);
    }
}

public class Main   {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>(
                List.of("Anna", "Bob","Ben","Arthur")
        );

        list.forEach(System.out::println);

        calculator(Integer::sum, 10,5);

        Supplier<PlainOld> reference1= PlainOld::new;
        PlainOld pojo = reference1.get();
    }

    private static <T> void calculator (BinaryOperator<T> function ,T value1, T value2) {
        T result = function.apply(value1,value2);
        System.out.println("Result: "+ result);

    }
}
