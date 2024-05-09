//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Person p = new Person();
            p.name = "김코딩";
            p.age = 24;
            p.learn();
            p.eat();
            p.walk();
            System.out.println(p.name);

            Programmer pg = new Programmer();
            pg.name = "박해커";
            pg.age = 25;
            p.eat();
            p.walk();
            System.out.println(p.age);
    }

}