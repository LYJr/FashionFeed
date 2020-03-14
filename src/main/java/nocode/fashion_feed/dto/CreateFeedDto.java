package nocode.fashion_feed.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import nocode.fashion_feed.domain.Feed;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
public class CreateFeedDto {

    @NotBlank(message = "아이디를 입력하세요.")
    private String userId;

    @NotNull(message = "내용을 입력하세요.")
    private String contents;

    @NotBlank(message = "이미지를 등록하세요.")
    private String mdPhoto;

    @NotBlank(message = "MD 이름을 입력하세요.")
    private String mdName;

    public CreateFeedDto(@NotBlank(message = "아이디를 입력하세요.") String userId, @NotNull(message = "내용을 입력하세요.") String contents, @NotBlank(message = "이미지를 등록하세요.") String mdPhoto, @NotBlank(message = "MD 이름을 입력하세요.") String mdName) {
        this.userId = userId;
        this.contents = contents;
        this.mdPhoto = mdPhoto;
        this.mdName = mdName;
    }

    public Feed toFeed() {
        return new Feed(userId, contents, mdPhoto, mdName);
    }
}
