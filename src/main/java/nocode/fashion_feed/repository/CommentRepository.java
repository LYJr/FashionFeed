package nocode.fashion_feed.repository;

import nocode.fashion_feed.domain.Comment;
import nocode.fashion_feed.domain.common.CommonState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findByUserIdAndState(String userId, CommonState state);
}
