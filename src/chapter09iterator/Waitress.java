package chapter09iterator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/29 15:22
 */
public class Waitress {
//    private Menu pancakeHouseMenu;
//    private Menu dinerMenu;
//    private Menu cafeMenu;
//
//    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu,Menu cafeMenu) {
//        this.pancakeHouseMenu = pancakeHouseMenu;
//        this.dinerMenu = dinerMenu;
//        this.cafeMenu = cafeMenu;
//    }


//    private List<Menu> menus;
//
//    public Waitress(List<Menu> menus) {
//        this.menus = menus;
//    }

    MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu(){
//        java.util.Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
//        java.util.Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
//        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();
//        System.out.println(MyUtils.getCurrentTime() +"Menu");
//        System.out.println(MyUtils.getCurrentTime() +"==============");
//        System.out.println(MyUtils.getCurrentTime() +"BREAKFAST");
//        printMenu(pancakeHouseMenuIterator);
//        System.out.println(MyUtils.getCurrentTime() +"LUNCH");
//        printMenu(dinerMenuIterator);
//        System.out.println(MyUtils.getCurrentTime() +"DINNER");
//        printMenu(cafeMenuIterator);

//        for (Menu menu : menus) {
//            printMenu(menu.createIterator());
//        }

        menuComponent.print();
    }

//    private void printMenu(java.util.Iterator<MenuItem> iterator) {
//        while (iterator.hasNext()) {
//            MenuItem next = iterator.next();
//            if (next != null) {
//                System.out.println(MyUtils.getCurrentTime() + next.getName()+", "+next.getPrice()+" -- "+next.getDescription());
//            }
//        }
//    }
}
