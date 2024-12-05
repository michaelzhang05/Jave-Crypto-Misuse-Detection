package x2;

import u2.InterfaceC4057d;
import x5.h;

/* loaded from: classes4.dex */
public final class c implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C4186a f40672a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f40673b;

    public c(C4186a c4186a, L5.a aVar) {
        this.f40672a = c4186a;
        this.f40673b = aVar;
    }

    public static c a(C4186a c4186a, L5.a aVar) {
        return new c(c4186a, aVar);
    }

    public static InterfaceC4057d c(C4186a c4186a, boolean z8) {
        return (InterfaceC4057d) h.d(c4186a.b(z8));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4057d get() {
        return c(this.f40672a, ((Boolean) this.f40673b.get()).booleanValue());
    }
}
