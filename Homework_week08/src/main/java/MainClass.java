import domain.Author;
import domain.Blog;
import domain.Comment;
import domain.Post;
import mappers.AuthorMapper;
import mappers.BlogMapper;
import mappers.CommentMapper;
import mappers.PostMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MainClass {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            AuthorMapper authorMapper = session.getMapper(AuthorMapper.class);
            Author author = authorMapper.selectAuthor(5);
            System.out.println(author);

            author = authorMapper.selectAuthor(5);
            System.out.println(author);
//            CommentMapper commentMapper = session.getMapper(CommentMapper.class);
//            Comment comment = commentMapper.selectComment(1);
//            System.out.println(comment);
//            PostMapper postMapper = session.getMapper(PostMapper.class);
//            Post post = postMapper.selectPost(1);
//            System.out.println(post);
            BlogMapper blogMapper = session.getMapper(BlogMapper.class);
            Blog blog = blogMapper.selectBlog(1);
            System.out.println(blog);
        }
    }
}
