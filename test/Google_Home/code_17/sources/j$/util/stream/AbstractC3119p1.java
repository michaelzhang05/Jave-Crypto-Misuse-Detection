package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3119p1 implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    L0 f33791a;

    /* renamed from: b, reason: collision with root package name */
    int f33792b;

    /* renamed from: c, reason: collision with root package name */
    Spliterator f33793c;

    /* renamed from: d, reason: collision with root package name */
    Spliterator f33794d;

    /* renamed from: e, reason: collision with root package name */
    ArrayDeque f33795e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3119p1(L0 l02) {
        this.f33791a = l02;
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
        int p8 = this.f33791a.p();
        while (true) {
            p8--;
            if (p8 < this.f33792b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f33791a.b(p8));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c() {
        if (this.f33791a == null) {
            return false;
        }
        if (this.f33794d != null) {
            return true;
        }
        Spliterator spliterator = this.f33793c;
        if (spliterator == null) {
            ArrayDeque b8 = b();
            this.f33795e = b8;
            L0 a8 = a(b8);
            if (a8 == null) {
                this.f33791a = null;
                return false;
            }
            spliterator = a8.spliterator();
        }
        this.f33794d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long j8 = 0;
        if (this.f33791a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f33793c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i8 = this.f33792b; i8 < this.f33791a.p(); i8++) {
            j8 += this.f33791a.b(i8).count();
        }
        return j8;
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
    public final Spliterator trySplit() {
        L0 l02 = this.f33791a;
        if (l02 == null || this.f33794d != null) {
            return null;
        }
        Spliterator spliterator = this.f33793c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f33792b < l02.p() - 1) {
            L0 l03 = this.f33791a;
            int i8 = this.f33792b;
            this.f33792b = i8 + 1;
            return l03.b(i8).spliterator();
        }
        L0 b8 = this.f33791a.b(this.f33792b);
        this.f33791a = b8;
        if (b8.p() == 0) {
            Spliterator spliterator2 = this.f33791a.spliterator();
            this.f33793c = spliterator2;
            return spliterator2.trySplit();
        }
        L0 l04 = this.f33791a;
        this.f33792b = 1;
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
