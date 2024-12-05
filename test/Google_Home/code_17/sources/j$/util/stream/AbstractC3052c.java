package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3052c extends AbstractC3062e {

    /* renamed from: h, reason: collision with root package name */
    protected final AtomicReference f33687h;

    /* renamed from: i, reason: collision with root package name */
    protected volatile boolean f33688i;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3052c(AbstractC3047b abstractC3047b, Spliterator spliterator) {
        super(abstractC3047b, spliterator);
        this.f33687h = new AtomicReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3052c(AbstractC3052c abstractC3052c, Spliterator spliterator) {
        super(abstractC3052c, spliterator);
        this.f33687h = abstractC3052c.f33687h;
    }

    @Override // j$.util.stream.AbstractC3062e
    public final Object c() {
        if (!d()) {
            return super.c();
        }
        Object obj = this.f33687h.get();
        return obj == null ? j() : obj;
    }

    @Override // j$.util.stream.AbstractC3062e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f33703b;
        long estimateSize = spliterator.estimateSize();
        long j8 = this.f33704c;
        if (j8 == 0) {
            j8 = AbstractC3062e.g(estimateSize);
            this.f33704c = j8;
        }
        AtomicReference atomicReference = this.f33687h;
        boolean z8 = false;
        AbstractC3052c abstractC3052c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z9 = abstractC3052c.f33688i;
            if (!z9) {
                CountedCompleter<?> completer = abstractC3052c.getCompleter();
                while (true) {
                    AbstractC3052c abstractC3052c2 = (AbstractC3052c) ((AbstractC3062e) completer);
                    if (z9 || abstractC3052c2 == null) {
                        break;
                    }
                    z9 = abstractC3052c2.f33688i;
                    completer = abstractC3052c2.getCompleter();
                }
            }
            if (z9) {
                obj = abstractC3052c.j();
                break;
            }
            if (estimateSize <= j8 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            AbstractC3052c abstractC3052c3 = (AbstractC3052c) abstractC3052c.e(trySplit);
            abstractC3052c.f33705d = abstractC3052c3;
            AbstractC3052c abstractC3052c4 = (AbstractC3052c) abstractC3052c.e(spliterator);
            abstractC3052c.f33706e = abstractC3052c4;
            abstractC3052c.setPendingCount(1);
            if (z8) {
                spliterator = trySplit;
                abstractC3052c = abstractC3052c3;
                abstractC3052c3 = abstractC3052c4;
            } else {
                abstractC3052c = abstractC3052c4;
            }
            z8 = !z8;
            abstractC3052c3.fork();
            estimateSize = spliterator.estimateSize();
        }
        obj = abstractC3052c.a();
        abstractC3052c.f(obj);
        abstractC3052c.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f33687h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC3062e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    protected void h() {
        this.f33688i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        AbstractC3052c abstractC3052c = this;
        for (AbstractC3052c abstractC3052c2 = (AbstractC3052c) ((AbstractC3062e) getCompleter()); abstractC3052c2 != null; abstractC3052c2 = (AbstractC3052c) ((AbstractC3062e) abstractC3052c2.getCompleter())) {
            if (abstractC3052c2.f33705d == abstractC3052c) {
                AbstractC3052c abstractC3052c3 = (AbstractC3052c) abstractC3052c2.f33706e;
                if (!abstractC3052c3.f33688i) {
                    abstractC3052c3.h();
                }
            }
            abstractC3052c = abstractC3052c2;
        }
    }

    protected abstract Object j();
}
