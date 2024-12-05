package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.c0;
import androidx.core.view.p;
import androidx.core.view.u;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public class k {

    /* compiled from: ViewUtils.java */
    /* loaded from: classes2.dex */
    static class a implements p {
        final /* synthetic */ c a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f16700b;

        a(c cVar, d dVar) {
            this.a = cVar;
            this.f16700b = dVar;
        }

        @Override // androidx.core.view.p
        public c0 a(View view, c0 c0Var) {
            return this.a.a(view, c0Var, new d(this.f16700b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewUtils.java */
    /* loaded from: classes2.dex */
    public static class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            u.f0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes2.dex */
    public interface c {
        c0 a(View view, c0 c0Var, d dVar);
    }

    public static void a(View view, c cVar) {
        u.v0(view, new a(cVar, new d(u.D(view), view.getPaddingTop(), u.C(view), view.getPaddingBottom())));
        f(view);
    }

    public static float b(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f2 += u.t((View) parent);
        }
        return f2;
    }

    public static boolean d(View view) {
        return u.y(view) == 1;
    }

    public static PorterDuff.Mode e(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 != 9) {
            switch (i2) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_ATOP;
    }

    public static void f(View view) {
        if (u.N(view)) {
            u.f0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes2.dex */
    public static class d {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public int f16701b;

        /* renamed from: c, reason: collision with root package name */
        public int f16702c;

        /* renamed from: d, reason: collision with root package name */
        public int f16703d;

        public d(int i2, int i3, int i4, int i5) {
            this.a = i2;
            this.f16701b = i3;
            this.f16702c = i4;
            this.f16703d = i5;
        }

        public void a(View view) {
            u.w0(view, this.a, this.f16701b, this.f16702c, this.f16703d);
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.f16701b = dVar.f16701b;
            this.f16702c = dVar.f16702c;
            this.f16703d = dVar.f16703d;
        }
    }
}
