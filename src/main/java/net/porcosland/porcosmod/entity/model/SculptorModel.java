package net.porcosland.porcosmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.porcosland.porcosmod.entity.SculptorEntity;

import net.minecraft.resources.ResourceLocation;

public class SculptorModel extends GeoModel<SculptorEntity> {
	@Override
	public ResourceLocation getAnimationResource(SculptorEntity entity) {
		return new ResourceLocation("porcosmod", "animations/sculptor.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SculptorEntity entity) {
		return new ResourceLocation("porcosmod", "geo/sculptor.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SculptorEntity entity) {
		return new ResourceLocation("porcosmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
