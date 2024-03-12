
package net.porcosland.porcosmod.client.renderer;

import net.porcosland.porcosmod.entity.IgrisEntity;
import net.porcosland.porcosmod.client.model.ModelIgris;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class IgrisRenderer extends MobRenderer<IgrisEntity, ModelIgris<IgrisEntity>> {
	public IgrisRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelIgris(context.bakeLayer(ModelIgris.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(IgrisEntity entity) {
		return new ResourceLocation("porcosmod:textures/entities/textureigris.png");
	}
}
