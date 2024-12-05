package W2;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3983b f11996a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11997b;

    /* renamed from: c, reason: collision with root package name */
    private final int f11998c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11999d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12000e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f12001f;

    public a(InterfaceC3983b displayName, boolean z8, int i8, String str, String str2, boolean z9) {
        AbstractC3159y.i(displayName, "displayName");
        this.f11996a = displayName;
        this.f11997b = z8;
        this.f11998c = i8;
        this.f11999d = str;
        this.f12000e = str2;
        this.f12001f = z9;
    }

    public static /* synthetic */ a b(a aVar, InterfaceC3983b interfaceC3983b, boolean z8, int i8, String str, String str2, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            interfaceC3983b = aVar.f11996a;
        }
        if ((i9 & 2) != 0) {
            z8 = aVar.f11997b;
        }
        boolean z10 = z8;
        if ((i9 & 4) != 0) {
            i8 = aVar.f11998c;
        }
        int i10 = i8;
        if ((i9 & 8) != 0) {
            str = aVar.f11999d;
        }
        String str3 = str;
        if ((i9 & 16) != 0) {
            str2 = aVar.f12000e;
        }
        String str4 = str2;
        if ((i9 & 32) != 0) {
            z9 = aVar.f12001f;
        }
        return aVar.a(interfaceC3983b, z10, i10, str3, str4, z9);
    }

    public final a a(InterfaceC3983b displayName, boolean z8, int i8, String str, String str2, boolean z9) {
        AbstractC3159y.i(displayName, "displayName");
        return new a(displayName, z8, i8, str, str2, z9);
    }

    public final String c() {
        return this.f12000e;
    }

    public final InterfaceC3983b d() {
        return this.f11996a;
    }

    public final boolean e() {
        return this.f12001f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f11996a, aVar.f11996a) && this.f11997b == aVar.f11997b && this.f11998c == aVar.f11998c && AbstractC3159y.d(this.f11999d, aVar.f11999d) && AbstractC3159y.d(this.f12000e, aVar.f12000e) && this.f12001f == aVar.f12001f) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f11998c;
    }

    public final String g() {
        return this.f11999d;
    }

    public final boolean h() {
        return this.f11997b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f11996a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f11997b)) * 31) + this.f11998c) * 31;
        String str = this.f11999d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        String str2 = this.f12000e;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return ((i9 + i8) * 31) + androidx.compose.foundation.a.a(this.f12001f);
    }

    public String toString() {
        return "FormHeaderInformation(displayName=" + this.f11996a + ", shouldShowIcon=" + this.f11997b + ", iconResource=" + this.f11998c + ", lightThemeIconUrl=" + this.f11999d + ", darkThemeIconUrl=" + this.f12000e + ", iconRequiresTinting=" + this.f12001f + ")";
    }
}
