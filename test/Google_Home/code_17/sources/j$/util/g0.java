package j$.util;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class g0 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator f33412a;

    private /* synthetic */ g0(java.util.Spliterator spliterator) {
        this.f33412a = spliterator;
    }

    public static /* synthetic */ Spliterator a(java.util.Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof Spliterator.Wrapper ? Spliterator.this : spliterator instanceof Spliterator.OfPrimitive ? d0.a((Spliterator.OfPrimitive) spliterator) : new g0(spliterator);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33412a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.Spliterator spliterator = this.f33412a;
        if (obj instanceof g0) {
            obj = ((g0) obj).f33412a;
        }
        return spliterator.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33412a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33412a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33412a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33412a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return this.f33412a.hasCharacteristics(i8);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33412a.hashCode();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33412a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return a(this.f33412a.trySplit());
    }
}
