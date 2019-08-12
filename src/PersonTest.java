import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadz nową osobę (podaj imię, nazwisko, wiek i pesel): ");
        String firstName = in.nextLine();
        String lastName = in.nextLine();
        int age = in.nextInt();
        in.nextLine();
        String pesel = in.nextLine();

    try{
        Person person1  = new Person(firstName, lastName, age, pesel);
        System.out.println(person1);
    } catch (NameUndefeinedException |IncorrectAgeException e){
        System.out.println(e.getMessage());
    }




    }
}
