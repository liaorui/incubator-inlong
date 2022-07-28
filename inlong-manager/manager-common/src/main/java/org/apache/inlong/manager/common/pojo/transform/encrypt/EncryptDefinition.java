package org.apache.inlong.manager.common.pojo.transform.encrypt;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.inlong.manager.common.enums.TransformType;
import org.apache.inlong.manager.common.pojo.stream.StreamField;
import org.apache.inlong.manager.common.pojo.transform.TransformDefinition;

/**
 * A class to define operation to encrypt stream fields in stream records by EncryptRule defined.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class EncryptDefinition extends TransformDefinition {

    private List<EncryptRule> encryptRules;

    public EncryptDefinition(List<EncryptRule> encryptRules) {
        this.transformType = TransformType.ENCRYPT;
        this.encryptRules = encryptRules;
    }

    @Data
    @AllArgsConstructor
    public static class EncryptRule {

        private StreamField sourceField;

        private String key;

        private String encrypt;
    }
}
