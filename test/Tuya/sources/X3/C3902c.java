package x3;

import s3.C3747c;
import s3.InterfaceC3746b;

/* renamed from: x3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3902c implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C3901b f39308a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f39309b;

    public C3902c(C3901b c3901b, I5.a aVar) {
        this.f39308a = c3901b;
        this.f39309b = aVar;
    }

    public static C3902c a(C3901b c3901b, I5.a aVar) {
        return new C3902c(c3901b, aVar);
    }

    public static InterfaceC3746b c(C3901b c3901b, C3747c c3747c) {
        return (InterfaceC3746b) u5.h.d(c3901b.a(c3747c));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3746b get() {
        return c(this.f39308a, (C3747c) this.f39309b.get());
    }
}
