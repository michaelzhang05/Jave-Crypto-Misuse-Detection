package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3148v1 extends AbstractC3156x1 implements InterfaceC3120p2 {

    /* renamed from: h, reason: collision with root package name */
    private final long[] f33829h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3148v1(Spliterator spliterator, AbstractC3047b abstractC3047b, long[] jArr) {
        super(spliterator, abstractC3047b, jArr.length);
        this.f33829h = jArr;
    }

    C3148v1(C3148v1 c3148v1, Spliterator spliterator, long j8, long j9) {
        super(c3148v1, spliterator, j8, j9, c3148v1.f33829h.length);
        this.f33829h = c3148v1.f33829h;
    }

    @Override // j$.util.stream.AbstractC3156x1, j$.util.stream.InterfaceC3125q2, j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        int i8 = this.f33849f;
        if (i8 >= this.f33850g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33849f));
        }
        long[] jArr = this.f33829h;
        this.f33849f = i8 + 1;
        jArr[i8] = j8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC3156x1
    final AbstractC3156x1 b(Spliterator spliterator, long j8, long j9) {
        return new C3148v1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC3120p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3163z0.i(this, l8);
    }
}
