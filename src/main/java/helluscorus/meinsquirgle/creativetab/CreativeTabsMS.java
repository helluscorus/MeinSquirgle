package helluscorus.meinsquirgle.creativetab;

import helluscorus.meinsquirgle.init.ModItems;
import helluscorus.meinsquirgle.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsMS {

    public static final CreativeTabs MS_TAB = new CreativeTabs(Reference.MOD_ID) {

        @Override
        public Item getTabIconItem() {

            return ModItems.tab;
        }

        @Override
        public String getTranslatedTabLabel() {

            return "MeinSquirgle";
        }
    };
}

