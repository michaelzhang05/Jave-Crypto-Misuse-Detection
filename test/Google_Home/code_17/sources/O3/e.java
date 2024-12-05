package O3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f8011a;

    /* renamed from: b, reason: collision with root package name */
    private final B2.b f8012b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8013c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8014d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8015e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f8016f;

    /* renamed from: g, reason: collision with root package name */
    private final B2.b f8017g;

    /* renamed from: h, reason: collision with root package name */
    private final Function0 f8018h;

    public e(String code, B2.b displayName, int i8, String str, String str2, boolean z8, B2.b bVar, Function0 onClick) {
        AbstractC3255y.i(code, "code");
        AbstractC3255y.i(displayName, "displayName");
        AbstractC3255y.i(onClick, "onClick");
        this.f8011a = code;
        this.f8012b = displayName;
        this.f8013c = i8;
        this.f8014d = str;
        this.f8015e = str2;
        this.f8016f = z8;
        this.f8017g = bVar;
        this.f8018h = onClick;
    }

    public final String a() {
        return this.f8011a;
    }

    public final String b() {
        return this.f8015e;
    }

    public final B2.b c() {
        return this.f8012b;
    }

    public final boolean d() {
        return this.f8016f;
    }

    public final int e() {
        return this.f8013c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3255y.d(this.f8011a, eVar.f8011a) && AbstractC3255y.d(this.f8012b, eVar.f8012b) && this.f8013c == eVar.f8013c && AbstractC3255y.d(this.f8014d, eVar.f8014d) && AbstractC3255y.d(this.f8015e, eVar.f8015e) && this.f8016f == eVar.f8016f && AbstractC3255y.d(this.f8017g, eVar.f8017g) && AbstractC3255y.d(this.f8018h, eVar.f8018h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f8014d;
    }

    public final Function0 g() {
        return this.f8018h;
    }

    public final B2.b h() {
        return this.f8017g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f8011a.hashCode() * 31) + this.f8012b.hashCode()) * 31) + this.f8013c) * 31;
        String str = this.f8014d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        String str2 = this.f8015e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a8 = (((i9 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f8016f)) * 31;
        B2.b bVar = this.f8017g;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return ((a8 + i8) * 31) + this.f8018h.hashCode();
    }

    public String toString() {
        return "DisplayablePaymentMethod(code=" + this.f8011a + ", displayName=" + this.f8012b + ", iconResource=" + this.f8013c + ", lightThemeIconUrl=" + this.f8014d + ", darkThemeIconUrl=" + this.f8015e + ", iconRequiresTinting=" + this.f8016f + ", subtitle=" + this.f8017g + ", onClick=" + this.f8018h + ")";
    }
}
