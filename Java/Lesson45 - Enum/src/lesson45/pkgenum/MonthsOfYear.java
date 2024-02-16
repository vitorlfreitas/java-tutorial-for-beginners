package lesson45.pkgenum;

public enum MonthsOfYear {
    
    JAN(1), 
    FEB(2), 
    MAR(3), 
    APR(4), 
    MAY(5), 
    JUN(6);
    
    // Use final to be sure anyone will change the value of your enum
    private final int numberOfMonth;
    
    
    MonthsOfYear (int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }
    
    public int getNumberOfMonth() {
        return numberOfMonth;
    }
    
}
