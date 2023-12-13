package org.example;


import valuableChakhrit.Container023;
import valuableChakhrit.Item023;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        testItem023();
        testContainer023();

    }



    private static void testItem023() {
        Item023 item1 = Item023.create("Dear",1500);
        Item023 item3 = Item023.create("Tea",200);
        Item023 item4 = Item023.create("tar",100);
        Item023 item5 = Item023.create("two",300);
        System.out.println("### testItem023 ###");
        System.out.print("create item name=\"\" " + "amount=-150 : ");
        System.out.println(  Item023.create("",-150));
        System.out.print("create item name=null amount=-150 : ");
        System.out.println(Item023.create(null,0));
        System.out.println("use method add for item1(amount=1500) with item3(amount=200) : "+item1.add(item3));
        System.out.println("use method isMatched for item1 and item3 : "+item1.isMatched(item3));
        System.out.println("use method isMatched for item4 and item4 : "+item4.isMatched(item4));
        System.out.println("");
    }

   private static void testContainer023() {

        Item023 item1 = Item023.create("Dear",1500);
        Item023 item3 = Item023.create("Tea",200);
        Item023 item4 = Item023.create("tar",100);
        Item023 item5 = Item023.create("two",300);
        Container023 container = new Container023();
        container.add(item1);
        container.add(item3);
        container.add(item4);
        container.add(item5);

        System.out.println("### Container023 ###");
        System.out.println("container : "+container);
        container.remove(item3);
       System.out.println("remove item 3 from container : "+container);
       System.out.println("");


    }
}