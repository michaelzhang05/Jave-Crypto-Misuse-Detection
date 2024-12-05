package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzadt extends zzaeb {

    /* renamed from: f, reason: collision with root package name */
    private static final int f12656f;

    /* renamed from: g, reason: collision with root package name */
    private static final int f12657g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f12658h;

    /* renamed from: i, reason: collision with root package name */
    private static final int f12659i;

    /* renamed from: j, reason: collision with root package name */
    private final String f12660j;

    /* renamed from: k, reason: collision with root package name */
    private final List<zzadw> f12661k = new ArrayList();
    private final List<zzaei> l = new ArrayList();
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final boolean r;

    static {
        int rgb = Color.rgb(12, 174, 206);
        f12656f = rgb;
        int rgb2 = Color.rgb(204, 204, 204);
        f12657g = rgb2;
        f12658h = rgb2;
        f12659i = rgb;
    }

    public zzadt(String str, List<zzadw> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.f12660j = str;
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                zzadw zzadwVar = list.get(i4);
                this.f12661k.add(zzadwVar);
                this.l.add(zzadwVar);
            }
        }
        this.m = num != null ? num.intValue() : f12658h;
        this.n = num2 != null ? num2.intValue() : f12659i;
        this.o = num3 != null ? num3.intValue() : 12;
        this.p = i2;
        this.q = i3;
        this.r = z;
    }

    public final int I7() {
        return this.m;
    }

    public final int J7() {
        return this.n;
    }

    public final int K7() {
        return this.o;
    }

    public final List<zzadw> L7() {
        return this.f12661k;
    }

    public final int M7() {
        return this.p;
    }

    public final int N7() {
        return this.q;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final String X0() {
        return this.f12660j;
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final List<zzaei> q0() {
        return this.l;
    }
}
