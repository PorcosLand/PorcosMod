// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Igris<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "igris"), "main");
	private final ModelPart RightLeg;
	private final ModelPart Lefttleg;
	private final ModelPart Body;
	private final ModelPart rightArm;
	private final ModelPart leftArm;
	private final ModelPart Head;
	private final ModelPart Pluma;

	public Igris(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.Lefttleg = root.getChild("Lefttleg");
		this.Body = root.getChild("Body");
		this.rightArm = root.getChild("rightArm");
		this.leftArm = root.getChild("leftArm");
		this.Head = root.getChild("Head");
		this.Pluma = root.getChild("Pluma");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(122, 31).addBox(-1.0F, 19.0F, -3.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(156, 137).addBox(-1.0F, 17.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 145).addBox(-1.0F, 19.0F, -4.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 138).addBox(-1.0F, 33.0F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(150, 62).addBox(-1.0F, 34.0F, -6.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(136, 141).addBox(-1.0F, 35.0F, -8.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(107, 81).addBox(-2.0F, 34.0F, -5.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 80).addBox(-2.0F, 35.0F, -6.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 120).addBox(-0.3F, 17.0F, -3.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(83, 114).addBox(-1.7F, 17.0F, -3.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(120, 101).addBox(-2.3F, 19.0F, -1.2F, 4.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -12.0F, 4.0F));

		PartDefinition cube_r1 = RightLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(127, 8).addBox(-4.6F, -31.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(119, 10).addBox(-3.3F, -36.0F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(110, 101).addBox(-4.0F, -36.0F, -2.0F, 2.0F, 19.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 36.0F, -4.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r2 = RightLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(156, 56).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 30.0F, 9.2F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r3 = RightLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(169, 3).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 30.0F, 9.2F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r4 = RightLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(153, 44).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 30.0F, 9.2F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r5 = RightLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(156, 30).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 27.0F, 9.7F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r6 = RightLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(169, 0).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 27.0F, 9.7F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r7 = RightLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(152, 108).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 27.0F, 9.7F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r8 = RightLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(168, 79).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 18.0F, 10.5F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r9 = RightLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(150, 70).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 18.0F, 10.5F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r10 = RightLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(156, 125).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 18.0F, 10.5F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r11 = RightLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(78, 168).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 18.0F, -9.7F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r12 = RightLeg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(155, 131).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 18.0F, -9.7F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r13 = RightLeg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(140, 82).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 18.0F, -9.7F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r14 = RightLeg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(160, 168).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 21.0F, 10.2F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r15 = RightLeg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(152, 50).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 21.0F, 10.2F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r16 = RightLeg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(156, 128).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 21.0F, 10.2F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r17 = RightLeg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(154, 168).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 21.0F, -10.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r18 = RightLeg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(156, 27).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 21.0F, -10.0F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r19 = RightLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(151, 41).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 21.0F, -10.0F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r20 = RightLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 169).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 24.0F, 10.2F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r21 = RightLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(152, 73).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 24.0F, 10.2F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r22 = RightLeg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(156, 134).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 24.0F, 10.2F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r23 = RightLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(84, 156).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 24.0F, -10.0F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r24 = RightLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(169, 6).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 24.0F, -10.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r25 = RightLeg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(153, 88).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 24.0F, -10.0F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r26 = RightLeg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(156, 97).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 27.0F, -10.5F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r27 = RightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(169, 9).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 27.0F, -10.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r28 = RightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(153, 91).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 27.0F, -10.5F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r29 = RightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(156, 100).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 30.0F, -11.0F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r30 = RightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(169, 33).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 30.0F, -11.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r31 = RightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(153, 141).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 30.0F, -11.0F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r32 = RightLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 74).addBox(-5.3F, -4.0F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 165).addBox(-5.3F, -6.0F, 0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 166).addBox(-5.3F, -8.0F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 166).addBox(-5.3F, -10.0F, -1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 24).addBox(-5.3F, -12.0F, -2.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 12).addBox(-5.3F, -14.0F, -3.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 158).addBox(-5.3F, -16.0F, -4.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(29, 74).addBox(-1.6F, -4.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(165, 143).addBox(-1.6F, -6.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 82).addBox(-1.6F, -8.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 70).addBox(-1.6F, -10.0F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 64).addBox(-1.6F, -12.0F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 52).addBox(-1.6F, -14.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(39, 166).addBox(-1.6F, -16.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 36.0F, -4.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r33 = RightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(166, 122).addBox(-9.0F, -13.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(117, 166).addBox(-8.0F, -11.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 116).addBox(-7.0F, -9.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(113, 166).addBox(-6.0F, -7.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 110).addBox(-4.0F, -3.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 36.0F, -4.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition cube_r34 = RightLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(24, 158).addBox(-5.4F, -5.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 36.9F, -4.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition cube_r35 = RightLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(20, 158).addBox(0.5F, -8.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(132, 167).addBox(-1.5F, -12.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 92).addBox(-0.5F, -10.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 98).addBox(-2.5F, -14.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(166, 104).addBox(-3.5F, -16.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(140, 167).addBox(-4.5F, -18.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 36.9F, -4.0F, -3.0625F, -0.0368F, 2.5729F));

		PartDefinition cube_r36 = RightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(123, 8).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(125, 98).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 35.0F, -13.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r37 = RightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(154, 79).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 35.0F, 7.2F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r38 = RightLeg.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(122, 53).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 35.0F, 7.2F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r39 = RightLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(75, 93).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 35.0F, 7.2F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r40 = RightLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(156, 67).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 33.0F, 8.2F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r41 = RightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(6, 169).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 33.0F, 8.2F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r42 = RightLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(153, 47).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 33.0F, 8.2F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r43 = RightLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(169, 36).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 33.0F, -12.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r44 = RightLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(151, 153).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 33.0F, -12.0F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r45 = RightLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(156, 103).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 33.0F, -12.0F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r46 = RightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(156, 33).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 35.0F, -13.0F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r47 = RightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(110, 39).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 35.0F, -13.0F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition Lefttleg = partdefinition.addOrReplaceChild("Lefttleg", CubeListBuilder.create().texOffs(120, 119).addBox(-1.0F, 18.0F, -3.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(83, 109).addBox(-1.0F, 16.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 145).addBox(-1.0F, 18.0F, -4.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 130).addBox(-1.0F, 32.0F, -5.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(70, 128).addBox(-1.0F, 33.0F, -6.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(140, 63).addBox(-1.0F, 34.0F, -8.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(95, 81).addBox(-2.0F, 33.0F, -5.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 73).addBox(-2.0F, 34.0F, -6.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(54, 117).addBox(-0.3F, 16.0F, -3.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(112, 55).addBox(-1.7F, 16.0F, -3.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(120, 55).addBox(-2.0F, 18.0F, -1.2F, 4.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -11.0F, 4.0F));

		PartDefinition cube_r48 = Lefttleg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(107, 123).addBox(-4.6F, -31.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(62, 117).addBox(-3.3F, -36.0F, -1.0F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(73, 106).addBox(-4.0F, -36.0F, -2.0F, 2.0F, 19.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 35.0F, -4.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r49 = Lefttleg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(155, 122).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 29.0F, 9.2F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r50 = Lefttleg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(168, 76).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 29.0F, 9.2F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r51 = Lefttleg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(8, 138).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 29.0F, 9.2F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r52 = Lefttleg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(155, 9).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 26.0F, 9.7F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r53 = Lefttleg.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(72, 168).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 26.0F, 9.7F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r54 = Lefttleg.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(120, 74).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 26.0F, 9.7F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r55 = Lefttleg.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(168, 21).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 17.0F, 10.5F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r56 = Lefttleg.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(80, 106).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 17.0F, 10.5F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r57 = Lefttleg.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(156, 119).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 17.0F, 10.5F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r58 = Lefttleg.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(168, 18).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 17.0F, -9.7F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r59 = Lefttleg.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(155, 6).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 17.0F, -9.7F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r60 = Lefttleg.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(101, 101).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 17.0F, -9.7F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r61 = Lefttleg.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(167, 152).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 20.0F, 10.2F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r62 = Lefttleg.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(22, 96).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 20.0F, 10.2F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r63 = Lefttleg.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(156, 116).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 20.0F, 10.2F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r64 = Lefttleg.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(144, 167).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 20.0F, -10.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r65 = Lefttleg.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(155, 3).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 20.0F, -10.0F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r66 = Lefttleg.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(92, 13).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 20.0F, -10.0F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r67 = Lefttleg.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(167, 140).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 23.0F, 10.2F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r68 = Lefttleg.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(88, 29).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 23.0F, 10.2F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r69 = Lefttleg.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(156, 113).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 23.0F, 10.2F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r70 = Lefttleg.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(155, 0).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 23.0F, -10.0F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r71 = Lefttleg.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(167, 88).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 23.0F, -10.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r72 = Lefttleg.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(11, 86).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 23.0F, -10.0F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r73 = Lefttleg.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(154, 94).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 26.0F, -10.5F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r74 = Lefttleg.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(166, 30).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 26.0F, -10.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r75 = Lefttleg.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(82, 13).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 26.0F, -10.5F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r76 = Lefttleg.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(154, 76).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 29.0F, -11.0F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r77 = Lefttleg.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(165, 149).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 29.0F, -11.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r78 = Lefttleg.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(40, 81).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 29.0F, -11.0F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r79 = Lefttleg.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(0, 8).addBox(-5.3F, -4.0F, 1.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 165).addBox(-5.3F, -6.0F, 0.2F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(165, 58).addBox(-5.3F, -8.0F, -0.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(165, 34).addBox(-5.3F, -10.0F, -1.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(165, 6).addBox(-5.3F, -12.0F, -2.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(165, 0).addBox(-5.3F, -14.0F, -3.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(142, 0).addBox(-5.3F, -16.0F, -4.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 80).addBox(-1.6F, -4.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(108, 167).addBox(-1.6F, -6.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 167).addBox(-1.6F, -8.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 167).addBox(-1.6F, -10.0F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 167).addBox(-1.6F, -12.0F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 167).addBox(-1.6F, -14.0F, -4.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 167).addBox(-1.6F, -16.0F, -5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 35.0F, -4.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r80 = Lefttleg.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(124, 164).addBox(-9.0F, -13.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(164, 76).addBox(-8.0F, -11.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 164).addBox(-7.0F, -9.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 164).addBox(-6.0F, -7.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 164).addBox(-4.0F, -3.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 35.0F, -4.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition cube_r81 = Lefttleg.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(132, 0).addBox(-5.4F, -5.0F, -0.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 35.9F, -4.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition cube_r82 = Lefttleg.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(16, 109).addBox(0.5F, -8.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 164).addBox(-1.5F, -12.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 164).addBox(-0.5F, -10.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(27, 164).addBox(-2.5F, -14.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 164).addBox(-3.5F, -16.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(136, 167).addBox(-4.5F, -18.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 35.9F, -4.0F, -3.0625F, -0.0368F, 2.5729F));

		PartDefinition cube_r83 = Lefttleg.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(119, 89).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(101, 104).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 34.0F, -13.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r84 = Lefttleg.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(153, 144).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 34.0F, 7.2F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r85 = Lefttleg.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(44, 115).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 34.0F, 7.2F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r86 = Lefttleg.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(65, 93).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 34.0F, 7.2F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r87 = Lefttleg.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(154, 53).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 32.0F, 8.2F, 2.4856F, 0.6153F, 2.6732F));

		PartDefinition cube_r88 = Lefttleg.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(133, 144).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 32.0F, 8.2F, 2.618F, -0.0873F, 3.1416F));

		PartDefinition cube_r89 = Lefttleg.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(80, 45).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 32.0F, 8.2F, 2.4296F, -0.7038F, -2.6826F));

		PartDefinition cube_r90 = Lefttleg.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(144, 110).addBox(-4.0F, -19.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 32.0F, -12.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r91 = Lefttleg.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(78, 29).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 32.0F, -12.0F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition cube_r92 = Lefttleg.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(154, 24).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 32.0F, -12.0F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r93 = Lefttleg.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(152, 111).addBox(-3.0F, -19.0F, 0.1F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 34.0F, -13.0F, -0.7072F, -0.6925F, 0.4995F));

		PartDefinition cube_r94 = Lefttleg.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(103, 55).addBox(-5.4F, -19.0F, -4.2F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 34.0F, -13.0F, -0.6643F, 0.625F, -0.4296F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(42, 48).addBox(-9.0F, 5.0F, 0.0F, 19.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-8.0F, -11.0F, 0.0F, 17.0F, 16.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(84, 77).addBox(-9.7F, 1.0F, 7.0F, 20.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(51, 81).addBox(-9.7F, -2.0F, 7.0F, 20.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 77).addBox(-9.7F, -5.0F, 7.0F, 20.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(58, 25).addBox(-9.7F, -8.0F, 7.0F, 20.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 41).addBox(-9.7F, -11.0F, 7.0F, 20.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(99, 116).addBox(7.8F, -14.0F, 0.1F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(91, 116).addBox(7.8F, -14.0F, 6.5F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(38, 115).addBox(-9.2F, -14.0F, 6.5F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 115).addBox(-9.1F, -14.0F, 0.2F, 2.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-9.7F, -18.0F, 0.0F, 20.0F, 7.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(89, 85).addBox(-4.7F, -22.0F, 2.0F, 10.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 74).addBox(-5.7F, -21.0F, 2.0F, 12.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(34, 64).addBox(-6.7F, -20.0F, 1.0F, 14.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.3F, -25.0F, 0.0F));

		PartDefinition cube_r95 = Body.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(72, 0).addBox(-2.0F, -68.8F, -1.0F, 8.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 49.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r96 = Body.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(65, 64).addBox(-6.0F, -68.8F, -1.0F, 8.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 49.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r97 = Body.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(0, 150).addBox(9.2F, -50.0F, -18.6F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(78, 149).addBox(9.2F, -52.0F, -20.5F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(72, 149).addBox(9.2F, -55.0F, -22.5F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(149, 0).addBox(9.2F, -58.0F, -24.5F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(150, 95).addBox(9.2F, -47.0F, -16.7F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 150).addBox(-10.1F, -47.0F, -16.7F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(104, 148).addBox(-10.1F, -50.0F, -18.6F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(133, 148).addBox(-10.1F, -52.0F, -20.5F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(139, 148).addBox(-10.1F, -55.0F, -22.5F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(145, 148).addBox(-10.1F, -58.0F, -24.5F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 49.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r98 = Body.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(111, 147).addBox(-38.1F, -48.0F, -1.0F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 143).addBox(-35.6F, -47.0F, -1.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(144, 95).addBox(-33.0F, -45.0F, -1.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 49.8F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r99 = Body.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(20, 143).addBox(29.6F, -46.0F, -1.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 99).addBox(32.2F, -48.0F, -1.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(98, 148).addBox(34.8F, -49.0F, -1.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 49.8F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r100 = Body.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(102, 13).addBox(-33.0F, -45.0F, -1.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 53.8F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r101 = Body.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(14, 143).addBox(29.6F, -46.0F, -1.0F, 2.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 53.8F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r102 = Body.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(117, 147).addBox(34.8F, -49.0F, -1.0F, 2.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 45.8F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r103 = Body.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(54, 147).addBox(-38.1F, -48.0F, -1.0F, 2.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3F, 45.8F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r104 = Body.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(50, 45).addBox(-21.7F, -38.4F, -1.8F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 49.0F, -1.6F, 0.0F, 0.0436F, 0.3054F));

		PartDefinition cube_r105 = Body.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 60).addBox(0.7F, -31.9F, -2.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(11, 80).addBox(0.7F, -32.9F, -3.8F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(114, 81).addBox(0.7F, -33.9F, -4.8F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(92, 55).addBox(0.7F, -43.9F, -5.8F, 1.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 49.0F, 0.0F, 0.0F, 1.5708F, -0.0873F));

		PartDefinition cube_r106 = Body.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(0, 80).addBox(0.7F, -31.9F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(144, 35).addBox(0.7F, -32.9F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(123, 0).addBox(0.7F, -33.9F, -1.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(31, 96).addBox(0.7F, -43.9F, -2.0F, 1.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 49.0F, 0.0F, 0.0F, 1.5708F, 0.0873F));

		PartDefinition cube_r107 = Body.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(99, 20).addBox(13.5F, -43.0F, -1.0F, 1.0F, 10.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(123, 66).addBox(13.5F, -33.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(149, 56).addBox(13.5F, -32.0F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 36).addBox(13.5F, -31.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 49.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r108 = Body.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(0, 16).addBox(-8.9F, -29.7F, 31.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(145, 108).addBox(-8.9F, -30.7F, 30.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(26, 56).addBox(-8.9F, -31.7F, 29.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 80).addBox(-8.9F, -41.7F, 28.0F, 1.0F, 10.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(-9.5F, -29.7F, 21.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(146, 141).addBox(-9.5F, -30.7F, 20.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(65, 85).addBox(-9.5F, -31.7F, 19.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(11, 90).addBox(-9.2F, -41.7F, 18.0F, 1.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.1F, 46.3F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r109 = Body.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(90, 97).addBox(13.5F, -43.0F, -1.0F, 1.0F, 10.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(123, 43).addBox(13.5F, -33.0F, 0.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(147, 76).addBox(13.5F, -32.0F, 1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(13.5F, -31.0F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.1F, 46.3F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r110 = Body.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(101, 91).addBox(-9.0F, -44.0F, -1.7F, 10.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 49.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r111 = Body.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(99, 0).addBox(0.0F, -44.0F, -1.9F, 10.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 49.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r112 = Body.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 56).addBox(-29.0F, -29.2F, -0.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(0.0F, 49.0F, -1.6F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r113 = Body.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(58, 29).addBox(14.0F, -38.3F, -1.8F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 49.0F, -1.6F, 0.0F, -0.0436F, -0.3054F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(), PartPose.offset(11.0F, -38.0F, 5.0F));

		PartDefinition cube_r114 = rightArm.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(0, 109).addBox(26.0F, -34.0F, 2.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(74, 142).addBox(25.0F, -33.0F, 3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(132, 69).addBox(24.0F, -32.0F, 4.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(50, 38).addBox(23.0F, -35.0F, 7.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 22).addBox(22.0F, -35.0F, 5.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 19).addBox(23.0F, -35.0F, 3.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 8).addBox(28.0F, -33.0F, 3.0F, 32.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 62.0F, -5.0F, 0.0F, 0.0F, -1.2217F));

		PartDefinition cube_r115 = rightArm.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(161, 146).addBox(31.1F, 2.6F, 28.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(143, 161).addBox(34.1F, 2.6F, 28.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(139, 161).addBox(37.1F, 2.6F, 28.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(135, 161).addBox(40.1F, 2.6F, 28.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(131, 161).addBox(42.8F, 2.6F, 28.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(110, 161).addBox(45.8F, 2.6F, 28.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(106, 161).addBox(48.8F, 2.6F, 28.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 161).addBox(51.8F, 2.6F, 28.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(147, 161).addBox(35.1F, 2.6F, 32.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(162, 12).addBox(38.1F, 2.6F, 32.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(162, 70).addBox(41.1F, 2.6F, 32.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(72, 162).addBox(44.1F, 2.6F, 32.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(76, 162).addBox(46.8F, 2.6F, 32.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(80, 162).addBox(49.8F, 2.6F, 32.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(162, 106).addBox(52.8F, 2.6F, 32.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(158, 162).addBox(55.8F, 2.6F, 32.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 62.0F, -5.0F, 1.5708F, 0.0F, -1.2217F));

		PartDefinition cube_r116 = rightArm.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(84, 149).addBox(13.0F, -64.0F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(123, 147).addBox(11.0F, -61.7F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(135, 17).addBox(9.0F, -59.7F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(132, 42).addBox(7.0F, -57.5F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(115, 130).addBox(5.0F, -55.5F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(115, 123).addBox(3.0F, -53.0F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(123, 0).addBox(1.0F, -50.9F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 120).addBox(-1.0F, -48.6F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(123, 154).addBox(-1.0F, -48.6F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(94, 156).addBox(1.0F, -50.9F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(151, 156).addBox(3.0F, -53.0F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(155, 156).addBox(5.0F, -55.5F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(44, 157).addBox(7.0F, -57.5F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 157).addBox(9.0F, -59.7F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 157).addBox(11.0F, -61.7F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(64, 157).addBox(13.0F, -64.0F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 62.0F, -5.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.2F, -40.0F, 5.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r117 = leftArm.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(51, 106).addBox(26.0F, -34.0F, 2.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(68, 4).addBox(25.0F, -33.0F, 3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(103, 74).addBox(24.0F, -32.0F, 4.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 32).addBox(23.0F, -35.0F, 7.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 35).addBox(22.0F, -35.0F, 5.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 16).addBox(23.0F, -35.0F, 3.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(28.0F, -33.0F, 3.0F, 32.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 64.0F, -5.0F, 0.0F, 0.0F, -1.2217F));

		PartDefinition cube_r118 = leftArm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(28, 158).addBox(31.1F, 2.6F, 28.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 159).addBox(34.1F, 2.6F, 28.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 159).addBox(37.1F, 2.6F, 28.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(127, 159).addBox(40.1F, 2.6F, 28.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(159, 156).addBox(42.8F, 2.6F, 28.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 160).addBox(45.8F, 2.6F, 28.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 160).addBox(48.8F, 2.6F, 28.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 160).addBox(51.8F, 2.6F, 28.6F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(116, 160).addBox(35.1F, 2.6F, 32.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(120, 160).addBox(38.1F, 2.6F, 32.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(161, 35).addBox(41.1F, 2.6F, 32.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 161).addBox(44.1F, 2.6F, 32.8F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 161).addBox(46.8F, 2.6F, 32.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(161, 59).addBox(49.8F, 2.6F, 32.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(161, 81).addBox(52.8F, 2.6F, 32.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(98, 161).addBox(55.8F, 2.6F, 32.7F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 64.0F, -5.0F, 1.5708F, 0.0F, -1.2217F));

		PartDefinition cube_r119 = leftArm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(26, 56).addBox(13.0F, -64.0F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 56).addBox(11.0F, -61.7F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 64).addBox(9.0F, -59.7F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(69, 64).addBox(7.0F, -57.5F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 85).addBox(5.0F, -55.5F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 48).addBox(3.0F, -53.0F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(32, 96).addBox(1.0F, -50.9F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(68, 157).addBox(-1.0F, -48.6F, 6.8F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 158).addBox(-1.0F, -48.6F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 96).addBox(1.0F, -50.9F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(42, 96).addBox(3.0F, -53.0F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 96).addBox(5.0F, -55.5F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(96, 55).addBox(7.0F, -57.5F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 99).addBox(9.0F, -59.7F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(103, 57).addBox(11.0F, -61.7F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(107, 57).addBox(13.0F, -64.0F, 2.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 64.0F, -5.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 56).addBox(-4.5F, -10.0F, -5.7F, 9.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(94, 41).addBox(-6.0F, -12.0F, 3.0F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(51, 85).addBox(-6.0F, -11.0F, -6.0F, 2.0F, 11.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(75, 85).addBox(4.0F, -11.0F, -6.0F, 2.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -47.0F, 4.6F));

		PartDefinition cube_r120 = Head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(144, 51).addBox(35.3F, -66.6F, -0.4F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 71.0F, -6.0F, 0.0F, 0.0F, -0.5672F));

		PartDefinition cube_r121 = Head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(151, 82).addBox(12.3F, -70.0F, -0.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 71.0F, -6.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r122 = Head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(51, 85).addBox(-38.2F, -66.6F, -0.3F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 71.0F, -6.0F, 0.0F, 0.0F, 0.5672F));

		PartDefinition cube_r123 = Head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(151, 147).addBox(-15.2F, -70.0F, -0.3F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 71.0F, -6.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r124 = Head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(152, 13).addBox(-48.9F, -49.2F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 71.0F, -6.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r125 = Head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(88, 146).addBox(35.3F, -68.0F, -0.4F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.2F, 58.7F, -6.0F, 0.0F, 0.0F, -0.829F));

		PartDefinition cube_r126 = Head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(44, 147).addBox(-38.2F, -68.0F, -0.3F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.4F, 58.4F, -6.0F, 0.0F, 0.0F, 0.829F));

		PartDefinition cube_r127 = Head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(74, 85).addBox(-15.4F, -70.3F, -0.3F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.4F, 58.4F, -6.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r128 = Head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(151, 35).addBox(-48.9F, -49.2F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 61.0F, -6.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r129 = Head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(60, 151).addBox(12.3F, -70.0F, -0.4F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.2F, 58.7F, -6.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r130 = Head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(23, 73).addBox(80.0F, -6.0F, -0.2F, 3.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 71.0F, -6.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Pluma = partdefinition.addOrReplaceChild("Pluma", CubeListBuilder.create().texOffs(142, 132).addBox(-2.0F, -5.0F, -1.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 141).addBox(-2.0F, -5.0F, 0.2F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(126, 79).addBox(-3.8F, -5.0F, 0.2F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(125, 89).addBox(-1.2F, -5.0F, 0.2F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -60.0F, 8.0F));

		PartDefinition cube_r131 = Pluma.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(70, 133).addBox(-2.0F, -44.3F, -99.1F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 79.0F, -8.0F, -1.3963F, 0.0F, -0.1309F));

		PartDefinition cube_r132 = Pluma.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(132, 60).addBox(-2.0F, -82.3F, -67.1F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(130, 107).addBox(-2.0F, -82.3F, -66.8F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 79.0F, -8.0F, -0.8727F, 0.0F, -0.1309F));

		PartDefinition cube_r133 = Pluma.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(130, 98).addBox(-2.0F, -90.5F, -44.8F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(130, 51).addBox(-2.0F, -90.5F, -45.4F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 79.0F, -8.0F, -0.6109F, 0.0F, -0.1309F));

		PartDefinition cube_r134 = Pluma.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(130, 33).addBox(-2.0F, -89.0F, -33.5F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(128, 126).addBox(-2.0F, -89.0F, -34.4F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 79.0F, -8.0F, -0.48F, 0.0F, -0.1309F));

		PartDefinition cube_r135 = Pluma.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(128, 117).addBox(-2.0F, -89.0F, 8.2F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(128, 24).addBox(-2.0F, -89.0F, 7.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 79.0F, -8.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r136 = Pluma.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(139, 42).addBox(-2.0F, -44.3F, -99.1F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 79.0F, -8.0F, -1.3963F, 0.0F, 0.1309F));

		PartDefinition cube_r137 = Pluma.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(113, 138).addBox(-2.0F, -82.3F, -67.1F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(138, 72).addBox(-2.0F, -82.3F, -66.8F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 79.0F, -8.0F, -0.8727F, 0.0F, 0.1309F));

		PartDefinition cube_r138 = Pluma.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(46, 138).addBox(-2.0F, -90.5F, -44.8F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 137).addBox(-2.0F, -90.5F, -45.4F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 79.0F, -8.0F, -0.6109F, 0.0F, 0.1309F));

		PartDefinition cube_r139 = Pluma.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(32, 136).addBox(-2.0F, -89.0F, -33.5F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(128, 135).addBox(-2.0F, -89.0F, -34.4F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 79.0F, -8.0F, -0.48F, 0.0F, 0.1309F));

		PartDefinition cube_r140 = Pluma.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(135, 8).addBox(-2.0F, -89.0F, 8.2F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 134).addBox(-2.0F, -89.0F, 7.0F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, 79.0F, -8.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r141 = Pluma.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(142, 26).addBox(-2.0F, -44.3F, -99.1F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 84.0F, -8.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r142 = Pluma.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(139, 86).addBox(-2.0F, -82.3F, -66.8F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 142).addBox(-2.0F, -82.3F, -67.1F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 84.0F, -8.0F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r143 = Pluma.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(98, 139).addBox(-2.0F, -90.5F, -44.8F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(142, 114).addBox(-2.0F, -90.5F, -45.4F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 84.0F, -8.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r144 = Pluma.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(140, 17).addBox(-2.0F, -89.0F, -33.5F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(142, 123).addBox(-2.0F, -89.0F, -34.4F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 84.0F, -8.0F, -0.48F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Lefttleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Pluma.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}