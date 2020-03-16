package nocode.fashion_feed.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QComment is a Querydsl query type for Comment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QComment extends EntityPathBase<Comment> {

    private static final long serialVersionUID = -337879650L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComment comment1 = new QComment("comment1");

    public final nocode.fashion_feed.domain.common.QBaseEntity _super = new nocode.fashion_feed.domain.common.QBaseEntity(this);

    public final QComment comment;

    public final StringPath contents = createString("contents");

    public final QFeed feedId;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final EnumPath<nocode.fashion_feed.domain.common.CommonState> state = _super.state;

    public final ListPath<Comment, QComment> subComments = this.<Comment, QComment>createList("subComments", Comment.class, QComment.class, PathInits.DIRECT2);

    //inherited
    public final StringPath userId = _super.userId;

    public QComment(String variable) {
        this(Comment.class, forVariable(variable), INITS);
    }

    public QComment(Path<? extends Comment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QComment(PathMetadata metadata, PathInits inits) {
        this(Comment.class, metadata, inits);
    }

    public QComment(Class<? extends Comment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.comment = inits.isInitialized("comment") ? new QComment(forProperty("comment"), inits.get("comment")) : null;
        this.feedId = inits.isInitialized("feedId") ? new QFeed(forProperty("feedId")) : null;
    }

}

