package org.fuse.cidpoc.test;

import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.Item.Capability;
import org.fuse.cidpoc.Item.Requirement;
import org.fuse.cidpoc.a.A;
import org.fuse.cidpoc.c.C;
import org.junit.Assert;
import org.junit.Test;

public class CTest {

    @Test
    public void testStatus() throws Exception {
        
        Item item = new C();
        item.transitiveStatus();
        
        List<Item> deps = item.getDependencies();
        Assert.assertEquals(1, deps.size());
        String version = Item.getVersion(A.class);
        Item depA = deps.get(0);
        Assert.assertEquals("A-" + version, depA.getVName());
        
        Capability cap = item.getCapability();
        Assert.assertEquals("C", cap.getName());
        Assert.assertEquals(0, cap.getValue());
        
        List<Requirement> reqs = item.getRequirements();
        Assert.assertEquals(1, reqs.size());
        Assert.assertTrue(reqs.get(0).matches(depA.getCapability()));

        version = Item.getVersion(item.getClass());
        Assert.assertEquals("C-" + version, item.getVName());
        Assert.assertEquals("is satisfied", item.getStatus());
    }
}
