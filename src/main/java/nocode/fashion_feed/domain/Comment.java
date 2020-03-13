package nocode.fashion_feed.domain;

import lombok.Cleanup;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nocode.fashion_feed.domain.commen.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Comment extends BaseEntity {

    @Size
    @Column
    private String comment;
//
//    @Column
//    private List<Comment> commentList;

    @Column
    private Long commentAmount;

}
