package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class X implements Z {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f32111a;

    private /* synthetic */ X(Spliterator.OfInt ofInt) {
        this.f32111a = ofInt;
    }

    public static /* synthetic */ Z a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof Y ? ((Y) ofInt).f32112a : new X(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f32111a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f32111a;
        if (obj instanceof X) {
            obj = ((X) obj).f32111a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f32111a.estimateSize();
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f32111a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f32111a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Z
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f32111a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f32111a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f32111a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f32111a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32111a.hashCode();
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f32111a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f32111a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Z
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f32111a.tryAdvance(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return g0.a(this.f32111a.trySplit());
    }

    @Override // j$.util.Z, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ Z trySplit() {
        return a(this.f32111a.trySplit());
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        return d0.a(this.f32111a.trySplit());
    }
}
