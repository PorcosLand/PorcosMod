
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.porcoslandbosses.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.porcoslandbosses.client.model.Modelprueba;
import net.mcreator.porcoslandbosses.client.model.ModelTiti;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PorcoslandbossesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelprueba.LAYER_LOCATION, Modelprueba::createBodyLayer);
		event.registerLayerDefinition(ModelTiti.LAYER_LOCATION, ModelTiti::createBodyLayer);
	}
}
