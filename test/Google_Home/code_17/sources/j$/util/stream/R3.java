package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
final class R3 extends AbstractC3062e {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC3047b f33600h;

    /* renamed from: i, reason: collision with root package name */
    private final IntFunction f33601i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f33602j;

    /* renamed from: k, reason: collision with root package name */
    private long f33603k;

    /* renamed from: l, reason: collision with root package name */
    private long f33604l;

    R3(R3 r32, Spliterator spliterator) {
        super(r32, spliterator);
        this.f33600h = r32.f33600h;
        this.f33601i = r32.f33601i;
        this.f33602j = r32.f33602j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public R3(AbstractC3047b abstractC3047b, AbstractC3047b abstractC3047b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC3047b2, spliterator);
        this.f33600h = abstractC3047b;
        this.f33601i = intFunction;
        this.f33602j = EnumC3066e3.ORDERED.r(abstractC3047b2.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final Object a() {
        boolean z8 = !d();
        D0 J8 = this.f33702a.J((z8 && this.f33602j && EnumC3066e3.SIZED.u(this.f33600h.f33676c)) ? this.f33600h.C(this.f33703b) : -1L, this.f33601i);
        Q3 q32 = (Q3) this.f33600h;
        boolean z9 = this.f33602j && z8;
        q32.getClass();
        P3 p32 = new P3(q32, J8, z9);
        this.f33702a.R(this.f33703b, p32);
        L0 a8 = J8.a();
        this.f33603k = a8.count();
        this.f33604l = p32.f33579b;
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final AbstractC3062e e(Spliterator spliterator) {
        return new R3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3062e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        L0 I8;
        Object c8;
        L0 l02;
        AbstractC3062e abstractC3062e = this.f33705d;
        if (abstractC3062e != null) {
            if (this.f33602j) {
                R3 r32 = (R3) abstractC3062e;
                long j8 = r32.f33604l;
                this.f33604l = j8;
                if (j8 == r32.f33603k) {
                    this.f33604l = j8 + ((R3) this.f33706e).f33604l;
                }
            }
            R3 r33 = (R3) abstractC3062e;
            long j9 = r33.f33603k;
            R3 r34 = (R3) this.f33706e;
            this.f33603k = j9 + r34.f33603k;
            if (r33.f33603k == 0) {
                c8 = r34.c();
            } else if (r34.f33603k == 0) {
                c8 = r33.c();
            } else {
                I8 = AbstractC3163z0.I(this.f33600h.E(), (L0) ((R3) this.f33705d).c(), (L0) ((R3) this.f33706e).c());
                l02 = I8;
                if (d() && this.f33602j) {
                    l02 = l02.g(this.f33604l, l02.count(), this.f33601i);
                }
                f(l02);
            }
            I8 = (L0) c8;
            l02 = I8;
            if (d()) {
                l02 = l02.g(this.f33604l, l02.count(), this.f33601i);
            }
            f(l02);
        }
        super.onCompletion(countedCompleter);
    }
}
