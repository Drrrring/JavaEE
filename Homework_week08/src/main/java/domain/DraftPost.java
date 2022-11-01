package domain;

public class DraftPost extends Post{
    @Override
    public String toString() {
        return "DraftPost{" +
                "postId=" + postId +
                ", postTitle='" + postTitle + '\'' +
                ", comments=" + comments +
                ", tags=" + tags +
                '}';
    }
}
