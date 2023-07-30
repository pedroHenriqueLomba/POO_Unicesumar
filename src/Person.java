import java.time.LocalDate;
import java.time.Period;

public class Person {
    public String name;
    public Integer age;
    private LocalDate birthday;

    // Função executada ao criar um objeto
    public Person(String name, LocalDate birthday)
    {
        this.name = name;
        this.birthday = birthday;
        this.age = this.calculateAge(birthday);
    }

    // Função criada com o intuito de resgatar o nome
    public String getName() {
        return this.name;
    }

    // Função criada com o intuito de resgatar o dia do nascimento
    public LocalDate getBirthday() {
        return this.birthday;
    }

    // Função criada com o intuito de resgatar a idade
    public Integer getAge() {
        return this.age;
    }

    // Função criada com o intuito de alterar o nome
    public void setName(String newName) {
        this.name = newName;
    }

    // Função criada com o intuito de alterar o dia do nascimento
    public void setBirthday(LocalDate newBirthday) {
        this.birthday = newBirthday;
        this.updateAge();
    }

    // Função criada com o intuito de alterar a idade sempre que o dia do nascimento for alterado
    private void updateAge(){
        this.age = this.calculateAge(this.birthday);
    }

    // Função criada para calcular a idade através do dia do nascimento
    private int calculateAge(LocalDate birthday){
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthday, currentDate).getYears();
    }
}