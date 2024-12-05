package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzv {
    private final AtomicInteger a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<zzr<?>> f15654b;

    /* renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<zzr<?>> f15655c;

    /* renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<zzr<?>> f15656d;

    /* renamed from: e, reason: collision with root package name */
    private final zzb f15657e;

    /* renamed from: f, reason: collision with root package name */
    private final zzm f15658f;

    /* renamed from: g, reason: collision with root package name */
    private final zzab f15659g;

    /* renamed from: h, reason: collision with root package name */
    private final zzn[] f15660h;

    /* renamed from: i, reason: collision with root package name */
    private zzd f15661i;

    /* renamed from: j, reason: collision with root package name */
    private final List<zzx> f15662j;

    /* renamed from: k, reason: collision with root package name */
    private final List<zzw> f15663k;

    private zzv(zzb zzbVar, zzm zzmVar, int i2, zzab zzabVar) {
        this.a = new AtomicInteger();
        this.f15654b = new HashSet();
        this.f15655c = new PriorityBlockingQueue<>();
        this.f15656d = new PriorityBlockingQueue<>();
        this.f15662j = new ArrayList();
        this.f15663k = new ArrayList();
        this.f15657e = zzbVar;
        this.f15658f = zzmVar;
        this.f15660h = new zzn[4];
        this.f15659g = zzabVar;
    }

    public final void a() {
        zzd zzdVar = this.f15661i;
        if (zzdVar != null) {
            zzdVar.b();
        }
        for (zzn zznVar : this.f15660h) {
            if (zznVar != null) {
                zznVar.b();
            }
        }
        zzd zzdVar2 = new zzd(this.f15655c, this.f15656d, this.f15657e, this.f15659g);
        this.f15661i = zzdVar2;
        zzdVar2.start();
        for (int i2 = 0; i2 < this.f15660h.length; i2++) {
            zzn zznVar2 = new zzn(this.f15656d, this.f15658f, this.f15657e, this.f15659g);
            this.f15660h[i2] = zznVar2;
            zznVar2.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(zzr<?> zzrVar, int i2) {
        synchronized (this.f15663k) {
            Iterator<zzw> it = this.f15663k.iterator();
            while (it.hasNext()) {
                it.next().a(zzrVar, i2);
            }
        }
    }

    public final <T> zzr<T> c(zzr<T> zzrVar) {
        zzrVar.r(this);
        synchronized (this.f15654b) {
            this.f15654b.add(zzrVar);
        }
        zzrVar.F(this.a.incrementAndGet());
        zzrVar.H("add-to-queue");
        b(zzrVar, 0);
        if (!zzrVar.O()) {
            this.f15656d.add(zzrVar);
            return zzrVar;
        }
        this.f15655c.add(zzrVar);
        return zzrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void d(zzr<T> zzrVar) {
        synchronized (this.f15654b) {
            this.f15654b.remove(zzrVar);
        }
        synchronized (this.f15662j) {
            Iterator<zzx> it = this.f15662j.iterator();
            while (it.hasNext()) {
                it.next().a(zzrVar);
            }
        }
        b(zzrVar, 5);
    }

    private zzv(zzb zzbVar, zzm zzmVar, int i2) {
        this(zzbVar, zzmVar, 4, new zzi(new Handler(Looper.getMainLooper())));
    }

    public zzv(zzb zzbVar, zzm zzmVar) {
        this(zzbVar, zzmVar, 4);
    }
}
