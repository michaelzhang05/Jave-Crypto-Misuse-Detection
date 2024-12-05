package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2943k0 extends AbstractC2953m0 {
    @Override // j$.util.stream.AbstractC2897b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC2953m0, j$.util.stream.InterfaceC2968p0
    public final void forEach(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEach(longConsumer);
        } else {
            AbstractC2953m0.U(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC2953m0, j$.util.stream.InterfaceC2968p0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (isParallel()) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC2953m0.U(P()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC2968p0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ InterfaceC2968p0 sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final InterfaceC2927h unordered() {
        return !H() ? this : new C3008y(this, EnumC2916e3.f32527r, 4);
    }
}
