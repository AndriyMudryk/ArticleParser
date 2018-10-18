import java.util.regex.Pattern;

abstract class Matcher {
}

class HouseMatcher extends Matcher {

    private static String roomNumberRegex = "((((кімнат)|(кім.))\\s+\\d)|(\\d\\s+кімнат(ами)?(и)))";
    private static String addressRegex = "((вул.)|(вулиці))\\s+[А-Яа-яёЁЇїІіЄєҐґ]+";
    private static String floorRegex = "((((поверх)|(пов.))\\s+\\d+)|(\\d+\\s+(поверх|поверсі)))";
    private static String typeRegex = "((панельн((ий)|(ому)))|(цеглян((ий)|(ому))))";
    private static String roomTypeRegex = "((тип ([к]((імнат)|([.]))))[:]?\\s*[А-Яа-яёЁЇїІіЄєҐґ]+)";
    private static String kitchenRegex = "(([іІ]з кухнею)|([єЄ] кухня))";
    private static String areaRegex = "\\d+\\s+(м2)";
    private static String balconyRegex = "(([іІ]з балконом)|([єЄ] балкон))";
    private static String styleRegex = "(([іІ]з ремонтом)|([єЄ] ремонт))";
    private static String priceRegex = "\\d+\\s+((((грн)|(гривень))((\\/м2)|([.]?))))";

    public static String matchRoomNumber(String text) {
        Pattern p = Pattern.compile(roomNumberRegex);
        java.util.regex.Matcher m = p.matcher(text);
        if(m.find()){
            return m.group();
        }
        else{
            return "";
        }
    }

    public static String matchAddress(String text) {
        Pattern p = Pattern.compile(addressRegex);
        java.util.regex.Matcher m = p.matcher(text);
        if(m.find()){
            return m.group();
        }
        else{
            return "";
        }
    }

    public static String matchFloor(String text) {
        Pattern p = Pattern.compile(floorRegex);
        java.util.regex.Matcher m = p.matcher(text);
        if(m.find()){
            return m.group();
        }
        else{
            return "";
        }
    }
    public static String matchType(String text) {
        Pattern p = Pattern.compile(typeRegex);
        java.util.regex.Matcher m = p.matcher(text);
        if(m.find()){
            return m.group();
        }
        else{
            return "";
        }
    }

    public static String matchRoomType(String text) {
        Pattern p = Pattern.compile(roomTypeRegex);
        java.util.regex.Matcher m = p.matcher(text);
        if(m.find()){
            return m.group();
        }
        else{
            return "";
        }
    }

    public static String matchKitchen(String text) {
        Pattern p = Pattern.compile(kitchenRegex);
        java.util.regex.Matcher m = p.matcher(text);
        if(m.find()){
            return m.group();
        }
        else{
            return "";
        }
    }

    public static String matchArea(String text) {
        Pattern p = Pattern.compile(areaRegex);
        java.util.regex.Matcher m = p.matcher(text);
        if(m.find()){
            return m.group();
        }
        else{
            return "";
        }
    }

    public static String matchBalcony(String text) {
        Pattern p = Pattern.compile(balconyRegex);
        java.util.regex.Matcher m = p.matcher(text);
        if(m.find()){
            return m.group();
        }
        else{
            return "";
        }
    }

    public static String matchStyle(String text) {
        Pattern p = Pattern.compile(styleRegex);
        java.util.regex.Matcher m = p.matcher(text);
        if(m.find()){
            return m.group();
        }
        else{
            return "";
        }
    }

    public static String matchPrice(String text) {
        Pattern p = Pattern.compile(priceRegex);
        java.util.regex.Matcher m = p.matcher(text);
        if(m.find()){
            return m.group();
        }
        else{
            return "";
        }
    }
}
