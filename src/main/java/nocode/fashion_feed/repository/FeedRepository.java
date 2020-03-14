package nocode.fashion_feed.repository;

import nocode.fashion_feed.domain.Feed;
import nocode.fashion_feed.domain.common.CommonState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Long> {
    Feed findByIdAndState(long id, CommonState state);

}
