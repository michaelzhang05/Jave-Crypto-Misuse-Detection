package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static Method f2240a;

    /* loaded from: classes.dex */
    static class a {
        static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: androidx.core.text.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0032b {
        static ULocale a(Object obj) {
            ULocale addLikelySubtags;
            addLikelySubtags = ULocale.addLikelySubtags(c.a(obj));
            return addLikelySubtags;
        }

        static ULocale b(Locale locale) {
            ULocale forLocale;
            forLocale = ULocale.forLocale(locale);
            return forLocale;
        }

        static String c(Object obj) {
            String script;
            script = c.a(obj).getScript();
            return script;
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f2240a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0032b.c(C0032b.a(C0032b.b(locale)));
        }
        try {
            return a.a((Locale) f2240a.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException e6) {
            Log.w("ICUCompat", e6);
            return a.a(locale);
        }
    }
}
