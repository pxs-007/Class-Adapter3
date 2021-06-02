package as;

public class Adapter extends OldJuicer implements NewJuicer{
    @Override
    public String newPort(Fruit fruit1, Fruit fruit2) {
        String str="混合果汁："+oldPort(fruit1);
        String str2 =str+"混合"+oldPort(fruit2);
        return str2;
    }
}
