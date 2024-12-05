package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzayt {
    private final List<String> a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<Double> f13114b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<Double> f13115c = new ArrayList();

    public final zzayt a(String str, double d2, double d3) {
        int i2 = 0;
        while (i2 < this.a.size()) {
            double doubleValue = this.f13115c.get(i2).doubleValue();
            double doubleValue2 = this.f13114b.get(i2).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d3 < doubleValue2)) {
                break;
            }
            i2++;
        }
        this.a.add(i2, str);
        this.f13115c.add(i2, Double.valueOf(d2));
        this.f13114b.add(i2, Double.valueOf(d3));
        return this;
    }

    public final zzayq e() {
        return new zzayq(this);
    }
}
