package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class R3 extends AbstractC2912e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC2897b f32406h;

    /* renamed from: i, reason: collision with root package name */
    private final IntFunction f32407i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f32408j;

    /* renamed from: k, reason: collision with root package name */
    private long f32409k;

    /* renamed from: l, reason: collision with root package name */
    private long f32410l;

    R3(R3 r32, Spliterator spliterator) {
        super(r32, spliterator);
        this.f32406h = r32.f32406h;
        this.f32407i = r32.f32407i;
        this.f32408j = r32.f32408j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public R3(AbstractC2897b abstractC2897b, AbstractC2897b abstractC2897b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC2897b2, spliterator);
        this.f32406h = abstractC2897b;
        this.f32407i = intFunction;
        this.f32408j = EnumC2916e3.ORDERED.r(abstractC2897b2.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final Object a() {
        boolean z8 = !d();
        D0 J8 = this.f32508a.J((z8 && this.f32408j && EnumC2916e3.SIZED.u(this.f32406h.f32482c)) ? this.f32406h.C(this.f32509b) : -1L, this.f32407i);
        Q3 q32 = (Q3) this.f32406h;
        boolean z9 = this.f32408j && z8;
        q32.getClass();
        P3 p32 = new P3(q32, J8, z9);
        this.f32508a.R(this.f32509b, p32);
        L0 a8 = J8.a();
        this.f32409k = a8.count();
        this.f32410l = p32.f32385b;
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final AbstractC2912e e(Spliterator spliterator) {
        return new R3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 I8;
        Object c8;
        L0 l02;
        AbstractC2912e abstractC2912e = this.f32511d;
        if (abstractC2912e != null) {
            if (this.f32408j) {
                R3 r32 = (R3) abstractC2912e;
                long j8 = r32.f32410l;
                this.f32410l = j8;
                if (j8 == r32.f32409k) {
                    this.f32410l = j8 + ((R3) this.f32512e).f32410l;
                }
            }
            R3 r33 = (R3) abstractC2912e;
            long j9 = r33.f32409k;
            R3 r34 = (R3) this.f32512e;
            this.f32409k = j9 + r34.f32409k;
            if (r33.f32409k == 0) {
                c8 = r34.c();
            } else if (r34.f32409k == 0) {
                c8 = r33.c();
            } else {
                I8 = AbstractC3013z0.I(this.f32406h.E(), (L0) ((R3) this.f32511d).c(), (L0) ((R3) this.f32512e).c());
                l02 = I8;
                if (d() && this.f32408j) {
                    l02 = l02.g(this.f32410l, l02.count(), this.f32407i);
                }
                f(l02);
            }
            I8 = (L0) c8;
            l02 = I8;
            if (d()) {
                l02 = l02.g(this.f32410l, l02.count(), this.f32407i);
            }
            f(l02);
        }
        super.onCompletion(countedCompleter);
    }
}
