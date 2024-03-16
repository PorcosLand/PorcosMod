
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
	public static final RegistryObject<SoundEvent> ESPECTATOR_QUIETO = REGISTRY.register("espectator_quieto", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "espectator_quieto")));
	public static final RegistryObject<SoundEvent> ESPECTATOR_GOLPE = REGISTRY.register("espectator_golpe", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "espectator_golpe")));
	public static final RegistryObject<SoundEvent> BAT_QUIETO = REGISTRY.register("bat_quieto", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "bat_quieto")));
	public static final RegistryObject<SoundEvent> BAT_GOLPE = REGISTRY.register("bat_golpe", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "bat_golpe")));
	public static final RegistryObject<SoundEvent> BAT_PASOS = REGISTRY.register("bat_pasos", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "bat_pasos")));
	public static final RegistryObject<SoundEvent> BAT_MUERTE = REGISTRY.register("bat_muerte", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "bat_muerte")));
	public static final RegistryObject<SoundEvent> CADA_QUIETO = REGISTRY.register("cada_quieto", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "cada_quieto")));
	public static final RegistryObject<SoundEvent> CADA_PASOS = REGISTRY.register("cada_pasos", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "cada_pasos")));
	public static final RegistryObject<SoundEvent> CADA_GOLPE = REGISTRY.register("cada_golpe", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "cada_golpe")));
	public static final RegistryObject<SoundEvent> CADA_MUERTE = REGISTRY.register("cada_muerte", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "cada_muerte")));
	public static final RegistryObject<SoundEvent> GRAN_QUIETO = REGISTRY.register("gran_quieto", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "gran_quieto")));
	public static final RegistryObject<SoundEvent> GRAN_PASOS = REGISTRY.register("gran_pasos", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "gran_pasos")));
	public static final RegistryObject<SoundEvent> GRAN_GOLPE = REGISTRY.register("gran_golpe", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "gran_golpe")));
	public static final RegistryObject<SoundEvent> GRAN_MUERTE = REGISTRY.register("gran_muerte", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("porcosmod", "gran_muerte")));
}
