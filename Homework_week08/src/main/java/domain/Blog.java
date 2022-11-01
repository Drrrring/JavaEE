package domain;

import java.util.List;

public class Blog {
    private int blogId;
    private Author author;
    private List<Post> posts;
    private BlogState state;

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public BlogState getState() {
        return state;
    }

    public void setState(BlogState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "blogId=" + blogId +
                ", author=" + author +
                ", posts=" + posts +
                ", state=" + state +
                '}';
    }
}
