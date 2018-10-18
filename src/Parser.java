abstract class Parser {
    abstract boolean simpleParse(String text);

    abstract boolean regexParse(String text);
}

class HouseParser extends Parser {
    HouseInfo house;
    boolean isParsed;

    public HouseParser() {
        this.house = new HouseInfo();
        this.isParsed = false;
    }

    public boolean simpleParse(String text) {
        return false;
    }

    public boolean regexParse(String text) {
        return false;
    }

}
