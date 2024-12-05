package L6;

import P6.C1282h;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final C1282h f6543d = C1282h.f(":");

    /* renamed from: e, reason: collision with root package name */
    public static final C1282h f6544e = C1282h.f(Header.RESPONSE_STATUS_UTF8);

    /* renamed from: f, reason: collision with root package name */
    public static final C1282h f6545f = C1282h.f(Header.TARGET_METHOD_UTF8);

    /* renamed from: g, reason: collision with root package name */
    public static final C1282h f6546g = C1282h.f(Header.TARGET_PATH_UTF8);

    /* renamed from: h, reason: collision with root package name */
    public static final C1282h f6547h = C1282h.f(Header.TARGET_SCHEME_UTF8);

    /* renamed from: i, reason: collision with root package name */
    public static final C1282h f6548i = C1282h.f(Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: a, reason: collision with root package name */
    public final C1282h f6549a;

    /* renamed from: b, reason: collision with root package name */
    public final C1282h f6550b;

    /* renamed from: c, reason: collision with root package name */
    final int f6551c;

    public c(String str, String str2) {
        this(C1282h.f(str), C1282h.f(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f6549a.equals(cVar.f6549a) || !this.f6550b.equals(cVar.f6550b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f6549a.hashCode()) * 31) + this.f6550b.hashCode();
    }

    public String toString() {
        return G6.c.o("%s: %s", this.f6549a.M(), this.f6550b.M());
    }

    public c(C1282h c1282h, String str) {
        this(c1282h, C1282h.f(str));
    }

    public c(C1282h c1282h, C1282h c1282h2) {
        this.f6549a = c1282h;
        this.f6550b = c1282h2;
        this.f6551c = c1282h.F() + 32 + c1282h2.F();
    }
}
