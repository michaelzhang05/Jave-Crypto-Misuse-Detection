package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    final String f16932a;

    /* renamed from: b, reason: collision with root package name */
    final String f16933b;

    /* renamed from: c, reason: collision with root package name */
    final String f16934c;

    /* renamed from: d, reason: collision with root package name */
    final long f16935d;

    /* renamed from: e, reason: collision with root package name */
    final long f16936e;

    /* renamed from: f, reason: collision with root package name */
    final C f16937f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(R2 r22, String str, String str2, String str3, long j8, long j9, Bundle bundle) {
        C c8;
        AbstractC1400p.f(str2);
        AbstractC1400p.f(str3);
        this.f16932a = str2;
        this.f16933b = str3;
        this.f16934c = TextUtils.isEmpty(str) ? null : str;
        this.f16935d = j8;
        this.f16936e = j9;
        if (j9 != 0 && j9 > j8) {
            r22.c().L().b("Event created with reverse previous/current timestamps. appId", C2367i2.s(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    r22.c().G().a("Param name can't be null");
                    it.remove();
                } else {
                    Object s02 = r22.L().s0(next, bundle2.get(next));
                    if (s02 == null) {
                        r22.c().L().b("Param value can't be null", r22.D().f(next));
                        it.remove();
                    } else {
                        r22.L().O(bundle2, next, s02);
                    }
                }
            }
            c8 = new C(bundle2);
        } else {
            c8 = new C(new Bundle());
        }
        this.f16937f = c8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final A a(R2 r22, long j8) {
        return new A(r22, this.f16934c, this.f16932a, this.f16933b, this.f16935d, j8, this.f16937f);
    }

    public final String toString() {
        return "Event{appId='" + this.f16932a + "', name='" + this.f16933b + "', params=" + String.valueOf(this.f16937f) + "}";
    }

    private A(R2 r22, String str, String str2, String str3, long j8, long j9, C c8) {
        AbstractC1400p.f(str2);
        AbstractC1400p.f(str3);
        AbstractC1400p.l(c8);
        this.f16932a = str2;
        this.f16933b = str3;
        this.f16934c = TextUtils.isEmpty(str) ? null : str;
        this.f16935d = j8;
        this.f16936e = j9;
        if (j9 != 0 && j9 > j8) {
            r22.c().L().c("Event created with reverse previous/current timestamps. appId, name", C2367i2.s(str2), C2367i2.s(str3));
        }
        this.f16937f = c8;
    }
}
