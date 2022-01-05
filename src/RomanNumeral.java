
public enum RomanNumeral {
    I("I", 1), II("II", 2), III("III", 3), IV("IV", 4),
    V("V", 5), VI("VI", 6), VII("VII", 7), VIII("VIII", 8),
    IX("IX", 9), X("X", 10);// numbers

    public int value;
    public String key;

    RomanNumeral(String key, int value) {
        this.value = value;
    }
    public RomanNumeral romanNumeral;

    public int getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    int toInt(String key) {
        for (RomanNumeral i : this.values())
            if (i.getKey().equals(key))
                return i.getValue();
        return 0;
    }

}