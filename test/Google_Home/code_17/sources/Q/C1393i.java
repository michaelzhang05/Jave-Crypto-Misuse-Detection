package Q;

/* renamed from: Q.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1393i {

    /* renamed from: a, reason: collision with root package name */
    private final String f9035a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9036b;

    public C1393i(String str) {
        this(str, null);
    }

    public C1393i(String str, String str2) {
        AbstractC1400p.m(str, "log tag cannot be null");
        AbstractC1400p.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f9035a = str;
        this.f9036b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
