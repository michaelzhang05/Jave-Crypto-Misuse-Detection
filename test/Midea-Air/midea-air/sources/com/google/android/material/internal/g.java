package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import okhttp3.HttpUrl;

/* compiled from: StaticLayoutBuilderCompat.java */
/* loaded from: classes2.dex */
final class g {
    private static boolean a;

    /* renamed from: b, reason: collision with root package name */
    private static Constructor<StaticLayout> f16683b;

    /* renamed from: c, reason: collision with root package name */
    private static Object f16684c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f16685d;

    /* renamed from: e, reason: collision with root package name */
    private final TextPaint f16686e;

    /* renamed from: f, reason: collision with root package name */
    private final int f16687f;

    /* renamed from: h, reason: collision with root package name */
    private int f16689h;
    private boolean l;

    /* renamed from: g, reason: collision with root package name */
    private int f16688g = 0;

    /* renamed from: i, reason: collision with root package name */
    private Layout.Alignment f16690i = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: j, reason: collision with root package name */
    private int f16691j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    private boolean f16692k = true;
    private TextUtils.TruncateAt m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StaticLayoutBuilderCompat.java */
    /* loaded from: classes2.dex */
    public static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private g(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f16685d = charSequence;
        this.f16686e = textPaint;
        this.f16687f = i2;
        this.f16689h = charSequence.length();
    }

    private void b() throws a {
        Class<?> cls;
        if (a) {
            return;
        }
        try {
            boolean z = this.l && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                f16684c = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = g.class.getClassLoader();
                String str = this.l ? "RTL" : "LTR";
                Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                f16684c = loadClass2.getField(str).get(loadClass2);
                cls = loadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            f16683b = declaredConstructor;
            declaredConstructor.setAccessible(true);
            a = true;
        } catch (Exception e2) {
            throw new a(e2);
        }
    }

    public static g c(CharSequence charSequence, TextPaint textPaint, int i2) {
        return new g(charSequence, textPaint, i2);
    }

    public StaticLayout a() throws a {
        if (this.f16685d == null) {
            this.f16685d = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int max = Math.max(0, this.f16687f);
        CharSequence charSequence = this.f16685d;
        if (this.f16691j == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f16686e, max, this.m);
        }
        int min = Math.min(charSequence.length(), this.f16689h);
        this.f16689h = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.l) {
                this.f16690i = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f16688g, min, this.f16686e, max);
            obtain.setAlignment(this.f16690i);
            obtain.setIncludePad(this.f16692k);
            obtain.setTextDirection(this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f16691j);
            return obtain.build();
        }
        b();
        try {
            return (StaticLayout) ((Constructor) c.h.j.j.c(f16683b)).newInstance(charSequence, Integer.valueOf(this.f16688g), Integer.valueOf(this.f16689h), this.f16686e, Integer.valueOf(max), this.f16690i, c.h.j.j.c(f16684c), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f16692k), null, Integer.valueOf(max), Integer.valueOf(this.f16691j));
        } catch (Exception e2) {
            throw new a(e2);
        }
    }

    public g d(Layout.Alignment alignment) {
        this.f16690i = alignment;
        return this;
    }

    public g e(TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    public g f(boolean z) {
        this.f16692k = z;
        return this;
    }

    public g g(boolean z) {
        this.l = z;
        return this;
    }

    public g h(int i2) {
        this.f16691j = i2;
        return this;
    }
}
