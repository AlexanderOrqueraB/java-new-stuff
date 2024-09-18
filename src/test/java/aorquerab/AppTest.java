package aorquerab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @BeforeEach
    public void initialize() {
        System.out.println("Initializing stuff..");
    }

    @Test
    public void sillyTest () {
        assertTrue(true);
    }

}
