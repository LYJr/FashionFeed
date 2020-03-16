package nocode.fashion_feed.domain.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@NoArgsConstructor
public class BaseEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String userId;

    @Column
    @Enumerated(EnumType.STRING)
    private CommonState state;

    public BaseEntity(String userId) {
        this.userId = userId;
    }

    public BaseEntity(String userId, CommonState state) {
        this.userId = userId;
        this.state = state;
    }

    public long delete(CommonState commonState) {
        this.state = commonState;
        return id;
    }
}
