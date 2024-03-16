// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDevorador<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "devorador"), "main");
	private final ModelPart todo;
	private final ModelPart manoizquierda;
	private final ModelPart manoderecha;
	private final ModelPart head;

	public ModelDevorador(ModelPart root) {
		this.todo = root.getChild("todo");
		this.manoizquierda = root.getChild("manoizquierda");
		this.manoderecha = root.getChild("manoderecha");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition todo = partdefinition.addOrReplaceChild("todo",
				CubeListBuilder.create().texOffs(65, 87)
						.addBox(-5.0F, 6.1547F, 16.254F, 10.0F, 9.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(68, 11)
						.addBox(-6.0F, -9.8501F, -8.6232F, 12.0F, 17.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 8.8501F, 11.6232F));

		PartDefinition todo_r1 = todo.addOrReplaceChild("todo_r1",
				CubeListBuilder.create().texOffs(0, 38).addBox(-5.0F, -6.0F, -11.5F, 10.0F, 12.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.6953F, 8.8691F, -0.4363F, 0.0F, 0.0F));

		PartDefinition manoizquierda = partdefinition.addOrReplaceChild("manoizquierda", CubeListBuilder.create()
				.texOffs(112, 11).addBox(-0.8353F, -3.5932F, -3.7356F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(36, 106).addBox(8.1647F, 8.4068F, -9.7356F, 4.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.8353F, 10.5932F, 9.7356F));

		PartDefinition manoizquierda_r1 = manoizquierda.addOrReplaceChild("manoizquierda_r1",
				CubeListBuilder.create().texOffs(85, 50).addBox(-8.0F, -3.0F, -2.5F, 16.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9248F, 4.0594F, -0.2356F, 0.0F, 0.0F, 0.6545F));

		PartDefinition mano = manoizquierda.addOrReplaceChild("mano",
				CubeListBuilder.create().texOffs(0, 106)
						.addBox(1.684F, -1.5F, -10.6206F, 8.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(26, 106)
						.addBox(3.684F, -1.5F, -17.6206F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.4807F, 11.9068F, -8.115F));

		PartDefinition mano_r1 = mano.addOrReplaceChild("mano_r1",
				CubeListBuilder.create().texOffs(98, 61).addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -13.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition mano_r2 = mano.addOrReplaceChild("mano_r2",
				CubeListBuilder.create().texOffs(56, 107).addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.7971F, 0.0F, -13.6521F, 0.0F, -0.4363F, 0.0F));

		PartDefinition manoderecha = partdefinition.addOrReplaceChild("manoderecha", CubeListBuilder.create()
				.texOffs(90, 110).addBox(-3.1647F, -2.5932F, -3.7356F, 4.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(96, 75).addBox(-12.1647F, 9.4068F, -9.7356F, 4.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.8353F, 9.5932F, 9.7356F));

		PartDefinition manoderecha_r1 = manoderecha.addOrReplaceChild("manoderecha_r1",
				CubeListBuilder.create().texOffs(43, 50).addBox(-8.0F, -3.0F, -2.5F, 16.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9248F, 5.0594F, -0.2356F, 0.0F, 0.0F, -0.6545F));

		PartDefinition mano2 = manoderecha.addOrReplaceChild("mano2",
				CubeListBuilder.create().texOffs(97, 97)
						.addBox(-4.3927F, -1.5F, -9.0223F, 8.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-0.3927F, -1.5F, -16.0223F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.772F, 12.9068F, -9.7134F));

		PartDefinition mano2_r1 = mano2.addOrReplaceChild("mano2_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2913F, 0.0F, -11.4017F, 0.0F, -0.3491F, 0.0F));

		PartDefinition mano2_r2 = mano2.addOrReplaceChild("mano2_r2",
				CubeListBuilder.create().texOffs(48, 87).addBox(-1.0F, -1.5F, -3.5F, 2.0F, 3.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5058F, 0.0F, -12.0538F, 0.0F, 0.4363F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(56, 63)
						.addBox(-8.0F, -18.0F, -14.0F, 16.0F, 14.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 73)
						.addBox(-8.0F, -18.0F, -4.0F, 16.0F, 25.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 38)
						.addBox(-15.0F, 5.0F, -14.0F, 30.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-15.0F, -4.0F, -14.0F, 30.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 6.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -9.0F, -10.0F, 14.0F, 18.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.6085F, 5.4446F, 0.3054F, 0.0F, 0.0F));

		PartDefinition lengua = head.addOrReplaceChild("lengua",
				CubeListBuilder.create().texOffs(23, 85)
						.addBox(-2.0F, -2.0F, -18.0F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(48, 11)
						.addBox(-3.0F, -3.0F, -20.0F, 6.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, -3.0F));

		PartDefinition boca2 = head.addOrReplaceChild("boca2",
				CubeListBuilder.create().texOffs(102, 11)
						.addBox(-8.6883F, 1.5F, -10.5638F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(59, 87)
						.addBox(-8.6883F, -2.5F, -10.5638F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-6.3117F, 1.5F, -3.4362F));

		PartDefinition boca2_r1 = boca2.addOrReplaceChild("boca2_r1",
				CubeListBuilder.create().texOffs(68, 107).addBox(-0.5F, -5.5F, -5.0F, 1.0F, 11.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.6234F, 0.0F, -2.8725F, 0.0F, 1.0908F, 0.0F));

		PartDefinition boca1 = head.addOrReplaceChild("boca1", CubeListBuilder.create().texOffs(40, 76)
				.addBox(7.6883F, -2.1667F, -10.5638F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 13)
				.addBox(7.6883F, 0.8333F, -10.5638F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.3117F, 1.1667F, -3.4362F));

		PartDefinition boca1_r1 = boca1.addOrReplaceChild("boca1_r1",
				CubeListBuilder.create().texOffs(0, 38).addBox(-0.427F, -5.5F, -9.4715F, 1.0F, 11.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6234F, 0.3333F, -0.8725F, 0.0F, -1.0908F, 0.0F));

		PartDefinition cejas = head.addOrReplaceChild("cejas", CubeListBuilder.create(),
				PartPose.offset(0.5F, -11.0F, -13.5F));

		PartDefinition cejas_r1 = cejas.addOrReplaceChild("cejas_r1",
				CubeListBuilder.create().texOffs(36, 73).addBox(-1.5F, -1.0F, -0.5F, 8.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cejas_r2 = cejas.addOrReplaceChild("cejas_r2",
				CubeListBuilder.create().texOffs(96, 92).addBox(-6.5F, -1.0F, -0.5F, 8.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.2618F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		todo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manoizquierda.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manoderecha.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.manoizquierda.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.manoderecha.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}