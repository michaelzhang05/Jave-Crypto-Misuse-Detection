package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S3 extends AbstractC2902c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC2897b f32419j;

    /* renamed from: k, reason: collision with root package name */
    private final IntFunction f32420k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f32421l;

    /* renamed from: m, reason: collision with root package name */
    private long f32422m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f32423n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f32424o;

    S3(S3 s32, Spliterator spliterator) {
        super(s32, spliterator);
        this.f32419j = s32.f32419j;
        this.f32420k = s32.f32420k;
        this.f32421l = s32.f32421l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S3(AbstractC2897b abstractC2897b, AbstractC2897b abstractC2897b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC2897b2, spliterator);
        this.f32419j = abstractC2897b;
        this.f32420k = intFunction;
        this.f32421l = EnumC2916e3.ORDERED.r(abstractC2897b2.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final Object a() {
        D0 J8 = this.f32508a.J(-1L, this.f32420k);
        InterfaceC2975q2 N8 = this.f32419j.N(this.f32508a.G(), J8);
        AbstractC2897b abstractC2897b = this.f32508a;
        boolean x8 = abstractC2897b.x(this.f32509b, abstractC2897b.S(N8));
        this.f32423n = x8;
        if (x8) {
            i();
        }
        L0 a8 = J8.a();
        this.f32422m = a8.count();
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final AbstractC2912e e(Spliterator spliterator) {
        return new S3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2902c
    protected final void h() {
        this.f32494i = true;
        if (this.f32421l && this.f32424o) {
            f(AbstractC3013z0.L(this.f32419j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC2902c
    protected final Object j() {
        return AbstractC3013z0.L(this.f32419j.E());
    }

    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object I8;
        Object c8;
        AbstractC2912e abstractC2912e = this.f32511d;
        if (abstractC2912e != null) {
            this.f32423n = ((S3) abstractC2912e).f32423n | ((S3) this.f32512e).f32423n;
            if (this.f32421l && this.f32494i) {
                this.f32422m = 0L;
                I8 = AbstractC3013z0.L(this.f32419j.E());
            } else {
                if (this.f32421l) {
                    S3 s32 = (S3) this.f32511d;
                    if (s32.f32423n) {
                        this.f32422m = s32.f32422m;
                        I8 = (L0) s32.c();
                    }
                }
                S3 s33 = (S3) this.f32511d;
                long j8 = s33.f32422m;
                S3 s34 = (S3) this.f32512e;
                this.f32422m = j8 + s34.f32422m;
                if (s33.f32422m == 0) {
                    c8 = s34.c();
                } else if (s34.f32422m == 0) {
                    c8 = s33.c();
                } else {
                    I8 = AbstractC3013z0.I(this.f32419j.E(), (L0) ((S3) this.f32511d).c(), (L0) ((S3) this.f32512e).c());
                }
                I8 = (L0) c8;
            }
            f(I8);
        }
        this.f32424o = true;
        super.onCompletion(countedCompleter);
    }
}
