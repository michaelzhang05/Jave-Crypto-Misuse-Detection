package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
abstract class z3 {

    /* renamed from: a, reason: collision with root package name */
    final long f32675a;

    /* renamed from: b, reason: collision with root package name */
    final long f32676b;

    /* renamed from: c, reason: collision with root package name */
    Spliterator f32677c;

    /* renamed from: d, reason: collision with root package name */
    long f32678d;

    /* renamed from: e, reason: collision with root package name */
    long f32679e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z3(Spliterator spliterator, long j8, long j9, long j10, long j11) {
        this.f32677c = spliterator;
        this.f32675a = j8;
        this.f32676b = j9;
        this.f32678d = j10;
        this.f32679e = j11;
    }

    protected abstract Spliterator a(Spliterator spliterator, long j8, long j9, long j10, long j11);

    public final int characteristics() {
        return this.f32677c.characteristics();
    }

    public final long estimateSize() {
        long j8 = this.f32679e;
        long j9 = this.f32675a;
        if (j9 < j8) {
            return j8 - Math.max(j9, this.f32678d);
        }
        return 0L;
    }

    public final Spliterator trySplit() {
        long j8 = this.f32679e;
        if (this.f32675a >= j8 || this.f32678d >= j8) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f32677c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f32678d;
            long min = Math.min(estimateSize, this.f32676b);
            long j9 = this.f32675a;
            if (j9 >= min) {
                this.f32678d = min;
            } else {
                long j10 = this.f32676b;
                if (min < j10) {
                    long j11 = this.f32678d;
                    if (j11 < j9 || estimateSize > j10) {
                        this.f32678d = min;
                        return a(trySplit, j9, j10, j11, min);
                    }
                    this.f32678d = min;
                    return trySplit;
                }
                this.f32677c = trySplit;
                this.f32679e = min;
            }
        }
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.W m5596trySplit() {
        return (j$.util.W) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Z m5597trySplit() {
        return (j$.util.Z) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m5598trySplit() {
        return (j$.util.c0) trySplit();
    }

    /* renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.f0 m5599trySplit() {
        return (j$.util.f0) trySplit();
    }
}
