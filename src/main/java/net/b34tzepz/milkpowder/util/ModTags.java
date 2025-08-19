package net.b34tzepz.milkpowder.util;

import com.sun.jna.platform.unix.solaris.LibKstat;
import net.b34tzepz.milkpowder.MilkPowder;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> DRINKABLE_LIQUIDS = createTag("drinkable_liquids");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of("c", name));
        }
    }
}
