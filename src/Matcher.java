abstract class Matcher {
}

class HouseMatcher extends Matcher {

    static String roomNumberRegex = "(\\B((кімнат)|(кім.))\\s+\\d)|(\\d\\s+кімнат(ами)*\\B)";
    static String addressRegex = "[A-Z]{1}[a-z]{1,20}\\s?\\d{1,3}[a-z]?\\\\d{1,3}";
    static String floorRegex = "(\\B((поверх)|(пов.))\\s+\\d)|(\\d\\s+(поверх|поверсі)*\\B)";
    static String typeRegex = "((панельн((ий)|(ому)))|(цеглян((ий)|(ому))))";
    static String roomTypeRegex = "(\\B(тип ([к]((імнат)|([.]))))[:]?\\s*[А-Яа-яёЁЇїІіЄєҐґ]+)";
    static String kitchenRegex = "((із кухнею)|(є кухня))";
    static String areaRegex = "\\d([,]|[.])?\\d?\\s(м2)";
    static String balconyRegex = "((із балконом)|(є балкон))";
    static String styleRegex = "((із ремонтом)|(є ремонт))";
    static String priceRegex = "\\d\\s((((грн)|(гривень))((\\/м2)|([.]?))))";

    public boolean matchRoomNumber(String text) {
        return true;
    }
}
