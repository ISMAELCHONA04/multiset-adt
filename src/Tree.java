import java.util.Optional;

public class Tree {
    private int root;
    private Tree[] subtrees;
    public Tree(int num, Tree[] subtreelist) {
        root = num;
        subtrees = subtreelist;

    }

    public Tree(int num) {
        root = num;
        subtrees = new Tree[] {};
    }

}
