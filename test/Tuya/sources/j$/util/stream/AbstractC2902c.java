package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2902c extends AbstractC2912e {

    /* renamed from: h, reason: collision with root package name */
    protected final AtomicReference f32493h;

    /* renamed from: i, reason: collision with root package name */
    protected volatile boolean f32494i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2902c(AbstractC2897b abstractC2897b, Spliterator spliterator) {
        super(abstractC2897b, spliterator);
        this.f32493h = new AtomicReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2902c(AbstractC2902c abstractC2902c, Spliterator spliterator) {
        super(abstractC2902c, spliterator);
        this.f32493h = abstractC2902c.f32493h;
    }

    @Override // j$.util.stream.AbstractC2912e
    public final Object c() {
        if (!d()) {
            return super.c();
        }
        Object obj = this.f32493h.get();
        return obj == null ? j() : obj;
    }

    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f32509b;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f32510c;
        if (j8 == 0) {
            j8 = AbstractC2912e.g(estimateSize);
            this.f32510c = j8;
        }
        AtomicReference atomicReference = this.f32493h;
        boolean z8 = false;
        AbstractC2902c abstractC2902c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z9 = abstractC2902c.f32494i;
            if (!z9) {
                CountedCompleter<?> completer = abstractC2902c.getCompleter();
                while (true) {
                    AbstractC2902c abstractC2902c2 = (AbstractC2902c) ((AbstractC2912e) completer);
                    if (z9 || abstractC2902c2 == null) {
                        break;
                    }
                    z9 = abstractC2902c2.f32494i;
                    completer = abstractC2902c2.getCompleter();
                }
            }
            if (z9) {
                obj = abstractC2902c.j();
                break;
            }
            if (estimateSize <= j8 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC2902c abstractC2902c3 = (AbstractC2902c) abstractC2902c.e(trySplit);
            abstractC2902c.f32511d = abstractC2902c3;
            AbstractC2902c abstractC2902c4 = (AbstractC2902c) abstractC2902c.e(spliterator);
            abstractC2902c.f32512e = abstractC2902c4;
            abstractC2902c.setPendingCount(1);
            if (z8) {
                spliterator = trySplit;
                abstractC2902c = abstractC2902c3;
                abstractC2902c3 = abstractC2902c4;
            } else {
                abstractC2902c = abstractC2902c4;
            }
            z8 = !z8;
            abstractC2902c3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = abstractC2902c.a();
        abstractC2902c.f(obj);
        abstractC2902c.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f32493h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC2912e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.f32494i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        AbstractC2902c abstractC2902c = this;
        for (AbstractC2902c abstractC2902c2 = (AbstractC2902c) ((AbstractC2912e) getCompleter()); abstractC2902c2 != null; abstractC2902c2 = (AbstractC2902c) ((AbstractC2912e) abstractC2902c2.getCompleter())) {
            if (abstractC2902c2.f32511d == abstractC2902c) {
                AbstractC2902c abstractC2902c3 = (AbstractC2902c) abstractC2902c2.f32512e;
                if (!abstractC2902c3.f32494i) {
                    abstractC2902c3.h();
                }
            }
            abstractC2902c = abstractC2902c2;
        }
    }

    protected abstract Object j();
}
