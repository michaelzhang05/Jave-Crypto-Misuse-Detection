package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class n4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16705a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16706b = "_err";

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f16707c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o4 f16708d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n4(o4 o4Var, String str, String str2, Bundle bundle) {
        this.f16708d = o4Var;
        this.f16705a = str;
        this.f16707c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16708d.f16720a.k((C2270v) AbstractC1319p.l(this.f16708d.f16720a.h0().y0(this.f16705a, this.f16706b, this.f16707c, "auto", this.f16708d.f16720a.a().currentTimeMillis(), false, true)), this.f16705a);
    }
}
