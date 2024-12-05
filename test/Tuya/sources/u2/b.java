package u2;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class b implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C3801a f38487a;

    public b(C3801a c3801a) {
        this.f38487a = c3801a;
    }

    public static b a(C3801a c3801a) {
        return new b(c3801a);
    }

    public static Locale c(C3801a c3801a) {
        return c3801a.a();
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Locale get() {
        return c(this.f38487a);
    }
}
