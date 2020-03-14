//package nocode.fashion_feed.service;
//
//import lombok.RequiredArgsConstructor;
//import nocode.fashion_feed.domain.FeedLike;
//import nocode.fashion_feed.domain.common.CommonResponse;
//import nocode.fashion_feed.repository.FeedLikeRepository;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//
//@Service
//@RequiredArgsConstructor
//public class FeedLikeService {
//
//    private final FeedService feedService;
//    private final FeedLikeRepository feedLikeRepository;
//
//    public FeedLike findByUserIdAndFeedId(String userId, long feedId) throws IllegalArgumentException {
//       return feedLikeRepository.findByUserIdAndFeedId(userId, feedId);
//    }
//
//    @Transactional
//    public FeedLike save(String userId, long feedId) {
//        if(findByUserIdAndFeedId(userId, feedId) == null) {
//            return feedLikeRepository.save(new FeedLike());
//        }
//        return null;
//    }
//
//    @Transactional
//    public CommonResponse cancel(String userId, long feedId) {
//        return null;
//    }
//}
