package nocode.fashion_feed.service;

import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import nocode.fashion_feed.domain.FeedLike;
import nocode.fashion_feed.domain.common.CommonResponse;
import nocode.fashion_feed.repository.FeedLikeRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class FeedLikeService {

    //Todo DI가 아닌 message에 해당하는 enum class를 만드는건 어떨까?
    private final FeedLikeRepository feedLikeRepository;
    private final String CANCEL = "좋아요가 취소되었습니다.";

    private FeedLike findByUserIdAndFeedId(String userId, long feedId) throws NotFoundException {
        try{
            return feedLikeRepository.findByUserIdAndFeedId(userId, feedId);
        } catch (Exception e) {
            throw new NotFoundException("해당 데이터가 없습니다.");
        }
    }

    public long findByFeedId(long feedId) {
        return feedLikeRepository.findAllByFeedId(feedId).size();
    }

    @Transactional
    public FeedLike save(long feedId, String userId) {
        return feedLikeRepository.save(new FeedLike(feedId, userId));
    }

    /**
     * 좋아요는 한 사람당 한번만 가능, 그러므로 이미 데이터가 저장되있을 시 삭제
     * 삭제될 경우 리턴할 값이 없음으로 CommonResponse 바로 리턴
     * @param userId
     * @param feedId
     * @return
     */
    @Transactional
    public CommonResponse cancel(String userId, long feedId) throws NotFoundException{
        FeedLike feedLike = findByUserIdAndFeedId(userId, feedId);
        feedLikeRepository.delete(feedLike);
        return CommonResponse.delete(CANCEL);
    }
}
