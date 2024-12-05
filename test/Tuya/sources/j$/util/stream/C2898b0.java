package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2898b0 extends AbstractC2908d0 {
    @Override // j$.util.stream.AbstractC2897b
    final boolean M() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2897b
    public final InterfaceC2975q2 N(int i8, InterfaceC2975q2 interfaceC2975q2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC2908d0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEach(intConsumer);
        } else {
            AbstractC2908d0.U(P()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC2908d0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (isParallel()) {
            super.forEachOrdered(intConsumer);
        } else {
            AbstractC2908d0.U(P()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h, j$.util.stream.G
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC2897b, j$.util.stream.InterfaceC2927h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.InterfaceC2927h
    public final InterfaceC2927h unordered() {
        return !H() ? this : new C3004x(this, EnumC2916e3.f32527r, 2);
    }
}
