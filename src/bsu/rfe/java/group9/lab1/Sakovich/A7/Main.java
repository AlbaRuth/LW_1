package bsu.rfe.java.group9.lab1.Sakovich.A7;


public class Main
{

    // Конструктор класса отсутствует!!!
    // Главный метод главного класса
    @SuppressWarnings("unchecked")
    public static void main(String [] args) throws Exception {
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        int icecreamcount = 0;

        for (String arg: args)
        {
            String[] parts = arg.split("/");
            if (parts[0].equals("Сыр")) {
                breakfast[itemsSoFar] = new Cheese();
                itemsSoFar++;
            } else if (parts[0].equals("Яблоко")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
                itemsSoFar++;
            } else if (parts[0].equals("Мороженое")) {
                breakfast[itemsSoFar] = new IceCream(parts[1]);
                itemsSoFar++;
                icecreamcount++;
            }
        }
// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
            break;

        System.out.println("Всего " + icecreamcount + " мороженых съедно") ;
        System.out.println("Всего хорошего!");
    }
}