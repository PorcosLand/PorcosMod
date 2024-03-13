
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.porcosland.porcosmod.init;

import net.porcosland.porcosmod.PorcosmodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PorcosmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PorcosmodMod.MODID);
	public static final RegistryObject<CreativeModeTab> PORCOS_MOD = REGISTRY.register("porcos_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.porcosmod.porcos_mod")).icon(() -> new ItemStack(PorcosmodModItems.PORCONIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(PorcosmodModItems.PORCONIUM.get());
				tabData.accept(PorcosmodModItems.PORCARMOR_ARMOR_HELMET.get());
				tabData.accept(PorcosmodModItems.PORCARMOR_ARMOR_CHESTPLATE.get());
				tabData.accept(PorcosmodModItems.PORCARMOR_ARMOR_LEGGINGS.get());
				tabData.accept(PorcosmodModItems.PORCARMOR_ARMOR_BOOTS.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(PorcosmodModItems.RADAGON_SPAWN_EGG.get());
			tabData.accept(PorcosmodModItems.TITI_SPAWN_EGG.get());
			tabData.accept(PorcosmodModItems.IGRIS_SPAWN_EGG.get());
			tabData.accept(PorcosmodModItems.GORGON_SPAWN_EGG.get());
			tabData.accept(PorcosmodModItems.DEVIL_GIRL_SPAWN_EGG.get());
		}
	}
}
