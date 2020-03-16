//package nocode.fashion_feed.repository;
//
//import com.querydsl.core.types.Projections;
//import com.querydsl.jpa.impl.JPAQuery;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//
//import nocode.fashion_feed.domain.QFeed;
//
//import nocode.fashion_feed.domain.common.CommonState;
//import nocode.fashion_feed.dto.FindAllFeedDto;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
//import org.springframework.transaction.annotation.Transactional;
//
//@Transactional(readOnly = true)
//public class FeedCustomRepositoryImpl extends QuerydslRepositorySupport implements FeedCustomRepository {
//
//    private JPAQueryFactory jpaQueryFactory;
//
//    public FeedCustomRepositoryImpl(Class<?> domainClass, JPAQueryFactory jpaQueryFactory) {
//        super(domainClass);
//        this.jpaQueryFactory = jpaQueryFactory;
//    }
//
//    @Override
//    public Page<FindAllFeedDto> availablePageFeedList(Pageable pageable, CommonState isDelect) {
//        QFeed feed = QFeed.feed;
////        QFeedLike feedLike = QFeedLike.feedLike;
////        QShared shared = QShared.shared;
//
//        JPAQuery<FindAllFeedDto> query = jpaQueryFactory
//                .select((Projections.fields(FindAllFeedDto.class,
//                        feed._super.id,
//                        feed._super.userId,
//                        feed.Contents,
//                        feed.mdPhoto,
//                        feed.mdName)))
//                .from(feed)
//                .where(feed._super.state.eq(isDelect))
//                .fetchAll();
//
//        return null;
//    }
//}
