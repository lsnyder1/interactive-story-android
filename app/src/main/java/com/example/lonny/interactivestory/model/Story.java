package com.example.lonny.interactivestory.model;

import com.example.lonny.interactivestory.R;

/**
 * Created by lonny on 9/21/2017.
 */

public class Story {

    private Page[] pages;

    public Story(){
        pages= new Page[7];

        pages[0] = new Page();
        pages[0].setImageId(R.drawable.page0);
        pages[0].setTextId(R.string.page0);
        pages[0].setChoice1(new Choice());
        pages[0].setChoice2(new Choice());

    }
}
