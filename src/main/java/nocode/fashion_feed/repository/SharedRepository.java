package nocode.fashion_feed.repository;

import nocode.fashion_feed.domain.Shared;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SharedRepository extends JpaRepository<Shared, Long> {
    Shared findByUserId(String userId);
}
