package chapter09iterator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/29 14:26
 */
public class MenuTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
//        ArrayList<Menu> menus = new ArrayList<>();
//        menus.add(pancakeHouseMenu);
//        menus.add(dinerMenu);
//        menus.add(cafeMenu);
//        Waitress waitress = new Waitress(menus);
//        waitress.printMenu();

        MenuComponent pancakehouseMenu = new MenuEntity("PANCAKE HOUSE MENU", "Breakfast", pancakeHouseMenu.createIterator());
        MenuComponent dinersMenu = new MenuEntity("DINER MENU", "Diner", dinerMenu.createIterator());
        MenuComponent cafesMenu = new MenuEntity("CAFE MENU", "Cafe Diner", cafeMenu.createIterator());
        MenuComponent allMenus = new MenuEntity("ALL MENUS","All menus combined!",null);
        allMenus.add(pancakehouseMenu);
        allMenus.add(dinersMenu);
        allMenus.add(cafesMenu);
        allMenus.print();
    }
}
//  2018-1-3 11:22:25版本
//        2018-01-03 11:19:09:522  Menu
//        2018-01-03 11:19:09:523  ==============
//        2018-01-03 11:19:09:523  BREAKFAST
//        2018-01-03 11:19:09:523  K&B's Pancake Breakfast, 2.99 -- Pancake with scrambled eggs,and toast
//        2018-01-03 11:19:09:524  Regular Pancake Breakfast, 2.99 -- Pancake with fried eggs,and sausage
//        2018-01-03 11:19:09:525  BlueBerry Pancake Breakfast, 3.49 -- Pancake with fresh blueberries
//        2018-01-03 11:19:09:525  Waffles, 3.59 -- Waffles,with your choice of blueberries or strawberries
//        2018-01-03 11:19:09:525  LUNCH
//        2018-01-03 11:19:09:525  Vegetarian BLT, 2.99 -- (Fakin') Bacon with lettuce & tomatos on whole wheat
//        2018-01-03 11:19:09:525  BLT, 2.99 -- Bacon with lettuce & tomatos on whole wheat
//        2018-01-03 11:19:09:525  Soup of the Day, 3.29 -- Soup of the day,with a side of potato salad
//        2018-01-03 11:19:09:525  Hot dog, 3.29 -- A hot dog,with saurkraut,relish,onions,topped with cheese

//  2018-1-3 16:04:20版本
//        2018-01-03 16:03:33:220  Menu
//        2018-01-03 16:03:33:220  ==============
//        2018-01-03 16:03:33:220  BREAKFAST
//        2018-01-03 16:03:33:220  K&B's Pancake Breakfast, 2.99 -- Pancake with scrambled eggs,and toast
//        2018-01-03 16:03:33:220  Regular Pancake Breakfast, 2.99 -- Pancake with fried eggs,and sausage
//        2018-01-03 16:03:33:235  BlueBerry Pancake Breakfast, 3.49 -- Pancake with fresh blueberries
//        2018-01-03 16:03:33:235  Waffles, 3.59 -- Waffles,with your choice of blueberries or strawberries
//        2018-01-03 16:03:33:235  LUNCH
//        2018-01-03 16:03:33:235  Vegetarian BLT, 2.99 -- (Fakin') Bacon with lettuce & tomatos on whole wheat
//        2018-01-03 16:03:33:235  BLT, 2.99 -- Bacon with lettuce & tomatos on whole wheat
//        2018-01-03 16:03:33:235  Soup of the Day, 3.29 -- Soup of the day,with a side of potato salad
//        2018-01-03 16:03:33:235  Hot dog, 3.29 -- A hot dog,with saurkraut,relish,onions,topped with cheese
//        2018-01-03 16:03:33:235  DINNER
//        2018-01-03 16:03:33:235  Soup of the day, 3.69 -- A cup of soup of the day,with a side salad
//        2018-01-03 16:03:33:235  Burrito, 4.29 -- A large burrito,with whole pinto beans,salsa,guacamole
//        2018-01-03 16:03:33:235  Veggie Burger and Air Fries, 3.99 -- Veggie burger and a whole wheat bun,lettuce,tomato,and fries

