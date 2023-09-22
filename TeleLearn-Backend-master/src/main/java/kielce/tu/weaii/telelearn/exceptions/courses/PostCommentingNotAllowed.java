package kielce.tu.weaii.telelearn.exceptions.courses;

import kielce.tu.weaii.telelearn.exceptions.BusinessLogicException;

public class PostCommentingNotAllowed extends BusinessLogicException {
    public PostCommentingNotAllowed() {
        super("Adding comments to the post has been disabled by the author.");
    }
}
