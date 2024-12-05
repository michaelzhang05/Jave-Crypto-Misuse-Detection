package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3138t1 extends AbstractC3156x1 implements InterfaceC3110n2 {

    /* renamed from: h, reason: collision with root package name */
    private final double[] f33816h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3138t1(Spliterator spliterator, AbstractC3047b abstractC3047b, double[] dArr) {
        super(spliterator, abstractC3047b, dArr.length);
        this.f33816h = dArr;
    }

    C3138t1(C3138t1 c3138t1, Spliterator spliterator, long j8, long j9) {
        super(c3138t1, spliterator, j8, j9, c3138t1.f33816h.length);
        this.f33816h = c3138t1.f33816h;
    }

    @Override // j$.util.stream.AbstractC3156x1, j$.util.stream.InterfaceC3125q2
    public final void accept(double d8) {
        int i8 = this.f33849f;
        if (i8 >= this.f33850g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f33849f));
        }
        double[] dArr = this.f33816h;
        this.f33849f = i8 + 1;
        dArr[i8] = d8;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC3156x1
    final AbstractC3156x1 b(Spliterator spliterator, long j8, long j9) {
        return new C3138t1(this, spliterator, j8, j9);
    }

    @Override // j$.util.stream.InterfaceC3110n2
    public final /* synthetic */ void o(Double d8) {
        AbstractC3163z0.e(this, d8);
    }
}
