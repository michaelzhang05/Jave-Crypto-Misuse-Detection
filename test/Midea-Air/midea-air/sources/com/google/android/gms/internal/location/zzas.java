package com.google.android.gms.internal.location;

import android.content.ContentProviderClient;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzas {
    private final zzbj<zzao> a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15889b;

    /* renamed from: c, reason: collision with root package name */
    private ContentProviderClient f15890c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15891d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Map<ListenerHolder.ListenerKey<LocationListener>, e> f15892e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Map<ListenerHolder.ListenerKey<Object>, d> f15893f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final Map<ListenerHolder.ListenerKey<LocationCallback>, a> f15894g = new HashMap();

    public zzas(Context context, zzbj<zzao> zzbjVar) {
        this.f15889b = context;
        this.a = zzbjVar;
    }

    public final void a() throws RemoteException {
        synchronized (this.f15892e) {
            for (e eVar : this.f15892e.values()) {
                if (eVar != null) {
                    this.a.b().P5(zzbf.z(eVar, null));
                }
            }
            this.f15892e.clear();
        }
        synchronized (this.f15894g) {
            for (a aVar : this.f15894g.values()) {
                if (aVar != null) {
                    this.a.b().P5(zzbf.w(aVar, null));
                }
            }
            this.f15894g.clear();
        }
        synchronized (this.f15893f) {
            for (d dVar : this.f15893f.values()) {
                if (dVar != null) {
                    this.a.b().x3(new zzo(2, null, dVar.asBinder(), null));
                }
            }
            this.f15893f.clear();
        }
    }

    public final void b(boolean z) throws RemoteException {
        this.a.a();
        this.a.b().d0(z);
        this.f15891d = z;
    }

    public final void c() throws RemoteException {
        if (this.f15891d) {
            b(false);
        }
    }
}
