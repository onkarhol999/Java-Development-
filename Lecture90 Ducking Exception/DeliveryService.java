
class customerNotAvailable extends Exception {
    public customerNotAvailable(String message) {
        super(message);
    }
}

class DeliveryManager {
    public void deliveryParcal(String customerName) throws customerNotAvailable {
        if (customerName == null || customerName.isEmpty()) {
            throw new customerNotAvailable("Customer Not available");
        } else {
            System.out.println("parcel Deliver Successfully");
        }
    }
}

public class DeliveryService {
    public static void main(String[] args) {
        DeliveryManager manager = new DeliveryManager();

        try {
            manager.deliveryParcal("");
        } catch (customerNotAvailable e) {
            System.out.println("Boss" + e.getMessage() + " can i deliver this parcel next time");
        }
        try {
            manager.deliveryParcal("Onkar");
        } catch (customerNotAvailable e) {
            System.out.println("Boss" + e.getMessage() + " can i deliver this parcel next time");
        }

    }
}
