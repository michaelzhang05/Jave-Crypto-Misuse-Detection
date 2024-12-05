package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context, long j6, boolean z5, boolean z6, boolean z7) {
        String d6 = d(j6);
        if (z5) {
            d6 = String.format(context.getString(m2.h.f7677q), d6);
        }
        return z6 ? String.format(context.getString(m2.h.f7676p), d6) : z7 ? String.format(context.getString(m2.h.f7673m), d6) : d6;
    }

    static String b(long j6) {
        return c(j6, Locale.getDefault());
    }

    static String c(long j6, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return w.f(locale).format(new Date(j6));
        }
        format = w.b(locale).format(new Date(j6));
        return format;
    }

    static String d(long j6) {
        return i(j6) ? b(j6) : g(j6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(Context context, int i6) {
        return w.i().get(1) == i6 ? String.format(context.getString(m2.h.f7674n), Integer.valueOf(i6)) : String.format(context.getString(m2.h.f7675o), Integer.valueOf(i6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String f(long j6) {
        return DateUtils.formatDateTime(null, j6, 8228);
    }

    static String g(long j6) {
        return h(j6, Locale.getDefault());
    }

    static String h(long j6, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return w.f(locale).format(new Date(j6));
        }
        format = w.m(locale).format(new Date(j6));
        return format;
    }

    private static boolean i(long j6) {
        Calendar i6 = w.i();
        Calendar k6 = w.k();
        k6.setTimeInMillis(j6);
        return i6.get(1) == k6.get(1);
    }
}
