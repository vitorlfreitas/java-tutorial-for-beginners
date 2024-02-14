package lesson34;

public class Window {
    
    private boolean isOpen = false;
    
    
    public void openWindow() {
        isOpen = true;
    }
    public void closeWindow() {
        isOpen = false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    
}
