package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class I extends M implements InterfaceC3110n2 {

    /* renamed from: c, reason: collision with root package name */
    static final H f33518c;

    /* renamed from: d, reason: collision with root package name */
    static final H f33519d;

    static {
        EnumC3071f3 enumC3071f3 = EnumC3071f3.DOUBLE_VALUE;
        f33518c = new H(true, enumC3071f3, j$.util.C.a(), new C3112o(10), new C3097l(7));
        f33519d = new H(false, enumC3071f3, j$.util.C.a(), new C3112o(10), new C3097l(7));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC3125q2
    public final void accept(double d8) {
        o(Double.valueOf(d8));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f33544a) {
            return j$.util.C.d(((Double) this.f33545b).doubleValue());
        }
        return null;
    }
}
