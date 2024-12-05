package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC2969p1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    L0 f32597a;

    /* renamed from: b, reason: collision with root package name */
    int f32598b;

    /* renamed from: c, reason: collision with root package name */
    Spliterator f32599c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f32600d;

    /* renamed from: e, reason: collision with root package name */
    ArrayDeque f32601e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2969p1(L0 l02) {
        this.f32597a = l02;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static L0 a(Deque deque) {
        while (true) {
            L0 l02 = (L0) deque.pollFirst();
            if (l02 == null) {
                return null;
            }
            if (l02.p() != 0) {
                for (int p8 = l02.p() - 1; p8 >= 0; p8--) {
                    deque.addFirst(l02.b(p8));
                }
            } else if (l02.count() > 0) {
                return l02;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int p8 = this.f32597a.p();
        while (true) {
            p8--;
            if (p8 < this.f32598b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f32597a.b(p8));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        if (this.f32597a == null) {
            return false;
        }
        if (this.f32600d != null) {
            return true;
        }
        Spliterator spliterator = this.f32599c;
        if (spliterator == null) {
            ArrayDeque b8 = b();
            this.f32601e = b8;
            L0 a8 = a(b8);
            if (a8 == null) {
                this.f32597a = null;
                return false;
            }
            spliterator = a8.spliterator();
        }
        this.f32600d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j8 = 0;
        if (this.f32597a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f32599c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i8 = this.f32598b; i8 < this.f32597a.p(); i8++) {
            j8 += this.f32597a.b(i8).count();
        }
        return j8;
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
    public final Spliterator trySplit() {
        L0 l02 = this.f32597a;
        if (l02 == null || this.f32600d != null) {
            return null;
        }
        Spliterator spliterator = this.f32599c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f32598b < l02.p() - 1) {
            L0 l03 = this.f32597a;
            int i8 = this.f32598b;
            this.f32598b = i8 + 1;
            return l03.b(i8).spliterator();
        }
        L0 b8 = this.f32597a.b(this.f32598b);
        this.f32597a = b8;
        if (b8.p() == 0) {
            Spliterator spliterator2 = this.f32597a.spliterator();
            this.f32599c = spliterator2;
            return spliterator2.trySplit();
        }
        L0 l04 = this.f32597a;
        this.f32598b = 1;
        return l04.b(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        return (j$.util.f0) trySplit();
    }
}
