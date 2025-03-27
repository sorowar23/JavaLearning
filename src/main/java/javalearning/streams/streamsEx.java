package javalearning.streams;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streamsEx {

    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);
        numbersList.add(40);

        System.out.println("Numbers List: "+ numbersList);

       /* List<Integer> squareList = new ArrayList<>();
        for(Integer item: numbersList){
            squareList.add(item*item);
        }
        System.out.println("Square List: "+ squareList);
        */
        List<Integer> squareList = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("Square List: "+ squareList);

      /*  Set<Integer> squareSet = new HashSet<>();
        for(Integer num :numbersList){
            squareSet.add(num * num);
        }

        System.out.println("Square Set: "+ squareSet);
       */

        Set<Integer> squareSet1 = numbersList.stream().map(x-> x*x).collect(Collectors.toSet());
        System.out.println("Square Set: "+ squareSet1);

        List<String> languages = new ArrayList<>();
        languages.add("Scala");
        languages.add("Java");
        languages.add("Php");
        languages.add("Python");
        languages.add("C");
        languages.add("C++");
        languages.add("R");


        List<String> filterResult = new ArrayList<>();

        for(String result: languages){
            if(result.startsWith("P")){
                filterResult.add(result);
            }
        }
        System.out.println("FilterList Items: "+filterResult);

        List<String> filterResult1 = languages.stream().filter(x->x.startsWith("P")).collect(Collectors.toList());
        System.out.println(filterResult1);

        List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
        System.out.println("Languages sorted by alphabetical order: "+ sortedList);

        languages.stream().sorted().forEach(x -> System.out.println("Element is: - "+x));

        //Need to learn about more about "Reduce()" method on stream

    }
}
