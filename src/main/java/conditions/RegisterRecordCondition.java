package conditions;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Dmitrii Nemtsov <nemtsov@reksoft.ru>
 */
@Getter
@Setter
@ToString
@JsonTypeName("register_record")
public class RegisterRecordCondition extends Condition {

    @JsonProperty("rr_presence_status_code")
    private String presenceStatusCode;
}
