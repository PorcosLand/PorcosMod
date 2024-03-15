
package net.porcosland.porcosmod.client.renderer;

import net.porcosland.porcosmod.entity.NecromancerEntity;
import net.porcosland.porcosmod.client.model.ModelNigromante;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class NecromancerRenderer extends MobRenderer<NecromancerEntity, ModelNigromante<NecromancerEntity>> {
	public NecromancerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNigromante(context.bakeLayer(ModelNigromante.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NecromancerEntity entity) {
		return new ResourceLocation("porcosmod:textures/entities/nigromantetexture.png");
	}
}
