package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2993u1 extends AbstractC3006x1 implements InterfaceC2965o2 {

    /* renamed from: h, reason: collision with root package name */
    private final int[] f32628h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2993u1(Spliterator spliterator, AbstractC2897b abstractC2897b, int[] iArr) {
        super(spliterator, abstractC2897b, iArr.length);
        this.f32628h = iArr;
    }

    C2993u1(C2993u1 c2993u1, Spliterator spliterator, long j8, long j9) {
        super(c2993u1, spliterator, j8, j9, c2993u1.f32628h.length);
        this.f32628h = c2993u1.f32628h;
    }

    @Override // j$.util.stream.AbstractC3006x1, j$.util.stream.InterfaceC2975q2
    public final void accept(int i8) {
        int i9 = this.f32655f;
        if (i9 >= this.f32656g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f32655f));
        }
        int[] iArr = this.f32628h;
        this.f32655f = i9 + 1;
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

    @Override // j$.util.stream.AbstractC3006x1
    final AbstractC3006x1 b(Spliterator spliterator, long j8, long j9) {
        return new C2993u1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC2965o2
    public final /* synthetic */ void l(Integer num) {
        AbstractC3013z0.g(this, num);
    }
}
