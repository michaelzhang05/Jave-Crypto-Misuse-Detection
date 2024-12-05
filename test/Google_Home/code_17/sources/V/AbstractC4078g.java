package v;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4078g {

    /* renamed from: v.g$a */
    /* loaded from: classes3.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static AbstractC4078g a() {
        return new C4073b(a.FATAL_ERROR, -1L);
    }

    public static AbstractC4078g d() {
        return new C4073b(a.INVALID_PAYLOAD, -1L);
    }

    public static AbstractC4078g e(long j8) {
        return new C4073b(a.OK, j8);
    }

    public static AbstractC4078g f() {
        return new C4073b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
