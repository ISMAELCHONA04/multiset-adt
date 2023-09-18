import java.util.Optional;

import static java.util.Objects.isNull;

public class Tree {
    private Object root;
    private Tree[] subtrees;
    public Tree(int num, Tree[] subtreelist) {
        root = num;
        subtrees = subtreelist;

    }

    public Tree(int num) {
        root = num;
        subtrees = new Tree[] {};
    }

    public boolean is_empty()
    {
        if (isNull(this.root))
        {
            return true;
        }
        return false;

    }

    public int count()
    {
        if (this.is_empty())
        {
            return 0;
        }
        else {
            int size = 1;
            for (int i =0; i<subtrees.length; i++)
            {
                size = size+subtrees[i].count();
            }
            return size;

        }

    }

}