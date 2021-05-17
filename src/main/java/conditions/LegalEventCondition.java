package conditions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

/**
 * @author Dmitrii Nemtsov <nemtsov@reksoft.ru>
 */
@Getter
@Setter
@ToString
@JsonTypeName("legal_event")
public class LegalEventCondition extends Condition {

    @JsonProperty("le_register_type_code")
    private String eventTypeCode;

    @JsonProperty("le_event_type_code")
    private List<String> registerTypeCode;

    @JsonProperty("is_blocked")
    private Boolean isBlocked;

    @JsonProperty("is_deleted")
    private Boolean isDeleted;
}
