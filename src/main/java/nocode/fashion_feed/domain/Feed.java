package nocode.fashion_feed.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nocode.fashion_feed.domain.common.BaseEntity;
import nocode.fashion_feed.domain.common.CommonState;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Feed extends BaseEntity {

    @Column
    private String Contents;

    @Column
    private String mdPhoto;

    @Column
    private String mdName;

    public Feed(String userId, String contents, String mdPhoto, String mdName) {
        super(userId, CommonState.PERMIT);
        this.Contents = contents;
        this.mdPhoto = mdPhoto;
        this.mdName = mdName;
    }
}
