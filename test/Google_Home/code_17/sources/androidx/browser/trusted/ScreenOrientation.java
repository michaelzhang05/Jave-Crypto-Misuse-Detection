package androidx.browser.trusted;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class ScreenOrientation {
    public static final int ANY = 5;
    public static final int DEFAULT = 0;
    public static final int LANDSCAPE = 6;
    public static final int LANDSCAPE_PRIMARY = 3;
    public static final int LANDSCAPE_SECONDARY = 4;
    public static final int NATURAL = 8;
    public static final int PORTRAIT = 7;
    public static final int PORTRAIT_PRIMARY = 1;
    public static final int PORTRAIT_SECONDARY = 2;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public @interface LockType {
    }

    private ScreenOrientation() {
    }
}
