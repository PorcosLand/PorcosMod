package net.porcosland.porcosmod.procedures;

import net.minecraft.world.entity.Entity;

public class IgrisItIsStruckByLightningProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
