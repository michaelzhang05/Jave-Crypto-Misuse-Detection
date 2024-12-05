package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

@zzard
/* loaded from: classes2.dex */
public final class zzawu implements zzut {

    /* renamed from: b, reason: collision with root package name */
    private final zzaxb f13061b;

    /* renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    private final zzawr f13063d;
    private final Object a = new Object();

    /* renamed from: e, reason: collision with root package name */
    @VisibleForTesting
    private final HashSet<zzawj> f13064e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    @VisibleForTesting
    private final HashSet<Object> f13065f = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final zzawt f13062c = new zzawt();

    public zzawu(String str, zzaxb zzaxbVar) {
        this.f13063d = new zzawr(str, zzaxbVar);
        this.f13061b = zzaxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void a(boolean z) {
        long a = zzk.zzln().a();
        if (z) {
            if (a - this.f13061b.v() > ((Long) zzyt.e().c(zzacu.f1)).longValue()) {
                this.f13063d.f13053d = -1;
                return;
            } else {
                this.f13063d.f13053d = this.f13061b.r();
                return;
            }
        }
        this.f13061b.q(a);
        this.f13061b.D(this.f13063d.f13053d);
    }

    public final Bundle b(Context context, zzaws zzawsVar) {
        HashSet<zzawj> hashSet = new HashSet<>();
        synchronized (this.a) {
            hashSet.addAll(this.f13064e);
            this.f13064e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f13063d.c(context, this.f13062c.b()));
        Bundle bundle2 = new Bundle();
        Iterator<Object> it = this.f13065f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<zzawj> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzawsVar.a(hashSet);
            return bundle;
        }
        it.next();
        throw new NoSuchMethodError();
    }

    public final zzawj c(Clock clock, String str) {
        return new zzawj(clock, this, this.f13062c.a(), str);
    }

    public final void d(zzxz zzxzVar, long j2) {
        synchronized (this.a) {
            this.f13063d.a(zzxzVar, j2);
        }
    }

    public final void e(zzawj zzawjVar) {
        synchronized (this.a) {
            this.f13064e.add(zzawjVar);
        }
    }

    public final void f(HashSet<zzawj> hashSet) {
        synchronized (this.a) {
            this.f13064e.addAll(hashSet);
        }
    }

    public final void g() {
        synchronized (this.a) {
            this.f13063d.d();
        }
    }

    public final void h() {
        synchronized (this.a) {
            this.f13063d.e();
        }
    }
}
