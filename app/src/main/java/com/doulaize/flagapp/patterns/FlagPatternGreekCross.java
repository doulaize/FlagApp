package com.doulaize.flagapp.patterns;

import android.graphics.Canvas;

/**
 * Created by rdeleuze on 3/1/2017
 */
public class FlagPatternGreekCross implements PatternInterface {

    @Override
    public void onDraw(Canvas canvas){

    }

    @Override
    public patternTypeEnum getPatternType(){
        return patternTypeEnum.GREEK_CROSS;
    }
}