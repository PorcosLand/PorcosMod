
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.porcosmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.porcosmod.PorcosmodMod;
import net.mcreator.porcoslandbosses.entity.TitiEntity;
import net.mcreator.porcoslandbosses.entity.RadagonEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PorcosmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PorcosmodMod.MODID);
	public static final RegistryObject<EntityType<RadagonEntity>> RADAGON = register("radagon",
			EntityType.Builder.<RadagonEntity>of(RadagonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RadagonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TitiEntity>> TITI = register("titi",
			EntityType.Builder.<TitiEntity>of(TitiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TitiEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RadagonEntity.init();
			TitiEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RADAGON.get(), RadagonEntity.createAttributes().build());
		event.put(TITI.get(), TitiEntity.createAttributes().build());
	}
}
