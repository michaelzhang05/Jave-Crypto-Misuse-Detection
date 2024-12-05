package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2246q {

    /* renamed from: a, reason: collision with root package name */
    final String f16744a;

    /* renamed from: b, reason: collision with root package name */
    final String f16745b;

    /* renamed from: c, reason: collision with root package name */
    final String f16746c;

    /* renamed from: d, reason: collision with root package name */
    final long f16747d;

    /* renamed from: e, reason: collision with root package name */
    final long f16748e;

    /* renamed from: f, reason: collision with root package name */
    final C2260t f16749f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2246q(Y1 y12, String str, String str2, String str3, long j8, long j9, Bundle bundle) {
        C2260t c2260t;
        AbstractC1319p.f(str2);
        AbstractC1319p.f(str3);
        this.f16744a = str2;
        this.f16745b = str3;
        this.f16746c = true == TextUtils.isEmpty(str) ? null : str;
        this.f16747d = j8;
        this.f16748e = j9;
        if (j9 != 0 && j9 > j8) {
            y12.d().w().b("Event created with reverse previous/current timestamps. appId", C2267u1.z(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    y12.d().r().a("Param name can't be null");
                    it.remove();
                } else {
                    Object o8 = y12.N().o(next, bundle2.get(next));
                    if (o8 == null) {
                        y12.d().w().b("Param value can't be null", y12.D().e(next));
                        it.remove();
                    } else {
                        y12.N().D(bundle2, next, o8);
                    }
                }
            }
            c2260t = new C2260t(bundle2);
        } else {
            c2260t = new C2260t(new Bundle());
        }
        this.f16749f = c2260t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2246q a(Y1 y12, long j8) {
        return new C2246q(y12, this.f16746c, this.f16744a, this.f16745b, this.f16747d, j8, this.f16749f);
    }

    public final String toString() {
        return "Event{appId='" + this.f16744a + "', name='" + this.f16745b + "', params=" + this.f16749f.toString() + "}";
    }

    private C2246q(Y1 y12, String str, String str2, String str3, long j8, long j9, C2260t c2260t) {
        AbstractC1319p.f(str2);
        AbstractC1319p.f(str3);
        AbstractC1319p.l(c2260t);
        this.f16744a = str2;
        this.f16745b = str3;
        this.f16746c = true == TextUtils.isEmpty(str) ? null : str;
        this.f16747d = j8;
        this.f16748e = j9;
        if (j9 != 0 && j9 > j8) {
            y12.d().w().c("Event created with reverse previous/current timestamps. appId, name", C2267u1.z(str2), C2267u1.z(str3));
        }
        this.f16749f = c2260t;
    }
}
