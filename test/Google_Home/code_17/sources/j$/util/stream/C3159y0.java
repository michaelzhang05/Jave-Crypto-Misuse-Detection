package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3159y0 extends AbstractC3052c {

    /* renamed from: j, reason: collision with root package name */
    private final C3155x0 f33855j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3159y0(C3155x0 c3155x0, AbstractC3047b abstractC3047b, Spliterator spliterator) {
        super(abstractC3047b, spliterator);
        this.f33855j = c3155x0;
    }

    C3159y0(C3159y0 c3159y0, Spliterator spliterator) {
        super(c3159y0, spliterator);
        this.f33855j = c3159y0.f33855j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final Object a() {
        boolean z8;
        AbstractC3047b abstractC3047b = this.f33702a;
        AbstractC3147v0 abstractC3147v0 = (AbstractC3147v0) this.f33855j.f33843b.get();
        abstractC3047b.R(this.f33703b, abstractC3147v0);
        boolean z9 = abstractC3147v0.f33828b;
        z8 = this.f33855j.f33842a.f33837b;
        if (z9 == z8) {
            Boolean valueOf = Boolean.valueOf(z9);
            AtomicReference atomicReference = this.f33687h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC3062e
    public final AbstractC3062e e(Spliterator spliterator) {
        return new C3159y0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC3052c
    protected final Object j() {
        boolean z8;
        z8 = this.f33855j.f33842a.f33837b;
        return Boolean.valueOf(!z8);
    }
}
