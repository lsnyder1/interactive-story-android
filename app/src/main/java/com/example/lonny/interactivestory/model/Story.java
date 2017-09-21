package com.example.lonny.interactivestory.model;

import com.example.lonny.interactivestory.R;

/**
 * Created by lonny on 9/21/2017.
 */

public class Story {

    private Page[] pages;

    public Story(){
        pages= new Page[7];

        pages[0]=new Page (R.drawable.page0,
                R.string.page0,
                new Choice (R.string.page0_choice1,1),
                new Choice (R.string.page0_choice2,2 ));

    }

    public Page getPage(int pageNumber) {
        if (pageNumber >= pages.length){
            pageNumber=0;
        }
        return pages[pageNumber];
    }
}
