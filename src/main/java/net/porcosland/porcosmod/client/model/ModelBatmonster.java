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
public class ModelBatmonster<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("porcosmod", "model_batmonster"), "main");
	public final ModelPart pataderecha;
	public final ModelPart pataizquierda;
	public final ModelPart cola;
	public final ModelPart pecho;
	public final ModelPart head;
	public final ModelPart manoderecha;
	public final ModelPart manoizquierda;
	public final ModelPart bb_main;

	public ModelBatmonster(ModelPart root) {
		this.pataderecha = root.getChild("pataderecha");
		this.pataizquierda = root.getChild("pataizquierda");
		this.cola = root.getChild("cola");
		this.pecho = root.getChild("pecho");
		this.head = root.getChild("head");
		this.manoderecha = root.getChild("manoderecha");
		this.manoizquierda = root.getChild("manoizquierda");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition pataderecha = partdefinition.addOrReplaceChild("pataderecha", CubeListBuilder.create().texOffs(113, 177).addBox(-4.5F, -1.5768F, -4.204F, 9.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.5F, 2.5768F, 4.204F));
		PartDefinition pataderecha_r1 = pataderecha.addOrReplaceChild("pataderecha_r1", CubeListBuilder.create().texOffs(130, 64).addBox(-2.5F, -3.0F, -9.5F, 5.0F, 6.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.8403F, 6.5123F, 0.48F, 0.0F, 0.0F));
		PartDefinition pataderecha_r2 = pataderecha.addOrReplaceChild("pataderecha_r2", CubeListBuilder.create().texOffs(72, 102).addBox(-3.5F, -3.5F, -9.5F, 7.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.7729F, 5.3191F, -0.3054F, 0.0F, 0.0F));
		PartDefinition piederecho = pataderecha.addOrReplaceChild("piederecho", CubeListBuilder.create().texOffs(0, 150).addBox(-4.5F, -2.6695F, -13.1786F, 9.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0927F, 0.9745F));
		PartDefinition piederecho_r1 = piederecho.addOrReplaceChild("piederecho_r1",
				CubeListBuilder.create().texOffs(100, 137).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 173).addBox(-2.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(134, 64)
						.addBox(-4.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(100, 137).addBox(-6.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0424F, -14.7054F, 0.829F, 0.0F, 0.0F));
		PartDefinition pataizquierda = partdefinition.addOrReplaceChild("pataizquierda", CubeListBuilder.create().texOffs(107, 177).addBox(-4.5F, -1.5768F, -5.204F, 9.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.5F, 2.5768F, 5.204F));
		PartDefinition pataizquierda_r1 = pataizquierda.addOrReplaceChild("pataizquierda_r1", CubeListBuilder.create().texOffs(130, 89).addBox(-2.5F, -3.0F, -9.5F, 5.0F, 6.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.8403F, 5.5123F, 0.48F, 0.0F, 0.0F));
		PartDefinition pataizquierda_r2 = pataizquierda.addOrReplaceChild("pataizquierda_r2", CubeListBuilder.create().texOffs(104, 0).addBox(-3.5F, -3.5F, -9.5F, 7.0F, 7.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.7729F, 4.3191F, -0.3054F, 0.0F, 0.0F));
		PartDefinition pieizquierdo = pataizquierda.addOrReplaceChild("pieizquierdo", CubeListBuilder.create().texOffs(32, 155).addBox(-4.5F, -2.6695F, -12.1786F, 9.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.0927F, -1.0255F));
		PartDefinition pieizquierdo_r1 = pieizquierdo.addOrReplaceChild("pieizquierdo_r1",
				CubeListBuilder.create().texOffs(144, 26).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 173).addBox(1.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(144, 26)
						.addBox(3.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(144, 37).addBox(5.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0424F, -13.7054F, 0.829F, 0.0F, 0.0F));
		PartDefinition cola = partdefinition.addOrReplaceChild("cola", CubeListBuilder.create(), PartPose.offset(0.0F, -2.9669F, 15.2514F));
		PartDefinition cola_r1 = cola.addOrReplaceChild("cola_r1", CubeListBuilder.create().texOffs(26, 174).addBox(-2.0F, -2.0F, -7.0F, 4.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0637F, 6.3089F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cola2 = cola.addOrReplaceChild("cola2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.2001F, 12.6674F));
		PartDefinition cola2_r1 = cola2.addOrReplaceChild("cola2_r1", CubeListBuilder.create().texOffs(163, 78).addBox(-3.0F, -2.5F, -7.5F, 6.0F, 5.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 6.0F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cola3 = cola2.addOrReplaceChild("cola3", CubeListBuilder.create(), PartPose.offset(0.0F, -6.7317F, 12.8445F));
		PartDefinition cola3_r1 = cola3.addOrReplaceChild("cola3_r1", CubeListBuilder.create().texOffs(84, 0).addBox(-5.0F, -5.0F, -4.5F, 10.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cola3_r2 = cola3.addOrReplaceChild("cola3_r2", CubeListBuilder.create().texOffs(143, 128).addBox(-4.0F, -2.0F, -8.5F, 8.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition pecho = partdefinition.addOrReplaceChild("pecho", CubeListBuilder.create(), PartPose.offset(-0.5F, -8.1838F, 4.4119F));
		PartDefinition pecho_r1 = pecho.addOrReplaceChild(
				"pecho_r1", CubeListBuilder.create().texOffs(162, 174).addBox(-17.5F, -17.7195F, -6.0527F, 16.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(176, 127)
						.addBox(1.5F, -17.7195F, -6.0527F, 16.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-15.5F, -18.7195F, -3.0526F, 32.0F, 23.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.0F, -8.0F, 0.3491F, 0.0F, 0.0F));
		PartDefinition pecho_r2 = pecho.addOrReplaceChild("pecho_r2", CubeListBuilder.create().texOffs(87, 26).addBox(-9.5F, -1.6456F, -0.9346F, 20.0F, 21.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.0F, -8.0F, 0.0436F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(112, 116).addBox(-6.0F, -11.8459F, -5.064F, 12.0F, 17.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 91).addBox(-10.0F, -28.8459F, -7.064F, 20.0F, 18.0F, 16.0F, new CubeDeformation(0.0F))
						.texOffs(148, 114).addBox(-7.0F, -14.8459F, -15.064F, 14.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(56, 102).addBox(-6.0F, -10.8459F, -14.064F, 12.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(125, 102)
						.addBox(-3.0F, -17.8459F, -14.064F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(176, 122).addBox(-9.0F, -16.8459F, -11.064F, 18.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -47.1541F, -4.936F, 0.1309F, 0.0F, 0.0F));
		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 43).addBox(-13.0F, -16.5F, -7.5F, 26.0F, 33.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -16.942F, 6.806F, 0.3054F, 0.0F, 0.0F));
		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(137, 0).addBox(-9.0F, -6.0F, -3.5F, 18.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -20.6911F, -6.3767F, -0.4363F, 0.0F, 0.0F));
		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(116, 145).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.8842F, -18.8122F, -8.564F, 0.0F, 0.0F, 0.5672F));
		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(82, 64).addBox(-4.0F, -1.0F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8096F, -20.4989F, -9.564F, 0.0F, 0.0F, 0.5672F));
		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(108, 64).addBox(-4.0F, -1.0F, -2.5F, 8.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8096F, -20.4989F, -9.564F, 0.0F, 0.0F, -0.5672F));
		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(64, 153).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8842F, -18.8122F, -8.564F, 0.0F, 0.0F, -0.5672F));
		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -2.0F, -1.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.9082F, -20.9689F, -4.4992F, 0.0F, 0.2182F, 0.4363F));
		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(105, 102).addBox(-4.0F, -2.0F, -1.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.9082F, -20.9689F, -4.4992F, 0.0F, -0.2182F, -0.4363F));
		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(0, 125).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.7296F, -52.1592F, -13.4159F, -0.2883F, 0.1719F, -0.3053F));
		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(67, 43).addBox(-2.0F, -4.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.3703F, -44.531F, -13.664F, 0.2353F, 0.1719F, -0.3053F));
		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(0, 188).addBox(-3.0F, -9.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.3909F, -35.2616F, -7.8527F, 0.628F, 0.1719F, -0.3053F));
		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(51, 125).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.7296F, -52.1592F, -13.4159F, -0.2883F, -0.1719F, 0.3053F));
		PartDefinition head_r13 = head.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(67, 43).addBox(-2.0F, -4.5F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.3703F, -44.531F, -13.664F, 0.2353F, -0.1719F, 0.3053F));
		PartDefinition head_r14 = head.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(164, 191).addBox(-3.0F, -9.0F, -3.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.3909F, -35.2616F, -7.8527F, 0.628F, -0.1719F, 0.3053F));
		PartDefinition boca = head.addOrReplaceChild("boca", CubeListBuilder.create(), PartPose.offset(0.0F, -7.8279F, -2.4253F));
		PartDefinition boca_r1 = boca.addOrReplaceChild("boca_r1", CubeListBuilder.create().texOffs(144, 19).addBox(-5.0F, -1.5F, -7.5F, 10.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -4.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition manoderecha = partdefinition.addOrReplaceChild("manoderecha", CubeListBuilder.create(), PartPose.offset(-15.7959F, -38.0075F, -1.375F));
		PartDefinition manoderecha_r1 = manoderecha.addOrReplaceChild("manoderecha_r1", CubeListBuilder.create().texOffs(133, 185).addBox(-3.0F, -5.0F, -4.5F, 6.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5945F, 18.9647F, -0.125F, 0.0F, 0.0F, 0.2182F));
		PartDefinition manoderecha_r2 = manoderecha.addOrReplaceChild("manoderecha_r2", CubeListBuilder.create().texOffs(127, 149).addBox(-4.0F, -8.5F, -5.5F, 8.0F, 17.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.4561F, 8.8084F, -0.125F, 0.0F, 0.0F, 0.2182F));
		PartDefinition manoderecha_r3 = manoderecha.addOrReplaceChild("manoderecha_r3", CubeListBuilder.create().texOffs(50, 128).addBox(-6.0F, -6.0F, -6.5F, 12.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0211F, 1.4225F, -0.125F, 0.0F, 0.0F, -0.5236F));
		PartDefinition manode = manoderecha.addOrReplaceChild("manode",
				CubeListBuilder.create().texOffs(165, 149).addBox(-5.0F, -2.0F, -2.5F, 9.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(188, 29).addBox(-4.0F, 12.0F, -1.5F, 7.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 169)
						.addBox(-5.0F, 16.0F, -2.5F, 9.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(148, 114).addBox(-2.0F, 24.0F, -1.5F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(130, 71)
						.addBox(-2.0F, 24.0F, 2.5F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(87, 128).addBox(-2.0F, 24.0F, 6.5F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 174)
						.addBox(2.0F, 30.0F, 6.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 169).addBox(2.0F, 30.0F, 2.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(168, 101)
						.addBox(2.0F, 30.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 150).addBox(4.0F, 27.0F, 6.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(79, 157)
						.addBox(4.0F, 27.0F, 2.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(101, 128).addBox(4.0F, 27.0F, -1.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-9.2041F, 25.0075F, -3.125F));
		PartDefinition manode_r1 = manode.addOrReplaceChild("manode_r1", CubeListBuilder.create().texOffs(0, 43).addBox(-2.0F, -6.0F, -1.5F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.2247F, 24.7071F, -4.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition manoizquierda = partdefinition.addOrReplaceChild("manoizquierda", CubeListBuilder.create(), PartPose.offset(15.7959F, -37.0075F, -1.375F));
		PartDefinition manoizquierda_r1 = manoizquierda.addOrReplaceChild("manoizquierda_r1", CubeListBuilder.create().texOffs(179, 10).addBox(-3.0F, -5.0F, -4.5F, 6.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5945F, 17.9647F, -0.125F, 0.0F, 0.0F, -0.2182F));
		PartDefinition manoizquierda_r2 = manoizquierda.addOrReplaceChild("manoizquierda_r2", CubeListBuilder.create().texOffs(89, 145).addBox(-4.0F, -8.5F, -5.5F, 8.0F, 17.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4561F, 7.8084F, -0.125F, 0.0F, 0.0F, -0.2182F));
		PartDefinition manoizquierda_r3 = manoizquierda.addOrReplaceChild("manoizquierda_r3", CubeListBuilder.create().texOffs(0, 125).addBox(-6.0F, -6.0F, -6.5F, 12.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0211F, 0.4225F, -0.125F, 0.0F, 0.0F, 0.5236F));
		PartDefinition manoiz = manoizquierda.addOrReplaceChild("manoiz",
				CubeListBuilder.create().texOffs(159, 53).addBox(-4.5F, -1.0F, -5.5F, 9.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 168).addBox(-4.5F, 17.0F, -5.5F, 9.0F, 8.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(37, 125)
						.addBox(-2.5F, 25.0F, -4.5F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 106).addBox(-2.5F, 25.0F, -0.5F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(87, 128)
						.addBox(-2.5F, 25.0F, 3.5F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(162, 149).addBox(-4.5F, 31.0F, -4.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(127, 152)
						.addBox(-4.5F, 31.0F, -0.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(139, 102).addBox(-4.5F, 31.0F, 3.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(32, 150)
						.addBox(-6.5F, 28.0F, -4.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(101, 128).addBox(-6.5F, 28.0F, -0.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(113, 0)
						.addBox(-6.5F, 28.0F, 3.5F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(185, 107).addBox(-3.5F, 13.0F, -4.5F, 7.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.7041F, 23.0075F, -0.125F));
		PartDefinition manoiz_r1 = manoiz.addOrReplaceChild("manoiz_r1", CubeListBuilder.create().texOffs(0, 43).addBox(-2.0F, -6.0F, -1.5F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.7247F, 25.7071F, -7.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition todo_r1 = bb_main.addOrReplaceChild("todo_r1", CubeListBuilder.create().texOffs(63, 72).addBox(-12.0F, -5.5F, -9.5F, 24.0F, 11.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -26.683F, 5.0542F, 0.0436F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		pataderecha.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pataizquierda.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cola.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pecho.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manoderecha.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		manoizquierda.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.pataizquierda.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.manoizquierda.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.pataderecha.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.manoderecha.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
