
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.porcosland.porcosmod.init;

import net.porcosland.porcosmod.block.BloqueDePorconiumBlock;
import net.porcosland.porcosmod.PorcosmodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class PorcosmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PorcosmodMod.MODID);
	public static final RegistryObject<Block> BLOQUE_DE_PORCONIUM = REGISTRY.register("bloque_de_porconium", () -> new BloqueDePorconiumBlock());
}
