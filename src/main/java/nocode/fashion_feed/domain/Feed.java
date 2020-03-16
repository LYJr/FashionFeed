package nocode.fashion_feed.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nocode.fashion_feed.domain.common.BaseEntity;
import nocode.fashion_feed.domain.common.CommonState;
import nocode.fashion_feed.dto.FindAllFeedDto;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Feed extends BaseEntity {

    @Column
    private String contents;

    //todo : MultipartFile로 변경해서 파일 등록 진행해야함.
    @Column
    private String mdPhoto;

    @Column
    private String mdName;

    public Feed(String userId, String contents, String mdPhoto, String mdName) {
        super(userId, CommonState.PERMIT);
        this.contents = contents;
        this.mdPhoto = mdPhoto;
        this.mdName = mdName;
    }

    public void update(Feed feed) {
        this.contents = feed.contents;
        this.mdPhoto = feed.mdPhoto;
        this.mdName = feed.mdName;
    }
}
