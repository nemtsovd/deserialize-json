package conditions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

/**
 * @author Dmitrii Nemtsov <nemtsov@reksoft.ru>
 */
@Getter
@Setter
public class Origin {

    @JsonProperty("conditions")
    private List<Condition> conditions;
}
