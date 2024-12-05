package x2;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class b implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C4186a f40671a;

    public b(C4186a c4186a) {
        this.f40671a = c4186a;
    }

    public static b a(C4186a c4186a) {
        return new b(c4186a);
    }

    public static Locale c(C4186a c4186a) {
        return c4186a.a();
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Locale get() {
        return c(this.f40671a);
    }
}