//  2018-1-3 16:53:27版本
//        2018-01-03 16:52:43:903  K&B's Pancake Breakfast, 2.99 -- Pancake with scrambled eggs,and toast
//        2018-01-03 16:52:43:903  Regular Pancake Breakfast, 2.99 -- Pancake with fried eggs,and sausage
//        2018-01-03 16:52:43:903  BlueBerry Pancake Breakfast, 3.49 -- Pancake with fresh blueberries
//        2018-01-03 16:52:43:903  Waffles, 3.59 -- Waffles,with your choice of blueberries or strawberries
//        2018-01-03 16:52:43:903  Vegetarian BLT, 2.99 -- (Fakin') Bacon with lettuce & tomatos on whole wheat
//        2018-01-03 16:52:43:903  BLT, 2.99 -- Bacon with lettuce & tomatos on whole wheat
//        2018-01-03 16:52:43:903  Soup of the Day, 3.29 -- Soup of the day,with a side of potato salad
//        2018-01-03 16:52:43:903  Hot dog, 3.29 -- A hot dog,with saurkraut,relish,onions,topped with cheese
//        2018-01-03 16:52:43:903  Soup of the day, 3.69 -- A cup of soup of the day,with a side salad
//        2018-01-03 16:52:43:903  Burrito, 4.29 -- A large burrito,with whole pinto beans,salsa,guacamole
//        2018-01-03 16:52:43:903  Veggie Burger and Air Fries, 3.99 -- Veggie burger and a whole wheat bun,lettuce,tomato,and fries

//  2018-1-3 18:13:34版本
//
//        2018-01-03 18:12:23:451  ALL MENUS, All menus combined!
//        2018-01-03 18:12:23:452  -----------------------------------
//        2018-01-03 18:12:23:452  PANCAKE HOUSE MENU, Breakfast
//        2018-01-03 18:12:23:452  -----------------------------------
//        2018-01-03 18:12:23:452    K&B's Pancake Breakfast(v), 2.99
//        2018-01-03 18:12:23:453      -- Pancake with scrambled eggs,and toast
//        2018-01-03 18:12:23:453    Regular Pancake Breakfast, 2.99
//        2018-01-03 18:12:23:453      -- Pancake with fried eggs,and sausage
//        2018-01-03 18:12:23:453    BlueBerry Pancake Breakfast(v), 3.49
//        2018-01-03 18:12:23:453      -- Pancake with fresh blueberries
//        2018-01-03 18:12:23:453    Waffles(v), 3.59
//        2018-01-03 18:12:23:454      -- Waffles,with your choice of blueberries or strawberries
//        2018-01-03 18:12:23:454  DINER MENU, Diner
//        2018-01-03 18:12:23:454  -----------------------------------
//        2018-01-03 18:12:23:454    Vegetarian BLT(v), 2.99
//        2018-01-03 18:12:23:454      -- (Fakin') Bacon with lettuce & tomatos on whole wheat
//        2018-01-03 18:12:23:454    BLT, 2.99
//        2018-01-03 18:12:23:454      -- Bacon with lettuce & tomatos on whole wheat
//        2018-01-03 18:12:23:454    Soup of the Day, 3.29
//        2018-01-03 18:12:23:455      -- Soup of the day,with a side of potato salad
//        2018-01-03 18:12:23:455    Hot dog, 3.29
//        2018-01-03 18:12:23:455      -- A hot dog,with saurkraut,relish,onions,topped with cheese
//        2018-01-03 18:12:23:455  CAFE MENU, Cafe Diner
//        2018-01-03 18:12:23:455  -----------------------------------
//        2018-01-03 18:12:23:455    Soup of the day, 3.69
//        2018-01-03 18:12:23:455      -- A cup of soup of the day,with a side salad
//        2018-01-03 18:12:23:455    Burrito(v), 4.29
//        2018-01-03 18:12:23:455      -- A large burrito,with whole pinto beans,salsa,guacamole
//        2018-01-03 18:12:23:456    Veggie Burger and Air Fries(v), 3.99
//        2018-01-03 18:12:23:456      -- Veggie burger and a whole wheat bun,lettuce,tomato,and fries
