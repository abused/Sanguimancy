package tombenpotter.sanguimancy.util;

import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockPostition {

    public int x;
    public int y;
    public int z;

    public BlockPostition(int posX, int posY, int posZ) {
        x = posX;
        y = posY;
        z = posZ;
    }

    public BlockPostition(TileEntity tile) {
        x = tile.xCoord;
        y = tile.yCoord;
        z = tile.zCoord;
    }

    public Block getBlock(World world) {
        return world.getBlock(x, y, z);
    }

    public TileEntity getTile(World world) {
        return world.getTileEntity(x, y, z);
    }

    public void readFromNBT(NBTTagCompound tag) {
        x = tag.getCompoundTag("BlockPostition").getInteger("posX");
        y = tag.getCompoundTag("BlockPostition").getInteger("posY");
        z = tag.getCompoundTag("BlockPostition").getInteger("posZ");
    }

    public void writeToNBT(NBTTagCompound tag) {
        tag.getCompoundTag("BlockPostition").setInteger("posX", x);
        tag.getCompoundTag("BlockPostition").setInteger("posY", y);
        tag.getCompoundTag("BlockPostition").setInteger("posZ", z);
    }
}
