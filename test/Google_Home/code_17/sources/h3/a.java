package H3;

import e3.EnumC2791e;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f3521a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2791e f3522b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3523c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3524d;

    public a(String lastFour, EnumC2791e cardBrand, String str, boolean z8) {
        AbstractC3255y.i(lastFour, "lastFour");
        AbstractC3255y.i(cardBrand, "cardBrand");
        this.f3521a = lastFour;
        this.f3522b = cardBrand;
        this.f3523c = str;
        this.f3524d = z8;
    }

    public final EnumC2791e a() {
        return this.f3522b;
    }

    public final String b() {
        return this.f3523c;
    }

    public final String c() {
        return this.f3521a;
    }

    public final boolean d() {
        return this.f3524d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3255y.d(this.f3521a, aVar.f3521a) && this.f3522b == aVar.f3522b && AbstractC3255y.d(this.f3523c, aVar.f3523c) && this.f3524d == aVar.f3524d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f3521a.hashCode() * 31) + this.f3522b.hashCode()) * 31;
        String str = this.f3523c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f3524d);
    }

    public String toString() {
        return "Args(lastFour=" + this.f3521a + ", cardBrand=" + this.f3522b + ", cvc=" + this.f3523c + ", isTestMode=" + this.f3524d + ")";
    }

    public /* synthetic */ a(String str, EnumC2791e enumC2791e, String str2, boolean z8, int i8, AbstractC3247p abstractC3247p) {
        this(str, enumC2791e, (i8 & 4) != 0 ? null : str2, z8);
    }
}
