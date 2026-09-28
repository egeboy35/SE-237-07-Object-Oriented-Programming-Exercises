class InventoryService {

    void updateStock() {
        System.out.println("Stock updated");
    }
}

class MaterialPlanner1 {

    void calculateMaterialNeeds() {
        System.out.println("Material requirements calculated");
    }
}

class InvoiceService {

    void createInvoice() {
        System.out.println("Invoice created");
    }
}

public class Main6 {
    public static void main(String[] args) {

        InventoryService inventory =
            new InventoryService();
        MaterialPlanner1 planner =
            new MaterialPlanner1();
        InvoiceService invoice =
            new InvoiceService();

        inventory.updateStock();
        planner.calculateMaterialNeeds();
        invoice.createInvoice();
    }
}