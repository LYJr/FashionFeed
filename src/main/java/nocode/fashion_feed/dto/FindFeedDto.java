package nocode.fashion_feed.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindFeedDto {
    private Long id;
    private String userId;
    private String Contents;
    private String mdPhoto;
    private String mdName;
//    private List<Comment> comment;
//    private FeedLike feedLike;
//    private Shared shared;

}
