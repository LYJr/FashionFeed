package nocode.fashion_feed.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class Feed extends BaseEntity {

    @Column
    private String Contents;

    @Column
    private String mdPhoto;

    @Column
    private String mdName;

}
