package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class D0 extends AbstractC2181e1 {

    /* renamed from: b, reason: collision with root package name */
    private final Map f16038b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f16039c;

    /* renamed from: d, reason: collision with root package name */
    private long f16040d;

    public D0(Y1 y12) {
        super(y12);
        this.f16039c = new ArrayMap();
        this.f16038b = new ArrayMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void i(D0 d02, String str, long j8) {
        d02.h();
        AbstractC1319p.f(str);
        if (d02.f16039c.isEmpty()) {
            d02.f16040d = j8;
        }
        Integer num = (Integer) d02.f16039c.get(str);
        if (num != null) {
            d02.f16039c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (d02.f16039c.size() >= 100) {
            d02.f16777a.d().w().a("Too many ads visible");
        } else {
            d02.f16039c.put(str, 1);
            d02.f16038b.put(str, Long.valueOf(j8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void j(D0 d02, String str, long j8) {
        d02.h();
        AbstractC1319p.f(str);
        Integer num = (Integer) d02.f16039c.get(str);
        if (num != null) {
            C2177d3 s8 = d02.f16777a.K().s(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                d02.f16039c.remove(str);
                Long l8 = (Long) d02.f16038b.get(str);
                if (l8 == null) {
                    d02.f16777a.d().r().a("First ad unit exposure time was never set");
                } else {
                    long longValue = j8 - l8.longValue();
                    d02.f16038b.remove(str);
                    d02.p(str, longValue, s8);
                }
                if (d02.f16039c.isEmpty()) {
                    long j9 = d02.f16040d;
                    if (j9 == 0) {
                        d02.f16777a.d().r().a("First ad exposure time was never set");
                        return;
                    } else {
                        d02.o(j8 - j9, s8);
                        d02.f16040d = 0L;
                        return;
                    }
                }
                return;
            }
            d02.f16039c.put(str, Integer.valueOf(intValue));
            return;
        }
        d02.f16777a.d().r().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void o(long j8, C2177d3 c2177d3) {
        if (c2177d3 == null) {
            this.f16777a.d().v().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            this.f16777a.d().v().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j8);
        y4.y(c2177d3, bundle, true);
        this.f16777a.I().u("am", "_xa", bundle);
    }

    private final void p(String str, long j8, C2177d3 c2177d3) {
        if (c2177d3 == null) {
            this.f16777a.d().v().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j8 < 1000) {
            this.f16777a.d().v().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j8));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j8);
        y4.y(c2177d3, bundle, true);
        this.f16777a.I().u("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(long j8) {
        Iterator it = this.f16038b.keySet().iterator();
        while (it.hasNext()) {
            this.f16038b.put((String) it.next(), Long.valueOf(j8));
        }
        if (!this.f16038b.isEmpty()) {
            this.f16040d = j8;
        }
    }

    public final void l(String str, long j8) {
        if (str != null && str.length() != 0) {
            this.f16777a.f().z(new RunnableC2155a(this, str, j8));
        } else {
            this.f16777a.d().r().a("Ad unit id must be a non-empty string");
        }
    }

    public final void m(String str, long j8) {
        if (str != null && str.length() != 0) {
            this.f16777a.f().z(new A(this, str, j8));
        } else {
            this.f16777a.d().r().a("Ad unit id must be a non-empty string");
        }
    }

    public final void n(long j8) {
        C2177d3 s8 = this.f16777a.K().s(false);
        for (String str : this.f16038b.keySet()) {
            p(str, j8 - ((Long) this.f16038b.get(str)).longValue(), s8);
        }
        if (!this.f16038b.isEmpty()) {
            o(j8 - this.f16040d, s8);
        }
        q(j8);
    }
}
