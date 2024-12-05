package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
abstract class G3 {

    /* renamed from: a, reason: collision with root package name */
    protected final Spliterator f32311a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f32312b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f32313c;

    /* renamed from: d, reason: collision with root package name */
    private final long f32314d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f32315e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G3(Spliterator spliterator, long j8, long j9) {
        this.f32311a = spliterator;
        this.f32312b = j9 < 0;
        this.f32314d = j9 >= 0 ? j9 : 0L;
        this.f32313c = 128;
        this.f32315e = new AtomicLong(j9 >= 0 ? j8 + j9 : j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public G3(Spliterator spliterator, G3 g32) {
        this.f32311a = spliterator;
        this.f32312b = g32.f32312b;
        this.f32315e = g32.f32315e;
        this.f32314d = g32.f32314d;
        this.f32313c = g32.f32313c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long b(long j8) {
        AtomicLong atomicLong;
        long j9;
        boolean z8;
        long min;
        do {
            atomicLong = this.f32315e;
            j9 = atomicLong.get();
            z8 = this.f32312b;
            if (j9 != 0) {
                min = Math.min(j9, j8);
                if (min <= 0) {
                    break;
                }
            } else {
                if (z8) {
                    return j8;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j9, j9 - min));
        if (z8) {
            return Math.max(j8 - min, 0L);
        }
        long j10 = this.f32314d;
        return j9 > j10 ? Math.max(min - (j9 - j10), 0L) : min;
    }

    protected abstract Spliterator c(Spliterator spliterator);

    public final int characteristics() {
        return this.f32311a.characteristics() & (-16465);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final F3 d() {
        return this.f32315e.get() > 0 ? F3.MAYBE_MORE : this.f32312b ? F3.UNLIMITED : F3.NO_MORE;
    }

    public final long estimateSize() {
        return this.f32311a.estimateSize();
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.f32315e.get() == 0 || (trySplit = this.f32311a.trySplit()) == null) {
            return null;
        }
        return c(trySplit);
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.W m5591trySplit() {
        return (j$.util.W) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Z m5592trySplit() {
        return (j$.util.Z) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m5593trySplit() {
        return (j$.util.c0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.f0 m5594trySplit() {
        return (j$.util.f0) trySplit();
    }
}
