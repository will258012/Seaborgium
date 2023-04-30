package com.undefinedbhvr.seaborgium.forge.compat_plugins.iris;

import net.minecraftforge.fml.loading.FMLLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class SeaborgiumIrisCompatPlugin implements IMixinConfigPlugin {
    private static boolean iris_loaded = false;
    @Override
    public void onLoad(String mixinPackage) {
        iris_loaded = FMLLoader.getLoadingModList().getModFileById("oculus") != null;
        if(!iris_loaded) {
            System.err.println("[Seaborgium] Iris was not found, not running compat mixins.");
        }
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        return iris_loaded;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }
}