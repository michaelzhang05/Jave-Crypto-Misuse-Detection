package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import l0.C3276k;

/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C3276k.a {

    /* renamed from: a, reason: collision with root package name */
    private C3276k f16927a;

    @Override // l0.C3276k.a
    public final void a(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f16927a == null) {
            this.f16927a = new C3276k(this);
        }
        this.f16927a.a(context, intent);
    }
}
