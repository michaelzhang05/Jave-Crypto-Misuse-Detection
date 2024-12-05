package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.b1;
import androidx.core.view.c3;
import androidx.core.view.w0;

/* loaded from: classes.dex */
public abstract class n {

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f5124a;

        a(View view) {
            this.f5124a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f5124a.getContext().getSystemService("input_method")).showSoftInput(this.f5124a, 1);
        }
    }

    /* loaded from: classes.dex */
    class b implements w0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f5125a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f5126b;

        b(d dVar, e eVar) {
            this.f5125a = dVar;
            this.f5126b = eVar;
        }

        @Override // androidx.core.view.w0
        public c3 a(View view, c3 c3Var) {
            return this.f5125a.a(view, c3Var, new e(this.f5126b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            b1.n0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        c3 a(View view, c3 c3Var, e eVar);
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public int f5127a;

        /* renamed from: b, reason: collision with root package name */
        public int f5128b;

        /* renamed from: c, reason: collision with root package name */
        public int f5129c;

        /* renamed from: d, reason: collision with root package name */
        public int f5130d;

        public e(int i6, int i7, int i8, int i9) {
            this.f5127a = i6;
            this.f5128b = i7;
            this.f5129c = i8;
            this.f5130d = i9;
        }

        public e(e eVar) {
            this.f5127a = eVar.f5127a;
            this.f5128b = eVar.f5128b;
            this.f5129c = eVar.f5129c;
            this.f5130d = eVar.f5130d;
        }
    }

    public static void a(View view, d dVar) {
        b1.D0(view, new b(dVar, new e(b1.J(view), view.getPaddingTop(), b1.I(view), view.getPaddingBottom())));
        g(view);
    }

    public static float b(Context context, int i6) {
        return TypedValue.applyDimension(1, i6, context.getResources().getDisplayMetrics());
    }

    public static Integer c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static float d(View view) {
        float f6 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f6 += b1.y((View) parent);
        }
        return f6;
    }

    public static boolean e(View view) {
        return b1.E(view) == 1;
    }

    public static PorterDuff.Mode f(int i6, PorterDuff.Mode mode) {
        if (i6 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i6 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i6 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i6) {
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

    public static void g(View view) {
        if (b1.T(view)) {
            b1.n0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void h(View view) {
        view.requestFocus();
        view.post(new a(view));
    }
}
