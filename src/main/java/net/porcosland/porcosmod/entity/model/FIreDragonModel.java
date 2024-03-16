package net.porcosland.porcosmod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.porcosland.porcosmod.entity.FIreDragonEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class FIreDragonModel extends GeoModel<FIreDragonEntity> {
	@Override
	public ResourceLocation getAnimationResource(FIreDragonEntity entity) {
		return new ResourceLocation("porcosmod", "animations/dragon_model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FIreDragonEntity entity) {
		return new ResourceLocation("porcosmod", "geo/dragon_model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FIreDragonEntity entity) {
		return new ResourceLocation("porcosmod", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(FIreDragonEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head_turn");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
