package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3255y;

@RequiresApi(17)
/* loaded from: classes3.dex */
public final class DisplayCompatHelperApi17 {
    public static final DisplayCompatHelperApi17 INSTANCE = new DisplayCompatHelperApi17();

    private DisplayCompatHelperApi17() {
    }

    public final void getRealSize(Display display, Point point) {
        AbstractC3255y.i(display, "display");
        AbstractC3255y.i(point, "point");
        display.getRealSize(point);
    }
}
