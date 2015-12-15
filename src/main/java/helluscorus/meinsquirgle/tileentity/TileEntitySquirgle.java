package helluscorus.meinsquirgle.tileentity;

import helluscorus.meinsquirgle.init.ModBlocks;
import net.minecraft.world.World;

public class TileEntitySquirgle extends TileEntityMS {

    public boolean previousRedstoneState;

    public TileEntitySquirgle() {

    }

    byte note;
    byte b0 = 0;

    public void getNote(int midiNote) {

    }


    public void triggerMIDI(World world, int x, int y, int z) {

        world.addBlockEvent(x, y, z, ModBlocks.squirgle, b0, note);
    }
}
