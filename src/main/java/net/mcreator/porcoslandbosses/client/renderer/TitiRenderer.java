
package net.mcreator.porcoslandbosses.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.porcoslandbosses.entity.TitiEntity;
import net.mcreator.porcoslandbosses.client.model.ModelTiti;

public class TitiRenderer extends MobRenderer<TitiEntity, ModelTiti<TitiEntity>> {
	public TitiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTiti(context.bakeLayer(ModelTiti.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TitiEntity entity) {
		return new ResourceLocation("porcoslandbosses:textures/entities/tititexturenew.png");
	}
}
