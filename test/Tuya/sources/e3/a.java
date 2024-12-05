package E3;

import b3.EnumC1870e;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f1971a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1870e f1972b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1973c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1974d;

    public a(String lastFour, EnumC1870e cardBrand, String str, boolean z8) {
        AbstractC3159y.i(lastFour, "lastFour");
        AbstractC3159y.i(cardBrand, "cardBrand");
        this.f1971a = lastFour;
        this.f1972b = cardBrand;
        this.f1973c = str;
        this.f1974d = z8;
    }

    public final EnumC1870e a() {
        return this.f1972b;
    }

    public final String b() {
        return this.f1973c;
    }

    public final String c() {
        return this.f1971a;
    }

    public final boolean d() {
        return this.f1974d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3159y.d(this.f1971a, aVar.f1971a) && this.f1972b == aVar.f1972b && AbstractC3159y.d(this.f1973c, aVar.f1973c) && this.f1974d == aVar.f1974d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f1971a.hashCode() * 31) + this.f1972b.hashCode()) * 31;
        String str = this.f1973c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f1974d);
    }

    public String toString() {
        return "Args(lastFour=" + this.f1971a + ", cardBrand=" + this.f1972b + ", cvc=" + this.f1973c + ", isTestMode=" + this.f1974d + ")";
    }

    public /* synthetic */ a(String str, EnumC1870e enumC1870e, String str2, boolean z8, int i8, AbstractC3151p abstractC3151p) {
        this(str, enumC1870e, (i8 & 4) != 0 ? null : str2, z8);
    }
}
