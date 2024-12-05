package com.capacitorjs.plugins.statusbar;

import a1.e;
import com.capacitorjs.plugins.statusbar.StatusBarPlugin;
import com.getcapacitor.a1;
import com.getcapacitor.j0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import java.util.Locale;
import t0.a;
import v0.b;

@b(name = "StatusBar")
/* loaded from: classes.dex */
public class StatusBarPlugin extends u0 {
    private a implementation;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$2(v0 v0Var) {
        this.implementation.d();
        v0Var.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setBackgroundColor$1(String str, v0 v0Var) {
        try {
            this.implementation.e(e.a(str.toUpperCase(Locale.ROOT)));
            v0Var.w();
        } catch (IllegalArgumentException unused) {
            v0Var.r("Invalid color provided. Must be a hex string (ex: #ff0000");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOverlaysWebView$4(Boolean bool, v0 v0Var) {
        this.implementation.f(bool);
        v0Var.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setStyle$0(String str, v0 v0Var) {
        this.implementation.g(str);
        v0Var.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$3(v0 v0Var) {
        this.implementation.h();
        v0Var.w();
    }

    @a1
    public void getInfo(v0 v0Var) {
        t0.b a6 = this.implementation.a();
        j0 j0Var = new j0();
        j0Var.put("visible", a6.d());
        j0Var.m("style", a6.b());
        j0Var.m("color", a6.a());
        j0Var.put("overlays", a6.c());
        v0Var.x(j0Var);
    }

    @a1
    public void hide(final v0 v0Var) {
        getBridge().i(new Runnable() { // from class: t0.d
            @Override // java.lang.Runnable
            public final void run() {
                StatusBarPlugin.this.lambda$hide$2(v0Var);
            }
        });
    }

    @Override // com.getcapacitor.u0
    public void load() {
        this.implementation = new a(getActivity());
    }

    @a1
    public void setBackgroundColor(final v0 v0Var) {
        final String n6 = v0Var.n("color");
        if (n6 == null) {
            v0Var.r("Color must be provided");
        } else {
            getBridge().i(new Runnable() { // from class: t0.c
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarPlugin.this.lambda$setBackgroundColor$1(n6, v0Var);
                }
            });
        }
    }

    @a1
    public void setOverlaysWebView(final v0 v0Var) {
        final Boolean f6 = v0Var.f("overlay", Boolean.TRUE);
        getBridge().i(new Runnable() { // from class: t0.f
            @Override // java.lang.Runnable
            public final void run() {
                StatusBarPlugin.this.lambda$setOverlaysWebView$4(f6, v0Var);
            }
        });
    }

    @a1
    public void setStyle(final v0 v0Var) {
        final String n6 = v0Var.n("style");
        if (n6 == null) {
            v0Var.r("Style must be provided");
        } else {
            getBridge().i(new Runnable() { // from class: t0.g
                @Override // java.lang.Runnable
                public final void run() {
                    StatusBarPlugin.this.lambda$setStyle$0(n6, v0Var);
                }
            });
        }
    }

    @a1
    public void show(final v0 v0Var) {
        getBridge().i(new Runnable() { // from class: t0.e
            @Override // java.lang.Runnable
            public final void run() {
                StatusBarPlugin.this.lambda$show$3(v0Var);
            }
        });
    }
}
