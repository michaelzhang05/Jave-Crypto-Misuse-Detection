package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2998v1 extends AbstractC3006x1 implements InterfaceC2970p2 {

    /* renamed from: h, reason: collision with root package name */
    private final long[] f32635h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2998v1(Spliterator spliterator, AbstractC2897b abstractC2897b, long[] jArr) {
        super(spliterator, abstractC2897b, jArr.length);
        this.f32635h = jArr;
    }

    C2998v1(C2998v1 c2998v1, Spliterator spliterator, long j8, long j9) {
        super(c2998v1, spliterator, j8, j9, c2998v1.f32635h.length);
        this.f32635h = c2998v1.f32635h;
    }

    @Override // j$.util.stream.AbstractC3006x1, j$.util.stream.InterfaceC2975q2, j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        int i8 = this.f32655f;
        if (i8 >= this.f32656g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f32655f));
        }
        long[] jArr = this.f32635h;
        this.f32655f = i8 + 1;
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

    @Override // j$.util.stream.AbstractC3006x1
    final AbstractC3006x1 b(Spliterator spliterator, long j8, long j9) {
        return new C2998v1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC2970p2
    public final /* synthetic */ void i(Long l8) {
        AbstractC3013z0.i(this, l8);
    }
}
