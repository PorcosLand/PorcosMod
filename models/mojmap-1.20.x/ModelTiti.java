// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTiti<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "titi"), "main");
	private final ModelPart Body;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg2;
	private final ModelPart Head;

	public ModelTiti(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg2 = root.getChild("RightLeg2");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(-4.0F, -9.0F, -4.0F, 10.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(28, 17)
						.addBox(-4.0F, -8.0F, -5.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(0.0F, -6.1F, -4.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.2F)).texOffs(0, 4)
						.addBox(-3.0F, -5.3F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.5F)).texOffs(0, 0)
						.addBox(3.0F, -5.3F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.5F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(24, 39)
				.addBox(6.0F, -1.0F, -4.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cuadradoPierna_r1 = LeftLeg.addOrReplaceChild(
				"cuadradoPierna_r1", CubeListBuilder.create().texOffs(0, 33).addBox(6.0F, -6.0F, -4.0F, 2.0F, 5.0F,
						5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition RightLeg2 = partdefinition.addOrReplaceChild("RightLeg2", CubeListBuilder.create()
				.texOffs(14, 33).addBox(6.0F, -1.0F, -4.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, 24.0F, 0.0F));

		PartDefinition cuadradoPierna_r2 = RightLeg2.addOrReplaceChild(
				"cuadradoPierna_r2", CubeListBuilder.create().texOffs(30, 0).addBox(6.0F, -6.0F, -4.0F, 2.0F, 5.0F,
						5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-11.0F, -18.0F, -5.0F, 10.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(27, 24)
						.addBox(2.0F, -16.0F, -4.0F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rama2_r1 = Head
				.addOrReplaceChild("rama2_r1",
						CubeListBuilder.create().texOffs(28, 20).addBox(1.0F, -12.0F, -1.0F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition Rama_r1 = Head
				.addOrReplaceChild("Rama_r1",
						CubeListBuilder.create().texOffs(14, 33).addBox(3.0F, -13.0F, -1.0F, 1.0F, 5.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.Body.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Body.xRot = headPitch / (180F / (float) Math.PI);
	}
}