package helluscorus.meinsquirgle.init;

import cpw.mods.fml.common.registry.GameRegistry;
import helluscorus.meinsquirgle.item.ItemMS;
import helluscorus.meinsquirgle.item.ItemTab;
import helluscorus.meinsquirgle.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemMS tab = new ItemTab();

    public static void init() {

        GameRegistry.registerItem(tab, "tab");
    }
}
