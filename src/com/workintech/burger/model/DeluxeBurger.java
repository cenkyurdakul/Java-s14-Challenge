package com.workintech.burger.model;

import com.workintech.burger.enums.BreadRollType;

public class DeluxeBurger extends Hamburger{
    private Drink drink;
    private Cips cips;
    public DeluxeBurger(Drink drink, Cips cips) {
        super("DELUX_BURGER", 19.10, BreadRollType.DOUBLE_BURGER);
        setMeat("DOUBLE");
        this.cips = cips;
        this.drink = drink;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("Deluxe burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
        builder.append("Drink: " + drink.getType().name() + "\n");
        builder.append("Cips: " + cips.getType().name() + "\n");
        System.out.println(builder);
        super.itemizeHamburger();
    }
}
