package test.java.ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.ua.lviv.iot.StringProcessor;

class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    void setUp() throws Exception {
        stringProcessor = new StringProcessor();
    }

    @Test
    void testReadInputText() throws Exception {
        String expectedInput = "String processor. ";

        InputStream inputStream = new ByteArrayInputStream(
                expectedInput.getBytes());
        System.setIn(inputStream);

        assertEquals("String processor. ", StringProcessor.readInputText());

    }

    /*
     * @Test public void testShowResult() { assertEquals("",
     * stringProcessor.showResults()); }
     */

}
