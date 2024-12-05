package l3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: l3.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3188r {

    /* renamed from: a, reason: collision with root package name */
    private final String f33949a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33950b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33951c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33952d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33953e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f33954f;

    public C3188r(String authUrl, String str, boolean z8, boolean z9, String str2, boolean z10) {
        AbstractC3159y.i(authUrl, "authUrl");
        this.f33949a = authUrl;
        this.f33950b = str;
        this.f33951c = z8;
        this.f33952d = z9;
        this.f33953e = str2;
        this.f33954f = z10;
    }

    public final String a() {
        return this.f33949a;
    }

    public final boolean b() {
        return this.f33954f;
    }

    public final String c() {
        return this.f33953e;
    }

    public final String d() {
        return this.f33950b;
    }

    public final boolean e() {
        return this.f33952d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3188r)) {
            return false;
        }
        C3188r c3188r = (C3188r) obj;
        if (AbstractC3159y.d(this.f33949a, c3188r.f33949a) && AbstractC3159y.d(this.f33950b, c3188r.f33950b) && this.f33951c == c3188r.f33951c && this.f33952d == c3188r.f33952d && AbstractC3159y.d(this.f33953e, c3188r.f33953e) && this.f33954f == c3188r.f33954f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f33951c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f33949a.hashCode() * 31;
        String str = this.f33950b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a8 = (((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f33951c)) * 31) + androidx.compose.foundation.a.a(this.f33952d)) * 31;
        String str2 = this.f33953e;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return ((a8 + i8) * 31) + androidx.compose.foundation.a.a(this.f33954f);
    }

    public String toString() {
        return "WebAuthParams(authUrl=" + this.f33949a + ", returnUrl=" + this.f33950b + ", shouldCancelSource=" + this.f33951c + ", shouldCancelIntentOnUserNavigation=" + this.f33952d + ", referrer=" + this.f33953e + ", forceInAppWebView=" + this.f33954f + ")";
    }

    public /* synthetic */ C3188r(String str, String str2, boolean z8, boolean z9, String str3, boolean z10, int i8, AbstractC3151p abstractC3151p) {
        this(str, str2, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? true : z9, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? false : z10);
    }
}
