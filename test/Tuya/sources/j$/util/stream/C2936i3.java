package j$.util.stream;

import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2936i3 extends AbstractC2946k3 implements IntConsumer {

    /* renamed from: c, reason: collision with root package name */
    final int[] f32562c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2936i3(int i8) {
        this.f32562c = new int[i8];
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i8) {
        int i9 = this.f32570b;
        this.f32570b = i9 + 1;
        this.f32562c[i9] = i8;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC2946k3
    public final void b(Object obj, long j8) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i8 = 0; i8 < j8; i8++) {
            intConsumer.accept(this.f32562c[i8]);
        }
    }
}
