package awesome;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
//Date: 25-7-2013 19:42:01
//Template version 1.1
//Java generated by Techne
//Keep in mind that you still need to fill in some blanks
//- ZeuX
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelBunny extends ModelBase {
 ModelRenderer body;
 ModelRenderer head;
 ModelRenderer nose;
 ModelRenderer ear2;
 ModelRenderer ear1;
 ModelRenderer leg1;
 ModelRenderer leg2;
 ModelRenderer tail;
 ModelRenderer leg3;
 ModelRenderer leg4;

	public ModelBunny() {
		textureWidth = 64;
		textureHeight = 32;
		
		body = new ModelRenderer(this, 0, 0);
		body.addBox(-3F, 0F, -5F, 6, 6, 10);
		body.setRotationPoint(0F, 16F, 3F);
	      
		head = new ModelRenderer(this, 22, 0);
		head.addBox(-2.5F, -2.5F, -5F, 5, 5, 5);
		head.setRotationPoint(0F, 18.5F, -2F);
		
		nose = new ModelRenderer(this, 22, 0);
		nose.addBox(-0.5F, 1F, -5.5F, 1, 1, 1);
		nose.setRotationPoint(0F, 18F, -2F);

		ear2 = new ModelRenderer(this, 37, 0);
		ear2.addBox(-1F, 0F, 0F, 2, 1, 4);
		ear2.setRotationPoint(1.5F, 16F, -4F);
		setRotation(ear2, 0.5934119F, 0F, 0F);
		
		ear1 = new ModelRenderer(this, 49, 0);
		ear1.addBox(-1F, 0F, 0F, 2, 1, 4);
		ear1.setRotationPoint(-1.5F, 16F, -4F);
		setRotation(ear1, 0.5934119F, 0F, 0F);
		
		leg1 = new ModelRenderer(this, 37, 5);
		leg1.addBox(-1F, 0F, -5F, 2, 2, 5);
		leg1.setRotationPoint(-2F, 22F, 8F);

		leg2 = new ModelRenderer(this, 37, 12);
		leg2.addBox(-1F, 0F, -5F, 2, 2, 5);
		leg2.setRotationPoint(2F, 22F, 8F);
		
		tail = new ModelRenderer(this, 32, 12);
		tail.addBox(-1.5F, -1.5F, 0F, 3, 3, 2);
		tail.setRotationPoint(0F, 18F, 8F);
		
		leg3 = new ModelRenderer(this, 0, 0);
		leg3.addBox(-1F, 0F, 0F, 2, 4, 1);
		leg3.setRotationPoint(2F, 21F, -1F);
		setRotation(leg3, -1.012291F, 0F, 0F);
		
		leg4 = new ModelRenderer(this, 0, 5);
		leg4.addBox(-1F, 0F, 0F, 2, 4, 1);
		leg4.setRotationPoint(-2F, 21F, -1F);
		setRotation(leg4, 0F, 0F, 0F);
	  }
	  
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
		if(this.isChild) {
			float f6 = 2.0F;
			
			GL11.glPushMatrix();
			GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
            GL11.glTranslatef(0.0F, 9F * f5, 2.5F * f5);
			head.render(f5);
			nose.render(f5);
			ear1.render(f5);
			ear2.render(f5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glScalef(1.4F / f6, 1.4F / f6, 1.4F / f6);
			GL11.glTranslatef(0.0F, 12.5F * f5, -3.0F * f5);
			tail.render(f5);
			GL11.glPopMatrix();
			
			GL11.glPushMatrix();
			GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
			GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
			body.render(f5);
			leg1.render(f5);
			leg2.render(f5);
			leg3.render(f5);
			leg4.render(f5);
			GL11.glPopMatrix();
		}
		else {
			body.render(f5);
			head.render(f5);
			nose.render(f5);
			ear2.render(f5);
			ear1.render(f5);
			leg1.render(f5);
			leg2.render(f5);
			tail.render(f5);
			leg3.render(f5);
			leg4.render(f5);
		}
	}
	  
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	/*
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */ 
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.leg1.rotateAngleX = MathHelper.abs(MathHelper.sin(f * 0.4F) * f1);
		this.leg2.rotateAngleX = this.leg1.rotateAngleX;
		
		this.leg3.rotateAngleX = MathHelper.abs(-MathHelper.sin(f * 0.4F) * f1 + 5.25F);
		this.leg4.rotateAngleX = this.leg3.rotateAngleX;
	}
}
