package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.h;
import androidx.lifecycle.k0;

/* loaded from: classes.dex */
public class i extends Dialog implements androidx.lifecycle.m, s, i0.d {

    /* renamed from: a, reason: collision with root package name */
    private androidx.lifecycle.n f143a;

    /* renamed from: b, reason: collision with root package name */
    private final i0.c f144b;

    /* renamed from: c, reason: collision with root package name */
    private final OnBackPressedDispatcher f145c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, int i6) {
        super(context, i6);
        f5.h.e(context, "context");
        this.f144b = i0.c.f6960d.a(this);
        this.f145c = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.h
            @Override // java.lang.Runnable
            public final void run() {
                i.f(i.this);
            }
        });
    }

    private final androidx.lifecycle.n b() {
        androidx.lifecycle.n nVar = this.f143a;
        if (nVar != null) {
            return nVar;
        }
        androidx.lifecycle.n nVar2 = new androidx.lifecycle.n(this);
        this.f143a = nVar2;
        return nVar2;
    }

    private final void e() {
        Window window = getWindow();
        f5.h.b(window);
        View decorView = window.getDecorView();
        f5.h.d(decorView, "window!!.decorView");
        k0.a(decorView, this);
        Window window2 = getWindow();
        f5.h.b(window2);
        View decorView2 = window2.getDecorView();
        f5.h.d(decorView2, "window!!.decorView");
        v.a(decorView2, this);
        Window window3 = getWindow();
        f5.h.b(window3);
        View decorView3 = window3.getDecorView();
        f5.h.d(decorView3, "window!!.decorView");
        i0.e.a(decorView3, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(i iVar) {
        f5.h.e(iVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f5.h.e(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.s
    public final OnBackPressedDispatcher c() {
        return this.f145c;
    }

    @Override // i0.d
    public androidx.savedstate.a d() {
        return this.f144b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f145c.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f145c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            f5.h.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.f(onBackInvokedDispatcher);
        }
        this.f144b.d(bundle);
        b().h(h.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        f5.h.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f144b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().h(h.a.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        b().h(h.a.ON_DESTROY);
        this.f143a = null;
        super.onStop();
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.h r() {
        return b();
    }

    @Override // android.app.Dialog
    public void setContentView(int i6) {
        e();
        super.setContentView(i6);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        f5.h.e(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        f5.h.e(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
