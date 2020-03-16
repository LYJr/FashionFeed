package nocode.fashion_feed.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nocode.fashion_feed.domain.common.BaseEntity;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor

public class FeedLike extends BaseEntity {

    //이 부분 뭔가 잘못 됨.
    @ManyToOne(targetEntity = Feed.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "feedId")
    private Long feedId;

    public FeedLike(long feedId, String userId) {
        super(userId);
        this.feedId = feedId;
    }
}
