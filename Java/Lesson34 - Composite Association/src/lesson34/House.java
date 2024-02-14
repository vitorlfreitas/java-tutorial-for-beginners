package lesson34;

public class House {
    
    Window kitchenWindow;
    Window livingRoomWindow;
    Window[] bedroomWindows;

    public House() {
        
        this.kitchenWindow = new Window();
        this.livingRoomWindow = new Window();
        this.bedroomWindows = new Window[2];
        for (int i = 0; i < bedroomWindows.length; i++) {
            bedroomWindows[i] = new Window();
        }
        
    }
    
    
}
