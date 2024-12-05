package com.airbnb.lottie.s.k;

import com.airbnb.lottie.s.i.j;
import com.airbnb.lottie.s.i.k;
import com.airbnb.lottie.s.i.l;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: Layer.java */
/* loaded from: classes.dex */
public class d {
    private final List<com.airbnb.lottie.s.j.b> a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.d f8227b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8228c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8229d;

    /* renamed from: e, reason: collision with root package name */
    private final a f8230e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8231f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8232g;

    /* renamed from: h, reason: collision with root package name */
    private final List<com.airbnb.lottie.s.j.g> f8233h;

    /* renamed from: i, reason: collision with root package name */
    private final l f8234i;

    /* renamed from: j, reason: collision with root package name */
    private final int f8235j;

    /* renamed from: k, reason: collision with root package name */
    private final int f8236k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    private final j q;
    private final k r;
    private final com.airbnb.lottie.s.i.b s;
    private final List<com.airbnb.lottie.w.a<Float>> t;
    private final b u;

    /* compiled from: Layer.java */
    /* loaded from: classes.dex */
    public enum a {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown
    }

    /* compiled from: Layer.java */
    /* loaded from: classes.dex */
    public enum b {
        None,
        Add,
        Invert,
        Unknown
    }

    public d(List<com.airbnb.lottie.s.j.b> list, com.airbnb.lottie.d dVar, String str, long j2, a aVar, long j3, String str2, List<com.airbnb.lottie.s.j.g> list2, l lVar, int i2, int i3, int i4, float f2, float f3, int i5, int i6, j jVar, k kVar, List<com.airbnb.lottie.w.a<Float>> list3, b bVar, com.airbnb.lottie.s.i.b bVar2) {
        this.a = list;
        this.f8227b = dVar;
        this.f8228c = str;
        this.f8229d = j2;
        this.f8230e = aVar;
        this.f8231f = j3;
        this.f8232g = str2;
        this.f8233h = list2;
        this.f8234i = lVar;
        this.f8235j = i2;
        this.f8236k = i3;
        this.l = i4;
        this.m = f2;
        this.n = f3;
        this.o = i5;
        this.p = i6;
        this.q = jVar;
        this.r = kVar;
        this.t = list3;
        this.u = bVar;
        this.s = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.airbnb.lottie.d a() {
        return this.f8227b;
    }

    public long b() {
        return this.f8229d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.w.a<Float>> c() {
        return this.t;
    }

    public a d() {
        return this.f8230e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.s.j.g> e() {
        return this.f8233h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b f() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.f8228c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long h() {
        return this.f8231f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String k() {
        return this.f8232g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<com.airbnb.lottie.s.j.b> l() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f8236k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f8235j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float p() {
        return this.n / this.f8227b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j q() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k r() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.airbnb.lottie.s.i.b s() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float t() {
        return this.m;
    }

    public String toString() {
        return v(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l u() {
        return this.f8234i;
    }

    public String v(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(g());
        sb.append("\n");
        d o = this.f8227b.o(h());
        if (o != null) {
            sb.append("\t\tParents: ");
            sb.append(o.g());
            d o2 = this.f8227b.o(o.h());
            while (o2 != null) {
                sb.append("->");
                sb.append(o2.g());
                o2 = this.f8227b.o(o2.h());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!e().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(e().size());
            sb.append("\n");
        }
        if (o() != 0 && n() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(o()), Integer.valueOf(n()), Integer.valueOf(m())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.airbnb.lottie.s.j.b bVar : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(bVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
