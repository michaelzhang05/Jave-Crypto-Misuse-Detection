package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zacp {
    public static final Status a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: b, reason: collision with root package name */
    private static final BasePendingResult<?>[] f10718b = new BasePendingResult[0];

    /* renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    final Set<BasePendingResult<?>> f10719c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d, reason: collision with root package name */
    private final l0 f10720d = new j0(this);

    /* renamed from: e, reason: collision with root package name */
    private final Map<Api.AnyClientKey<?>, Api.Client> f10721e;

    public zacp(Map<Api.AnyClientKey<?>, Api.Client> map) {
        this.f10721e = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f10719c.toArray(f10718b)) {
            com.google.android.gms.common.api.zac zacVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            basePendingResult.n(null);
            if (basePendingResult.g() == null) {
                if (basePendingResult.q()) {
                    this.f10719c.remove(basePendingResult);
                }
            } else {
                basePendingResult.f(null);
                IBinder serviceBrokerBinder = this.f10721e.get(((BaseImplementation.ApiMethodImpl) basePendingResult).u()).getServiceBrokerBinder();
                if (basePendingResult.j()) {
                    basePendingResult.n(new k0(basePendingResult, zacVar, serviceBrokerBinder, objArr3 == true ? 1 : 0));
                } else if (serviceBrokerBinder != null && serviceBrokerBinder.isBinderAlive()) {
                    k0 k0Var = new k0(basePendingResult, objArr2 == true ? 1 : 0, serviceBrokerBinder, objArr == true ? 1 : 0);
                    basePendingResult.n(k0Var);
                    try {
                        serviceBrokerBinder.linkToDeath(k0Var, 0);
                    } catch (RemoteException unused) {
                        basePendingResult.d();
                        basePendingResult.g().intValue();
                        throw null;
                    }
                } else {
                    basePendingResult.n(null);
                    basePendingResult.d();
                    basePendingResult.g().intValue();
                    throw null;
                }
                this.f10719c.remove(basePendingResult);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(BasePendingResult<? extends Result> basePendingResult) {
        this.f10719c.add(basePendingResult);
        basePendingResult.n(this.f10720d);
    }

    public final void c() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f10719c.toArray(f10718b)) {
            basePendingResult.p(a);
        }
    }
}
