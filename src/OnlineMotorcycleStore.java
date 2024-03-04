import Model.Motorcycle;
import View.MotorcycleView;
import Controller.MotorcycleController;
import GUI.MotorcycleViewGUI;
import java.util.Scanner;

public class OnlineMotorcycleStore {
    public static void main(String[] args) {
        // Create a motorcycle instance
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR600RR", 12000.00);

        // Create a motorcycle view instance
        MotorcycleView view = new MotorcycleView();

        // Create a motorcycle controller instance
        MotorcycleController controller = new MotorcycleController(motorcycle, view);

        // Create a GUI to display motorcycle details and enable updates
        MotorcycleViewGUI gui = new MotorcycleViewGUI(controller);

        // Display the initial motorcycle details
        controller.updateView();

        // Read new motorcycle details from keyboard input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new brand:");
        String newBrand = scanner.nextLine();
        System.out.println("Enter new model:");
        String newModel = scanner.nextLine();
        System.out.println("Enter new price:");
        double newPrice = scanner.nextDouble();

        // Update the motorcycle details and display the updated details
        controller.setMotorcycleBrand(newBrand);
        controller.setMotorcycleMark(newModel);
        controller.setMotorcyclePrice(newPrice);
        controller.updateView();
    }
}
