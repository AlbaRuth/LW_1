package bsu.rfe.java.group9.lab1.Sakovich.A7;

public class IceCream extends Food {
    // Новое внутреннее поле данных РАЗМЕР
    private String sirup;

    public IceCream(String sirup) {
        super("Мороженое");
        this.sirup = sirup;
    }
    @Override
    public void consume() {
        System.out.println(this + " съедено");
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getSirup() {
        return sirup;
    }
    // Модификатор для изменения поля данных СИРОП
    public void setSirup(String sirup) {
        this.sirup = sirup;
    }
    // Переопределѐнная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof IceCream)) return false; // Шаг 2
            return sirup.equals(((IceCream)arg0).sirup); // Шаг 3
        } else
            return false;
    }
    // Переопределѐнная версия метода toString(), возвращающая не только
// название продукта, но и его размер
    public String toString() {
        return super.toString() + " с сиропом '" + sirup.toUpperCase() + "'";
    }
}