class Engine
{
    String type;
    int horsepower;

    Engine(String type, int horsepower)
    {
        this.type = type;
        this.horsepower = horsepower;
    }
}

class CarHasARelation
{
    String brand;
    String model;
    Engine engine;   // HAS-A relationship

    CarHasARelation(String brand, String model, Engine engine)
    {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    void display()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine Type: " + engine.type);
        System.out.println("Horsepower: " + engine.horsepower);
    }

    public static void main(String args[])
    {
        Engine e = new Engine("Petrol", 120);
        CarHasARelation c = new CarHasARelation("Toyota", "Corolla", e);

        c.display();
    }
}
