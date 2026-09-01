package net.madelyn.nyagibits_bytes.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.madelyn.nyagibits_bytes.registry.helpers.IAbbreviatedItem;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiGraphics.class) //Yep. We're doing this, buckle up.
public abstract class GuiGraphicsMixin {

    @Shadow
    public abstract PoseStack pose();

    @Shadow
    public abstract int drawString(Font font, @Nullable String text, int x, int y, int color, boolean shadow);

    @Inject(method = "renderItemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V", at = @At("TAIL"))
    private void addAbbreviations(Font font, ItemStack stack, int x, int y, String text, CallbackInfo ci){
        if(stack.isEmpty()) return;
        if(stack.getItem() instanceof IAbbreviatedItem abbreviated && abbreviated.isAbbreviated()){
            if(abbreviated.getAbbreviation().isEmpty()) return; //Just as a failsafe even though doing this with an empty string is fine.
            pose().pushPose();
            pose().translate(0f,0f, 200f);
            pose().translate(x+2,y+1,0f);
            pose().scale(0.8F, 0.8F, 1F);
            drawString(font, abbreviated.getAbbreviation(), 0,0, 0x333333, false);
            drawString(font, abbreviated.getAbbreviation(), -1,0, 0xFFFFFF, false);
            pose().popPose();
        }
    }
}
