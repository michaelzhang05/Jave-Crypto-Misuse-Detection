package com.google.android.gms.internal.measurement;

import R.AbstractC1319p;
import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes3.dex */
final class O0 extends M0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bundle f15478e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Activity f15479f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ W0 f15480g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(W0 w02, Bundle bundle, Activity activity) {
        super(w02.f15593a, true);
        this.f15480g = w02;
        this.f15478e = bundle;
        this.f15479f = activity;
    }

    @Override // com.google.android.gms.internal.measurement.M0
    final void a() {
        Bundle bundle;
        InterfaceC2005h0 interfaceC2005h0;
        if (this.f15478e != null) {
            bundle = new Bundle();
            if (this.f15478e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f15478e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        interfaceC2005h0 = this.f15480g.f15593a.f15610i;
        ((InterfaceC2005h0) AbstractC1319p.l(interfaceC2005h0)).onActivityCreated(Z.b.m0(this.f15479f), bundle, this.f15391b);
    }
}
