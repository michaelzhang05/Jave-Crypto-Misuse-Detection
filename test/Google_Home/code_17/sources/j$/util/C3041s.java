package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3041s implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final Spliterator f33452a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3041s(Spliterator spliterator) {
        this.f33452a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f33452a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33452a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f33452a.forEachRemaining(new C3040q(consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f33452a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f33452a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i8) {
        return this.f33452a.hasCharacteristics(i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f33452a.tryAdvance(new C3040q(consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f33452a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C3041s(trySplit);
    }
}
