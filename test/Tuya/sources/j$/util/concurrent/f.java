package j$.util.concurrent;

import j$.util.AbstractC2877d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f extends p implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f32152i;

    /* renamed from: j, reason: collision with root package name */
    long f32153j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l[] lVarArr, int i8, int i9, int i10, long j8, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i8, i9, i10);
        this.f32152i = concurrentHashMap;
        this.f32153j = j8;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f32153j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l a8 = a();
            if (a8 == null) {
                return;
            } else {
                consumer.accept(new k(a8.f32162b, a8.f32163c, this.f32152i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC2877d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2877d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l a8 = a();
        if (a8 == null) {
            return false;
        }
        consumer.accept(new k(a8.f32162b, a8.f32163c, this.f32152i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f32174f;
        int i9 = this.f32175g;
        int i10 = (i8 + i9) >>> 1;
        if (i10 <= i8) {
            return null;
        }
        l[] lVarArr = this.f32169a;
        this.f32175g = i10;
        long j8 = this.f32153j >>> 1;
        this.f32153j = j8;
        return new f(lVarArr, this.f32176h, i10, i9, j8, this.f32152i);
    }
}
