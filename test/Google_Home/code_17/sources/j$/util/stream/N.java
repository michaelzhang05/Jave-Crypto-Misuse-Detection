package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class N extends AbstractC3052c {

    /* renamed from: j, reason: collision with root package name */
    private final H f33552j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f33553k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(H h8, boolean z8, AbstractC3047b abstractC3047b, Spliterator spliterator) {
        super(abstractC3047b, spliterator);
        this.f33553k = z8;
        this.f33552j = h8;
    }

    N(N n8, Spliterator spliterator) {
        super(n8, spliterator);
        this.f33553k = n8.f33553k;
        this.f33552j = n8.f33552j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final Object a() {
        AbstractC3047b abstractC3047b = this.f33702a;
        L3 l32 = (L3) this.f33552j.f33513d.get();
        abstractC3047b.R(this.f33703b, l32);
        Object obj = l32.get();
        if (!this.f33553k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f33687h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        AbstractC3062e abstractC3062e = this;
        while (true) {
            if (abstractC3062e != null) {
                AbstractC3062e abstractC3062e2 = (AbstractC3062e) abstractC3062e.getCompleter();
                if (abstractC3062e2 != null && abstractC3062e2.f33705d != abstractC3062e) {
                    i();
                    break;
                }
                abstractC3062e = abstractC3062e2;
            } else {
                AtomicReference atomicReference2 = this.f33687h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final AbstractC3062e e(Spliterator spliterator) {
        return new N(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3052c
    protected final Object j() {
        return this.f33552j.f33511b;
    }

    @Override // j$.util.stream.AbstractC3062e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f33553k) {
            N n8 = (N) this.f33705d;
            N n9 = null;
            while (true) {
                if (n8 != n9) {
                    Object c8 = n8.c();
                    if (c8 != null && this.f33552j.f33512c.test(c8)) {
                        f(c8);
                        AbstractC3062e abstractC3062e = this;
                        while (true) {
                            if (abstractC3062e != null) {
                                AbstractC3062e abstractC3062e2 = (AbstractC3062e) abstractC3062e.getCompleter();
                                if (abstractC3062e2 != null && abstractC3062e2.f33705d != abstractC3062e) {
                                    i();
                                    break;
                                }
                                abstractC3062e = abstractC3062e2;
                            } else {
                                AtomicReference atomicReference = this.f33687h;
                                while (!atomicReference.compareAndSet(null, c8) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        n9 = n8;
                        n8 = (N) this.f33706e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
