package nocode.fashion_feed.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFeed is a Querydsl query type for Feed
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeed extends EntityPathBase<Feed> {

    private static final long serialVersionUID = 819386047L;

    public static final QFeed feed = new QFeed("feed");

    public final nocode.fashion_feed.domain.common.QBaseEntity _super = new nocode.fashion_feed.domain.common.QBaseEntity(this);

    public final StringPath Contents = createString("Contents");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath mdName = createString("mdName");

    public final StringPath mdPhoto = createString("mdPhoto");

    //inherited
    public final EnumPath<nocode.fashion_feed.domain.common.CommonState> state = _super.state;

    //inherited
    public final StringPath userId = _super.userId;

    public QFeed(String variable) {
        super(Feed.class, forVariable(variable));
    }

    public QFeed(Path<? extends Feed> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFeed(PathMetadata metadata) {
        super(Feed.class, metadata);
    }

}

