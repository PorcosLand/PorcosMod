package net.porcosland.porcosmod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.porcosland.porcosmod.entity.EspectatorEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class EspectatorModel extends GeoModel<EspectatorEntity> {
	@Override
	public ResourceLocation getAnimationResource(EspectatorEntity entity) {
		return new ResourceLocation("porcosmod", "animations/espectador.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EspectatorEntity entity) {
		return new ResourceLocation("porcosmod", "geo/espectador.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EspectatorEntity entity) {
		return new ResourceLocation("porcosmod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(EspectatorEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("animation.animation.ojo");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
