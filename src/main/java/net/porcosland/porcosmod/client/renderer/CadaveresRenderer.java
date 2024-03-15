
package net.porcosland.porcosmod.client.renderer;

import net.porcosland.porcosmod.entity.CadaveresEntity;
import net.porcosland.porcosmod.client.model.ModelCadaveres;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class CadaveresRenderer extends MobRenderer<CadaveresEntity, ModelCadaveres<CadaveresEntity>> {
	public CadaveresRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCadaveres(context.bakeLayer(ModelCadaveres.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CadaveresEntity entity) {
		return new ResourceLocation("porcosmod:textures/entities/cadaveres.png");
	}
}
