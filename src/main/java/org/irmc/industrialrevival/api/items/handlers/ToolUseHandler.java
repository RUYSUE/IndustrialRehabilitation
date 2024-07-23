package org.irmc.industrialrevival.api.items.handlers;

import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.irmc.industrialrevival.api.items.IndustrialRevivalItem;
import org.irmc.industrialrevival.api.items.ItemHandler;
import org.irmc.industrialrevival.api.objects.exceptions.IncompatibleItemHandlerException;

import java.util.List;

@FunctionalInterface
public interface ToolUseHandler extends ItemHandler {
    /**
     * Called when a tool is used on a block.
     *
     * @param e the {@link BlockBreakEvent} that was fired
     * @param tool the {@link ItemStack} that was used as a tool
     * @param drops the list of {@link ItemStack}s that will be dropped by the block
     */
    void onToolUse(BlockBreakEvent e, ItemStack tool, List<ItemStack> drops);

    @Override
    default IncompatibleItemHandlerException isCompatible(IndustrialRevivalItem item) {
        if (!item.getItem().getType().isItem()) {
            return new IncompatibleItemHandlerException("Only materials that are items can have a block use handler", item.getId());
        }

        return null;
    }
}
