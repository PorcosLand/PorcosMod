package net.porcosland.porcosmod.procedures;

import net.porcosland.porcosmod.network.PorcosmodModVariables;
import net.porcosland.porcosmod.PorcosmodMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class RadagonOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean infinite = false;
		if (infinite == false) {
			PorcosmodModVariables.MapVariables.get(world).setXRadagon = entity.getX();
			PorcosmodModVariables.MapVariables.get(world).syncData(world);
			PorcosmodModVariables.MapVariables.get(world).setYRadagon = entity.getY();
			PorcosmodModVariables.MapVariables.get(world).syncData(world);
			PorcosmodModVariables.MapVariables.get(world).setZRadagon = entity.getZ();
			PorcosmodModVariables.MapVariables.get(world).syncData(world);
		}
		infinite = true;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("porcosmod:epicbattlemusic")), SoundSource.VOICE, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("porcosmod:epicbattlemusic")), SoundSource.VOICE, 1, 1, false);
			}
		}
		PorcosmodMod.queueServerWork(4840, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("porcosmod:epicbattlemusic")), SoundSource.VOICE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("porcosmod:epicbattlemusic")), SoundSource.VOICE, 1, 1, false);
				}
			}
		});
	}
}
