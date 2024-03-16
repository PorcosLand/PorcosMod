package net.porcosland.porcosmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.porcosland.porcosmod.entity.CorpsesEntity;

import net.minecraft.resources.ResourceLocation;

public class CorpsesModel extends GeoModel<CorpsesEntity> {
	@Override
	public ResourceLocation getAnimationResource(CorpsesEntity entity) {
		return new ResourceLocation("porcosmod", "animations/cadaveres.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CorpsesEntity entity) {
		return new ResourceLocation("porcosmod", "geo/cadaveres.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CorpsesEntity entity) {
		return new ResourceLocation("porcosmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
