package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes3.dex */
public final class PorterDuffKt {
    public static final PorterDuffColorFilter toColorFilter(PorterDuff.Mode mode, int i8) {
        return new PorterDuffColorFilter(i8, mode);
    }

    public static final PorterDuffXfermode toXfermode(PorterDuff.Mode mode) {
        return new PorterDuffXfermode(mode);
    }
}
