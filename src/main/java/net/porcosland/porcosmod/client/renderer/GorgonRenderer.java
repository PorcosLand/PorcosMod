
package net.porcosland.porcosmod.client.renderer;

import net.porcosland.porcosmod.entity.GorgonEntity;
import net.porcosland.porcosmod.client.model.ModelGorgon;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class GorgonRenderer extends MobRenderer<GorgonEntity, ModelGorgon<GorgonEntity>> {
	public GorgonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGorgon(context.bakeLayer(ModelGorgon.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(GorgonEntity entity) {
		return new ResourceLocation("porcosmod:textures/entities/gorgontextureedit.png");
	}
}
