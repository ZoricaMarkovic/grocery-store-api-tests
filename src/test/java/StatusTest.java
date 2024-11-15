import org.example.GroceryStore;
import org.testng.annotations.Test;

public class StatusTest {

    GroceryStore groceryStore = new GroceryStore();

    @Test
    public void status() {

        groceryStore.getStatus();
    }
}
