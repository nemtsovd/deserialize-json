import com.fasterxml.jackson.databind.ObjectMapper;
import conditions.LegalEventCondition;
import conditions.Origin;
import conditions.RegisterRecordCondition;
import org.junit.Test;
import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

/**
 * @author Dmitrii Nemtsov <nemtsov@reksoft.ru>
 */
public class MainTest {

    @Test
    public void mainTest() {

        URL resource = Main.class.getClassLoader().getResource("conditions.json");
        if (resource == null) {
            throw new IllegalArgumentException("not found");
        }
        try {
            Origin origin = new ObjectMapper().readValue(resource, Origin.class);

            assertEquals(LegalEventCondition.class, origin.getConditions().get(0).getClass());
            assertEquals(RegisterRecordCondition.class, origin.getConditions().get(1).getClass());

            System.out.println(origin.getConditions().get(0));
            System.out.println(origin.getConditions().get(1));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
