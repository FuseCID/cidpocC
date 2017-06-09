package org.fuse.cidpoc.c;

import java.util.Arrays;
import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.Utils;
import org.fuse.cidpoc.a.A;

public class C extends Item {

    @Override
    public Capability getCapability() {
        return Utils.getCapability(C.class);
    }

    @Override
    public List<Requirement> getRequirements() {
        return Utils.getRequirements(C.class);
    }

    @Override
    public List<Item> getDependencies() {
        Item[] deps = new Item[] { new A() };
        return Arrays.asList(deps);
    }
}
