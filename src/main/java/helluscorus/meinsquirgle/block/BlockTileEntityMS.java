package helluscorus.meinsquirgle.block;

import helluscorus.meinsquirgle.creativetab.CreativeTabsMS;
import net.minecraft.block.material.Material;

public abstract class BlockTileEntityMS extends BlockMS {

    protected BlockTileEntityMS(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabsMS.MS_TAB);
    }

}
