package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class A2 extends AbstractC3052c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC3047b f33463j;

    /* renamed from: k, reason: collision with root package name */
    private final IntFunction f33464k;

    /* renamed from: l, reason: collision with root package name */
    private final long f33465l;

    /* renamed from: m, reason: collision with root package name */
    private final long f33466m;

    /* renamed from: n, reason: collision with root package name */
    private long f33467n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f33468o;

    A2(A2 a22, Spliterator spliterator) {
        super(a22, spliterator);
        this.f33463j = a22.f33463j;
        this.f33464k = a22.f33464k;
        this.f33465l = a22.f33465l;
        this.f33466m = a22.f33466m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A2(AbstractC3047b abstractC3047b, AbstractC3047b abstractC3047b2, Spliterator spliterator, IntFunction intFunction, long j8, long j9) {
        super(abstractC3047b2, spliterator);
        this.f33463j = abstractC3047b;
        this.f33464k = intFunction;
        this.f33465l = j8;
        this.f33466m = j9;
    }

    private long k(long j8) {
        if (this.f33468o) {
            return this.f33467n;
        }
        A2 a22 = (A2) this.f33705d;
        A2 a23 = (A2) this.f33706e;
        if (a22 == null || a23 == null) {
            return this.f33467n;
        }
        long k8 = a22.k(j8);
        return k8 >= j8 ? k8 : k8 + a23.k(j8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final Object a() {
        if (d()) {
            D0 J8 = this.f33463j.J(EnumC3066e3.SIZED.u(this.f33463j.f33676c) ? this.f33463j.C(this.f33703b) : -1L, this.f33464k);
            InterfaceC3125q2 N8 = this.f33463j.N(this.f33702a.G(), J8);
            AbstractC3047b abstractC3047b = this.f33702a;
            abstractC3047b.x(this.f33703b, abstractC3047b.S(N8));
            return J8.a();
        }
        D0 J9 = this.f33463j.J(-1L, this.f33464k);
        if (this.f33465l == 0) {
            InterfaceC3125q2 N9 = this.f33463j.N(this.f33702a.G(), J9);
            AbstractC3047b abstractC3047b2 = this.f33702a;
            abstractC3047b2.x(this.f33703b, abstractC3047b2.S(N9));
        } else {
            this.f33702a.R(this.f33703b, J9);
        }
        L0 a8 = J9.a();
        this.f33467n = a8.count();
        this.f33468o = true;
        this.f33703b = null;
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final AbstractC3062e e(Spliterator spliterator) {
        return new A2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3052c
    protected final void h() {
        this.f33688i = true;
        if (this.f33468o) {
            f(AbstractC3163z0.L(this.f33463j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC3052c
    protected final Object j() {
        return AbstractC3163z0.L(this.f33463j.E());
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        if (r2 >= r0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    @Override // j$.util.stream.AbstractC3062e, java.util.concurrent.CountedCompleter
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
