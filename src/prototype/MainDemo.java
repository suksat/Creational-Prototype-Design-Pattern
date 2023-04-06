package prototype;

public class MainDemo {
    public static void main(String[] args) {
        Class5Store.load();

        Class1Abstract class1Abstract2 = Class5Store.method3("2");
        System.out.println(class1Abstract2.getVar2());
        System.out.println(new Class2().var2);
        System.out.println("*** *** ***");

        Class1Abstract class1Abstract3 = Class5Store.method3("3");
        System.out.println(class1Abstract3.getVar2());
        System.out.println(new Class3().var2);
        System.out.println("*** *** ***");

        Class1Abstract class1Abstract4 = Class5Store.method3("4");
        System.out.println(class1Abstract4.getVar2());
        System.out.println(new Class4().var2);
        System.out.println("*** *** ***");


    }
}
