package com.getcapacitor;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.getcapacitor.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j extends androidx.appcompat.app.c {
    protected h C;
    protected c0 E;
    protected boolean D = true;
    protected int F = 0;
    protected List G = new ArrayList();
    protected final h.a H = new h.a(this);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.j, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i6, int i7, Intent intent) {
        h hVar = this.C;
        if (hVar == null || hVar.X(i6, i7, intent)) {
            return;
        }
        super.onActivityResult(i6, i7, intent);
    }

    @Override // androidx.appcompat.app.c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h hVar = this.C;
        if (hVar == null) {
            return;
        }
        hVar.Y(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.j, androidx.activity.ComponentActivity, androidx.core.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.H.e(bundle);
        getApplication().setTheme(u0.c.f9374a);
        setTheme(u0.c.f9374a);
        setContentView(u0.b.f9373a);
        try {
            this.H.b(new z0(getAssets()).a());
        } catch (y0 e6) {
            l0.e("Error loading plugins.", e6);
        }
        q0();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.j, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.C.Z();
        l0.a("App destroyed");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C.a0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        h hVar = this.C;
        if (hVar == null || intent == null) {
            return;
        }
        hVar.b0(intent);
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    public void onPause() {
        super.onPause();
        this.C.c0();
        l0.a("App paused");
    }

    @Override // androidx.fragment.app.j, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        h hVar = this.C;
        if (hVar == null || hVar.d0(i6, strArr, iArr)) {
            return;
        }
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        this.C.e0();
        l0.a("App restarted");
    }

    @Override // androidx.fragment.app.j, android.app.Activity
    public void onResume() {
        super.onResume();
        this.C.l().b(true);
        this.C.f0();
        l0.a("App resumed");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.p, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.C.t0(bundle);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.j, android.app.Activity
    public void onStart() {
        super.onStart();
        this.F++;
        this.C.g0();
        l0.a("App started");
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.j, android.app.Activity
    public void onStop() {
        super.onStop();
        int max = Math.max(0, this.F - 1);
        this.F = max;
        if (max == 0) {
            this.C.l().b(false);
        }
        this.C.h0();
        l0.a("App stopped");
    }

    protected void q0() {
        l0.a("Starting BridgeActivity");
        h c6 = this.H.b(this.G).d(this.E).c();
        this.C = c6;
        this.D = c6.B0();
        onNewIntent(getIntent());
    }
}
