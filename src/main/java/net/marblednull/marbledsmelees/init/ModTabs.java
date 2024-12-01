package net.marblednull.marbledsmelees.init;

import net.marblednull.marbledsmelees.MarbledsMelees;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarbledsMelees.MODID);

    public static final RegistryObject<CreativeModeTab> MARBLEDS_MELEES = TABS.register("marbleds_melees",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.marbleds_melees"))
                    .icon(() -> new ItemStack(ModItems.CROWBAR.get()))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.CROWBAR.get());
                        output.accept(ModItems.FIRE_AXE.get());
                        output.accept(ModItems.MODERN_AXE.get());
                        output.accept(ModItems.TOMAHAWK.get());
                        output.accept(ModItems.PIPE_WRENCH.get());
                        output.accept(ModItems.SLEDGEHAMMER.get());
                        output.accept(ModItems.BONE_SAW.get());
                        output.accept(ModItems.POLICE_BATON.get());
                        output.accept(ModItems.MACHETE.get());
                        output.accept(ModItems.STOP_SIGN.get());
                        output.accept(ModItems.KATANA.get());
                        output.accept(ModItems.TANTO.get());
                        output.accept(ModItems.BASEBALL_BAT.get());
                        output.accept(ModItems.BARBED_BASEBALL_BAT.get());
                        output.accept(ModItems.STEEL_BASEBALL_BAT.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
