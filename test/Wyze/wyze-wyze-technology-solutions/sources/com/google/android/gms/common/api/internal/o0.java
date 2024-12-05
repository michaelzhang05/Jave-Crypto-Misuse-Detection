package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o0 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final n0 f10645f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ zal f10646g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(zal zalVar, n0 n0Var) {
        this.f10646g = zalVar;
        this.f10645f = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10646g.f10741g) {
            ConnectionResult a = this.f10645f.a();
            if (a.J()) {
                zal zalVar = this.f10646g;
                zalVar.f10603f.startActivityForResult(GoogleApiActivity.b(zalVar.b(), a.D(), this.f10645f.b(), false), 1);
            } else if (this.f10646g.f10744j.m(a.w())) {
                zal zalVar2 = this.f10646g;
                zalVar2.f10744j.A(zalVar2.b(), this.f10646g.f10603f, a.w(), 2, this.f10646g);
            } else {
                if (a.w() == 18) {
                    Dialog u = GoogleApiAvailability.u(this.f10646g.b(), this.f10646g);
                    zal zalVar3 = this.f10646g;
                    zalVar3.f10744j.w(zalVar3.b().getApplicationContext(), new p0(this, u));
                    return;
                }
                this.f10646g.l(a, this.f10645f.b());
            }
        }
    }
}
