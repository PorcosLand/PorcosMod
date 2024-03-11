
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.porcoslandbosses.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.porcoslandbosses.PorcoslandbossesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PorcoslandbossesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PorcoslandbossesMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(PorcoslandbossesModItems.PORCARMOR_ARMOR_HELMET.get());
			tabData.accept(PorcoslandbossesModItems.PORCARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(PorcoslandbossesModItems.PORCARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(PorcoslandbossesModItems.PORCARMOR_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PorcoslandbossesModItems.RADAGON_SPAWN_EGG.get());
			tabData.accept(PorcoslandbossesModItems.TITI_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(PorcoslandbossesModItems.PORCONIUM.get());
		}
	}
}
