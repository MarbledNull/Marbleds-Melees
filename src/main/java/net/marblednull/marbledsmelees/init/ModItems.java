package net.marblednull.marbledsmelees.init;

import net.marblednull.marbledsmelees.MarbledsMelees;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MarbledsMelees.MODID);

    public static final RegistryObject<Item> CROWBAR = ITEMS.register("crowbar", () -> new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().durability(500)));
    public static final RegistryObject<Item> FIRE_AXE = ITEMS.register("fire_axe", () -> new AxeItem(Tiers.IRON, 5, -3.1f, new Item.Properties().durability(500)));
    public static final RegistryObject<Item> MODERN_AXE = ITEMS.register("modern_axe", () -> new AxeItem(Tiers.IRON, 6, -3f, new Item.Properties().durability(750)));
    public static final RegistryObject<Item> TOMAHAWK = ITEMS.register("tomahawk", () -> new AxeItem(Tiers.IRON, 4, -2.6f, new Item.Properties().durability(250)));
    public static final RegistryObject<Item> PIPE_WRENCH = ITEMS.register("pipe_wrench", () -> new SwordItem(Tiers.IRON, 2, -2.3f, new Item.Properties().durability(500)));
    public static final RegistryObject<Item> SLEDGEHAMMER = ITEMS.register("sledgehammer", () -> new SwordItem(Tiers.IRON, 9, -3.4f, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> BONE_SAW = ITEMS.register("bone_saw", () -> new SwordItem(Tiers.IRON, 4, -2.4f, new Item.Properties().durability(250)));
    public static final RegistryObject<Item> POLICE_BATON = ITEMS.register("police_baton", () -> new SwordItem(Tiers.IRON, 2, -2.4f, new Item.Properties().durability(500)));
    public static final RegistryObject<Item> MACHETE = ITEMS.register("machete", () -> new SwordItem(Tiers.IRON, 5, -2.4f, new Item.Properties().durability(500)));
    public static final RegistryObject<Item> STOP_SIGN = ITEMS.register("stop_sign", () -> new SwordItem(Tiers.IRON, 7, -3.4f, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> KATANA = ITEMS.register("katana", () -> new SwordItem(Tiers.IRON, 5, -2.7f, new Item.Properties().durability(750)));
    public static final RegistryObject<Item> TANTO = ITEMS.register("tanto", () -> new SwordItem(Tiers.IRON, 3, -2.3f, new Item.Properties().durability(250)));
    public static final RegistryObject<Item> BASEBALL_BAT = ITEMS.register("baseball_bat", () -> new SwordItem(Tiers.IRON, 1, -2.4f, new Item.Properties().durability(500)));
    public static final RegistryObject<Item> BARBED_BASEBALL_BAT = ITEMS.register("barbed_baseball_bat", () -> new SwordItem(Tiers.IRON, 3, -2.4f, new Item.Properties().durability(500)));
    public static final RegistryObject<Item> STEEL_BASEBALL_BAT = ITEMS.register("steel_baseball_bat", () -> new SwordItem(Tiers.IRON, 5, -2.7f, new Item.Properties().durability(750)));
    public static final RegistryObject<Item> KITCHEN_KNIFE = ITEMS.register("kitchen_knife", () -> new SwordItem(Tiers.IRON, 2, -2.7f, new Item.Properties().durability(125)));
    public static final RegistryObject<Item> BUTCHER_KNIFE = ITEMS.register("butcher_knife", () -> new SwordItem(Tiers.IRON, 3, -2.7f, new Item.Properties().durability(125)));
    public static final RegistryObject<Item> COMBAT_KNIFE = ITEMS.register("combat_knife", () -> new SwordItem(Tiers.IRON, 2, -1.4f, new Item.Properties().durability(200)));
    public static final RegistryObject<Item> FRYING_PAN = ITEMS.register("frying_pan", () -> new SwordItem(Tiers.IRON, 2, -1.4f, new Item.Properties().durability(200)));
    public static final RegistryObject<Item> PENCIL = ITEMS.register("pencil", () -> new SwordItem(Tiers.IRON, 1, -1.4f, new Item.Properties().durability(200)));
    public static final RegistryObject<Item> COMICALLY_LARGE_SPOON = ITEMS.register("comically_large_spoon", () -> new SwordItem(Tiers.IRON, 8, -3.6f, new Item.Properties().durability(200)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
