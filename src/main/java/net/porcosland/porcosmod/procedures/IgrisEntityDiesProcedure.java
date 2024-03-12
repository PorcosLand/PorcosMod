package net.porcosland.porcosmod.procedures;

import net.porcosland.porcosmod.network.PorcosmodModVariables;
import net.porcosland.porcosmod.init.PorcosmodModEntities;
import net.porcosland.porcosmod.PorcosmodMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class IgrisEntityDiesProcedure {
	public static void execute(LevelAccessor world) {
		PorcosmodMod.queueServerWork(20, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = PorcosmodModEntities.IGRIS.get().spawn(_level,
						BlockPos.containing(PorcosmodModVariables.MapVariables.get(world).setXIgris, PorcosmodModVariables.MapVariables.get(world).setYIgris, PorcosmodModVariables.MapVariables.get(world).setZIgris), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Igris \u00A7eha vuelto a spawnear en el mundo"), false);
		});
	}
}
