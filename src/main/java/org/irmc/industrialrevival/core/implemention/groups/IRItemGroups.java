package org.irmc.industrialrevival.core.implemention.groups;

import org.irmc.industrialrevival.api.items.groups.ItemGroup;
import org.irmc.industrialrevival.api.items.groups.NormalItemGroup;
import org.irmc.industrialrevival.core.utils.Keys;

public class IRItemGroups {
    public static final ItemGroup ORES = new NormalItemGroup(Keys.customKey("ores"), GroupIcons.GROUP_ORE);
    public static final ItemGroup MANUAL_MACHINES = new NormalItemGroup(Keys.customKey("manual_machines"), GroupIcons.GROUP_MANUAL_MACHINES);
    public static final ItemGroup MATERIALS = new NormalItemGroup(Keys.customKey("materials"), GroupIcons.GROUP_MATERIALS);
    public static final ItemGroup SMELTING = new NormalItemGroup(Keys.customKey("smelting"), GroupIcons.GROUP_SMELTING);
    public static final ItemGroup ELECTRIC_MACHINES = new NormalItemGroup(Keys.customKey("electric_machines"), GroupIcons.GROUP_ELECTRIC_MACHINES);
    public static final ItemGroup TOOLS = new NormalItemGroup(Keys.customKey("tools"), GroupIcons.GROUP_TOOLS);
    public static final ItemGroup ARMORS = new NormalItemGroup(Keys.customKey("armors"), GroupIcons.GROUP_ARMORS);
    public static final ItemGroup DEFENSE = new NormalItemGroup(Keys.customKey("defense"), GroupIcons.GROUP_DEFENSE);
    public static final ItemGroup FOOD = new NormalItemGroup(Keys.customKey("food"), GroupIcons.GROUP_FOOD);
    public static final ItemGroup MISC = new NormalItemGroup(Keys.customKey("misc"), GroupIcons.GROUP_MISC);

    public static void setup() {
        ORES.register();
        MANUAL_MACHINES.register();
        MATERIALS.register();
        SMELTING.register();
        ELECTRIC_MACHINES.register();
        TOOLS.register();
        ARMORS.register();
        DEFENSE.register();
        FOOD.register();
        MISC.register();
    }
}
