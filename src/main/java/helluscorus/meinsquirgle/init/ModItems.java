package helluscorus.meinsquirgle.init;

import cpw.mods.fml.common.registry.GameRegistry;
import helluscorus.meinsquirgle.item.ItemMS;
import helluscorus.meinsquirgle.item.ItemMapleLeaf;

public class ModItems {

    public static final ItemMS mapleLeaf = new ItemMapleLeaf();

    public static void init() {

        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
