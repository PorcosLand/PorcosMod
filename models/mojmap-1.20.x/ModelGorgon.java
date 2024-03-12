// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGorgon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gorgon"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public ModelGorgon(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 37)
						.addBox(-8.0F, -36.0F, -9.0F, 17.0F, 21.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-3.5F, -40.0F, -4.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -35.0F, -11.0F, 15.0F, 19.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(46, 55)
						.addBox(-6.0F, -34.0F, -12.0F, 13.0F, 17.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(66, 0)
						.addBox(-9.0F, -35.0F, -8.0F, 19.0F, 19.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(59, 32)
						.addBox(9.0F, -36.0F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(70, 90)
						.addBox(-9.0F, -36.0F, -5.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(64, 32)
						.addBox(-5.5F, -10.0F, -6.5F, 11.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(-4.5F, -9.0F, -6.4F, 9.0F, 8.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(80, 90)
						.addBox(-4.5F, -11.0F, -5.5F, 9.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(34, 90)
						.addBox(-6.5F, -9.0F, -5.5F, 13.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(98, 40)
						.addBox(-6.0F, -5.0F, -7.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 94)
						.addBox(-6.0F, -1.0F, -7.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-6.0F, -3.0F, -7.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(2.0F, -3.0F, -7.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 13)
						.addBox(2.0F, -8.0F, -6.9F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-2.5F, -3.0F, -6.7F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 49)
						.addBox(-1.5F, -2.0F, -6.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-2.5F, -2.0F, -6.6F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-5.0F, -8.0F, -6.9F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(49, 49)
						.addBox(-3.9F, -6.9F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(1.9F, -6.9F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -14.0F, -1.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(108, 78)
						.addBox(-3.0F, -1.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(49, 37)
						.addBox(-1.0F, 10.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 110)
						.addBox(-2.0F, 12.0F, -5.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 10.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(110, 110)
						.addBox(-1.0F, 3.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(108, 88)
						.addBox(-2.0F, -1.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(49, 43)
						.addBox(0.0F, 10.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 110)
						.addBox(-1.0F, 12.0F, -5.0F, 4.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 10.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(20, 108)
						.addBox(22.0F, 0.0F, -3.0F, 5.0F, 23.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(98, 32)
						.addBox(21.0F, 19.0F, -4.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(90, 54)
						.addBox(22.0F, -1.0F, -4.0F, 6.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(48, 3)
						.addBox(22.0F, 25.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(22.0F, 23.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(55, 41)
						.addBox(22.0F, 24.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(55, 47)
						.addBox(22.0F, 22.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 73)
						.addBox(22.0F, 21.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 4)
						.addBox(24.0F, 21.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(24.0F, 22.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 13)
						.addBox(24.0F, 24.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(24.0F, 23.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(24.0F, 25.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 73)
						.addBox(26.0F, 21.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 15)
						.addBox(26.0F, 22.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(57, 44)
						.addBox(26.0F, 24.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 11)
						.addBox(26.0F, 23.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 40)
						.addBox(26.0F, 25.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, -11.0F, -1.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(0, 94)
						.addBox(-26.0F, 1.0F, -3.0F, 5.0F, 23.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(108, 70)
						.addBox(-27.0F, 20.0F, -4.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(6, 76)
						.addBox(-26.0F, 22.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 1)
						.addBox(-26.0F, 23.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 40)
						.addBox(-26.0F, 24.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(-26.0F, 25.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(69, 3)
						.addBox(-26.0F, 26.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 76)
						.addBox(-24.0F, 22.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 32)
						.addBox(-24.0F, 23.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 37)
						.addBox(-24.0F, 24.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 35)
						.addBox(-24.0F, 25.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(69, 0)
						.addBox(-24.0F, 26.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 73)
						.addBox(-22.0F, 22.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 13)
						.addBox(-22.0F, 23.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 16)
						.addBox(-22.0F, 24.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 41)
						.addBox(-22.0F, 25.0F, -5.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(67, 40)
						.addBox(-22.0F, 26.0F, -4.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 108)
						.addBox(-27.0F, 0.0F, -4.0F, 6.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, -12.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}