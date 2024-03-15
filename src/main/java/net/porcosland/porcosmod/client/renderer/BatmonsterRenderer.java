
package net.porcosland.porcosmod.client.renderer;

import net.porcosland.porcosmod.entity.BatmonsterEntity;
import net.porcosland.porcosmod.client.model.ModelBatmonster;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class BatmonsterRenderer extends MobRenderer<BatmonsterEntity, ModelBatmonster<BatmonsterEntity>> {
	public BatmonsterRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBatmonster(context.bakeLayer(ModelBatmonster.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BatmonsterEntity entity) {
		return new ResourceLocation("porcosmod:textures/entities/batmonstertexture.png");
	}
}
