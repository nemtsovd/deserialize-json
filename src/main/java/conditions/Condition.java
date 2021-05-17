package conditions;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author Dmitrii Nemtsov <nemtsov@reksoft.ru>
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
                      @JsonSubTypes.Type(value = LegalEventCondition.class, name = "legal_event"),
                      @JsonSubTypes.Type(value = RegisterRecordCondition.class, name = "register_record")
              })
public abstract class Condition {
}
