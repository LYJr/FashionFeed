package nocode.fashion_feed.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShared is a Querydsl query type for Shared
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShared extends EntityPathBase<Shared> {

    private static final long serialVersionUID = 1825823046L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShared shared = new QShared("shared");

    public final nocode.fashion_feed.domain.common.QBaseEntity _super = new nocode.fashion_feed.domain.common.QBaseEntity(this);

    public final QFeed feedId;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Long> sharedAmount = createNumber("sharedAmount", Long.class);

    //inherited
    public final EnumPath<nocode.fashion_feed.domain.common.CommonState> state = _super.state;

    //inherited
    public final StringPath userId = _super.userId;

    public QShared(String variable) {
        this(Shared.class, forVariable(variable), INITS);
    }

    public QShared(Path<? extends Shared> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShared(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShared(PathMetadata metadata, PathInits inits) {
        this(Shared.class, metadata, inits);
    }

    public QShared(Class<? extends Shared> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.feedId = inits.isInitialized("feedId") ? new QFeed(forProperty("feedId")) : null;
    }

}

