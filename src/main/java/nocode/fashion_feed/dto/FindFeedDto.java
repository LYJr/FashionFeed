package nocode.fashion_feed.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import nocode.fashion_feed.domain.Comment;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindFeedDto {
    private Long id;
    private String userId;
    private String contents;
    private String mdPhoto;
    private String mdName;

    private List<List<Comment>> comment;
//    private FeedLike feedLike;
//    private Shared shared;
}
