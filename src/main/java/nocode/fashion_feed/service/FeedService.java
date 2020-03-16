package nocode.fashion_feed.service;

import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import nocode.fashion_feed.domain.Feed;
import nocode.fashion_feed.domain.common.CommonResponse;
import nocode.fashion_feed.domain.common.CommonState;
import nocode.fashion_feed.dto.FindAllFeedDto;
import nocode.fashion_feed.repository.feed.shared.feed.FeedRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedService {

    private final FeedRepository feedRepository;
    private final FeedLikeService feedLikeService;

    private Feed findByIdAndState(long id) throws NotFoundException {
        try {
            return feedRepository.findByIdAndState(id, CommonState.PERMIT);
        } catch (Exception e) {
            throw new NotFoundException("해당 피드가 없습니다.");
        }
    }

    @Transactional
    public Feed save(Feed feed) {
        return feedRepository.save(feed);
    }

    /**
     * userId가 동일할 때 수정이 가능하게 해야하지만 이 부분은 update ui로 이동할 때 체크해야한다 생각하여 제외
     * userId는 변경할 수 없다라는 전제하에 작업함
     * @param id = feed id
     * @param updateFeed = update될 데이터를 가진 feedDto
     * @return
     * @throws NotFoundException
     */
    @Transactional
    public CommonResponse update(long id, Feed updateFeed) throws NotFoundException{
        Feed originFeed = findByIdAndState(id);
        originFeed.update(updateFeed);
        return CommonResponse.success(originFeed);
    }

    /**
     * update와 마찬가지의 전제로 작업
     * RollBack이 필요한 경우를 대비하여 데이터 유지
     * @param id
     * @return
     * @throws NotFoundException
     */
    @Transactional
    public CommonResponse deletd(long id) throws NotFoundException {
       Feed feed = findByIdAndState(id);
       return CommonResponse.success(feed.delete(CommonState.DELETE));
    }

    public List<FindAllFeedDto> createAllDto() {
        List<Feed> feedList = feedRepository.findAllByState(CommonState.PERMIT);

        List<FindAllFeedDto> dtoLists = new ArrayList<>();
        for (Feed feed : feedList) {
            dtoLists.add(new FindAllFeedDto(feed, feedLikeService.findByFeedId(feed.getId())));
        }
        return dtoLists;
    }
}
