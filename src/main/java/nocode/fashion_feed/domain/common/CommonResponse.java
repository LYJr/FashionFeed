package nocode.fashion_feed.domain.common;

import lombok.Builder;
import lombok.Getter;
import org.springframework.validation.BindingResult;

@Getter
@Builder
public class CommonResponse <T> {

    private T data;
    private String message;

    public static <T>CommonResponse success (T data) {
        return builder().data(data)
                .message("성공하였습니다.").build();
    }

    public static <T>CommonResponse failure (BindingResult bindingResult) {
        return builder().data(bindingField(bindingResult))
                .message(bindingMessage(bindingResult)).build();
    }

    private static String bindingField(BindingResult bindingResult) {
        return bindingResult.getFieldError().getField();
    }

    private static String bindingMessage(BindingResult bindingResult) {
        return bindingResult.getFieldError().getDefaultMessage();
    }
}
