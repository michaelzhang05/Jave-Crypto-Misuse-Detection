package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class T3 implements Consumer, Spliterator {

    /* renamed from: a, reason: collision with root package name */
    final Spliterator f32430a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f32431b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f32432c;

    /* renamed from: d, reason: collision with root package name */
    boolean f32433d;

    /* renamed from: e, reason: collision with root package name */
    int f32434e;

    /* renamed from: f, reason: collision with root package name */
    final Predicate f32435f;

    /* renamed from: g, reason: collision with root package name */
    Object f32436g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32437h;

    public T3(Spliterator spliterator, T3 t32, int i8) {
        this.f32437h = i8;
        this.f32433d = true;
        this.f32430a = spliterator;
        this.f32431b = t32.f32431b;
        this.f32432c = t32.f32432c;
        this.f32435f = t32.f32435f;
    }

    public T3(Spliterator spliterator, Predicate predicate, int i8) {
        this.f32437h = i8;
        this.f32433d = true;
        this.f32430a = spliterator;
        this.f32431b = false;
        this.f32432c = new AtomicBoolean();
        this.f32435f = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f32434e = (this.f32434e + 1) & 63;
        this.f32436g = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    final Spliterator b(Spliterator spliterator) {
        switch (this.f32437h) {
            case 0:
                return new T3(spliterator, this, 0);
            default:
                return new T3(spliterator, this, 1);
        }
    }

    public final Spliterator c() {
        Spliterator trySplit = this.f32431b ? null : this.f32430a.trySplit();
        if (trySplit != null) {
            return b(trySplit);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f32430a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f32430a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        do {
        } while (tryAdvance(consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f32430a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i8) {
        return AbstractC2877d.e(this, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r0 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        r3.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        r8.accept(r7.f32436g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r2;
     */
    @Override // j$.util.Spliterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryAdvance(java.util.function.Consumer r8) {
        /*
            r7 = this;
            int r0 = r7.f32437h
            switch(r0) {
                case 0: goto L39;
                default: goto L5;
            }
        L5:
            boolean r0 = r7.f32433d
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f32432c
            r2 = 1
            if (r0 == 0) goto L2e
            int r0 = r7.f32434e
            if (r0 != 0) goto L16
            boolean r0 = r1.get()
            if (r0 != 0) goto L2e
        L16:
            j$.util.Spliterator r0 = r7.f32430a
            boolean r0 = r0.tryAdvance(r7)
            if (r0 == 0) goto L2e
            java.util.function.Predicate r0 = r7.f32435f
            java.lang.Object r3 = r7.f32436g
            boolean r0 = r0.test(r3)
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r7.f32436g
            r8.accept(r0)
            goto L38
        L2e:
            r0 = 1
        L2f:
            r8 = 0
            r7.f32433d = r8
            if (r0 != 0) goto L37
            r1.set(r2)
        L37:
            r2 = 0
        L38:
            return r2
        L39:
            boolean r0 = r7.f32433d
            j$.util.Spliterator r1 = r7.f32430a
            if (r0 == 0) goto L6e
            r0 = 0
            r7.f32433d = r0
        L42:
            boolean r2 = r1.tryAdvance(r7)
            java.util.concurrent.atomic.AtomicBoolean r3 = r7.f32432c
            r4 = 1
            if (r2 == 0) goto L61
            int r5 = r7.f32434e
            if (r5 != 0) goto L55
            boolean r5 = r3.get()
            if (r5 != 0) goto L61
        L55:
            java.util.function.Predicate r5 = r7.f32435f
            java.lang.Object r6 = r7.f32436g
            boolean r5 = r5.test(r6)
            if (r5 == 0) goto L61
            r0 = 1
            goto L42
        L61:
            if (r2 == 0) goto L72
            if (r0 == 0) goto L68
            r3.set(r4)
        L68:
            java.lang.Object r0 = r7.f32436g
            r8.accept(r0)
            goto L72
        L6e:
            boolean r2 = r1.tryAdvance(r8)
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.T3.tryAdvance(java.util.function.Consumer):boolean");
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f32437h) {
            case 1:
                if (this.f32432c.get()) {
                    return null;
                }
                return c();
            default:
                return c();
        }
    }
}
