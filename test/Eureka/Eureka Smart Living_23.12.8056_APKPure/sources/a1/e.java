package a1;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class e {
    public static int a(String str) {
        if (str.charAt(0) != '#') {
            str = "#" + str;
        }
        if (str.length() != 7 && str.length() != 9) {
            throw new IllegalArgumentException("The encoded color space is invalid or unknown");
        }
        if (str.length() == 7) {
            return Color.parseColor(str);
        }
        return Color.parseColor("#" + str.substring(7) + str.substring(1, 7));
    }
}
