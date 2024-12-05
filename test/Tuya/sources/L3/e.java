package L3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f6220a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3983b f6221b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6222c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6223d;

    /* renamed from: e, reason: collision with root package name */
    private final String f6224e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6225f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3983b f6226g;

    /* renamed from: h, reason: collision with root package name */
    private final Function0 f6227h;

    public e(String code, InterfaceC3983b displayName, int i8, String str, String str2, boolean z8, InterfaceC3983b interfaceC3983b, Function0 onClick) {
        AbstractC3159y.i(code, "code");
        AbstractC3159y.i(displayName, "displayName");
        AbstractC3159y.i(onClick, "onClick");
        this.f6220a = code;
        this.f6221b = displayName;
        this.f6222c = i8;
        this.f6223d = str;
        this.f6224e = str2;
        this.f6225f = z8;
        this.f6226g = interfaceC3983b;
        this.f6227h = onClick;
    }

    public final String a() {
        return this.f6220a;
    }

    public final String b() {
        return this.f6224e;
    }

    public final InterfaceC3983b c() {
        return this.f6221b;
    }

    public final boolean d() {
        return this.f6225f;
    }

    public final int e() {
        return this.f6222c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f6220a, eVar.f6220a) && AbstractC3159y.d(this.f6221b, eVar.f6221b) && this.f6222c == eVar.f6222c && AbstractC3159y.d(this.f6223d, eVar.f6223d) && AbstractC3159y.d(this.f6224e, eVar.f6224e) && this.f6225f == eVar.f6225f && AbstractC3159y.d(this.f6226g, eVar.f6226g) && AbstractC3159y.d(this.f6227h, eVar.f6227h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f6223d;
    }

    public final Function0 g() {
        return this.f6227h;
    }

    public final InterfaceC3983b h() {
        return this.f6226g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f6220a.hashCode() * 31) + this.f6221b.hashCode()) * 31) + this.f6222c) * 31;
        String str = this.f6223d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        String str2 = this.f6224e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a8 = (((i9 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f6225f)) * 31;
        InterfaceC3983b interfaceC3983b = this.f6226g;
        if (interfaceC3983b != null) {
            i8 = interfaceC3983b.hashCode();
        }
        return ((a8 + i8) * 31) + this.f6227h.hashCode();
    }

    public String toString() {
        return "DisplayablePaymentMethod(code=" + this.f6220a + ", displayName=" + this.f6221b + ", iconResource=" + this.f6222c + ", lightThemeIconUrl=" + this.f6223d + ", darkThemeIconUrl=" + this.f6224e + ", iconRequiresTinting=" + this.f6225f + ", subtitle=" + this.f6226g + ", onClick=" + this.f6227h + ")";
    }
}
