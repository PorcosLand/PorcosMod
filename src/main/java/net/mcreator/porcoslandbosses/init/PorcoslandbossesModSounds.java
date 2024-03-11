
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.porcoslandbosses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.porcoslandbosses.PorcoslandbossesMod;

public class PorcoslandbossesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PorcoslandbossesMod.MODID);
	public static final RegistryObject<SoundEvent> TITI_DU = REGISTRY.register("titi.du", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcoslandbosses", "titi.du")));
	public static final RegistryObject<SoundEvent> TITI_LIVE = REGISTRY.register("titi.live", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcoslandbosses", "titi.live")));
	public static final RegistryObject<SoundEvent> TITI_HIT = REGISTRY.register("titi.hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcoslandbosses", "titi.hit")));
}
