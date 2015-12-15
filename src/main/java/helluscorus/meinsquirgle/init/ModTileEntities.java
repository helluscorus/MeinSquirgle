package helluscorus.meinsquirgle.init;

import cpw.mods.fml.common.registry.GameRegistry;
import helluscorus.meinsquirgle.tileentity.TileEntitySquirgle;

/**
 * Created by Stephen on 14/12/2015.
 */
public class ModTileEntities {

    public static void init() {
        GameRegistry.registerTileEntity(TileEntitySquirgle.class, "squirgle");
    }
}
