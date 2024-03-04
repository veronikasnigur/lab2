package Controller;
import Model.Motorcycle;
import View.MotorcycleView;

public class MotorcycleController {
    private Motorcycle model;
    private MotorcycleView view;

    public MotorcycleController(Motorcycle model, MotorcycleView view) {
        this.model = model;
        this.view = view;
    }

    // Методи для взаємодії з моделлю
    public String getMotorcycleBrand() { return model.getBrand(); }
    public void setMotorcycleBrand(String brand) { model.setBrand(brand); }
    public String getMotorcycleMark() { return model.getMark(); }
    public void setMotorcycleMark(String mark) { model.setMark(mark); }
    public double getMotorcyclePrice() { return model.getPrice(); }
    public void setMotorcyclePrice(double price) { model.setPrice(price); }

    // Метод для оновлення представлення
    public void updateView() {
        view.printMotorcycleDetails(model.getBrand(), model.getMark(), model.getPrice());
    }
}

