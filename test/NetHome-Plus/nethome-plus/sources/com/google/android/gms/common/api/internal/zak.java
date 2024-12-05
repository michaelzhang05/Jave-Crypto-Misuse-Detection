package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zak {

    /* renamed from: d, reason: collision with root package name */
    private int f10739d;

    /* renamed from: b, reason: collision with root package name */
    private final c.e.a<zai<?>, String> f10737b = new c.e.a<>();

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource<Map<zai<?>, String>> f10738c = new TaskCompletionSource<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f10740e = false;
    private final c.e.a<zai<?>, ConnectionResult> a = new c.e.a<>();

    public zak(Iterable<? extends GoogleApi<?>> iterable) {
        Iterator<? extends GoogleApi<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.a.put(it.next().l(), null);
        }
        this.f10739d = this.a.keySet().size();
    }

    public final Task<Map<zai<?>, String>> a() {
        return this.f10738c.a();
    }

    public final void b(zai<?> zaiVar, ConnectionResult connectionResult, String str) {
        this.a.put(zaiVar, connectionResult);
        this.f10737b.put(zaiVar, str);
        this.f10739d--;
        if (!connectionResult.L()) {
            this.f10740e = true;
        }
        if (this.f10739d == 0) {
            if (this.f10740e) {
                this.f10738c.b(new AvailabilityException(this.a));
            } else {
                this.f10738c.c(this.f10737b);
            }
        }
    }

    public final Set<zai<?>> c() {
        return this.a.keySet();
    }
}
