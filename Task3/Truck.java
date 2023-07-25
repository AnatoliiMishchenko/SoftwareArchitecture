package Task3;

public class Truck extends Car implements GasStation{
    

    @Override
    public String getBodyType() {
        // TODO Auto-generated method stub
        return super.getBodyType();
    }

    @Override
    public String getBrand() {
        // TODO Auto-generated method stub
        return super.getBrand();
    }

    @Override
    public int getCnumberOfWheels() {
        // TODO Auto-generated method stub
        return super.getCnumberOfWheels();
    }

    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return super.getColor();
    }

    @Override
    public String getModel() {
        // TODO Auto-generated method stub
        return super.getModel();
    }

    @Override
    public void setBodyType(String bodyType) {
        // TODO Auto-generated method stub
        super.setBodyType(bodyType);
    }

    @Override
    public void setBrand(String brand) {
        // TODO Auto-generated method stub
        super.setBrand(brand);
    }

    @Override
    public void setCnumberOfWheels(int cnumberOfWheels) {
        // TODO Auto-generated method stub
        super.setCnumberOfWheels(cnumberOfWheels);
    }

    @Override
    public void setColor(String color) {
        // TODO Auto-generated method stub
        super.setColor(color);
    }

    @Override
    public void setModel(String model) {
        // TODO Auto-generated method stub
        super.setModel(model);
    }

    public Truck(String model, String brand, String color, String bodyType, int cnumberOfWheels) {
        super(model, brand, color, bodyType, cnumberOfWheels);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void refueling() {
        System.out.println("Автомобиль ездиет на бензине");
    }
}
