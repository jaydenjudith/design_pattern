package com.jayden.a1_creator.a3_builder.a1_example.builder.impl;

import com.jayden.a1_creator.a3_builder.a1_example.product.Bike;
import com.jayden.a1_creator.a3_builder.a1_example.builder.Builder;

public class HelloBuilder extends Builder {
    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
