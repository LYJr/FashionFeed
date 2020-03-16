package nocode.fashion_feed.service;

import javassist.NotFoundException;
import nocode.fashion_feed.domain.Comment;
import nocode.fashion_feed.domain.common.CommonState;
import nocode.fashion_feed.repository.CommentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentService {

    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> findAll () {
        return commentRepository.findAll();
    }

    @Transactional
    private Comment findByUserIdAndState(String userId, CommonState state) throws NotFoundException {
        try {
            return findByUserIdAndState(userId, state);
        } catch (Exception e) {
            throw new NotFoundException("데이터를 찾을 수 없습니다.");
        }
    }

//    @Transactional
//    public Comment save() {
//
//    }


}
