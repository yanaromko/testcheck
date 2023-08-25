public enum Rim {
    I("I", 1), II("II", 2), III("III", 3), IV("IV", 4), V("V", 5), VI("VI", 6), VII("VII", 7), VIII("VIII", 8), IX("IX", 9), X("X", 10);
    private int numbersar;
    private String numbersrim;
    Rim(String numbersrim, int numbersar){
        this.numbersar = numbersar;
        this.numbersrim = numbersrim;
    }
    public String getNumbersrim(){
        return numbersrim;
    }

    public int getNumbersar(){
        return numbersar;
    }


}
