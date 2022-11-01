package domain;

public class RegularPost extends Post{
    @Override
    public String toString() {
        return "RegularPost{" +
                "postId=" + postId +
                ", postTitle='" + postTitle + '\'' +
                ", comments=" + comments +
                ", tags=" + tags +
                '}';
    }
}
