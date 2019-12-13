package com.ejemplo.curso.practica2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

public class CustomButton extends Button {

    private int typefaceType;
    private TypeFactory mFontFactory;

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context, attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context, attrs);
    }

    public CustomButton(Context context) {
        super(context);
    }

    private void applyCustomFont(Context context, AttributeSet attrs) {


        TypedArray array = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.FontAttr,
                0, 0);
        try {
            typefaceType = array.getInteger(R.styleable.FontAttr_font_name, 0);
        } finally {
            array.recycle();
        }
        if (!isInEditMode()) {
            setTypeface(getTypeFace(typefaceType));
        }

    }

    public Typeface getTypeFace(int type) {
        if (mFontFactory == null)
            mFontFactory = new TypeFactory(getContext());

        switch (type) {
            case Constants.A_BOLD:
                return mFontFactory.ambleBold;

            case Constants.A_LIGHT:
                return mFontFactory.ambleLight;

            case Constants.A_REGULAR:
                return mFontFactory.ambleRegular;

            case Constants.O_LIGHT:
                return mFontFactory.openSansItalic;

            case Constants.O_REGULAR:
                return mFontFactory.openSansRegular;

            case Constants.P_Regular:
                return mFontFactory.pacifico;

            default:
                return mFontFactory.ambleBold;
        }
    }

    public interface Constants {
        int A_BOLD = 1,
                A_LIGHT = 2,
                A_REGULAR = 3,
                O_LIGHT = 4,
                O_REGULAR=5,
                P_Regular=6;
    }

}