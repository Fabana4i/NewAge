package net.Pillk.NewAge.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.Pillk.NewAge.NewAge.MOD_ID;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOLLE = CREATIVE_MODE_TABS.register("molle",
            () -> CreativeModeTab.builder().icon(() -> ItemStack.EMPTY)
                    .title(Component.translatable("creativetab.molle"))
                    .displayItems((pParamentes, pOutput) -> {

                        pOutput.accept(ModItems.SARMAT.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
