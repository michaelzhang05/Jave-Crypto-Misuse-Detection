package com.google.android.gms.common.api.internal;

import N.C1331b;
import Q.AbstractC1400p;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final z f15902a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C f15903b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(C c8, z zVar) {
        this.f15903b = c8;
        this.f15902a = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f15903b.f15917b) {
            return;
        }
        C1331b b8 = this.f15902a.b();
        if (b8.y()) {
            C c8 = this.f15903b;
            c8.f15921a.startActivityForResult(GoogleApiActivity.a(c8.b(), (PendingIntent) AbstractC1400p.l(b8.v()), this.f15902a.a(), false), 1);
            return;
        }
        C c9 = this.f15903b;
        if (c9.f15920e.b(c9.b(), b8.p(), null) != null) {
            C c10 = this.f15903b;
            c10.f15920e.w(c10.b(), c10.f15921a, b8.p(), 2, this.f15903b);
            return;
        }
        if (b8.p() != 18) {
            this.f15903b.l(b8, this.f15902a.a());
            return;
        }
        C c11 = this.f15903b;
        Dialog r8 = c11.f15920e.r(c11.b(), c11);
        C c12 = this.f15903b;
        c12.f15920e.s(c12.b().getApplicationContext(), new A(this, r8));
    }
}
