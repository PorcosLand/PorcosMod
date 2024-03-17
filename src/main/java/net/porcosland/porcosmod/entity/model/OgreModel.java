package net.porcosland.porcosmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.porcosland.porcosmod.entity.OgreEntity;

import net.minecraft.resources.ResourceLocation;

public class OgreModel extends GeoModel<OgreEntity> {
	@Override
	public ResourceLocation getAnimationResource(OgreEntity entity) {
		return new ResourceLocation("porcosmod", "animations/ogrevillager.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OgreEntity entity) {
		return new ResourceLocation("porcosmod", "geo/ogrevillager.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OgreEntity entity) {
		return new ResourceLocation("porcosmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
