package exporters;

import com.sun.tools.javac.Main;

import java.util.List;
import java.util.stream.Collectors;

public class ConsoleExporter  implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {


        System.out.print("[");
        for (var number: numbers){
            System.out.print( number + ", ");
        }
        System.out.print("]");



        // System.out.println("[" + numbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

    }
}




