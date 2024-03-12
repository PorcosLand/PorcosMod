
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.porcosland.porcosmod.init;

import net.porcosland.porcosmod.client.model.ModelTiti;
import net.porcosland.porcosmod.client.model.ModelIgris;
import net.porcosland.porcosmod.client.model.ModelGorgon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PorcosmodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelIgris.LAYER_LOCATION, ModelIgris::createBodyLayer);
		event.registerLayerDefinition(ModelGorgon.LAYER_LOCATION, ModelGorgon::createBodyLayer);
		event.registerLayerDefinition(ModelTiti.LAYER_LOCATION, ModelTiti::createBodyLayer);
	}
}
