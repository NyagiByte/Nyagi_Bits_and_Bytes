package net.madelyn.nyagibits_bytes.item.custom;

import net.minecraft.world.item.Item;

public class PureItem extends CustomTooltipItem {

    private final int tint;
    private final String element;

    public PureItem(Properties properties, int tint, String element) {
        super(properties);
        this.tint = tint;
        this.element = element;
    }
}
