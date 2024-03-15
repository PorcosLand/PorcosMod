package net.porcosland.porcosmod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class ModelCadaveres<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("porcosmod", "model_cadaveres"), "main");
	public final ModelPart todo;
	public final ModelPart cuerpod;
	public final ModelPart cuerpoi;
	public final ModelPart pieizquierdo;
	public final ModelPart piederecho;
	public final ModelPart head;
	public final ModelPart manoderecha;
	public final ModelPart manoizquierda;
	public final ModelPart cabeza2;

	public ModelCadaveres(ModelPart root) {
		this.todo = root.getChild("todo");
		this.cuerpod = root.getChild("cuerpod");
		this.cuerpoi = root.getChild("cuerpoi");
		this.pieizquierdo = root.getChild("pieizquierdo");
		this.piederecho = root.getChild("piederecho");
		this.head = root.getChild("head");
		this.manoderecha = root.getChild("manoderecha");
		this.manoizquierda = root.getChild("manoizquierda");
		this.cabeza2 = root.getChild("cabeza2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition todo = partdefinition.addOrReplaceChild("todo",
				CubeListBuilder.create().texOffs(26, 71).addBox(-8.0F, -42.0F, -3.0F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, -31.0F, -5.0F, 12.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-5.0F, -35.0F, -4.0F, 10.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(35, 0).addBox(-6.0F, -36.0F, -4.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(31, 15)
						.addBox(-7.0F, -38.0F, -4.0F, 14.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(84, 22).addBox(2.0F, -42.0F, -2.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-3.0F, -42.0F, 1.0F, 6.0F, 4.0F, -1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cuerpod = partdefinition.addOrReplaceChild("cuerpod",
				CubeListBuilder.create().texOffs(0, 15).addBox(-5.0F, -11.0F, -5.5F, 10.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(29, 56).addBox(-4.0F, -7.0F, -4.5F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.0F, -17.0F, 0.5F));
		PartDefinition cuerpoi = partdefinition.addOrReplaceChild("cuerpoi", CubeListBuilder.create().texOffs(91, 63).addBox(-2.0F, -11.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(31, 42)
				.addBox(-5.0F, -8.5F, -4.5F, 10.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(63, 35).addBox(-4.0F, -5.5F, -3.5F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(5.7766F, -17.5F, 0.4627F));
		PartDefinition pieizquierdo = partdefinition.addOrReplaceChild("pieizquierdo",
				CubeListBuilder.create().texOffs(63, 49).addBox(-3.0F, -1.3214F, -3.6135F, 6.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(96, 8).addBox(-1.0F, 14.6786F, -1.6135F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(90, 0)
						.addBox(-2.0F, 24.6786F, -4.6135F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(31, 15).addBox(1.0F, 24.6786F, -6.6135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-2.0F, 24.6786F, -6.6135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, -2.6786F, 0.6135F));
		PartDefinition pieizquierdo_r1 = pieizquierdo.addOrReplaceChild("pieizquierdo_r1", CubeListBuilder.create().texOffs(47, 80).addBox(-2.0F, -6.0F, -2.5F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 12.607F, 1.0677F, -0.1745F, 0.0F, 0.0F));
		PartDefinition piederecho = partdefinition.addOrReplaceChild("piederecho",
				CubeListBuilder.create().texOffs(0, 62).addBox(-3.0F, -0.3214F, -3.6135F, 6.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(89, 94).addBox(-1.0F, 15.6786F, -1.6135F, 2.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(89, 55)
						.addBox(-2.0F, 25.6786F, -4.6135F, 4.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(4, 20).addBox(-2.0F, 25.6786F, -6.6135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(1.0F, 25.6786F, -6.6135F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, -3.6786F, 0.6135F));
		PartDefinition piederecho_r1 = piederecho.addOrReplaceChild("piederecho_r1", CubeListBuilder.create().texOffs(74, 76).addBox(-2.0F, -6.0F, -2.5F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.607F, 1.0677F, -0.1745F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild(
				"head", CubeListBuilder.create().texOffs(0, 32).addBox(-5.25F, -12.7668F, -6.0168F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(45, 71).addBox(-5.25F, -5.7668F, 3.9832F, 9.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(69, 68).addBox(-4.25F, -5.7668F, -5.0168F, 8.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(92, 71).addBox(-2.25F, -2.7668F, -3.0168F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.75F, -28.2332F, 1.0168F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(46, 10).addBox(-4.0F, -0.5F, -2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -4.6328F, 2.6172F, 1.0472F, 0.0F, 0.0F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(60, 26).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -3.2668F, -2.0168F, 0.1745F, 0.0F, 0.0F));
		PartDefinition manoderecha = partdefinition.addOrReplaceChild("manoderecha",
				CubeListBuilder.create().texOffs(94, 79).addBox(-2.1397F, -1.6465F, -2.3931F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 97).addBox(-10.1397F, 7.3535F, -2.3931F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.8603F, -27.3535F, 0.3931F, 0.6109F, 0.0F, 0.0F));
		PartDefinition manoderecha_r1 = manoderecha.addOrReplaceChild("manoderecha_r1", CubeListBuilder.create().texOffs(79, 94).addBox(-1.5F, -6.0F, -1.0F, 3.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9075F, 4.4142F, -0.3931F, 0.0F, 0.0F, 0.7854F));
		PartDefinition manod = manoderecha.addOrReplaceChild("manod",
				CubeListBuilder.create().texOffs(53, 68).addBox(-2.4084F, -1.6343F, -9.311F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(61, 93).addBox(-3.4084F, -2.6343F, -13.311F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.7313F, 9.9879F, -3.0821F));
		PartDefinition manod_r1 = manod.addOrReplaceChild("manod_r1", CubeListBuilder.create().texOffs(19, 62).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7617F, 0.8657F, -16.5961F, 0.0F, 1.3526F, 0.0F));
		PartDefinition manod_r2 = manod.addOrReplaceChild("manod_r2", CubeListBuilder.create().texOffs(83, 37).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(82, 83)
				.addBox(1.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(84, 11).addBox(3.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9084F, -1.5473F, -20.7476F, 0.2618F, 0.0F, 0.0F));
		PartDefinition manod_r3 = manod.addOrReplaceChild("manod_r3", CubeListBuilder.create().texOffs(30, 34).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5058F, 0.8657F, -11.811F, 0.0F, 0.7854F, 0.0F));
		PartDefinition manod_r4 = manod.addOrReplaceChild("manod_r4", CubeListBuilder.create().texOffs(99, 91).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0916F, -1.6716F, -14.1544F, -0.5672F, 0.0F, 0.0F));
		PartDefinition manod_r5 = manod.addOrReplaceChild("manod_r5", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9084F, -1.9403F, -14.5761F, -0.5672F, 0.0F, 0.0F));
		PartDefinition manod_r6 = manod.addOrReplaceChild("manod_r6", CubeListBuilder.create().texOffs(0, 5).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9084F, -2.2089F, -14.9978F, -0.5672F, 0.0F, 0.0F));
		PartDefinition manoizquierda = partdefinition.addOrReplaceChild("manoizquierda",
				CubeListBuilder.create().texOffs(28, 94).addBox(-1.8603F, -1.6465F, -2.3931F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(95, 36).addBox(7.1397F, 7.3535F, -2.3931F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.8603F, -25.3535F, 1.3931F, 0.7418F, -0.3054F, 0.0F));
		PartDefinition manoizquierda_r1 = manoizquierda.addOrReplaceChild("manoizquierda_r1", CubeListBuilder.create().texOffs(18, 94).addBox(-1.5F, -6.0F, -1.0F, 3.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9075F, 4.4142F, -0.3931F, 0.0F, 0.0F, -0.7854F));
		PartDefinition manoi = manoizquierda.addOrReplaceChild("manoi",
				CubeListBuilder.create().texOffs(0, 93).addBox(-1.5916F, -1.6343F, -14.311F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 9).addBox(-0.5916F, -0.6343F, -10.311F, 3.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.7313F, 8.9879F, -2.0821F));
		PartDefinition manoi_r1 = manoi.addOrReplaceChild("manoi_r1", CubeListBuilder.create().texOffs(0, 81).addBox(-0.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(12, 82)
				.addBox(-2.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(24, 83).addBox(-4.5F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9084F, -0.5473F, -21.7476F, 0.2618F, 0.0F, 0.0F));
		PartDefinition manoi_r2 = manoi.addOrReplaceChild("manoi_r2", CubeListBuilder.create().texOffs(52, 99).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0916F, -0.6716F, -15.1544F, -0.5672F, 0.0F, 0.0F));
		PartDefinition manoi_r3 = manoi.addOrReplaceChild("manoi_r3", CubeListBuilder.create().texOffs(99, 98).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.9084F, -0.9403F, -15.5761F, -0.5672F, 0.0F, 0.0F));
		PartDefinition manoi_r4 = manoi.addOrReplaceChild("manoi_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9084F, -1.2089F, -15.9978F, -0.5672F, 0.0F, 0.0F));
		PartDefinition manoi_r5 = manoi.addOrReplaceChild("manoi_r5", CubeListBuilder.create().texOffs(60, 47).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7617F, 1.8657F, -17.5961F, 0.0F, -1.3526F, 0.0F));
		PartDefinition manoi_r6 = manoi.addOrReplaceChild("manoi_r6", CubeListBuilder.create().texOffs(30, 32).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5058F, 1.8657F, -12.811F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cabeza2 = partdefinition
				.addOrReplaceChild(
						"cabeza2", CubeListBuilder.create().texOffs(32, 26).addBox(-4.375F, -9.4543F, -5.9375F, 9.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(94, 87)
								.addBox(-4.375F, -3.4543F, 4.0625F, 9.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(82, 48).addBox(-3.375F, -3.4543F, -4.9375F, 7.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(6.1516F, -28.5457F, 0.9002F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cabeza2_r1 = cabeza2.addOrReplaceChild("cabeza2_r1", CubeListBuilder.create().texOffs(88, 31).addBox(-3.5F, -0.5F, -2.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.125F, -2.8203F, 2.5625F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cabeza2_r2 = cabeza2.addOrReplaceChild("cabeza2_r2", CubeListBuilder.create().texOffs(68, 0).addBox(-3.5F, -0.5F, -4.0F, 7.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.125F, -0.9543F, -1.9375F, 0.2618F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		todo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cuerpod.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cuerpoi.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pieizquierdo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		piederecho.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manoderecha.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manoizquierda.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cabeza2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.piederecho.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.cabeza2.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.cabeza2.xRot = headPitch / (180F / (float) Math.PI);
		this.manoizquierda.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.pieizquierdo.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.manoderecha.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
