package moriyashiine.bewitchment.client.renderer.entity;

import moriyashiine.bewitchment.common.Bewitchment;
import moriyashiine.bewitchment.common.entity.projectile.SilverArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class SilverArrowEntityRenderer extends ProjectileEntityRenderer<SilverArrowEntity> {
	private static final Identifier TEXTURE = new Identifier(Bewitchment.MODID, "textures/entity/projectiles/silver_arrow.png");
	
	public SilverArrowEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
		super(entityRenderDispatcher);
	}
	
	@Override
	public Identifier getTexture(SilverArrowEntity silverArrowEntity) {
		return TEXTURE;
	}
}
