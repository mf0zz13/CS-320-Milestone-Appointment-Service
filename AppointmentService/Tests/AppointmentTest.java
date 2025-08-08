import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;


public class AppointmentTest {
    private Date currDate = new Date();
    private Object[][] invalidConstructors = {
            {"01234567891", (new Date((currDate.getYear()+1),(currDate.getMonth()),currDate.getDate())), "01234567890123456789012345678901234567890123456789"},
            {"0123456789", new Date(125, 7, 7), "01234567890123456789012345678901234567890123456789"},
            {"0123456789", (new Date((currDate.getYear()+1),(currDate.getMonth()),currDate.getDate())), "012345678901234567890123456789012345678901234567891"}
    };

    @Test
    public void TestConstructor() {
        for (Object[] input : invalidConstructors) {
            assertThrows(IllegalArgumentException.class, () -> {
                new Appointment(
                        (String) input[0],
                        (Date) input[1],
                        (String) input[2]);
            });
        }
    }
}
