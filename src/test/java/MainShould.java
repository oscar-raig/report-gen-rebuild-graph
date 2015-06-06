package org.raig.report_gen_rebuild_graph;

import org.junit.*;
import org.junit.Test;
import org.junit.Assert.*;

public class MainShould {

    @Test
    public void mainShouldReturnErrorIfNoDirectoryIsSupplied() {
        Main main = new Main();
        int result = main.parseArgs(null);
        Assert.assertEquals(result,Main.ERROR_NO_ARGS);
    }
}