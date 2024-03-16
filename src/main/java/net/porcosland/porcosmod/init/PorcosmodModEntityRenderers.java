
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.porcosland.porcosmod.init;

import net.porcosland.porcosmod.client.renderer.TitiRenderer;
import net.porcosland.porcosmod.client.renderer.RadagonRenderer;
import net.porcosland.porcosmod.client.renderer.NecromancerRenderer;
import net.porcosland.porcosmod.client.renderer.IgrisRenderer;
import net.porcosland.porcosmod.client.renderer.GorgonRenderer;
import net.porcosland.porcosmod.client.renderer.EspectatorRenderer;
import net.porcosland.porcosmod.client.renderer.DevoradorRenderer;
import net.porcosland.porcosmod.client.renderer.DevilGirlRenderer;
import net.porcosland.porcosmod.client.renderer.CadaveresRenderer;
import net.porcosland.porcosmod.client.renderer.BatMonsterRenderer;

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
		event.registerEntityRenderer(PorcosmodModEntities.DEVIL_GIRL.get(), DevilGirlRenderer::new);
		event.registerEntityRenderer(PorcosmodModEntities.NIGROMANTE.get(), NecromancerRenderer::new);
		event.registerEntityRenderer(PorcosmodModEntities.CADAVERES.get(), CadaveresRenderer::new);
		event.registerEntityRenderer(PorcosmodModEntities.DEVORADOR.get(), DevoradorRenderer::new);
		event.registerEntityRenderer(PorcosmodModEntities.ESPECTATOR.get(), EspectatorRenderer::new);
		event.registerEntityRenderer(PorcosmodModEntities.BAT_MONSTER.get(), BatMonsterRenderer::new);
	}
}
