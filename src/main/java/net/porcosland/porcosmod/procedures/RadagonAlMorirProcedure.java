package net.porcosland.porcosmod.procedures;

import net.porcosland.porcosmod.network.PorcosmodModVariables;
import net.porcosland.porcosmod.init.PorcosmodModEntities;
import net.porcosland.porcosmod.PorcosmodMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RadagonAlMorirProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getPlayer().level(), event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		boolean bossSpawn = false;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "stopsound @a");
		PorcosmodMod.queueServerWork(1, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = PorcosmodModEntities.RADAGON.get().spawn(_level,
						BlockPos.containing(PorcosmodModVariables.MapVariables.get(world).setXRadagon, PorcosmodModVariables.MapVariables.get(world).setYRadagon, PorcosmodModVariables.MapVariables.get(world).setZRadagon), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7eEl \u00A74Radagon \u00A7eha vuelto a spawnear en el mundo"), false);
		});
	}
}
