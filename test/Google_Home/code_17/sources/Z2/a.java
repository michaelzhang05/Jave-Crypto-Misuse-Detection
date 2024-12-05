package Z2;

import B2.b;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f13634a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f13635b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13636c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13637d;

    /* renamed from: e, reason: collision with root package name */
    private final String f13638e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f13639f;

    public a(b displayName, boolean z8, int i8, String str, String str2, boolean z9) {
        AbstractC3255y.i(displayName, "displayName");
        this.f13634a = displayName;
        this.f13635b = z8;
        this.f13636c = i8;
        this.f13637d = str;
        this.f13638e = str2;
        this.f13639f = z9;
    }

    public static /* synthetic */ a b(a aVar, b bVar, boolean z8, int i8, String str, String str2, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bVar = aVar.f13634a;
        }
        if ((i9 & 2) != 0) {
            z8 = aVar.f13635b;
        }
        boolean z10 = z8;
        if ((i9 & 4) != 0) {
            i8 = aVar.f13636c;
        }
        int i10 = i8;
        if ((i9 & 8) != 0) {
            str = aVar.f13637d;
        }
        String str3 = str;
        if ((i9 & 16) != 0) {
            str2 = aVar.f13638e;
        }
        String str4 = str2;
        if ((i9 & 32) != 0) {
            z9 = aVar.f13639f;
        }
        return aVar.a(bVar, z10, i10, str3, str4, z9);
    }

    public final a a(b displayName, boolean z8, int i8, String str, String str2, boolean z9) {
        AbstractC3255y.i(displayName, "displayName");
        return new a(displayName, z8, i8, str, str2, z9);
    }

    public final String c() {
        return this.f13638e;
    }

    public final b d() {
        return this.f13634a;
    }

    public final boolean e() {
        return this.f13639f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3255y.d(this.f13634a, aVar.f13634a) && this.f13635b == aVar.f13635b && this.f13636c == aVar.f13636c && AbstractC3255y.d(this.f13637d, aVar.f13637d) && AbstractC3255y.d(this.f13638e, aVar.f13638e) && this.f13639f == aVar.f13639f) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f13636c;
    }

    public final String g() {
        return this.f13637d;
    }

    public final boolean h() {
        return this.f13635b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f13634a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f13635b)) * 31) + this.f13636c) * 31;
        String str = this.f13637d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        String str2 = this.f13638e;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return ((i9 + i8) * 31) + androidx.compose.foundation.a.a(this.f13639f);
    }

    public String toString() {
        return "FormHeaderInformation(displayName=" + this.f13634a + ", shouldShowIcon=" + this.f13635b + ", iconResource=" + this.f13636c + ", lightThemeIconUrl=" + this.f13637d + ", darkThemeIconUrl=" + this.f13638e + ", iconRequiresTinting=" + this.f13639f + ")";
    }
}
