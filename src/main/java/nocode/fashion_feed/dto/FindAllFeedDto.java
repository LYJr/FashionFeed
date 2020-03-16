package nocode.fashion_feed.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nocode.fashion_feed.domain.Feed;

@Getter
@NoArgsConstructor
public class FindAllFeedDto {

    private Long id;
    private String userId;
    private String contents;

    private String mdPhoto;

    private String mdName;
    private Long likeAmount;
    private Long sharedAmount;

    public FindAllFeedDto(Feed feed, Long likeAmount) {
        this.id = feed.getId();
        this.userId = feed.getUserId();
        this.contents = feed.getContents();
        this.mdPhoto = feed.getMdPhoto();
        this.mdName = feed.getMdName();
        this.likeAmount = likeAmount;
    }

    public void setAmount(long likeAmount){
        this.likeAmount = likeAmount;
    }
}
