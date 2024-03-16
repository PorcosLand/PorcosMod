package net.porcosland.porcosmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.porcosland.porcosmod.entity.BatMonsterEntity;

import net.minecraft.resources.ResourceLocation;

public class BatMonsterModel extends GeoModel<BatMonsterEntity> {
	@Override
	public ResourceLocation getAnimationResource(BatMonsterEntity entity) {
		return new ResourceLocation("porcosmod", "animations/batmonster.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BatMonsterEntity entity) {
		return new ResourceLocation("porcosmod", "geo/batmonster.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BatMonsterEntity entity) {
		return new ResourceLocation("porcosmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
