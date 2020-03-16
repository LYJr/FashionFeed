package nocode.fashion_feed.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nocode.fashion_feed.domain.common.BaseEntity;
import nocode.fashion_feed.domain.common.CommonState;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@NoArgsConstructor
public class Comment extends BaseEntity {

    @ManyToOne(targetEntity = Feed.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "feedId")
    private Feed feedId;

    @Column
    private String contents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id")
    private Comment comment;

    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL)
    private List<Comment> subComments;

    public Comment(String userId, CommonState state, String contents) {
        super(userId, state);
        this.feedId = feedId;
        this.contents = contents;
    }

}
