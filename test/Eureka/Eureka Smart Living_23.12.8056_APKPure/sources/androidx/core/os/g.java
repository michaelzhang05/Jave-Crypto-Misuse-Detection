package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class g {

    /* loaded from: classes.dex */
    static class a {
        static LocaleList a(Configuration configuration) {
            LocaleList locales;
            locales = configuration.getLocales();
            return locales;
        }
    }

    public static i a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? i.i(a.a(configuration)) : i.a(configuration.locale);
    }
}
