package org.fuse.cidpoc.c;

import java.util.Arrays;
import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.a.A;

public class C extends Item {

    Item[] deps = new Item[] { new A() };

    @Override
    public List<Item> getDependencies() {
        return Arrays.asList(deps);
    }
}
