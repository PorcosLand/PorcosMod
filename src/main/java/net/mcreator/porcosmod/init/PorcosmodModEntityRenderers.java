
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.porcosmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.porcoslandbosses.client.renderer.TitiRenderer;
import net.mcreator.porcoslandbosses.client.renderer.RadagonRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PorcosmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PorcosmodModEntities.RADAGON.get(), RadagonRenderer::new);
		event.registerEntityRenderer(PorcosmodModEntities.TITI.get(), TitiRenderer::new);
	}
}
