package x2;

import androidx.core.os.LocaleListCompat;
import java.util.Locale;
import u2.InterfaceC4057d;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4186a {
    public final Locale a() {
        LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
        if (adjustedDefault.isEmpty()) {
            adjustedDefault = null;
        }
        if (adjustedDefault == null) {
            return null;
        }
        return adjustedDefault.get(0);
    }

    public final InterfaceC4057d b(boolean z8) {
        return InterfaceC4057d.f39950a.a(z8);
    }
}
