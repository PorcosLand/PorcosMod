
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.porcoslandbosses.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.porcoslandbosses.item.PorconiumItem;
import net.mcreator.porcoslandbosses.item.PorcarmorArmorItem;
import net.mcreator.porcoslandbosses.PorcoslandbossesMod;

public class PorcoslandbossesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PorcoslandbossesMod.MODID);
	public static final RegistryObject<Item> RADAGON_SPAWN_EGG = REGISTRY.register("radagon_spawn_egg", () -> new ForgeSpawnEggItem(PorcoslandbossesModEntities.RADAGON, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> PORCONIUM = REGISTRY.register("porconium", () -> new PorconiumItem());
	public static final RegistryObject<Item> PORCARMOR_ARMOR_HELMET = REGISTRY.register("porcarmor_armor_helmet", () -> new PorcarmorArmorItem.Helmet());
	public static final RegistryObject<Item> PORCARMOR_ARMOR_CHESTPLATE = REGISTRY.register("porcarmor_armor_chestplate", () -> new PorcarmorArmorItem.Chestplate());
	public static final RegistryObject<Item> PORCARMOR_ARMOR_LEGGINGS = REGISTRY.register("porcarmor_armor_leggings", () -> new PorcarmorArmorItem.Leggings());
	public static final RegistryObject<Item> PORCARMOR_ARMOR_BOOTS = REGISTRY.register("porcarmor_armor_boots", () -> new PorcarmorArmorItem.Boots());
}
