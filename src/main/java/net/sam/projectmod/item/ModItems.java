package net.sam.projectmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sam.projectmod.item.custom.NitroDrillItem;
import net.sam.projectmod.projectmod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, projectmod.MOD_ID);

    public static final RegistryObject<Item> NITRO_DRILL = ITEMS.register("nitro_drill",
            () -> new NitroDrillItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
