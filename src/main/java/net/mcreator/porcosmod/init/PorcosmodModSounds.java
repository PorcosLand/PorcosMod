
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.porcosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.porcosmod.PorcosmodMod;

public class PorcosmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PorcosmodMod.MODID);
	public static final RegistryObject<SoundEvent> TITI_DU = REGISTRY.register("titi.du", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "titi.du")));
	public static final RegistryObject<SoundEvent> TITI_LIVE = REGISTRY.register("titi.live", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "titi.live")));
	public static final RegistryObject<SoundEvent> TITI_HIT = REGISTRY.register("titi.hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "titi.hit")));
}
