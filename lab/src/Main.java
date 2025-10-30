public class Main {
    public static void main(String[] args) {
        Dean ftf = new Dean("ФТФ", "218", "С", "123-45-67", "Строганова Е.В.");
        Dean abc = new Dean("АБВ", "123", "Г", "111-22-33", "Петров П.П.");
        Dean def = new Dean("ДЕЖ", "456", "З", "444-55-66", "Иванов И.И.");

        Dean[] initialDeaneries = {ftf, abc, def};

        GroupDean group = new GroupDean(1, initialDeaneries);
        System.out.println(group);

        System.out.println("Плюс деканат ИКЛ");
        Dean ghi = new Dean("ИКЛ", "101", "М", "555-55-55", "Кузнецов К.К.");
        group.addDean(ghi);
        System.out.println(group);

        System.out.println("Минус деканат АБВ");
        group.removeDean("АБВ");
        System.out.println(group);

        Dean firstDeanery = group.getDeanElem(0);
        if (firstDeanery != null) {
            System.out.println(firstDeanery);
        }

        System.out.println("\nСортировка по названию");
        group.sortDean();
        System.out.println(group);
    }
}
