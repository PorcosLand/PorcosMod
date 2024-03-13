
package net.porcosland.porcosmod.client.renderer;

import net.porcosland.porcosmod.entity.DevilGirlEntity;
import net.porcosland.porcosmod.client.model.ModelDEvilGirl;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class DevilGirlRenderer extends MobRenderer<DevilGirlEntity, ModelDEvilGirl<DevilGirlEntity>> {
	public DevilGirlRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDEvilGirl(context.bakeLayer(ModelDEvilGirl.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DevilGirlEntity entity) {
		return new ResourceLocation("porcosmod:textures/entities/devilextureedit.png");
	}
}
