package net.porcosland.porcosmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelDEvilGirl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("porcosmod", "model_d_evil_girl"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Cola;

	public ModelDEvilGirl(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Cola = root.getChild("Cola");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 33).addBox(-4.5F, -10.0F, -4.0F, 9.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 50).addBox(3.5F, -10.0F, 4.1F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 50)
						.addBox(1.5F, -10.0F, 4.1F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 50).addBox(-0.5F, -10.0F, 4.1F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 50)
						.addBox(-2.5F, -10.0F, 4.1F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 50).addBox(-4.5F, -10.0F, 4.1F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 7)
						.addBox(-1.5F, -10.0F, -4.3F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 9).addBox(4.6F, -10.0F, -2.3F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(4.6F, -10.0F, -0.3F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 9).addBox(4.6F, -10.0F, 1.7F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-4.6F, -10.0F, 1.7F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0).addBox(-4.6F, -10.0F, -0.3F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-4.6F, -10.0F, -2.3F, 0.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 6).addBox(-3.5F, -9.0F, -4.3F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(-4.5F, -8.0F, -4.3F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 40).addBox(-4.5F, -7.0F, -4.3F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-4.5F, -6.0F, -4.3F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 16).addBox(-4.5F, -5.0F, -4.3F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 16)
						.addBox(-3.5F, -2.0F, -4.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 15).addBox(2.5F, -8.0F, -4.3F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(2.5F, -7.0F, -4.3F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 0).addBox(3.5F, -6.0F, -4.3F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -11.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 1).addBox(-5.0F, -11.7F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(24, 10).addBox(-23.9F, -27.5F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 16).addBox(15.6F, -32.8F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, 23.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(34, 40).addBox(-4.0F, -23.2F, -7.0F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.0F, 0.0F, -0.1745F, 0.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(16, 16).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 13.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 13.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(34, 16).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 2.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 18).addBox(0.0F, 6.3F, -15.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 24)
						.addBox(0.0F, 12.3F, -15.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 50).addBox(0.0F, 6.3F, -10.9F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-1.0F, 8.3F, 11.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.0F, 9.3F, -19.0F, 1.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, 1.0F, 0.0F));
		PartDefinition cube_r4 = RightArm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 33).addBox(-6.0F, -21.5F, -6.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(49, 33).addBox(-6.0F, -20.4F, -11.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 23.0F, 0.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r5 = RightArm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(12, 16).addBox(-6.0F, -3.4F, -17.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 48).addBox(-6.0F, -4.6F, -22.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 23.0F, 0.0F, -0.4363F, 0.0F, 0.0F));
		PartDefinition Cola = partdefinition.addOrReplaceChild("Cola", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r6 = Cola.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(24, 13).addBox(-1.6F, -5.7F, 22.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 16).addBox(0.4F, -5.7F, 22.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 33)
						.addBox(-0.6F, -5.7F, 30.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 18).addBox(-1.6F, -5.7F, 29.2F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(-3.6F, -5.7F, 24.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 0).addBox(2.4F, -5.7F, 24.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 33)
						.addBox(-2.6F, -5.7F, 23.2F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 33).addBox(-0.6F, -5.7F, 18.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.829F, 0.0F, 0.0F));
		PartDefinition cube_r7 = Cola.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 0).addBox(-0.6F, -2.4F, 14.2F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0036F, 0.0F, 0.0F));
		PartDefinition cube_r8 = Cola.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(44, 11).addBox(-1.0F, -13.0F, 4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Cola.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
