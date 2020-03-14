package nocode.fashion_feed.service;

import lombok.RequiredArgsConstructor;
import nocode.fashion_feed.domain.Feed;
import nocode.fashion_feed.domain.common.CommonState;
import nocode.fashion_feed.repository.FeedRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class FeedService {

    private final FeedRepository feedRepository;

    public Feed findByIdAndState(long id) throws IllegalArgumentException {
        try {
            return feedRepository.findByIdAndState(id, CommonState.PERMIT);
        } catch (Exception e) {
            throw new IllegalArgumentException("해당 피드가 없습니다.");
        }
    }

    @Transactional
    public Feed save(Feed feed) {
        return feedRepository.save(feed);
    }
}
