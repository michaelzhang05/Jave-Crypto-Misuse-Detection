package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class J extends M implements InterfaceC3115o2 {

    /* renamed from: c, reason: collision with root package name */
    static final H f33526c;

    /* renamed from: d, reason: collision with root package name */
    static final H f33527d;

    static {
        EnumC3071f3 enumC3071f3 = EnumC3071f3.INT_VALUE;
        f33526c = new H(true, enumC3071f3, j$.util.D.a(), new C3112o(11), new C3097l(8));
        f33527d = new H(false, enumC3071f3, j$.util.D.a(), new C3112o(11), new C3097l(8));
    }

    @Override // j$.util.stream.M, j$.util.stream.InterfaceC3125q2
    public final void accept(int i8) {
        o(Integer.valueOf(i8));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f33544a) {
            return j$.util.D.d(((Integer) this.f33545b).intValue());
        }
        return null;
    }
}
