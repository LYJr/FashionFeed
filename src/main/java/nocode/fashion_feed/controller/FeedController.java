package nocode.fashion_feed.controller;

import javassist.NotFoundException;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.RequiredArgsConstructor;
import nocode.fashion_feed.domain.common.CommonResponse;
import nocode.fashion_feed.dto.CreateFeedDto;
import nocode.fashion_feed.service.FeedLikeService;
import nocode.fashion_feed.service.FeedService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequiredArgsConstructor
public class FeedController {

    private final FeedService feedService;
    private final FeedLikeService feedLikeService;

    // if문 중복제거 어떻게 할지 고민. 메서드 분리 후 T 타입으로 데이터 받기?

    @GetMapping("/feedList")
    public CommonResponse feedList(BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return CommonResponse.failure(bindingResult);
        }
        return CommonResponse.success(feedService.createAllDto());
    }

    @PostMapping("/create")
    public CommonResponse createFeed(@RequestBody CreateFeedDto feedDto, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return CommonResponse.failure(bindingResult);
        }
        return CommonResponse.success(feedService.save(feedDto.toFeed()));
    }

    @PutMapping("{id}/update")
    public CommonResponse updateFeed
            (@PathVariable long id, @RequestBody CreateFeedDto feedDtd, BindingResult bindingResult) throws NotFoundException {
        if(bindingResult.hasErrors()) {
            return CommonResponse.failure(bindingResult);
        }
        return CommonResponse.success(feedService.update(id, feedDtd.toFeed()));
    }

    @DeleteMapping("{id}/delete}")
    public CommonResponse deleteFeed(@PathVariable long id) throws NotFoundException {
        return CommonResponse.success(feedService.deletd(id));
    }

    @PutMapping("{id}/like/{userId}")
    public CommonResponse feedLike(@PathVariable long id, @PathVariable String userId) {
        return CommonResponse.success(feedLikeService.save(id, userId));
    }

    @DeleteMapping("{id}/cancel/{userId}")
    public CommonResponse cancel(@PathVariable long id, @PathVariable String userId) throws NotFoundException {
        return feedLikeService.cancel(userId, id);
    }

    @PutMapping("/shared/{id}")
    public String shared(@PathVariable String userId) {

        return null;
    }
}
