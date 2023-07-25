package Task3;
/**Урок 3. Принципы SOLID
1) Спроектировать абстрактный класс «Car» у которого должны быть свойства: марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя; методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
2) Создать конкретный автомобиль путём наследования класса «Car».
3) Создать интерфейс «Заправочная станция», создать метод: заправка топливом.
4) Имплементировать метод интерфейса «Заправочная станция» в конкретный класс «Car».
5) Создать путём наследования класса «Car» два автомобиля: с бензиновым и дизельным двигателями,
 имплементировать метод «Заправка топливом» интерфейса «Заправочная станция». 
 Реализовать заправку каждого автомобиля подходящим топливом.

По разработанному коду нарисовать UML диаграмму.
Диаграмму можно нарисовать на ресурсе:https://online.visual-paradigm.com/login.jsp?t=diagrams */

public abstract class Car {
    protected String model;
    protected String brand;
    protected String color;
    protected String bodyType;
    protected int cnumberOfWheels;

    public Car(String model, String brand, String color, String bodyType, int cnumberOfWheels) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.bodyType = bodyType;
        this.cnumberOfWheels = cnumberOfWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCnumberOfWheels() {
        return cnumberOfWheels;
    }

    public void setCnumberOfWheels(int cnumberOfWheels) {
        this.cnumberOfWheels = cnumberOfWheels;
    }

    

   
    


    
    
}
