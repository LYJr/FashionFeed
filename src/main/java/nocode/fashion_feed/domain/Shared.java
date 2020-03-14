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
//public class Shared extends BaseEntity {
//
////    @ManyToOne(targetEntity = Feed.class, fetch = FetchType.LAZY)
////    @JoinColumn(name = "id")
////    private Feed feedId;
//
//    @Column
//    private Long sharedAmount;
//
//    public Shared(String userId, Long sharedAmount) {
//        super(userId);
//        this.sharedAmount = sharedAmount;
//    }
//}
