package helluscorus.meinsquirgle.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import helluscorus.meinsquirgle.midi.MidiMS;
import helluscorus.meinsquirgle.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockMS extends Block {

    public BlockMS(Material material) {

        super(material);
    }

    public BlockMS() {

        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName() {

        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {

        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float sidex, float sidey, float sidez) {

        super.onBlockActivated(world, x, y, z, player, meta, sidex, sidey, sidez);
        if (world.getBlock(x, y, z) instanceof BlockSquirgle) {
            MidiMS.midiNote();
        }
        return true;
    }
}
