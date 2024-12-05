package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@zzard
/* loaded from: classes2.dex */
public final class zzawj {
    private final Clock a;

    /* renamed from: b, reason: collision with root package name */
    private final zzawu f13024b;

    /* renamed from: e, reason: collision with root package name */
    private final String f13027e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13028f;

    /* renamed from: d, reason: collision with root package name */
    private final Object f13026d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private long f13029g = -1;

    /* renamed from: h, reason: collision with root package name */
    private long f13030h = -1;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13031i = false;

    /* renamed from: j, reason: collision with root package name */
    private long f13032j = -1;

    /* renamed from: k, reason: collision with root package name */
    private long f13033k = 0;
    private long l = -1;
    private long m = -1;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList<u4> f13025c = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawj(Clock clock, zzawu zzawuVar, String str, String str2) {
        this.a = clock;
        this.f13024b = zzawuVar;
        this.f13027e = str;
        this.f13028f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f13026d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f13027e);
            bundle.putString("slotid", this.f13028f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.l);
            bundle.putLong("tresponse", this.m);
            bundle.putLong("timp", this.f13030h);
            bundle.putLong("tload", this.f13032j);
            bundle.putLong("pcc", this.f13033k);
            bundle.putLong("tfetch", this.f13029g);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<u4> it = this.f13025c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final void c(boolean z) {
        synchronized (this.f13026d) {
            if (this.m != -1) {
                this.f13032j = this.a.b();
            }
        }
    }

    public final void d(zzxz zzxzVar) {
        synchronized (this.f13026d) {
            long b2 = this.a.b();
            this.l = b2;
            this.f13024b.d(zzxzVar, b2);
        }
    }

    public final void e(long j2) {
        synchronized (this.f13026d) {
            this.m = j2;
            if (j2 != -1) {
                this.f13024b.e(this);
            }
        }
    }

    public final void f() {
        synchronized (this.f13026d) {
            if (this.m != -1 && this.f13030h == -1) {
                this.f13030h = this.a.b();
                this.f13024b.e(this);
            }
            this.f13024b.g();
        }
    }

    public final void g() {
        synchronized (this.f13026d) {
            if (this.m != -1) {
                u4 u4Var = new u4(this);
                u4Var.d();
                this.f13025c.add(u4Var);
                this.f13033k++;
                this.f13024b.h();
                this.f13024b.e(this);
            }
        }
    }

    public final void h() {
        synchronized (this.f13026d) {
            if (this.m != -1 && !this.f13025c.isEmpty()) {
                u4 last = this.f13025c.getLast();
                if (last.b() == -1) {
                    last.c();
                    this.f13024b.e(this);
                }
            }
        }
    }

    public final String i() {
        return this.f13027e;
    }
}
