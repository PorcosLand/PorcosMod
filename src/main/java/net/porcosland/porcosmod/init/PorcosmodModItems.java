
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.porcosland.porcosmod.init;

import net.porcosland.porcosmod.item.PorconiumItem;
import net.porcosland.porcosmod.item.PorcoinDePlataItem;
import net.porcosland.porcosmod.item.PorcoinDeOroItem;
import net.porcosland.porcosmod.item.PorcoinDeBronceItem;
import net.porcosland.porcosmod.item.PorcarmorArmorItem;
import net.porcosland.porcosmod.PorcosmodMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

public class PorcosmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PorcosmodMod.MODID);
	public static final RegistryObject<Item> RADAGON_SPAWN_EGG = REGISTRY.register("radagon_spawn_egg", () -> new ForgeSpawnEggItem(PorcosmodModEntities.RADAGON, -6750157, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> PORCONIUM = REGISTRY.register("porconium", () -> new PorconiumItem());
	public static final RegistryObject<Item> PORCARMOR_ARMOR_HELMET = REGISTRY.register("porcarmor_armor_helmet", () -> new PorcarmorArmorItem.Helmet());
	public static final RegistryObject<Item> PORCARMOR_ARMOR_CHESTPLATE = REGISTRY.register("porcarmor_armor_chestplate", () -> new PorcarmorArmorItem.Chestplate());
	public static final RegistryObject<Item> PORCARMOR_ARMOR_LEGGINGS = REGISTRY.register("porcarmor_armor_leggings", () -> new PorcarmorArmorItem.Leggings());
	public static final RegistryObject<Item> PORCARMOR_ARMOR_BOOTS = REGISTRY.register("porcarmor_armor_boots", () -> new PorcarmorArmorItem.Boots());
	public static final RegistryObject<Item> TITI_SPAWN_EGG = REGISTRY.register("titi_spawn_egg", () -> new ForgeSpawnEggItem(PorcosmodModEntities.TITI, -16295405, -9874901, new Item.Properties()));
	public static final RegistryObject<Item> IGRIS_SPAWN_EGG = REGISTRY.register("igris_spawn_egg", () -> new ForgeSpawnEggItem(PorcosmodModEntities.IGRIS, -6750208, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> GORGON_SPAWN_EGG = REGISTRY.register("gorgon_spawn_egg", () -> new ForgeSpawnEggItem(PorcosmodModEntities.GORGON, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> DEVIL_GIRL_SPAWN_EGG = REGISTRY.register("devil_girl_spawn_egg", () -> new ForgeSpawnEggItem(PorcosmodModEntities.DEVIL_GIRL, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> PORCOIN_DE_ORO = REGISTRY.register("porcoin_de_oro", () -> new PorcoinDeOroItem());
	public static final RegistryObject<Item> PORCOIN_DE_PLATA = REGISTRY.register("porcoin_de_plata", () -> new PorcoinDePlataItem());
	public static final RegistryObject<Item> PORCOIN_DE_BRONCE = REGISTRY.register("porcoin_de_bronce", () -> new PorcoinDeBronceItem());
}
