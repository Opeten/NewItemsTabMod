package com.opeten.newitemstab;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class NewItemsTab implements ModInitializer {

    public static final String MOD_ID = "nit";

    boolean cool = true;

    public static final ItemGroup NEW_ITEMS = FabricItemGroupBuilder.create(
                    new Identifier(MOD_ID, "new_items"))
            .icon(() -> new ItemStack(Items.ECHO_SHARD))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Items.OAK_CHEST_BOAT));
                stacks.add(new ItemStack(Items.SPRUCE_CHEST_BOAT));
                stacks.add(new ItemStack(Items.BIRCH_CHEST_BOAT));
                stacks.add(new ItemStack(Items.JUNGLE_CHEST_BOAT));
                stacks.add(new ItemStack(Items.ACACIA_CHEST_BOAT));
                stacks.add(new ItemStack(Items.DARK_OAK_CHEST_BOAT));
                stacks.add(new ItemStack(Items.MANGROVE_CHEST_BOAT));
                stacks.add(new ItemStack(Items.MANGROVE_BOAT));
                stacks.add(new ItemStack(Items.DISC_FRAGMENT_5));
                stacks.add(new ItemStack(Items.MUSIC_DISC_5));
                stacks.add(new ItemStack(Items.ECHO_SHARD));
                stacks.add(new ItemStack(Items.ALLAY_SPAWN_EGG));
                stacks.add(new ItemStack(Items.FROG_SPAWN_EGG));
                stacks.add(new ItemStack(Items.TADPOLE_SPAWN_EGG));
                stacks.add(new ItemStack(Items.WARDEN_SPAWN_EGG));
                stacks.add(new ItemStack(Items.FROGSPAWN));
                stacks.add(new ItemStack(Items.TADPOLE_BUCKET));
                stacks.add(new ItemStack(Items.OCHRE_FROGLIGHT));
                stacks.add(new ItemStack(Items.PEARLESCENT_FROGLIGHT));
                stacks.add(new ItemStack(Items.VERDANT_FROGLIGHT));
                stacks.add(new ItemStack(Items.SCULK));
                stacks.add(new ItemStack(Items.SCULK_SENSOR));
                stacks.add(new ItemStack(Items.SCULK_SHRIEKER));
                stacks.add(new ItemStack(Items.SCULK_VEIN));
                stacks.add(new ItemStack(Items.SCULK_CATALYST));
                stacks.add(new ItemStack(Items.RECOVERY_COMPASS));
                stacks.add(new ItemStack(Items.GOAT_HORN));
                stacks.add(new ItemStack(Items.REINFORCED_DEEPSLATE));
                stacks.add(new ItemStack(Items.MANGROVE_BUTTON));
                stacks.add(new ItemStack(Items.MANGROVE_DOOR));
                stacks.add(new ItemStack(Items.MANGROVE_FENCE));
                stacks.add(new ItemStack(Items.MANGROVE_FENCE_GATE));
                stacks.add(new ItemStack(Items.MANGROVE_LEAVES));
                stacks.add(new ItemStack(Items.MANGROVE_LOG));
                stacks.add(new ItemStack(Items.MANGROVE_PLANKS));
                stacks.add(new ItemStack(Items.MANGROVE_PRESSURE_PLATE));
                stacks.add(new ItemStack(Items.MANGROVE_PROPAGULE));
                stacks.add(new ItemStack(Items.MANGROVE_ROOTS));
                stacks.add(new ItemStack(Items.MUDDY_MANGROVE_ROOTS));
                stacks.add(new ItemStack(Items.MANGROVE_SIGN));
                stacks.add(new ItemStack(Items.MANGROVE_SLAB));
                stacks.add(new ItemStack(Items.MANGROVE_STAIRS));
                stacks.add(new ItemStack(Items.MANGROVE_TRAPDOOR));
                stacks.add(new ItemStack(Items.MANGROVE_WOOD));
                stacks.add(new ItemStack(Items.STRIPPED_MANGROVE_LOG));
                stacks.add(new ItemStack(Items.STRIPPED_MANGROVE_WOOD));
                stacks.add(new ItemStack(Items.MUD));
                stacks.add(new ItemStack(Items.MUD_BRICK_SLAB));
                stacks.add(new ItemStack(Items.MUD_BRICK_STAIRS));
                stacks.add(new ItemStack(Items.MUD_BRICK_WALL));
                stacks.add(new ItemStack(Items.MUD_BRICKS));
                stacks.add(new ItemStack(Items.PACKED_MUD));
            })
            .build();

    @Override
    public void onInitialize() {

    }
}
