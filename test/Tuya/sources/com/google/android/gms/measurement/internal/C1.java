package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class C1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final r4 f16025a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16026b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16027c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1(r4 r4Var) {
        AbstractC1319p.l(r4Var);
        this.f16025a = r4Var;
    }

    public final void b() {
        this.f16025a.g();
        this.f16025a.f().h();
        if (this.f16026b) {
            return;
        }
        this.f16025a.c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f16027c = this.f16025a.X().m();
        this.f16025a.d().v().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f16027c));
        this.f16026b = true;
    }

    public final void c() {
        this.f16025a.g();
        this.f16025a.f().h();
        this.f16025a.f().h();
        if (this.f16026b) {
            this.f16025a.d().v().a("Unregistering connectivity change receiver");
            this.f16026b = false;
            this.f16027c = false;
            try {
                this.f16025a.c().unregisterReceiver(this);
            } catch (IllegalArgumentException e8) {
                this.f16025a.d().r().b("Failed to unregister the network broadcast receiver", e8);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f16025a.g();
        String action = intent.getAction();
        this.f16025a.d().v().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m8 = this.f16025a.X().m();
            if (this.f16027c != m8) {
                this.f16027c = m8;
                this.f16025a.f().z(new B1(this, m8));
                return;
            }
            return;
        }
        this.f16025a.d().w().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
