package prototype;

public abstract class Class1Abstract implements Cloneable {
    private String var1;
    protected String var2;

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public Object method2clone() {
        Object var3 = null;
        try {
            var3 = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return var3;
    }

}
