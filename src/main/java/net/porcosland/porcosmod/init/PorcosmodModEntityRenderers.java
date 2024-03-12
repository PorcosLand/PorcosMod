
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.porcosland.porcosmod.init;

import net.porcosland.porcosmod.client.renderer.TitiRenderer;
import net.porcosland.porcosmod.client.renderer.RadagonRenderer;
import net.porcosland.porcosmod.client.renderer.IgrisRenderer;
import net.porcosland.porcosmod.client.renderer.GorgonRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PorcosmodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PorcosmodModEntities.RADAGON.get(), RadagonRenderer::new);
		event.registerEntityRenderer(PorcosmodModEntities.TITI.get(), TitiRenderer::new);
		event.registerEntityRenderer(PorcosmodModEntities.IGRIS.get(), IgrisRenderer::new);
		event.registerEntityRenderer(PorcosmodModEntities.GORGON.get(), GorgonRenderer::new);
	}
}
