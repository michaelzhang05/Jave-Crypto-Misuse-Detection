package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class K extends M implements InterfaceC2970p2 {

    /* renamed from: c, reason: collision with root package name */
    static final H f32338c;

    /* renamed from: d, reason: collision with root package name */
    static final H f32339d;

    static {
        EnumC2921f3 enumC2921f3 = EnumC2921f3.LONG_VALUE;
        f32338c = new H(true, enumC2921f3, j$.util.E.a(), new C2962o(12), new C2947l(9));
        f32339d = new H(false, enumC2921f3, j$.util.E.a(), new C2962o(12), new C2947l(9));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC2975q2, j$.util.stream.InterfaceC2970p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        o(Long.valueOf(j8));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f32350a) {
            return j$.util.E.d(((Long) this.f32351b).longValue());
        }
        return null;
    }
}
