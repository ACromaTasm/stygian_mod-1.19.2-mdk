package net.acromatasm.stygian_mod.item;

import net.acromatasm.stygian_mod.stygian_mod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, stygian_mod.MOD_ID);

    public static final RegistryObject<Item> ANCIENT_BONE = ITEMS.register("ancient_bone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
