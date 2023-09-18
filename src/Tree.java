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


    public int length() {
        if (this.is_empty() == None) {
            return 0;
        }
        else {
            int size = 1;
            for (Tree subtree : this.subtrees) {
                size = size + subtree.length();
            }
            return size;
        }

    }


}
