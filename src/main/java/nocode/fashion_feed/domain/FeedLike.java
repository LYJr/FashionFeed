package nocode.fashion_feed.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nocode.fashion_feed.domain.commen.BaseEntity;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FeedLike extends BaseEntity {

//    private Feed feed;

    @Column
    private Long likeAmount;

}
