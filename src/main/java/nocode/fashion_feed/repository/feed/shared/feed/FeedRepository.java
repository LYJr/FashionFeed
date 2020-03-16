package nocode.fashion_feed.repository.feed.shared.feed;

import nocode.fashion_feed.domain.Feed;
import nocode.fashion_feed.domain.common.CommonState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Long> {
    Feed findByIdAndState(long id, CommonState state);
    List<Feed> findAllByState(CommonState state);

}
