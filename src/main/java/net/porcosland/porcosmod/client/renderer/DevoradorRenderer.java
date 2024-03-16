
package net.porcosland.porcosmod.client.renderer;

import net.porcosland.porcosmod.entity.DevoradorEntity;
import net.porcosland.porcosmod.client.model.ModelDevorador;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DevoradorRenderer extends MobRenderer<DevoradorEntity, ModelDevorador<DevoradorEntity>> {
	public DevoradorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDevorador(context.bakeLayer(ModelDevorador.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DevoradorEntity entity) {
		return new ResourceLocation("porcosmod:textures/entities/devorador.png");
	}
}
