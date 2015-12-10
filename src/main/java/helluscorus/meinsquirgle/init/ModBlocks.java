package helluscorus.meinsquirgle.init;

import cpw.mods.fml.common.registry.GameRegistry;
import helluscorus.meinsquirgle.block.BlockMS;
import helluscorus.meinsquirgle.block.BlockSquirgle;
import helluscorus.meinsquirgle.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockMS squirgle = new BlockSquirgle();

    public static void init() {

        GameRegistry.registerBlock(squirgle, "squirgle");
    }
}
