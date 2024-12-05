package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2891s implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final Spliterator f32258a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2891s(Spliterator spliterator) {
        this.f32258a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f32258a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f32258a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f32258a.forEachRemaining(new C2890q(consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f32258a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f32258a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i8) {
        return this.f32258a.hasCharacteristics(i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f32258a.tryAdvance(new C2890q(consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f32258a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C2891s(trySplit);
    }
}
