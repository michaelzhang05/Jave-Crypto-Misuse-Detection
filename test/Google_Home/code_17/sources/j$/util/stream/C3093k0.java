package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3093k0 extends AbstractC3103m0 {
    @Override // j$.util.stream.AbstractC3047b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC3047b
    public final InterfaceC3125q2 N(int i8, InterfaceC3125q2 interfaceC3125q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC3103m0, j$.util.stream.InterfaceC3118p0
    public final void forEach(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEach(longConsumer);
        } else {
            AbstractC3103m0.U(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3103m0, j$.util.stream.InterfaceC3118p0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC3103m0.U(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC3047b, j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC3118p0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC3047b, j$.util.stream.InterfaceC3077h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC3118p0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC3047b, j$.util.stream.InterfaceC3077h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC3077h
    public final InterfaceC3077h unordered() {
        return !H() ? this : new C3158y(this, EnumC3066e3.f33721r, 4);
    }
}
