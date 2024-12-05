package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
abstract class z3 {

    /* renamed from: a, reason: collision with root package name */
    final long f33869a;

    /* renamed from: b, reason: collision with root package name */
    final long f33870b;

    /* renamed from: c, reason: collision with root package name */
    Spliterator f33871c;

    /* renamed from: d, reason: collision with root package name */
    long f33872d;

    /* renamed from: e, reason: collision with root package name */
    long f33873e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z3(Spliterator spliterator, long j8, long j9, long j10, long j11) {
        this.f33871c = spliterator;
        this.f33869a = j8;
        this.f33870b = j9;
        this.f33872d = j10;
        this.f33873e = j11;
    }

    protected abstract Spliterator a(Spliterator spliterator, long j8, long j9, long j10, long j11);

    public final int characteristics() {
        return this.f33871c.characteristics();
    }

    public final long estimateSize() {
        long j8 = this.f33873e;
        long j9 = this.f33869a;
        if (j9 < j8) {
            return j8 - Math.max(j9, this.f33872d);
        }
        return 0L;
    }

    public final Spliterator trySplit() {
        long j8 = this.f33873e;
        if (this.f33869a >= j8 || this.f33872d >= j8) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f33871c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f33872d;
            long min = Math.min(estimateSize, this.f33870b);
            long j9 = this.f33869a;
            if (j9 >= min) {
                this.f33872d = min;
            } else {
                long j10 = this.f33870b;
                if (min < j10) {
                    long j11 = this.f33872d;
                    if (j11 < j9 || estimateSize > j10) {
                        this.f33872d = min;
                        return a(trySplit, j9, j10, j11, min);
                    }
                    this.f33872d = min;
                    return trySplit;
                }
                this.f33871c = trySplit;
                this.f33873e = min;
            }
        }
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.W m5595trySplit() {
        return (j$.util.W) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Z m5596trySplit() {
        return (j$.util.Z) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m5597trySplit() {
        return (j$.util.c0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.f0 m5598trySplit() {
        return (j$.util.f0) trySplit();
    }
}
