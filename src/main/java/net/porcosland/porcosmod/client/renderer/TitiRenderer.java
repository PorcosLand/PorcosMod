
package net.porcosland.porcosmod.client.renderer;

import net.porcosland.porcosmod.entity.TitiEntity;
import net.porcosland.porcosmod.client.model.ModelTiti;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TitiRenderer extends MobRenderer<TitiEntity, ModelTiti<TitiEntity>> {
	public TitiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTiti(context.bakeLayer(ModelTiti.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TitiEntity entity) {
		return new ResourceLocation("porcosmod:textures/entities/texturatiti.png");
	}
}
