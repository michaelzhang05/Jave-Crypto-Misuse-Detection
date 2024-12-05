package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.IntFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S3 extends AbstractC3052c {

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC3047b f33613j;

    /* renamed from: k, reason: collision with root package name */
    private final IntFunction f33614k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f33615l;

    /* renamed from: m, reason: collision with root package name */
    private long f33616m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f33617n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f33618o;

    S3(S3 s32, Spliterator spliterator) {
        super(s32, spliterator);
        this.f33613j = s32.f33613j;
        this.f33614k = s32.f33614k;
        this.f33615l = s32.f33615l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public S3(AbstractC3047b abstractC3047b, AbstractC3047b abstractC3047b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC3047b2, spliterator);
        this.f33613j = abstractC3047b;
        this.f33614k = intFunction;
        this.f33615l = EnumC3066e3.ORDERED.r(abstractC3047b2.G());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final Object a() {
        D0 J8 = this.f33702a.J(-1L, this.f33614k);
        InterfaceC3125q2 N8 = this.f33613j.N(this.f33702a.G(), J8);
        AbstractC3047b abstractC3047b = this.f33702a;
        boolean x8 = abstractC3047b.x(this.f33703b, abstractC3047b.S(N8));
        this.f33617n = x8;
        if (x8) {
            i();
        }
        L0 a8 = J8.a();
        this.f33616m = a8.count();
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final AbstractC3062e e(Spliterator spliterator) {
        return new S3(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3052c
    protected final void h() {
        this.f33688i = true;
        if (this.f33615l && this.f33618o) {
            f(AbstractC3163z0.L(this.f33613j.E()));
        }
    }

    @Override // j$.util.stream.AbstractC3052c
    protected final Object j() {
        return AbstractC3163z0.L(this.f33613j.E());
    }

    @Override // j$.util.stream.AbstractC3062e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object I8;
        Object c8;
        AbstractC3062e abstractC3062e = this.f33705d;
        if (abstractC3062e != null) {
            this.f33617n = ((S3) abstractC3062e).f33617n | ((S3) this.f33706e).f33617n;
            if (this.f33615l && this.f33688i) {
                this.f33616m = 0L;
                I8 = AbstractC3163z0.L(this.f33613j.E());
            } else {
                if (this.f33615l) {
                    S3 s32 = (S3) this.f33705d;
                    if (s32.f33617n) {
                        this.f33616m = s32.f33616m;
                        I8 = (L0) s32.c();
                    }
                }
                S3 s33 = (S3) this.f33705d;
                long j8 = s33.f33616m;
                S3 s34 = (S3) this.f33706e;
                this.f33616m = j8 + s34.f33616m;
                if (s33.f33616m == 0) {
                    c8 = s34.c();
                } else if (s34.f33616m == 0) {
                    c8 = s33.c();
                } else {
                    I8 = AbstractC3163z0.I(this.f33613j.E(), (L0) ((S3) this.f33705d).c(), (L0) ((S3) this.f33706e).c());
                }
                I8 = (L0) c8;
            }
            f(I8);
        }
        this.f33618o = true;
        super.onCompletion(countedCompleter);
    }
}
