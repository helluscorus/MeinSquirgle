package helluscorus.meinsquirgle.init;

import cpw.mods.fml.common.registry.GameRegistry;
import helluscorus.meinsquirgle.block.BlockMS;
import helluscorus.meinsquirgle.block.BlockSquirgle;
import helluscorus.meinsquirgle.block.BlockSquirgleChan1;
import helluscorus.meinsquirgle.block.BlockSquirgleChan2;
import helluscorus.meinsquirgle.block.BlockSquirgleChan3;
import helluscorus.meinsquirgle.block.BlockSquirgleChan4;
import helluscorus.meinsquirgle.block.BlockSquirgleChan5;
//
import helluscorus.meinsquirgle.block.BlockSquirgleChan16;
import helluscorus.meinsquirgle.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockMS squirgle = new BlockSquirgle(true);
    public static final BlockMS squirgleChan1 = new BlockSquirgleChan1();
    public static final BlockMS squirgleChan2 = new BlockSquirgleChan2();
    public static final BlockMS squirgleChan3 = new BlockSquirgleChan3();
    public static final BlockMS squirgleChan4 = new BlockSquirgleChan4();
    public static final BlockMS squirgleChan5 = new BlockSquirgleChan5();
    //
    public static final BlockMS squirgleChan16 = new BlockSquirgleChan16();

    public static void init() {

        GameRegistry.registerBlock(squirgle, "squirgle");
        GameRegistry.registerBlock(squirgleChan1, "squirgleChan1");
        GameRegistry.registerBlock(squirgleChan2, "squirgleChan2");
        GameRegistry.registerBlock(squirgleChan3, "squirgleChan3");
        GameRegistry.registerBlock(squirgleChan4, "squirgleChan4");
        GameRegistry.registerBlock(squirgleChan5, "squirgleChan5");
        //
        GameRegistry.registerBlock(squirgleChan16, "squirgleChan16");

    }
}
