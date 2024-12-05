package com.google.android.gms.common.api.internal;

import O.C1258b;
import R.AbstractC1319p;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final z f15101a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C f15102b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(C c8, z zVar) {
        this.f15102b = c8;
        this.f15101a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f15102b.f15116b) {
            return;
        }
        C1258b b8 = this.f15101a.b();
        if (b8.G()) {
            C c8 = this.f15102b;
            c8.f15120a.startActivityForResult(GoogleApiActivity.a(c8.b(), (PendingIntent) AbstractC1319p.l(b8.z()), this.f15101a.a(), false), 1);
            return;
        }
        C c9 = this.f15102b;
        if (c9.f15119e.b(c9.b(), b8.s(), null) != null) {
            C c10 = this.f15102b;
            c10.f15119e.w(c10.b(), c10.f15120a, b8.s(), 2, this.f15102b);
            return;
        }
        if (b8.s() != 18) {
            this.f15102b.l(b8, this.f15101a.a());
            return;
        }
        C c11 = this.f15102b;
        Dialog r8 = c11.f15119e.r(c11.b(), c11);
        C c12 = this.f15102b;
        c12.f15119e.s(c12.b().getApplicationContext(), new A(this, r8));
    }
}
