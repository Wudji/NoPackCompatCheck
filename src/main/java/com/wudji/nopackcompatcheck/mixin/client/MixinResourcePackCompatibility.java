package com.wudji.nopackcompatcheck.mixin.client;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.resource.ResourcePackCompatibility;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ResourcePackCompatibility.class)
public class MixinResourcePackCompatibility {
    @ModifyReturnValue(method = "isCompatible",at = @At("RETURN"))
    private boolean alwaysCompatible(boolean ori) {
        return true;
    }
}
