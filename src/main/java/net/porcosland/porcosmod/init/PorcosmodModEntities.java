
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.porcosland.porcosmod.init;

import net.porcosland.porcosmod.entity.TitiEntity;
import net.porcosland.porcosmod.entity.RadagonEntity;
import net.porcosland.porcosmod.entity.NecromancerEntity;
import net.porcosland.porcosmod.entity.IgrisEntity;
import net.porcosland.porcosmod.entity.GranpapoEntity;
import net.porcosland.porcosmod.entity.GorgonEntity;
import net.porcosland.porcosmod.entity.EspectatorEntity;
import net.porcosland.porcosmod.entity.DevoradorEntity;
import net.porcosland.porcosmod.entity.DevilGirlEntity;
import net.porcosland.porcosmod.entity.CorpsesEntity;
import net.porcosland.porcosmod.entity.BatMonsterEntity;
import net.porcosland.porcosmod.PorcosmodMod;

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

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PorcosmodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, PorcosmodMod.MODID);
	public static final RegistryObject<EntityType<RadagonEntity>> RADAGON = register("radagon",
			EntityType.Builder.<RadagonEntity>of(RadagonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(RadagonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TitiEntity>> TITI = register("titi",
			EntityType.Builder.<TitiEntity>of(TitiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TitiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IgrisEntity>> IGRIS = register("igris",
			EntityType.Builder.<IgrisEntity>of(IgrisEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(IgrisEntity::new)

					.sized(0.6f, 6.1f));
	public static final RegistryObject<EntityType<GorgonEntity>> GORGON = register("gorgon",
			EntityType.Builder.<GorgonEntity>of(GorgonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GorgonEntity::new)

					.sized(2f, 3f));
	public static final RegistryObject<EntityType<DevilGirlEntity>> DEVIL_GIRL = register("devil_girl",
			EntityType.Builder.<DevilGirlEntity>of(DevilGirlEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DevilGirlEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NecromancerEntity>> NIGROMANTE = register("nigromante",
			EntityType.Builder.<NecromancerEntity>of(NecromancerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NecromancerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DevoradorEntity>> DEVORADOR = register("devorador",
			EntityType.Builder.<DevoradorEntity>of(DevoradorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DevoradorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EspectatorEntity>> ESPECTATOR = register("espectator",
			EntityType.Builder.<EspectatorEntity>of(EspectatorEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EspectatorEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BatMonsterEntity>> BAT_MONSTER = register("bat_monster",
			EntityType.Builder.<BatMonsterEntity>of(BatMonsterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BatMonsterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CorpsesEntity>> CORPSES = register("corpses",
			EntityType.Builder.<CorpsesEntity>of(CorpsesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorpsesEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GranpapoEntity>> GRANPAPO = register("granpapo",
			EntityType.Builder.<GranpapoEntity>of(GranpapoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GranpapoEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RadagonEntity.init();
			TitiEntity.init();
			IgrisEntity.init();
			GorgonEntity.init();
			DevilGirlEntity.init();
			NecromancerEntity.init();
			DevoradorEntity.init();
			EspectatorEntity.init();
			BatMonsterEntity.init();
			CorpsesEntity.init();
			GranpapoEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RADAGON.get(), RadagonEntity.createAttributes().build());
		event.put(TITI.get(), TitiEntity.createAttributes().build());
		event.put(IGRIS.get(), IgrisEntity.createAttributes().build());
		event.put(GORGON.get(), GorgonEntity.createAttributes().build());
		event.put(DEVIL_GIRL.get(), DevilGirlEntity.createAttributes().build());
		event.put(NIGROMANTE.get(), NecromancerEntity.createAttributes().build());
		event.put(DEVORADOR.get(), DevoradorEntity.createAttributes().build());
		event.put(ESPECTATOR.get(), EspectatorEntity.createAttributes().build());
		event.put(BAT_MONSTER.get(), BatMonsterEntity.createAttributes().build());
		event.put(CORPSES.get(), CorpsesEntity.createAttributes().build());
		event.put(GRANPAPO.get(), GranpapoEntity.createAttributes().build());
	}
}
