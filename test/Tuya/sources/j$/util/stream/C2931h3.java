package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2931h3 extends AbstractC2946k3 implements DoubleConsumer {

    /* renamed from: c, reason: collision with root package name */
    final double[] f32557c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2931h3(int i8) {
        this.f32557c = new double[i8];
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d8) {
        int i8 = this.f32570b;
        this.f32570b = i8 + 1;
        this.f32557c[i8] = d8;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC2946k3
    public final void b(Object obj, long j8) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i8 = 0; i8 < j8; i8++) {
            doubleConsumer.accept(this.f32557c[i8]);
        }
    }
}
