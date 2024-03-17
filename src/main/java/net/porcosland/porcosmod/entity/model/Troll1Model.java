package net.porcosland.porcosmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.porcosland.porcosmod.entity.Troll1Entity;

import net.minecraft.resources.ResourceLocation;

public class Troll1Model extends GeoModel<Troll1Entity> {
	@Override
	public ResourceLocation getAnimationResource(Troll1Entity entity) {
		return new ResourceLocation("porcosmod", "animations/trollwarrior1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Troll1Entity entity) {
		return new ResourceLocation("porcosmod", "geo/trollwarrior1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Troll1Entity entity) {
		return new ResourceLocation("porcosmod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
