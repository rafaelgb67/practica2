package com.ejemplo.curso.practica2;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Class to create font objects with assets.
 */
public class TypeFactory {
    private String A_BOLD= "Amble-Bold.ttf";
    private String A_LIGHT="Amble-Light.ttf";
    private String A_REGULAR= "Amble-Regular.ttf";
    private String O_ITALIC= "OpenSans-Italic.ttf";
    private String O_REGULAR="OpenSans-Regular.ttf";
    private String P_REGULAR="Pacifico.ttf";

    Typeface ambleBold;
    Typeface ambleLight;
    Typeface ambleRegular;
    Typeface openSansItalic;
    Typeface openSansRegular;
    Typeface pacifico;

    public TypeFactory(Context context){
        ambleBold = Typeface.createFromAsset(context.getAssets(),A_BOLD);
        ambleLight = Typeface.createFromAsset(context.getAssets(),A_LIGHT);
        ambleRegular = Typeface.createFromAsset(context.getAssets(),A_REGULAR);
        openSansItalic = Typeface.createFromAsset(context.getAssets(),O_ITALIC);
        openSansRegular = Typeface.createFromAsset(context.getAssets(),O_REGULAR);
        pacifico = Typeface.createFromAsset(context.getAssets(),P_REGULAR);
    }
}
