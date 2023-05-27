package custom_textview;

import android.content.Context;
import android.graphics.Typeface;

public class Utils {
    private static Typeface alexBurshRegularTypeface;
    private static Typeface kaushanScriptRegularTypeface;
    private static Typeface nobileRegularTypeface;

    public static Typeface getAlexBurshRegularTypeface(Context context) {
        if (alexBurshRegularTypeface == null) {
            alexBurshRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/AlexBrush-Regular.ttf");
        }
        return alexBurshRegularTypeface;
    }

    public static Typeface getKaushanScriptRegularTypeface(Context context) {
        if (kaushanScriptRegularTypeface == null) {
            kaushanScriptRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/KaushanScript-Regular.otf");
        }
        return kaushanScriptRegularTypeface;
    }

    public static Typeface getNobileRegularTypeface(Context context) {
        if (nobileRegularTypeface == null) {
            nobileRegularTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Nobile-Regular.ttf");
        }
        return nobileRegularTypeface;
    }
}
