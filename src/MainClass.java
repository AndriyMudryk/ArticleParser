public class MainClass {
    public static void main(String[] args) {
        String article = "Продаю квартиру по вул. Шевченка. Є ремонт. 2 кімнати, із кухнею. Площа 100 м2. Із балконом на 2 поверсі в панельному будинку. тип к. суміжні. Ціна 12000 грн/м2";
        Parser p = new HouseParser();
        p.regexParse(article);
        System.out.println(((HouseParser) p).getHouse().toString());
    }
}
