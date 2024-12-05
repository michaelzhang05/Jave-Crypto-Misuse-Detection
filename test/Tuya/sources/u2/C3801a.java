package u2;

import androidx.core.os.LocaleListCompat;
import java.util.Locale;
import r2.InterfaceC3684d;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3801a {
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

    public final InterfaceC3684d b(boolean z8) {
        return InterfaceC3684d.f37570a.a(z8);
    }
}
