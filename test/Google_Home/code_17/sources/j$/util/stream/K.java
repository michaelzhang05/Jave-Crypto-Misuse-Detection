package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class K extends M implements InterfaceC3120p2 {

    /* renamed from: c, reason: collision with root package name */
    static final H f33532c;

    /* renamed from: d, reason: collision with root package name */
    static final H f33533d;

    static {
        EnumC3071f3 enumC3071f3 = EnumC3071f3.LONG_VALUE;
        f33532c = new H(true, enumC3071f3, j$.util.E.a(), new C3112o(12), new C3097l(9));
        f33533d = new H(false, enumC3071f3, j$.util.E.a(), new C3112o(12), new C3097l(9));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC3125q2, j$.util.stream.InterfaceC3120p2, java.util.function.LongConsumer
    public final void accept(long j8) {
        o(Long.valueOf(j8));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f33544a) {
            return j$.util.E.d(((Long) this.f33545b).longValue());
        }
        return null;
    }
}
