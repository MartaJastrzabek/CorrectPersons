public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person() {
    }

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefeinedException, IncorrectAgeException {
        check(firstName, lastName, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void check(String firstName, String lastName, int age) throws NameUndefeinedException, IncorrectAgeException {
        if(firstName == null || firstName.length()<2){
            throw new NameUndefeinedException("Imię");
        } else if(lastName==null || lastName.length()<2) {
            throw new NameUndefeinedException("Imię");
        }
        if(age < 1){
            throw new IncorrectAgeException();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Imie: " + firstName + " nazwisko: " + lastName
                + " wiek: " + age + " pesel: " + pesel;
    }
}

