package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class N0 {

    /* renamed from: g, reason: collision with root package name */
    public static final a f28491g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f28492h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f28493a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28494b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28495c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28496d;

    /* renamed from: e, reason: collision with root package name */
    private final int f28497e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28498f;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(int i8) {
            if ((((Color.red(i8) * 0.299d) + (Color.green(i8) * 0.587d)) + (Color.blue(i8) * 0.114d)) / 255 <= 0.5d) {
                return true;
            }
            return false;
        }

        public final boolean b(int i8) {
            if (Color.alpha(i8) < 16) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public N0(Context context) {
        AbstractC3255y.i(context, "context");
        this.f28493a = context;
        this.f28494b = g(R.attr.colorAccent).data;
        this.f28495c = g(R.attr.colorControlNormal).data;
        this.f28496d = g(R.attr.textColorPrimary).data;
        this.f28497e = g(R.attr.textColorSecondary).data;
        this.f28498f = g(R.attr.colorPrimary).data;
    }

    private final TypedValue g(int i8) {
        TypedValue typedValue = new TypedValue();
        this.f28493a.getTheme().resolveAttribute(i8, typedValue, true);
        return typedValue;
    }

    public final int a() {
        return this.f28494b;
    }

    public final int b() {
        return this.f28495c;
    }

    public final int c() {
        return this.f28498f;
    }

    public final int d() {
        return this.f28496d;
    }

    public final int e() {
        return this.f28497e;
    }

    public final Drawable f(Resources.Theme theme, int i8, int i9) {
        AbstractC3255y.i(theme, "theme");
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i8, typedValue, true);
        int i10 = typedValue.data;
        Drawable drawable = ContextCompat.getDrawable(this.f28493a, i9);
        AbstractC3255y.f(drawable);
        Drawable wrap = DrawableCompat.wrap(drawable);
        AbstractC3255y.h(wrap, "wrap(...)");
        DrawableCompat.setTint(wrap.mutate(), i10);
        return wrap;
    }
}
