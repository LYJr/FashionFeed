//package nocode.fashion_feed.domain;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import nocode.fashion_feed.domain.common.BaseEntity;
//import nocode.fashion_feed.domain.common.CommonState;
//
//import javax.persistence.*;
//import javax.validation.constraints.Size;
//
//@Entity
//@Table
//@Getter
//@Setter
//@NoArgsConstructor
//public class Comment extends BaseEntity {
//
////    @ManyToOne(targetEntity = Feed.class, fetch = FetchType.LAZY)
////    @JoinColumn(name = "feedId")
////    private Feed feedId;
//
//    @Column
//    private String comment;
//
////    @Column
////    private List<Comment> commentList;
//
//    public Comment(String userId, CommonState state, String comment) {
//        super(userId, state);
////        this.feedId = feedId;
//        this.comment = comment;
//    }
//}
