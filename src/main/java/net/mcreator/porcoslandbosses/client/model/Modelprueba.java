package net.mcreator.porcoslandbosses.client.model;

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
public class Modelprueba<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("porcoslandbosses", "modelprueba"), "main");
	public final ModelPart group;

	public Modelprueba(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(26, 37).addBox(-7.0F, -1.75F, 4.25F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 22).addBox(-9.5F, -0.75F, 4.25F, 2.5F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 12)
						.addBox(-12.5F, -5.75F, 4.25F, 8.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 34).addBox(-9.5F, -3.75F, 4.25F, 2.5F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(14, 36)
						.addBox(-9.5F, -1.75F, 4.25F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 39).addBox(-7.0F, -3.75F, 4.25F, 0.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(6, 39)
						.addBox(-9.5F, -3.75F, 4.25F, 0.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(12, 22).addBox(-4.5F, -6.75F, 5.25F, 0.0F, 2.5F, 6.0F, new CubeDeformation(0.0F)).texOffs(17, 32)
						.addBox(-4.5F, -4.25F, 5.25F, 0.0F, 3.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 19).addBox(-4.5F, -5.75F, 4.25F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 35)
						.addBox(-4.5F, -4.25F, 6.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35).addBox(-4.5F, -7.25F, 6.75F, 0.0F, 0.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-4.5F, -4.25F, 10.25F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 39).addBox(-4.5F, -3.75F, 4.75F, 0.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(2, 41)
						.addBox(-4.5F, -1.25F, 6.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 41).addBox(-4.5F, -4.25F, 9.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(40, 40)
						.addBox(-4.5F, -3.25F, 6.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(40, 39).addBox(-4.5F, -3.25F, 10.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(38, 40)
						.addBox(-4.5F, -4.25F, 7.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(36, 35).addBox(-7.0F, -3.75F, 4.25F, 2.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(33, 23)
						.addBox(-12.5F, -3.75F, 4.25F, 3.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(39, 32).addBox(-12.5F, -3.75F, 4.75F, 0.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-12.5F, -6.75F, 5.25F, 0.0F, 2.5F, 6.0F, new CubeDeformation(0.0F)).texOffs(13, 31).addBox(-12.5F, -4.25F, 5.25F, 0.0F, 3.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-12.5F, -5.75F, 4.25F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 35).addBox(-12.5F, -7.75F, 7.25F, 0.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(17, 32)
						.addBox(-12.5F, -4.25F, 6.75F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-12.5F, -4.25F, 10.25F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 40)
						.addBox(-12.5F, -3.25F, 6.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(34, 40).addBox(-12.5F, -4.25F, 9.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(32, 40)
						.addBox(-12.5F, -3.25F, 10.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(30, 40).addBox(-12.5F, -1.25F, 6.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(28, 40)
						.addBox(-12.5F, -4.25F, 7.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(23, 24).addBox(-12.5F, -5.75F, 4.25F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 34)
						.addBox(-7.0F, -1.75F, 4.75F, 2.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(27, 35).addBox(-7.0F, -3.75F, 4.75F, 2.5F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-10.5F, -6.75F, 5.25F, 4.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 33).addBox(-12.5F, -6.75F, 8.75F, 2.0F, 0.0F, 2.5F, new CubeDeformation(0.0F)).texOffs(17, 31)
						.addBox(-6.5F, -6.75F, 8.75F, 2.0F, 0.0F, 2.5F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-12.5F, -6.75F, 5.25F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(5, 33)
						.addBox(-6.5F, -6.75F, 5.25F, 2.0F, 0.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(-12.5F, -6.75F, 11.25F, 8.0F, 6.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 20)
						.addBox(-4.5F, -2.75F, 11.25F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 40).addBox(-13.5F, -2.75F, 11.25F, 1.0F, 1.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(35, 22)
						.addBox(-12.0F, -1.75F, 4.75F, 2.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(7, 35).addBox(-12.0F, -3.75F, 4.75F, 2.5F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-12.0F, -3.75F, 4.75F, 0.0F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-1.0F, -12.75F, 4.75F, 0.0F, 4.5F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 6)
						.addBox(-11.0F, -8.25F, 5.25F, 5.0F, 0.0F, 5.5F, new CubeDeformation(0.0F)).texOffs(8, 16).addBox(-4.0F, -8.25F, 4.75F, 3.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
						.addBox(-14.5F, -8.25F, 5.25F, 1.5F, 0.0F, 5.5F, new CubeDeformation(0.0F)).texOffs(0, 18).addBox(-13.0F, -8.25F, 5.25F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-6.0F, -8.25F, 4.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-13.0F, -8.25F, 8.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -8.25F, 8.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 5).addBox(-8.0F, -8.25F, 4.75F, 2.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(24, 25)
						.addBox(-8.0F, -12.75F, 4.75F, 7.0F, 4.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-8.0F, -12.75F, 4.75F, 0.0F, 0.5F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-8.0F, -12.25F, 4.75F, 0.0F, 4.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 6).addBox(-8.0F, -12.75F, 4.75F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-3.0F, -3.25F, 7.25F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 27).addBox(-3.0F, -0.25F, 5.25F, 0.0F, 0.5F, 4.5F, new CubeDeformation(0.0F)).texOffs(24, 37)
						.addBox(-3.0F, -2.75F, 10.25F, 0.0F, 1.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8).addBox(-3.0F, -3.75F, 7.75F, 0.0F, 0.5F, 2.5F, new CubeDeformation(0.0F)).texOffs(33, 34)
						.addBox(-3.0F, -0.75F, 5.25F, 0.0F, 0.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 39).addBox(-3.0F, -2.75F, 6.75F, 0.0F, 1.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(38, 38)
						.addBox(-3.0F, -4.25F, 8.25F, 0.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 40).addBox(-3.0F, -1.25F, 10.25F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(24, 40)
						.addBox(-3.0F, -3.25F, 10.25F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(29, 0).addBox(-5.0F, 0.25F, 5.25F, 2.0F, 0.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(12, 23)
						.addBox(-13.5F, -0.75F, 5.25F, 10.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(31, 34).addBox(-12.5F, -1.75F, 5.25F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 37)
						.addBox(-7.0F, -1.75F, 5.25F, 2.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 38).addBox(-5.0F, -0.25F, 5.25F, 2.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
						.addBox(-12.5F, -3.75F, 5.25F, 0.5F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 39).addBox(-13.5F, -0.25F, 5.25F, 1.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-5.0F, -0.25F, 5.25F, 0.0F, 0.5F, 4.5F, new CubeDeformation(0.0F)).texOffs(10, 26).addBox(-12.0F, -0.25F, 5.25F, 0.0F, 0.5F, 4.5F, new CubeDeformation(0.0F)).texOffs(29, 5)
						.addBox(-13.5F, 0.25F, 5.25F, 1.5F, 0.0F, 4.5F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.5F, -3.25F, 7.25F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-13.5F, -0.25F, 5.25F, 0.0F, 0.5F, 4.5F, new CubeDeformation(0.0F)).texOffs(0, 32).addBox(-13.5F, -2.75F, 10.25F, 0.0F, 1.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 35)
						.addBox(-13.5F, -4.25F, 8.25F, 0.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(-13.5F, -0.75F, 5.25F, 0.0F, 0.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 39)
						.addBox(-13.5F, -2.75F, 6.75F, 0.0F, 1.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(22, 40).addBox(-13.5F, -1.25F, 10.25F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(20, 40)
						.addBox(-13.5F, -3.75F, 9.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(18, 40).addBox(-13.5F, -3.25F, 10.25F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 40)
						.addBox(-13.5F, -3.75F, 7.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(32, 10).addBox(-4.5F, -0.75F, 5.25F, 1.5F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.0F, -0.25F, 5.25F, 7.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(37, 4).addBox(-5.0F, -0.25F, 9.75F, 2.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(37, 19)
						.addBox(-13.5F, -0.25F, 9.75F, 1.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(17, 22).addBox(-5.0F, -0.25F, 10.25F, 0.5F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 2)
						.addBox(-12.5F, -0.25F, 10.25F, 0.5F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 33).addBox(-13.5F, -0.75F, 5.25F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 14)
						.addBox(-12.5F, -6.75F, 5.25F, 8.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 30).addBox(-14.5F, -12.25F, 5.25F, 6.5F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 18)
						.addBox(-14.5F, -12.25F, 5.25F, 0.0F, 4.0F, 5.5F, new CubeDeformation(0.0F)).texOffs(14, 0).addBox(-14.5F, -12.25F, 5.25F, 6.5F, 0.0F, 5.5F, new CubeDeformation(0.0F)).texOffs(37, 18)
						.addBox(-4.5F, -1.25F, 6.75F, 1.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 38).addBox(-4.5F, -2.75F, 6.75F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(39, 23)
						.addBox(-13.5F, -1.25F, 6.75F, 1.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(22, 39).addBox(-13.5F, -2.75F, 6.75F, 1.0F, 1.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 17)
						.addBox(-4.5F, -2.75F, 6.75F, 1.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(39, 3).addBox(-13.5F, -2.75F, 6.75F, 1.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(12, 38)
						.addBox(-6.0F, -8.25F, 6.75F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 39).addBox(-4.5F, -8.25F, 6.75F, 0.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 2)
						.addBox(-6.5F, -7.25F, 6.75F, 0.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(33, 33).addBox(-6.5F, -7.25F, 6.75F, 0.0F, 0.5F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 18)
						.addBox(-6.5F, -7.25F, 6.75F, 0.5F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 32).addBox(-4.0F, -8.25F, 6.75F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 16)
						.addBox(-4.5F, -7.25F, 6.75F, 0.5F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-6.0F, -8.25F, 6.75F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 39)
						.addBox(-4.5F, -1.25F, 7.25F, 1.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 28).addBox(-13.5F, -1.25F, 7.25F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(39, 2)
						.addBox(-13.5F, -2.75F, 10.75F, 1.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(37, 16).addBox(-4.5F, -3.25F, 7.25F, 1.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(26, 39)
						.addBox(-4.5F, -3.25F, 7.25F, 1.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(39, 1).addBox(-13.5F, -3.25F, 7.25F, 1.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(28, 40)
						.addBox(-13.5F, -3.25F, 7.25F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 35).addBox(-10.5F, -7.75F, 7.25F, 0.0F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(8, 38)
						.addBox(-12.5F, -8.25F, 7.25F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 40).addBox(-11.0F, -7.75F, 7.25F, 0.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 1)
						.addBox(-13.0F, -8.25F, 7.25F, 0.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 2).addBox(-11.0F, -7.75F, 7.25F, 0.5F, 0.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(33, 35)
						.addBox(-11.0F, -8.25F, 7.25F, 0.0F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(29, 35).addBox(-13.0F, -8.25F, 7.25F, 0.0F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-13.0F, -7.75F, 7.25F, 0.5F, 0.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(37, 11).addBox(-4.5F, -2.75F, 10.75F, 1.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(39, 0)
						.addBox(-13.5F, -1.25F, 10.75F, 1.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(37, 10).addBox(-4.5F, -3.75F, 7.75F, 1.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(38, 38)
						.addBox(-4.5F, -3.75F, 7.75F, 1.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 33).addBox(-13.5F, -3.75F, 7.75F, 1.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(40, 27)
						.addBox(-13.5F, -3.75F, 7.75F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 9).addBox(-4.5F, -1.25F, 10.75F, 1.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(20, 38)
						.addBox(-12.5F, -0.75F, 10.25F, 0.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 39).addBox(-12.5F, -1.25F, 10.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(36, 37)
						.addBox(-4.5F, -0.75F, 10.25F, 0.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 39).addBox(-4.5F, -1.25F, 10.75F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(36, 36)
						.addBox(-4.5F, -4.25F, 8.25F, 1.5F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 32).addBox(-4.5F, -4.25F, 9.25F, 1.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(32, 38)
						.addBox(-4.5F, -4.25F, 8.25F, 1.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 20).addBox(-13.5F, -4.25F, 8.25F, 1.0F, 0.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(26, 40)
						.addBox(-13.5F, -4.25F, 8.25F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-14.5F, -12.25F, 10.75F, 13.5F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 15)
						.addBox(-8.0F, -12.75F, 10.75F, 7.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 38).addBox(-6.0F, -8.25F, 8.75F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 33)
						.addBox(-4.5F, -8.25F, 8.75F, 0.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(-6.5F, -7.25F, 8.75F, 0.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-12.5F, -8.25F, 8.75F, 1.5F, 1.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 40).addBox(-11.0F, -7.75F, 8.75F, 0.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 37)
						.addBox(-13.0F, -8.25F, 8.75F, 0.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(41, 36).addBox(-3.5F, -4.25F, 9.25F, 0.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 37)
						.addBox(-5.0F, -0.25F, 9.75F, 2.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 31).addBox(-13.5F, -0.25F, 9.75F, 1.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 8)
						.addBox(-4.5F, -3.75F, 9.75F, 1.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(39, 25).addBox(-3.5F, -3.75F, 9.25F, 0.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(30, 39)
						.addBox(-3.5F, -4.25F, 9.25F, 0.0F, 0.5F, 0.5F, new CubeDeformation(0.0F)).texOffs(40, 24).addBox(-4.5F, -4.25F, 9.75F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 40)
						.addBox(-13.5F, -4.25F, 9.75F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 30).addBox(-4.5F, -0.75F, 10.25F, 1.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 40)
						.addBox(-13.5F, -0.75F, 10.25F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 29).addBox(-4.5F, -3.75F, 10.25F, 1.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 28)
						.addBox(-13.5F, -3.75F, 9.75F, 1.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(18, 40).addBox(-13.5F, -3.75F, 10.25F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 7)
						.addBox(-4.5F, -0.75F, 10.25F, 1.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(28, 38).addBox(-4.5F, -1.25F, 10.75F, 1.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 27)
						.addBox(-13.5F, -0.75F, 10.25F, 1.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 40).addBox(-13.5F, -1.25F, 10.75F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 6)
						.addBox(-4.5F, -3.25F, 10.25F, 1.5F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(38, 26).addBox(-4.5F, -3.25F, 10.75F, 1.5F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(37, 25)
						.addBox(-13.5F, -3.25F, 10.25F, 1.0F, 0.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.5F, -3.25F, 10.75F, 1.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -10.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		group.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.group.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
