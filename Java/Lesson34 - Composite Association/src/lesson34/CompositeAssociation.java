package lesson34;

/* Association is when one class has another class as an attribute, not as extension. Its about having, not being. For example, you have a House class, and a Window class. The house HAS windows, but the house IS NOT a window. Can you see the difference? Therefore, we do not extend the class House, we add the windows as attribute of the House class.

Composite Association is when there is a strong dependence. For example, your class House HAS 3 windows, each window is an exclusive attribute of the House. By the time the house is destroyed, all the windows are destroyed as well */

public class CompositeAssociation {

    public static void main(String[] args) {
        
        House myHouse = new House();
        
        System.out.println(myHouse.bedroomWindows[1].isOpen());
        myHouse.kitchenWindow.openWindow();
        System.out.println(myHouse.kitchenWindow.isOpen());
    }
    
}
