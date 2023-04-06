package prototype;

import java.util.Hashtable;

public class Class5Store {
    private static Hashtable<String, Class1Abstract> class1AbstractHashtable = new Hashtable<>();

    public static Class1Abstract method3(String var4) {
        Class1Abstract class1Abstract = class1AbstractHashtable.get(var4);
        return (Class1Abstract) class1Abstract.method2clone();
    }

    public static void load(){

        Class2 class2 = new Class2();
        class2.setVar1("2");
        class1AbstractHashtable.put(class2.getVar1(), class2);

        Class3 class3 = new Class3();
        class3.setVar1("3");
        class1AbstractHashtable.put(class3.getVar1(), class3);

        Class4 class4 = new Class4();
        class4.setVar1("4");
        class1AbstractHashtable.put(class4.getVar1(), class4);

    }
}
