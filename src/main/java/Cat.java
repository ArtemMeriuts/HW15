
public class Cat{

    public String name;
    public String breed;
    public Integer age;
    public Integer weight;


    public Cat(String name, String breed, Integer age, Integer weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public Cat () {

    }

    public Cat (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }




    public static void main(String[] args) {
        Cat barsik = new Cat("barsik", "britain" , 13, 12);
        Cat murzik = new Cat("murzik", "dvornyaga", 11, 7);
        System.out.println(barsik.age.equals(murzik.age));
        System.out.println(barsik.weight.equals(murzik.weight));

    }








}