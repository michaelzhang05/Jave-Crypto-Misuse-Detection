package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a implements OnCompleteListener<Map<zai<?>, String>> {
    private SignInConnectionListener a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zax f10610b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(zax zaxVar, SignInConnectionListener signInConnectionListener) {
        this.f10610b = zaxVar;
        this.a = signInConnectionListener;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void a(Task<Map<zai<?>, String>> task) {
        Lock lock;
        Lock lock2;
        boolean z;
        boolean z2;
        Map map;
        Map map2;
        boolean l;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        ConnectionResult r;
        Condition condition;
        Map map7;
        Map map8;
        Map map9;
        lock = this.f10610b.f10755k;
        lock.lock();
        try {
            z = this.f10610b.s;
            if (!z) {
                this.a.a();
                return;
            }
            if (task.f()) {
                zax zaxVar = this.f10610b;
                map7 = zaxVar.f10751g;
                zaxVar.u = new c.e.a(map7.size());
                map8 = this.f10610b.f10751g;
                for (zaw zawVar : map8.values()) {
                    map9 = this.f10610b.u;
                    map9.put(zawVar.l(), ConnectionResult.f10493f);
                }
            } else if (task.c() instanceof AvailabilityException) {
                AvailabilityException availabilityException = (AvailabilityException) task.c();
                z2 = this.f10610b.q;
                if (!z2) {
                    this.f10610b.u = availabilityException.b();
                } else {
                    zax zaxVar2 = this.f10610b;
                    map = zaxVar2.f10751g;
                    zaxVar2.u = new c.e.a(map.size());
                    map2 = this.f10610b.f10751g;
                    for (zaw zawVar2 : map2.values()) {
                        Object l2 = zawVar2.l();
                        ConnectionResult a = availabilityException.a(zawVar2);
                        l = this.f10610b.l(zawVar2, a);
                        if (l) {
                            map3 = this.f10610b.u;
                            map3.put(l2, new ConnectionResult(16));
                        } else {
                            map4 = this.f10610b.u;
                            map4.put(l2, a);
                        }
                    }
                }
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", task.c());
                this.f10610b.u = Collections.emptyMap();
            }
            if (this.f10610b.isConnected()) {
                map5 = this.f10610b.t;
                map6 = this.f10610b.u;
                map5.putAll(map6);
                r = this.f10610b.r();
                if (r == null) {
                    this.f10610b.p();
                    this.f10610b.q();
                    condition = this.f10610b.n;
                    condition.signalAll();
                }
            }
            this.a.a();
        } finally {
            lock2 = this.f10610b.f10755k;
            lock2.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.a.a();
    }
}
