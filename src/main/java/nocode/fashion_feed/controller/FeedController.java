package nocode.fashion_feed.controller;

import lombok.RequiredArgsConstructor;
import nocode.fashion_feed.domain.Feed;
import nocode.fashion_feed.domain.common.CommonResponse;
import nocode.fashion_feed.dto.CreateFeedDto;
import nocode.fashion_feed.service.FeedService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequiredArgsConstructor
public class FeedController {

    private final FeedService feedService;

    @GetMapping("/feedList/{id}")
    public String selectFeedList(@PathVariable Long id) {

        return null;
    }

    @PostMapping("/create")
    public CommonResponse createFeed(@RequestBody CreateFeedDto feedDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return CommonResponse.failure(bindingResult);
        }
        return CommonResponse.success(feedService.save(feedDto.toFeed()));
    }

    @PutMapping("/like/{id}")
    public String feedLike(@PathVariable String userId) {
        return null;
    }

    @PutMapping("/shared/{id}")
    public String shared(@PathVariable String userId) {
        return null;
    }

    @DeleteMapping("/delete/")
    public String cancel (@PathVariable String userId ) { return null;
    }


}
