package j$.util.stream;

/* loaded from: classes2.dex */
final class L extends M {

    /* renamed from: c, reason: collision with root package name */
    static final H f33537c;

    /* renamed from: d, reason: collision with root package name */
    static final H f33538d;

    static {
        EnumC3071f3 enumC3071f3 = EnumC3071f3.REFERENCE;
        f33537c = new H(true, enumC3071f3, j$.util.B.a(), new C3112o(13), new C3097l(10));
        f33538d = new H(false, enumC3071f3, j$.util.B.a(), new C3112o(13), new C3097l(10));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f33544a) {
            return j$.util.B.d(this.f33545b);
        }
        return null;
    }
}
