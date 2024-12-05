package j$.util.concurrent;

import j$.util.AbstractC3027d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f extends p implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f33346i;

    /* renamed from: j, reason: collision with root package name */
    long f33347j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(l[] lVarArr, int i8, int i9, int i10, long j8, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i8, i9, i10);
        this.f33346i = concurrentHashMap;
        this.f33347j = j8;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f33347j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l a8 = a();
            if (a8 == null) {
                return;
            } else {
                consumer.accept(new k(a8.f33356b, a8.f33357c, this.f33346i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC3027d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC3027d.e(this, i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l a8 = a();
        if (a8 == null) {
            return false;
        }
        consumer.accept(new k(a8.f33356b, a8.f33357c, this.f33346i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i8 = this.f33368f;
        int i9 = this.f33369g;
        int i10 = (i8 + i9) >>> 1;
        if (i10 <= i8) {
            return null;
        }
        l[] lVarArr = this.f33363a;
        this.f33369g = i10;
        long j8 = this.f33347j >>> 1;
        this.f33347j = j8;
        return new f(lVarArr, this.f33370h, i10, i9, j8, this.f33346i);
    }
}
