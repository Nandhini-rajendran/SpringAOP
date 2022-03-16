package com.loonycorn;

import com.loonycorn.pointcuts.Item;
import com.loonycorn.pointcuts.ItemList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Item itemOne = (Item) context.getBean("itemBeanOne");
        Item itemTwo = (Item) context.getBean("itemBeanTwo");

        ItemList myList = (ItemList) context.getBean("listBean");

        myList.printNumItems();
        myList.displayItemList();

        System.out.println("\n=======================================");
        System.out.println("\nDisplaying the items one at a time...\n");
        itemOne.printItemDetails();
        itemTwo.printItemDetails();

    }
}