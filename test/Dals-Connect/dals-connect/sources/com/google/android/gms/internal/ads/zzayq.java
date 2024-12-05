package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzayq {
    private final String[] a;

    /* renamed from: b, reason: collision with root package name */
    private final double[] f13106b;

    /* renamed from: c, reason: collision with root package name */
    private final double[] f13107c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f13108d;

    /* renamed from: e, reason: collision with root package name */
    private int f13109e;

    private zzayq(zzayt zzaytVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzaytVar.f13114b;
        int size = list.size();
        list2 = zzaytVar.a;
        this.a = (String[]) list2.toArray(new String[size]);
        list3 = zzaytVar.f13114b;
        this.f13106b = b(list3);
        list4 = zzaytVar.f13115c;
        this.f13107c = b(list4);
        this.f13108d = new int[size];
        this.f13109e = 0;
    }

    private static double[] b(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = list.get(i2).doubleValue();
        }
        return dArr;
    }

    public final void a(double d2) {
        this.f13109e++;
        int i2 = 0;
        while (true) {
            double[] dArr = this.f13107c;
            if (i2 >= dArr.length) {
                return;
            }
            if (dArr[i2] <= d2 && d2 < this.f13106b[i2]) {
                int[] iArr = this.f13108d;
                iArr[i2] = iArr[i2] + 1;
            }
            if (d2 < dArr[i2]) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final List<zzays> c() {
        ArrayList arrayList = new ArrayList(this.a.length);
        int i2 = 0;
        while (true) {
            String[] strArr = this.a;
            if (i2 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i2];
            double d2 = this.f13107c[i2];
            double d3 = this.f13106b[i2];
            int[] iArr = this.f13108d;
            double d4 = iArr[i2];
            double d5 = this.f13109e;
            Double.isNaN(d4);
            Double.isNaN(d5);
            arrayList.add(new zzays(str, d2, d3, d4 / d5, iArr[i2]));
            i2++;
        }
    }
}
