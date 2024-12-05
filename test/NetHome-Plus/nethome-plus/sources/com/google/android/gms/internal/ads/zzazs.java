package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.zzk;

@zzard
/* loaded from: classes2.dex */
public final class zzazs {
    private final View a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f13132b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13133c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13134d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13135e;

    /* renamed from: f, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f13136f;

    /* renamed from: g, reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f13137g = null;

    public zzazs(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f13132b = activity;
        this.a = view;
        this.f13136f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver d(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        ViewTreeObserver d2;
        if (this.f13133c) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f13136f;
        if (onGlobalLayoutListener != null) {
            Activity activity = this.f13132b;
            if (activity != null && (d2 = d(activity)) != null) {
                d2.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            zzk.zzmd();
            zzbbz.a(this.a, this.f13136f);
        }
        this.f13133c = true;
    }

    private final void h() {
        ViewTreeObserver d2;
        Activity activity = this.f13132b;
        if (activity != null && this.f13133c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f13136f;
            if (onGlobalLayoutListener != null && (d2 = d(activity)) != null) {
                zzk.zzli().i(d2, onGlobalLayoutListener);
            }
            this.f13133c = false;
        }
    }

    public final void a() {
        this.f13134d = true;
        if (this.f13135e) {
            g();
        }
    }

    public final void b() {
        this.f13134d = false;
        h();
    }

    public final void c(Activity activity) {
        this.f13132b = activity;
    }

    public final void e() {
        this.f13135e = true;
        if (this.f13134d) {
            g();
        }
    }

    public final void f() {
        this.f13135e = false;
        h();
    }
}
