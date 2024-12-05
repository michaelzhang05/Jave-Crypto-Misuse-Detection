package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3143u1 extends AbstractC3156x1 implements InterfaceC3115o2 {

    /* renamed from: h, reason: collision with root package name */
    private final int[] f33822h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3143u1(Spliterator spliterator, AbstractC3047b abstractC3047b, int[] iArr) {
        super(spliterator, abstractC3047b, iArr.length);
        this.f33822h = iArr;
    }

    C3143u1(C3143u1 c3143u1, Spliterator spliterator, long j8, long j9) {
        super(c3143u1, spliterator, j8, j9, c3143u1.f33822h.length);
        this.f33822h = c3143u1.f33822h;
    }

    @Override // j$.util.stream.AbstractC3156x1, j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        int i9 = this.f33849f;
        if (i9 >= this.f33850g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33849f));
        }
        int[] iArr = this.f33822h;
        this.f33849f = i9 + 1;
        iArr[i9] = i8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC3156x1
    final AbstractC3156x1 b(Spliterator spliterator, long j8, long j9) {
        return new C3143u1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC3115o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3163z0.g(this, num);
    }
}
