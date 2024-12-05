package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class H2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f16137a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16138b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H2(Y2 y22, Bundle bundle) {
        this.f16138b = y22;
        this.f16137a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y2 y22 = this.f16138b;
        Bundle bundle = this.f16137a;
        y22.h();
        y22.i();
        AbstractC1319p.l(bundle);
        String f8 = AbstractC1319p.f(bundle.getString("name"));
        if (!y22.f16777a.o()) {
            y22.f16777a.d().v().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            y22.f16777a.L().s(new C2173d(bundle.getString(MBridgeConstans.APP_ID), "", new u4(f8, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), y22.f16777a.N().y0(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
