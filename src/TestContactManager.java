import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContactManager {

    @Test
    public void testAddContact() {
        ContactManager manager = new ContactManager();
        manager.addContact("Simonetta", "3401957864");
        assertEquals("3471957864", manager.contacts.get("Simonetta"));
    }

}
