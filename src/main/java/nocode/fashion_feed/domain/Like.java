package nocode.fashion_feed.domain;

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
public class Like extends BaseEntity {

//    private Feed feed;

    @Column
    private Long likeAmount;

}
