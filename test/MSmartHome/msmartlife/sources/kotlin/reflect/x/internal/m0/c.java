package kotlin.reflect.x.internal.m0;

/* compiled from: IntTree.java */
/* loaded from: classes2.dex */
final class c<V> {
    static final c<Object> a = new c<>();

    /* renamed from: b, reason: collision with root package name */
    private final long f21457b;

    /* renamed from: c, reason: collision with root package name */
    private final V f21458c;

    /* renamed from: d, reason: collision with root package name */
    private final c<V> f21459d;

    /* renamed from: e, reason: collision with root package name */
    private final c<V> f21460e;

    /* renamed from: f, reason: collision with root package name */
    private final int f21461f;

    private c() {
        this.f21461f = 0;
        this.f21457b = 0L;
        this.f21458c = null;
        this.f21459d = null;
        this.f21460e = null;
    }

    private static <V> c<V> c(long j2, V v, c<V> cVar, c<V> cVar2) {
        int i2 = ((c) cVar).f21461f;
        int i3 = ((c) cVar2).f21461f;
        if (i2 + i3 > 1) {
            if (i2 >= i3 * 5) {
                c<V> cVar3 = ((c) cVar).f21459d;
                c<V> cVar4 = ((c) cVar).f21460e;
                if (((c) cVar4).f21461f < ((c) cVar3).f21461f * 2) {
                    long j3 = ((c) cVar).f21457b;
                    return new c<>(j3 + j2, ((c) cVar).f21458c, cVar3, new c(-j3, v, cVar4.e(((c) cVar4).f21457b + j3), cVar2));
                }
                c<V> cVar5 = ((c) cVar4).f21459d;
                c<V> cVar6 = ((c) cVar4).f21460e;
                long j4 = ((c) cVar4).f21457b;
                long j5 = ((c) cVar).f21457b + j4 + j2;
                V v2 = ((c) cVar4).f21458c;
                c cVar7 = new c(-j4, ((c) cVar).f21458c, cVar3, cVar5.e(((c) cVar5).f21457b + j4));
                long j6 = ((c) cVar).f21457b;
                long j7 = ((c) cVar4).f21457b;
                return new c<>(j5, v2, cVar7, new c((-j6) - j7, v, cVar6.e(((c) cVar6).f21457b + j7 + j6), cVar2));
            }
            if (i3 >= i2 * 5) {
                c<V> cVar8 = ((c) cVar2).f21459d;
                c<V> cVar9 = ((c) cVar2).f21460e;
                if (((c) cVar8).f21461f < ((c) cVar9).f21461f * 2) {
                    long j8 = ((c) cVar2).f21457b;
                    return new c<>(j8 + j2, ((c) cVar2).f21458c, new c(-j8, v, cVar, cVar8.e(((c) cVar8).f21457b + j8)), cVar9);
                }
                c<V> cVar10 = ((c) cVar8).f21459d;
                c<V> cVar11 = ((c) cVar8).f21460e;
                long j9 = ((c) cVar8).f21457b;
                long j10 = ((c) cVar2).f21457b;
                long j11 = j9 + j10 + j2;
                V v3 = ((c) cVar8).f21458c;
                c cVar12 = new c((-j10) - j9, v, cVar, cVar10.e(((c) cVar10).f21457b + j9 + j10));
                long j12 = ((c) cVar8).f21457b;
                return new c<>(j11, v3, cVar12, new c(-j12, ((c) cVar2).f21458c, cVar11.e(((c) cVar11).f21457b + j12), cVar9));
            }
        }
        return new c<>(j2, v, cVar, cVar2);
    }

    private c<V> d(c<V> cVar, c<V> cVar2) {
        return (cVar == this.f21459d && cVar2 == this.f21460e) ? this : c(this.f21457b, this.f21458c, cVar, cVar2);
    }

    private c<V> e(long j2) {
        return (this.f21461f == 0 || j2 == this.f21457b) ? this : new c<>(j2, this.f21458c, this.f21459d, this.f21460e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public V a(long j2) {
        if (this.f21461f == 0) {
            return null;
        }
        long j3 = this.f21457b;
        if (j2 < j3) {
            return this.f21459d.a(j2 - j3);
        }
        if (j2 > j3) {
            return this.f21460e.a(j2 - j3);
        }
        return this.f21458c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c<V> b(long j2, V v) {
        if (this.f21461f == 0) {
            return new c<>(j2, v, this, this);
        }
        long j3 = this.f21457b;
        if (j2 < j3) {
            return d(this.f21459d.b(j2 - j3, v), this.f21460e);
        }
        if (j2 > j3) {
            return d(this.f21459d, this.f21460e.b(j2 - j3, v));
        }
        return v == this.f21458c ? this : new c<>(j2, v, this.f21459d, this.f21460e);
    }

    private c(long j2, V v, c<V> cVar, c<V> cVar2) {
        this.f21457b = j2;
        this.f21458c = v;
        this.f21459d = cVar;
        this.f21460e = cVar2;
        this.f21461f = cVar.f21461f + 1 + cVar2.f21461f;
    }
}
