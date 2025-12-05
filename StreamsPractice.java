import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsPractice {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,3,8,0,4,7);
        Predicate<Integer>pred = new Predicate<>(){
            @Override
            public boolean test(Integer t){
                return t%2==0;
            }
        };
       long cnt= numbers.stream()
                .filter(pred)
                .count();
        System.out.println("Count of even numbers: " + cnt);

        numbers.stream()
                        .filter(t->t%2==0)
                        .forEach(System.out::println);

        System.out.println("Sorted numbers: ");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Sorted numbers in reverse order: ");

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        long count = numbers.stream()

                .filter(t -> t % 2 == 0)
                .peek(System.out::println)
                .count();
        System.out.println("Count of even numbers: " + cnt);

        //data transformation
        Function<Integer,Integer> func = new Function<>(){
            @Override
            public Integer apply(Integer t){
                return t*t;
            }
        };

        System.out.println("Squared numbers: ");
        numbers.stream()
                .map(t->t*t)
                .forEach(System.out::println);


      System.out.println("from a list of employee names, find those with atleast 5 characters.convert them to uppercase and arrange them alphabetically then print them");
        List<String>employees = List.of("John","Alexandra","Ben","David","Christina","Amy");

        employees.stream()
                .filter(name ->name.length()>=5)
                .map(name ->name.toUpperCase())
                .sorted()
                .forEach(System.out::println);

    System.out.println("from an array of integers, select the even ones,calculate their squares and print them in inreasing order.also  show many met the criteria");
    Integer[]nums = {3,6,1,8,5,10,7};

    long evenCount = List.of(nums).stream()
            .filter(t->t%2==0)
            .map(t->t*t)
            .sorted()
            .peek(System.out::println)
            .count();
    System.out.println("count "+ evenCount);

    
    System.out.println("You are given a sentence that contains several words. First, extract all the words that begin with the letter 'A', regardless of whether they are uppercase or lowercase. Then, convert each of these words into lowercase form.After that, reverse the letters in each word. Once the words are reversed, arrange them in order from shortest to longest. Finally, for each word, display the reversed version along with the number of characters it contains.");

    String sentence = "Our channel provides Amazing Automation content for java and Selenium learners and professionals";

    List.of(sentence.split(" ")).stream()
            .filter(word -> word.toLowerCase().charAt(0)=='a')
            .map(word->word.toLowerCase())
            .map(word-> new StringBuilder(word).reverse().toString())
            .sorted(Comparator.comparingInt(String::length))
            .forEach(word-> System.out.println(word + " - " + word.length()));


    
    
    System.out.println("You are given a list of employees, where each employee has a name and a salary.\n" + //
                "Your task is to go through the list and apply the following rules based on their salary to calculate a bonus:\n" + //
                "If the salary is up to 230,000, apply a 15% bonus.\n" + //
                "If the salary is more than €30,000 and up to €75,000, apply a 12.5% bonus.\n" + //
                "If the salary is above €75,000, apply a 10% bonus.\n" + //
                "After calculating the bonus-adjusted salaries, you should display the names and updated salaries (original + bonus) of all employees who originally earned more than 850,000. Finally, print the total number of such employees who earned above\n" + //
                "850,000 before the bonus.");

    
            
    List<Employee> emp = Arrays.asList(
        new Employee("Arjun",28000),
        new Employee("Meera",52000),
        new Employee("Rahul", 61000),
        new Employee("Divya",47000),
        new Employee("Karan",75000)
    );

   long c= emp.stream()
        .map(e->{
            double bonus = 0;
            if(e.salary <= 30000){
                bonus = e.salary*0.15;
            }else if(e.salary > 30000 && e.salary <= 75000){
                bonus = e.salary*0.125;
            }else {
                bonus = e.salary*0.10;
            }
            return new Employee(e.name, e.salary,e.salary+bonus);
        })
        .peek(e->{
            if(e.salariedWithBonus > 50000)
                System.out.println(e.name + ": " + e.salariedWithBonus);
        })
        .filter(e->e.salary >50000)
        .count();

    System.out.println("Total employees with salary above 50000: " + c);

               
    }
    
    static class Employee{
        String name;
        int salary;
        double salariedWithBonus;
        Employee(String name,int salary){
            this.name = name;
            this.salary = salary;
        }
        Employee(String name,int salary, double salariedWithBonus){
            this.name = name;
            this.salary = salary;
            this.salariedWithBonus = salariedWithBonus;
        }
    }
}
