// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Nigromante<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "nigromante"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;

	public Nigromante(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(8, 59).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 0).addBox(-2.0F, 12.0F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 11.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(26, 18).addBox(-2.0F, 11.0F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -1.0F, -4.0F, 12.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(4, 28).addBox(-6.0F, 8.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(5, 26).addBox(-6.0F, 9.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-4.0F, 8.0F, -4.0F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(57, 59).addBox(0.0F, 9.0F, -4.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(14, 22).addBox(1.0F, 10.0F, -4.0F, 5.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 18).addBox(1.0F, 11.0F, -4.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(25, 17).addBox(-6.0F, -1.0F, -4.0F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(25, 16).addBox(-6.0F, -1.0F, 4.0F, 12.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 9).addBox(-6.0F, -1.0F, -3.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(11, 9).addBox(5.0F, -1.0F, -3.0F, 1.0F, 0.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-6.0F, 10.0F, -3.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(20, 18).addBox(-6.0F, 11.0F, 3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 19).addBox(-6.0F, 11.0F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 18).addBox(-6.0F, 11.0F, -3.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 17).addBox(-6.0F, -1.0F, -4.0F, 0.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(6.0F, -1.0F, -4.0F, 0.0F, 12.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 15).addBox(6.0F, 11.0F, -4.0F, 0.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(20, 19).addBox(6.0F, 11.0F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 49).addBox(-6.0F, -1.0F, 5.0F, 12.0F, 10.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(58, 48).addBox(-1.0F, 9.0F, 5.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(58, 47).addBox(-1.0F, 10.0F, 5.0F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(16, 21).addBox(-1.0F, 11.0F, 5.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 23).addBox(5.0F, 11.0F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 17).addBox(-6.0F, 9.0F, 5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(22, 23).addBox(-6.0F, 10.0F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 16).addBox(-6.0F, 11.0F, 5.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(-5.0F, -11.0F, -3.0F, 10.0F, 15.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(52, 29).addBox(-4.0F, -11.0F, 4.0F, 8.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(26, 0).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 28).addBox(4.0F, -4.0F, -3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(6.0F, -4.0F, -3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(28, 7).addBox(5.0F, -4.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(28, 6).addBox(5.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(26, 18).addBox(-7.0F, -4.0F, -3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(28, 4).addBox(-6.0F, -4.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(27, 26).addBox(-5.0F, -4.0F, -3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(28, 5).addBox(-6.0F, -2.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, -1.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(26, 0).addBox(-4.0F, -40.0F, -14.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(26, 1).addBox(1.0F, -40.0F, -14.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 48).addBox(-4.0F, -39.0F, -14.0F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(58, 15).addBox(-5.0F, -38.0F, -14.0F, 10.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(26, 2).addBox(-8.0F, -28.0F, -14.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(26, 5).addBox(7.0F, -28.0F, -14.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(26, 21).addBox(-8.0F, -34.0F, -14.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(28, 2).addBox(7.0F, -34.0F, -14.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(26, 60).addBox(-7.0F, -34.0F, -14.0F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(28, 60).addBox(6.0F, -34.0F, -14.0F, 1.0F, 9.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(22, 9).addBox(-6.0F, -36.0F, -14.0F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(55, 59).addBox(5.0F, -36.0F, -14.0F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(52, 16).addBox(-5.0F, -37.0F, -14.0F, 10.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 28.0F, 2.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(24, 49).addBox(-1.0F, -1.0F, -3.4F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(58, 38).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(18, 49).addBox(0.0F, 10.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(45, 59).addBox(0.9F, 12.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -3.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 48).addBox(-5.0F, -1.0F, -3.5F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(58, 6).addBox(-3.0F, 4.0F, -2.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(39, 18).addBox(-3.0F, 10.0F, -2.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(16, 59).addBox(-3.0F, 12.0F, -2.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.1F, 12.0F, -14.0F, 1.0F, 2.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(34, 37).addBox(-4.5F, 10.0F, -20.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -3.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}