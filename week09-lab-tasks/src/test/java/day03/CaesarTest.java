package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void encrypts() {
        Encryption encryption = new Caesar(3);
        String encrypted = encryption.encrypts("alma");
        System.out.println(encrypted);
        assertEquals("dopd", encrypted);
    }

    @Test
    void encryptsWithXYZ() {
        Encryption encryption = new Caesar(3);
        String encrypted = encryption.encrypts("almavwxyz");
        System.out.println(encrypted);
        assertEquals("dopdyzabc", encrypted);
    }

    @Test
    void encryptsWithOffsetMultiply() {
        Encryption encryption = new Caesar(83);
        String encrypted = encryption.encrypts("alma");
        System.out.println(encrypted);
        assertEquals("fqrf", encrypted);
    }
}