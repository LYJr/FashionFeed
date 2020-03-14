package nocode.fashion_feed.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FindAllFeedDto {

    private Long id;
    private String userId;
    private String Contents;

    private String mdPhoto;

    private String mdName;
    private Long likeAmount;
    private Long sharedAmount;


}
