package nocode.fashion_feed.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nocode.fashion_feed.domain.commen.BaseEntity;
import nocode.fashion_feed.domain.commen.FeedState;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Shared extends BaseEntity {

    @Column
    private FeedState shared;

    @Column
    private Long sharedAmount;
}
