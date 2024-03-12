package net.porcosland.porcosmod.procedures;

import net.porcosland.porcosmod.network.PorcosmodModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class IgrisOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		PorcosmodModVariables.MapVariables.get(world).setXIgris = entity.getX();
		PorcosmodModVariables.MapVariables.get(world).syncData(world);
		PorcosmodModVariables.MapVariables.get(world).setYIgris = entity.getY();
		PorcosmodModVariables.MapVariables.get(world).syncData(world);
		PorcosmodModVariables.MapVariables.get(world).setZIgris = entity.getZ();
		PorcosmodModVariables.MapVariables.get(world).syncData(world);
	}
}
