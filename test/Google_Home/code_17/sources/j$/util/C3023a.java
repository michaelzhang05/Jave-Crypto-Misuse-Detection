package j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3023a implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List f33307a;

    /* renamed from: b, reason: collision with root package name */
    private int f33308b;

    /* renamed from: c, reason: collision with root package name */
    private int f33309c;

    private C3023a(C3023a c3023a, int i8, int i9) {
        this.f33307a = c3023a.f33307a;
        this.f33308b = i8;
        this.f33309c = i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3023a(java.util.List list) {
        this.f33307a = list;
        this.f33308b = 0;
        this.f33309c = -1;
    }

    private int a() {
        int i8 = this.f33309c;
        if (i8 >= 0) {
            return i8;
        }
        int size = this.f33307a.size();
        this.f33309c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f33308b;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int a8 = a();
        this.f33308b = a8;
        for (int i8 = this.f33308b; i8 < a8; i8++) {
            try {
                consumer.accept(this.f33307a.get(i8));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
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
        int a8 = a();
        int i8 = this.f33308b;
        if (i8 >= a8) {
            return false;
        }
        this.f33308b = i8 + 1;
        try {
            consumer.accept(this.f33307a.get(i8));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a8 = a();
        int i8 = this.f33308b;
        int i9 = (a8 + i8) >>> 1;
        if (i8 >= i9) {
            return null;
        }
        this.f33308b = i9;
        return new C3023a(this, i8, i9);
    }
}
