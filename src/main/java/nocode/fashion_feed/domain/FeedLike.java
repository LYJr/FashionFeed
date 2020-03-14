//package nocode.fashion_feed.domain;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import nocode.fashion_feed.domain.common.BaseEntity;
//
//import javax.persistence.*;
//
//@Entity
//@Table
//@Getter
//@Setter
//@NoArgsConstructor
//public class FeedLike extends BaseEntity {
//
////    @ManyToOne(targetEntity = Feed.class, fetch = FetchType.LAZY)
////    @JoinColumn(name = "id")
////    private Feed feedId;
//
//    private Long likeAmount;
//
//    public FeedLike(String userId) {
//        super(userId);
////        this.feedId = feedId;
//    }
//
//    private void setAmount(long likeAmount) {
//        this.likeAmount = likeAmount;
//    }
//
//    public long getLikeAmount(long likeAmount) {
//        setAmount(likeAmount);
//        return this.likeAmount;
//    }
//}
