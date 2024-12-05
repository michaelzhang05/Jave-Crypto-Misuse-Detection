package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
final class h {

    /* renamed from: n, reason: collision with root package name */
    static final int f5097n;

    /* renamed from: o, reason: collision with root package name */
    private static boolean f5098o;

    /* renamed from: p, reason: collision with root package name */
    private static Constructor f5099p;

    /* renamed from: q, reason: collision with root package name */
    private static Object f5100q;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f5101a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f5102b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5103c;

    /* renamed from: e, reason: collision with root package name */
    private int f5105e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5112l;

    /* renamed from: d, reason: collision with root package name */
    private int f5104d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f5106f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f5107g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    private float f5108h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f5109i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f5110j = f5097n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5111k = true;

    /* renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f5113m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        f5097n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private h(CharSequence charSequence, TextPaint textPaint, int i6) {
        this.f5101a = charSequence;
        this.f5102b = textPaint;
        this.f5103c = i6;
        this.f5105e = charSequence.length();
    }

    private void b() {
        if (f5098o) {
            return;
        }
        try {
            f5100q = this.f5112l && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f5099p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f5098o = true;
        } catch (Exception e6) {
            throw new a(e6);
        }
    }

    public static h c(CharSequence charSequence, TextPaint textPaint, int i6) {
        return new h(charSequence, textPaint, i6);
    }

    public StaticLayout a() {
        StaticLayout.Builder obtain;
        StaticLayout build;
        if (this.f5101a == null) {
            this.f5101a = "";
        }
        int max = Math.max(0, this.f5103c);
        CharSequence charSequence = this.f5101a;
        if (this.f5107g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f5102b, max, this.f5113m);
        }
        int min = Math.min(charSequence.length(), this.f5105e);
        this.f5105e = min;
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                return (StaticLayout) ((Constructor) androidx.core.util.h.f(f5099p)).newInstance(charSequence, Integer.valueOf(this.f5104d), Integer.valueOf(this.f5105e), this.f5102b, Integer.valueOf(max), this.f5106f, androidx.core.util.h.f(f5100q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f5111k), null, Integer.valueOf(max), Integer.valueOf(this.f5107g));
            } catch (Exception e6) {
                throw new a(e6);
            }
        }
        if (this.f5112l && this.f5107g == 1) {
            this.f5106f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        obtain = StaticLayout.Builder.obtain(charSequence, this.f5104d, min, this.f5102b, max);
        obtain.setAlignment(this.f5106f);
        obtain.setIncludePad(this.f5111k);
        obtain.setTextDirection(this.f5112l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f5113m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f5107g);
        float f6 = this.f5108h;
        if (f6 != 0.0f || this.f5109i != 1.0f) {
            obtain.setLineSpacing(f6, this.f5109i);
        }
        if (this.f5107g > 1) {
            obtain.setHyphenationFrequency(this.f5110j);
        }
        build = obtain.build();
        return build;
    }

    public h d(Layout.Alignment alignment) {
        this.f5106f = alignment;
        return this;
    }

    public h e(TextUtils.TruncateAt truncateAt) {
        this.f5113m = truncateAt;
        return this;
    }

    public h f(int i6) {
        this.f5110j = i6;
        return this;
    }

    public h g(boolean z5) {
        this.f5111k = z5;
        return this;
    }

    public h h(boolean z5) {
        this.f5112l = z5;
        return this;
    }

    public h i(float f6, float f7) {
        this.f5108h = f6;
        this.f5109i = f7;
        return this;
    }

    public h j(int i6) {
        this.f5107g = i6;
        return this;
    }

    public h k(i iVar) {
        return this;
    }
}
