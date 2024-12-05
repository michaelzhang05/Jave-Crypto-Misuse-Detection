package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class G2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f16119a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y2 f16120b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G2(Y2 y22, Bundle bundle) {
        this.f16120b = y22;
        this.f16119a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y2 y22 = this.f16120b;
        Bundle bundle = this.f16119a;
        y22.h();
        y22.i();
        AbstractC1319p.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString(TtmlNode.ATTR_TTS_ORIGIN);
        AbstractC1319p.f(string);
        AbstractC1319p.f(string2);
        AbstractC1319p.l(bundle.get("value"));
        if (!y22.f16777a.o()) {
            y22.f16777a.d().v().a("Conditional property not set since app measurement is disabled");
            return;
        }
        u4 u4Var = new u4(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C2270v y02 = y22.f16777a.N().y0(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            y22.f16777a.L().s(new C2173d(bundle.getString(MBridgeConstans.APP_ID), string2, u4Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), y22.f16777a.N().y0(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), y02, bundle.getLong("time_to_live"), y22.f16777a.N().y0(bundle.getString(MBridgeConstans.APP_ID), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
