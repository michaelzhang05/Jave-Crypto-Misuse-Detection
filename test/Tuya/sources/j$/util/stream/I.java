package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class I extends M implements InterfaceC2960n2 {

    /* renamed from: c, reason: collision with root package name */
    static final H f32324c;

    /* renamed from: d, reason: collision with root package name */
    static final H f32325d;

    static {
        EnumC2921f3 enumC2921f3 = EnumC2921f3.DOUBLE_VALUE;
        f32324c = new H(true, enumC2921f3, j$.util.C.a(), new C2962o(10), new C2947l(7));
        f32325d = new H(false, enumC2921f3, j$.util.C.a(), new C2962o(10), new C2947l(7));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC2975q2
    public final void accept(double d8) {
        o(Double.valueOf(d8));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f32350a) {
            return j$.util.C.d(((Double) this.f32351b).doubleValue());
        }
        return null;
    }
}
