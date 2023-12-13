package valuableChakhrit;
import utilChakhrit.Tool023;

import java.util.Objects;

public class Item023 {
    private final String name;
    private int amount;
    private Item023(String name,int amount){
        this.name = name;
        this.amount = amount;
    }
    public static Item023 create(String name,int amount){
        if(!Tool023.isUsable023(name) || amount < 0) return null;
        return new Item023(name,amount);
    }

    @Override
    public String toString() {
        return "(" +name + ',' + amount +
                ")";
    }
    public int add(Item023 item){
        int sum= this.amount;
        sum += item.amount;
        return sum;
    }
    public boolean isMatched(Item023 item){
        return this.name.equalsIgnoreCase(item.name);
        //return Objects.equals(this.name, item.name);
    }
}
