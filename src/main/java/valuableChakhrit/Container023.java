package valuableChakhrit;

import utilChakhrit.Tool023;

import java.util.Arrays;

public class Container023 {
    private Item023[] items = new Item023[23];

    @Override
    public String toString() {
       int i = Tool023.count023(items);
        return "Container023{" +
                "items=" + Arrays.toString(items) + "\nnumber of Item023 = "+i+
                '}';
    }
    public boolean add(Item023 item){
        for(int i = 0;i < items.length;i++){
            if(items[i] == null && items[i]!=item){
                items[i]=item;
                return true;
            }
            if(items[i] == item){
                items[i].add(item);
            }
        }
        return false;
    }
    public boolean remove(Item023 item){
        for(int i = 0; i < items.length;i++){
           if(items[i] == item){
               items[i] = null;
               return true;}
        }
        return false;
    }
}
