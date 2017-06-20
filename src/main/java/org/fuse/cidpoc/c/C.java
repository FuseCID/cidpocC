package org.fuse.cidpoc.c;

import java.util.Arrays;
import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.a.A;

public class C extends Item {

    @Override
    public Capability getCapability() {
        return new Capability("C", 4);
    }

    @Override
    public List<Requirement> getRequirements() {
        Requirement[] reqs = new Requirement[] { new Requirement("A", 1, 4) };
        return Arrays.asList(reqs);
    }

    @Override
    public List<Item> getDependencies() {
        Item[] deps = new Item[] { new A() };
        return Arrays.asList(deps);
    }
}
