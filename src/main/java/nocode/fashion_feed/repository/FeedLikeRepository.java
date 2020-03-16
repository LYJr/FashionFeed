package nocode.fashion_feed.repository;

import nocode.fashion_feed.domain.FeedLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedLikeRepository extends JpaRepository<FeedLike, Long> {
    FeedLike findByUserIdAndFeedId(String userId, long feedId);
    List<FeedLike> findAllByFeedId(long feedId);

}
