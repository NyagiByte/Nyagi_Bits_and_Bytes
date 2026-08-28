package net.madelyn.nyagibits_bytes.misc.custom;

public class PureItem extends CustomTooltipItem {

    private final int tint;
    private final String element;

    public PureItem(Properties properties, int tint, String element) {
        super(properties);
        this.tint = tint;
        this.element = element;
    }
}
