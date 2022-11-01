package mappers;

import domain.Comment;

public interface CommentMapper {
    public Comment selectComment(int commentId);
}
