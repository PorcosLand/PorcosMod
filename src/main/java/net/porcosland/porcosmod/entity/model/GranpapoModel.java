package net.porcosland.porcosmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.porcosland.porcosmod.entity.GranpapoEntity;

import net.minecraft.resources.ResourceLocation;

public class GranpapoModel extends GeoModel<GranpapoEntity> {
	@Override
	public ResourceLocation getAnimationResource(GranpapoEntity entity) {
		return new ResourceLocation("porcosmod", "animations/granmano.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GranpapoEntity entity) {
		return new ResourceLocation("porcosmod", "geo/granmano.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GranpapoEntity entity) {
		return new ResourceLocation("porcosmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
