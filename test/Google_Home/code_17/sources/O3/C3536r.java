package o3;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: o3.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3536r {

    /* renamed from: a, reason: collision with root package name */
    private final String f35950a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35951b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35952c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35953d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35954e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f35955f;

    public C3536r(String authUrl, String str, boolean z8, boolean z9, String str2, boolean z10) {
        AbstractC3255y.i(authUrl, "authUrl");
        this.f35950a = authUrl;
        this.f35951b = str;
        this.f35952c = z8;
        this.f35953d = z9;
        this.f35954e = str2;
        this.f35955f = z10;
    }

    public final String a() {
        return this.f35950a;
    }

    public final boolean b() {
        return this.f35955f;
    }

    public final String c() {
        return this.f35954e;
    }

    public final String d() {
        return this.f35951b;
    }

    public final boolean e() {
        return this.f35953d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3536r)) {
            return false;
        }
        C3536r c3536r = (C3536r) obj;
        if (AbstractC3255y.d(this.f35950a, c3536r.f35950a) && AbstractC3255y.d(this.f35951b, c3536r.f35951b) && this.f35952c == c3536r.f35952c && this.f35953d == c3536r.f35953d && AbstractC3255y.d(this.f35954e, c3536r.f35954e) && this.f35955f == c3536r.f35955f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f35952c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f35950a.hashCode() * 31;
        String str = this.f35951b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a8 = (((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f35952c)) * 31) + androidx.compose.foundation.a.a(this.f35953d)) * 31;
        String str2 = this.f35954e;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return ((a8 + i8) * 31) + androidx.compose.foundation.a.a(this.f35955f);
    }

    public String toString() {
        return "WebAuthParams(authUrl=" + this.f35950a + ", returnUrl=" + this.f35951b + ", shouldCancelSource=" + this.f35952c + ", shouldCancelIntentOnUserNavigation=" + this.f35953d + ", referrer=" + this.f35954e + ", forceInAppWebView=" + this.f35955f + ")";
    }

    public /* synthetic */ C3536r(String str, String str2, boolean z8, boolean z9, String str3, boolean z10, int i8, AbstractC3247p abstractC3247p) {
        this(str, str2, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? true : z9, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? false : z10);
    }
}
