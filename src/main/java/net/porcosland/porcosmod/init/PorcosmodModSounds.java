
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.porcosland.porcosmod.init;

import net.porcosland.porcosmod.PorcosmodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class PorcosmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, PorcosmodMod.MODID);
	public static final RegistryObject<SoundEvent> TITI_LIVE = REGISTRY.register("titi.live", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "titi.live")));
	public static final RegistryObject<SoundEvent> TITI_HIT = REGISTRY.register("titi.hit", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "titi.hit")));
	public static final RegistryObject<SoundEvent> EPICBATTLEMUSIC = REGISTRY.register("epicbattlemusic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "epicbattlemusic")));
}
