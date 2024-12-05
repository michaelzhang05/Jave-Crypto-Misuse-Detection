package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class A2 extends AbstractC2902c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2897b f32269j;

    /* renamed from: k, reason: collision with root package name */
    private final IntFunction f32270k;

    /* renamed from: l, reason: collision with root package name */
    private final long f32271l;

    /* renamed from: m, reason: collision with root package name */
    private final long f32272m;

    /* renamed from: n, reason: collision with root package name */
    private long f32273n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f32274o;

    A2(A2 a22, Spliterator spliterator) {
        super(a22, spliterator);
        this.f32269j = a22.f32269j;
        this.f32270k = a22.f32270k;
        this.f32271l = a22.f32271l;
        this.f32272m = a22.f32272m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A2(AbstractC2897b abstractC2897b, AbstractC2897b abstractC2897b2, Spliterator spliterator, IntFunction intFunction, long j8, long j9) {
        super(abstractC2897b2, spliterator);
        this.f32269j = abstractC2897b;
        this.f32270k = intFunction;
        this.f32271l = j8;
        this.f32272m = j9;
    }

    private long k(long j8) {
        if (this.f32274o) {
            return this.f32273n;
        }
        A2 a22 = (A2) this.f32511d;
        A2 a23 = (A2) this.f32512e;
        if (a22 == null || a23 == null) {
            return this.f32273n;
        }
        long k8 = a22.k(j8);
        return k8 >= j8 ? k8 : k8 + a23.k(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final Object a() {
        if (d()) {
            D0 J8 = this.f32269j.J(EnumC2916e3.SIZED.u(this.f32269j.f32482c) ? this.f32269j.C(this.f32509b) : -1L, this.f32270k);
            InterfaceC2975q2 N8 = this.f32269j.N(this.f32508a.G(), J8);
            AbstractC2897b abstractC2897b = this.f32508a;
            abstractC2897b.x(this.f32509b, abstractC2897b.S(N8));
            return J8.a();
        }
        D0 J9 = this.f32269j.J(-1L, this.f32270k);
        if (this.f32271l == 0) {
            InterfaceC2975q2 N9 = this.f32269j.N(this.f32508a.G(), J9);
            AbstractC2897b abstractC2897b2 = this.f32508a;
            abstractC2897b2.x(this.f32509b, abstractC2897b2.S(N9));
        } else {
            this.f32508a.R(this.f32509b, J9);
        }
        L0 a8 = J9.a();
        this.f32273n = a8.count();
        this.f32274o = true;
        this.f32509b = null;
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final AbstractC2912e e(Spliterator spliterator) {
        return new A2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2902c
    protected final void h() {
        this.f32494i = true;
        if (this.f32274o) {
            f(AbstractC3013z0.L(this.f32269j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC2902c
    protected final Object j() {
        return AbstractC3013z0.L(this.f32269j.E());
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        if (r2 >= r0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.A2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
