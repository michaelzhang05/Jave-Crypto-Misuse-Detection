package e.e.b.b.x;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* compiled from: RippleUtils.java */
/* loaded from: classes2.dex */
public class b {
    public static final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f17552b;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f17553c;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f17554d;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f17555e;

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f17556f;

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f17557g;

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f17558h;

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f17559i;

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f17560j;

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f17561k;
    static final String l;

    static {
        a = Build.VERSION.SDK_INT >= 21;
        f17552b = new int[]{R.attr.state_pressed};
        f17553c = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f17554d = new int[]{R.attr.state_focused};
        f17555e = new int[]{R.attr.state_hovered};
        f17556f = new int[]{R.attr.state_selected, R.attr.state_pressed};
        f17557g = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        f17558h = new int[]{R.attr.state_selected, R.attr.state_focused};
        f17559i = new int[]{R.attr.state_selected, R.attr.state_hovered};
        f17560j = new int[]{R.attr.state_selected};
        f17561k = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        l = b.class.getSimpleName();
    }

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (a) {
            return new ColorStateList(new int[][]{f17560j, StateSet.NOTHING}, new int[]{c(colorStateList, f17556f), c(colorStateList, f17552b)});
        }
        int[] iArr = f17556f;
        int[] iArr2 = f17557g;
        int[] iArr3 = f17558h;
        int[] iArr4 = f17559i;
        int[] iArr5 = f17552b;
        int[] iArr6 = f17553c;
        int[] iArr7 = f17554d;
        int[] iArr8 = f17555e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f17560j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    private static int b(int i2) {
        return c.h.e.a.o(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f17561k, 0)) != 0) {
                Log.w(l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
