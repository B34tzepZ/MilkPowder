package net.b34tzepz.milkpowder.item;

import net.b34tzepz.milkpowder.MilkPowder;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MILK_POWDER = registerItem("milk_powder", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MilkPowder.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MilkPowder.LOGGER.info("Registering Mod Items for " + MilkPowder.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MILK_POWDER);
        });
    }
}
