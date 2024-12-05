package O6;

import S6.C1420h;
import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final C1420h f8334d = C1420h.f(":");

    /* renamed from: e, reason: collision with root package name */
    public static final C1420h f8335e = C1420h.f(Header.RESPONSE_STATUS_UTF8);

    /* renamed from: f, reason: collision with root package name */
    public static final C1420h f8336f = C1420h.f(Header.TARGET_METHOD_UTF8);

    /* renamed from: g, reason: collision with root package name */
    public static final C1420h f8337g = C1420h.f(Header.TARGET_PATH_UTF8);

    /* renamed from: h, reason: collision with root package name */
    public static final C1420h f8338h = C1420h.f(Header.TARGET_SCHEME_UTF8);

    /* renamed from: i, reason: collision with root package name */
    public static final C1420h f8339i = C1420h.f(Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: a, reason: collision with root package name */
    public final C1420h f8340a;

    /* renamed from: b, reason: collision with root package name */
    public final C1420h f8341b;

    /* renamed from: c, reason: collision with root package name */
    final int f8342c;

    public c(String str, String str2) {
        this(C1420h.f(str), C1420h.f(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f8340a.equals(cVar.f8340a) || !this.f8341b.equals(cVar.f8341b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f8340a.hashCode()) * 31) + this.f8341b.hashCode();
    }

    public String toString() {
        return J6.c.o("%s: %s", this.f8340a.Q(), this.f8341b.Q());
    }

    public c(C1420h c1420h, String str) {
        this(c1420h, C1420h.f(str));
    }

    public c(C1420h c1420h, C1420h c1420h2) {
        this.f8340a = c1420h;
        this.f8341b = c1420h2;
        this.f8342c = c1420h.K() + 32 + c1420h2.K();
    }
}
