package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2429r2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final I5 f17784a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17785b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17786c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2429r2(I5 i52) {
        AbstractC1400p.l(i52);
        this.f17784a = i52;
    }

    public final void b() {
        this.f17784a.A0();
        this.f17784a.e().k();
        if (this.f17785b) {
            return;
        }
        this.f17784a.w().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f17786c = this.f17784a.p0().B();
        this.f17784a.c().K().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f17786c));
        this.f17785b = true;
    }

    public final void c() {
        this.f17784a.A0();
        this.f17784a.e().k();
        this.f17784a.e().k();
        if (!this.f17785b) {
            return;
        }
        this.f17784a.c().K().a("Unregistering connectivity change receiver");
        this.f17785b = false;
        this.f17786c = false;
        try {
            this.f17784a.w().unregisterReceiver(this);
        } catch (IllegalArgumentException e8) {
            this.f17784a.c().G().b("Failed to unregister the network broadcast receiver", e8);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f17784a.A0();
        String action = intent.getAction();
        this.f17784a.c().K().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean B8 = this.f17784a.p0().B();
            if (this.f17786c != B8) {
                this.f17786c = B8;
                this.f17784a.e().D(new RunnableC2450u2(this, B8));
                return;
            }
            return;
        }
        this.f17784a.c().L().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
