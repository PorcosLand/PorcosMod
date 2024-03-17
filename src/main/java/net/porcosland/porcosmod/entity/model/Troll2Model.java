package net.porcosland.porcosmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.porcosland.porcosmod.entity.Troll2Entity;

import net.minecraft.resources.ResourceLocation;

public class Troll2Model extends GeoModel<Troll2Entity> {
	@Override
	public ResourceLocation getAnimationResource(Troll2Entity entity) {
		return new ResourceLocation("porcosmod", "animations/trollwarrior2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Troll2Entity entity) {
		return new ResourceLocation("porcosmod", "geo/trollwarrior2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Troll2Entity entity) {
		return new ResourceLocation("porcosmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
