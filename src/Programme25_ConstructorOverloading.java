public class Programme25_ConstructorOverloading {

    int id;
    String name;
    int age;
    Programme25_ConstructorOverloading(int i, String n){
        id = i;
        name = n;
    }
    Programme25_ConstructorOverloading(int i,String n,int a){
        id = i;
        name = n;
        age = a;
    }
    public void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Programme25_ConstructorOverloading s1 = new Programme25_ConstructorOverloading(111," Karan ");
        Programme25_ConstructorOverloading s2 = new Programme25_ConstructorOverloading(222," Aryan ",25);
        s1.display();
        s2.display();
    }
    }


