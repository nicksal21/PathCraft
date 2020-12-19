package com.savagezahar.pathcraft.util;

import com.savagezahar.pathcraft.Pathcraft;
import com.savagezahar.pathcraft.blocks.*;
import com.savagezahar.pathcraft.items.ItemBase;
import com.savagezahar.pathcraft.tools.RakeItem;
import net.minecraft.block.Block;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Pathcraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Pathcraft.MOD_ID);


    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> RAKE = ITEMS.register("rake", () -> new RakeItem(new Item.Properties().maxStackSize(1).group(Pathcraft.PATHCRAFT_ITEMS)));
    public static final RegistryObject<Item> MORTAR = ITEMS.register("mortar", ItemBase::new);

    // Stepping Stones
    public static final RegistryObject<Block> BIG_STEPPING_STONE = BLOCKS.register("big_stepping_stone", BigSteppingStone::new);
    public static final RegistryObject<Block> SMALL_STEPPING_STONE = BLOCKS.register("small_stepping_stone", SmallSteppingStone::new);

    // Paths
    public static final RegistryObject<Block> GRAVEL_PATH = BLOCKS.register("gravel_path", GravelPath::new);
    public static final RegistryObject<Block> RAKED_GRAVEL_PATH = BLOCKS.register("raked_gravel_path", RakedGravelPath::new);
    public static final RegistryObject<Block> SAND_PATH = BLOCKS.register("sand_path", SandPath::new);
    public static final RegistryObject<Block> RAKED_SAND_PATH = BLOCKS.register("raked_sand_path", RakedSandPath::new);
    public static final RegistryObject<Block> RED_SAND_PATH = BLOCKS.register("red_sand_path", RedSandPath::new);
    public static final RegistryObject<Block> RAKED_RED_SAND_PATH = BLOCKS.register("raked_red_sand_path", RakedRedSandPath::new);
    public static final RegistryObject<Block> SOUL_SAND_PATH = BLOCKS.register("soul_sand_path", SoulSandPath::new);
    public static final RegistryObject<Block> RAKED_SOUL_SAND_PATH = BLOCKS.register("raked_soul_sand_path", RakedSoulSandPath::new);
    public static final RegistryObject<Block> SMOOTH_STONE_PATH = BLOCKS.register("smooth_stone_path", SmoothStonePath::new);
    public static final RegistryObject<Block> BRICK_PATH = BLOCKS.register("brick_path", BrickPath::new);
    public static final RegistryObject<Block> END_STONE_PATH = BLOCKS.register("end_stone_path", EndStonePath::new);

    // Tile Paths
    public static final RegistryObject<Block> WHITE_TILE_PATH = BLOCKS.register("white_tile_path", WhiteTilePath::new);
    public static final RegistryObject<Block> ORANGE_TILE_PATH = BLOCKS.register("orange_tile_path", OrangeTilePath::new);
    public static final RegistryObject<Block> MAGENTA_TILE_PATH = BLOCKS.register("magenta_tile_path", MagentaTilePath::new);
    public static final RegistryObject<Block> LIGHT_BLUE_TILE_PATH = BLOCKS.register("light_blue_tile_path", LightBlueTilePath::new);
    public static final RegistryObject<Block> YELLOW_TILE_PATH = BLOCKS.register("yellow_tile_path", YellowTilePath::new);
    public static final RegistryObject<Block> LIME_TILE_PATH = BLOCKS.register("lime_tile_path", LimeTilePath::new);
    public static final RegistryObject<Block> PINK_TILE_PATH = BLOCKS.register("pink_tile_path", PinkTilePath::new);
    public static final RegistryObject<Block> GRAY_TILE_PATH = BLOCKS.register("gray_tile_path", GrayTilePath::new);
    public static final RegistryObject<Block> LIGHT_GRAY_TILE_PATH = BLOCKS.register("light_gray_tile_path", LightGrayTilePath::new);
    public static final RegistryObject<Block> CYAN_TILE_PATH = BLOCKS.register("cyan_tile_path", CyanTilePath::new);
    public static final RegistryObject<Block> PURPLE_TILE_PATH = BLOCKS.register("purple_tile_path", PurpleTilePath::new);
    public static final RegistryObject<Block> BLUE_TILE_PATH = BLOCKS.register("blue_tile_path", BlueTilePath::new);
    public static final RegistryObject<Block> BROWN_TILE_PATH = BLOCKS.register("brown_tile_path", BrownTilePath::new);
    public static final RegistryObject<Block> GREEN_TILE_PATH = BLOCKS.register("green_tile_path", GreenTilePath::new);
    public static final RegistryObject<Block> RED_TILE_PATH = BLOCKS.register("red_tile_path", RedTilePath::new);
    public static final RegistryObject<Block> BLACK_TILE_PATH = BLOCKS.register("black_tile_path", BlackTilePath::new);

    // Path Items
    public static final RegistryObject<Item> BIG_STEPPING_STONE_ITEM = ITEMS.register("big_stepping_stone", () -> new BlockItemBase(BIG_STEPPING_STONE.get()));
    public static final RegistryObject<Item> SMALL_STEPPING_STONE_ITEM = ITEMS.register("small_stepping_stone", () -> new BlockItemBase(SMALL_STEPPING_STONE.get()));
    public static final RegistryObject<Item> GRAVEL_PATH_ITEM = ITEMS.register("gravel_path", () -> new BlockItemBase(GRAVEL_PATH.get()));
    public static final RegistryObject<Item> RAKED_GRAVEL_PATH_ITEM = ITEMS.register("raked_gravel_path", () -> new BlockItemBase(RAKED_GRAVEL_PATH.get()));
    public static final RegistryObject<Item> SAND_PATH_ITEM = ITEMS.register("sand_path", () -> new BlockItemBase(SAND_PATH.get()));
    public static final RegistryObject<Item> RAKED_SAND_PATH_ITEM = ITEMS.register("raked_sand_path", () -> new BlockItemBase(RAKED_SAND_PATH.get()));
    public static final RegistryObject<Item> RED_SAND_PATH_ITEM = ITEMS.register("red_sand_path", () -> new BlockItemBase(RED_SAND_PATH.get()));
    public static final RegistryObject<Item> RAKED_RED_SAND_PATH_ITEM = ITEMS.register("raked_red_sand_path", () -> new BlockItemBase(RAKED_RED_SAND_PATH.get()));
    public static final RegistryObject<Item> SOUL_SAND_PATH_ITEM = ITEMS.register("soul_sand_path", () -> new BlockItemBase(SOUL_SAND_PATH.get()));
    public static final RegistryObject<Item> RAKED_SOUL_SAND_PATH_ITEM = ITEMS.register("raked_soul_sand_path", () -> new BlockItemBase(RAKED_SOUL_SAND_PATH.get()));
    public static final RegistryObject<Item> SMOOTH_STONE_PATH_ITEM = ITEMS.register("smooth_stone_path", () -> new BlockItemBase(SMOOTH_STONE_PATH.get()));
    public static final RegistryObject<Item> BRICK_PATH_ITEM = ITEMS.register("brick_path", () -> new BlockItemBase(BRICK_PATH.get()));
    public static final RegistryObject<Item> END_STONE_PATH_ITEM = ITEMS.register("end_stone_path", () -> new BlockItemBase(END_STONE_PATH.get()));

    // Tile Path Items
    public static final RegistryObject<Item> WHITE_TILE_PATH_ITEM = ITEMS.register("white_tile_path", () -> new BlockItemBase(WHITE_TILE_PATH.get()));
    public static final RegistryObject<Item> ORANGE_TILE_PATH_ITEM = ITEMS.register("orange_tile_path", () -> new BlockItemBase(ORANGE_TILE_PATH.get()));
    public static final RegistryObject<Item> MAGENTA_TILE_PATH_ITEM = ITEMS.register("magenta_tile_path", () -> new BlockItemBase(MAGENTA_TILE_PATH.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_TILE_PATH_ITEM = ITEMS.register("light_blue_tile_path", () -> new BlockItemBase(LIGHT_BLUE_TILE_PATH.get()));
    public static final RegistryObject<Item> YELLOW_TILE_PATH_ITEM = ITEMS.register("yellow_tile_path", () -> new BlockItemBase(YELLOW_TILE_PATH.get()));
    public static final RegistryObject<Item> LIME_TILE_PATH_ITEM = ITEMS.register("lime_tile_path", () -> new BlockItemBase(LIME_TILE_PATH.get()));
    public static final RegistryObject<Item> PINK_TILE_PATH_ITEM = ITEMS.register("pink_tile_path", () -> new BlockItemBase(PINK_TILE_PATH.get()));
    public static final RegistryObject<Item> GRAY_TILE_PATH_ITEM = ITEMS.register("gray_tile_path", () -> new BlockItemBase(GRAY_TILE_PATH.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_TILE_PATH_ITEM = ITEMS.register("light_gray_tile_path", () -> new BlockItemBase(LIGHT_GRAY_TILE_PATH.get()));
    public static final RegistryObject<Item> CYAN_TILE_PATH_ITEM = ITEMS.register("cyan_tile_path", () -> new BlockItemBase(CYAN_TILE_PATH.get()));
    public static final RegistryObject<Item> PURPLE_TILE_PATH_ITEM = ITEMS.register("purple_tile_path", () -> new BlockItemBase(PURPLE_TILE_PATH.get()));
    public static final RegistryObject<Item> BLUE_TILE_PATH_ITEM = ITEMS.register("blue_tile_path", () -> new BlockItemBase(BLUE_TILE_PATH.get()));
    public static final RegistryObject<Item> BROWN_TILE_PATH_ITEM = ITEMS.register("brown_tile_path", () -> new BlockItemBase(BROWN_TILE_PATH.get()));
    public static final RegistryObject<Item> GREEN_TILE_PATH_ITEM = ITEMS.register("green_tile_path", () -> new BlockItemBase(GREEN_TILE_PATH.get()));
    public static final RegistryObject<Item> RED_TILE_PATH_ITEM = ITEMS.register("red_tile_path", () -> new BlockItemBase(RED_TILE_PATH.get()));
    public static final RegistryObject<Item> BLACK_TILE_PATH_ITEM = ITEMS.register("black_tile_path", () -> new BlockItemBase(BLACK_TILE_PATH.get()));

}
