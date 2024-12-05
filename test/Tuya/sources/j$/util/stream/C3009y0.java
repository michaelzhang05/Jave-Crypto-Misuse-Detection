package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3009y0 extends AbstractC2902c {

    /* renamed from: j, reason: collision with root package name */
    private final C3005x0 f32661j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3009y0(C3005x0 c3005x0, AbstractC2897b abstractC2897b, Spliterator spliterator) {
        super(abstractC2897b, spliterator);
        this.f32661j = c3005x0;
    }

    C3009y0(C3009y0 c3009y0, Spliterator spliterator) {
        super(c3009y0, spliterator);
        this.f32661j = c3009y0.f32661j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final Object a() {
        boolean z8;
        AbstractC2897b abstractC2897b = this.f32508a;
        AbstractC2997v0 abstractC2997v0 = (AbstractC2997v0) this.f32661j.f32649b.get();
        abstractC2897b.R(this.f32509b, abstractC2997v0);
        boolean z9 = abstractC2997v0.f32634b;
        z8 = this.f32661j.f32648a.f32643b;
        if (z9 == z8) {
            Boolean valueOf = Boolean.valueOf(z9);
            AtomicReference atomicReference = this.f32493h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC2912e
    public final AbstractC2912e e(Spliterator spliterator) {
        return new C3009y0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC2902c
    protected final Object j() {
        boolean z8;
        z8 = this.f32661j.f32648a.f32643b;
        return Boolean.valueOf(!z8);
    }
}
