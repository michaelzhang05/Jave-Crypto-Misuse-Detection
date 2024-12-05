package H3;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f3536a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3537b;

    /* renamed from: c, reason: collision with root package name */
    private final g f3538c;

    public f(String lastFour, boolean z8, g cvcState) {
        AbstractC3255y.i(lastFour, "lastFour");
        AbstractC3255y.i(cvcState, "cvcState");
        this.f3536a = lastFour;
        this.f3537b = z8;
        this.f3538c = cvcState;
    }

    public static /* synthetic */ f b(f fVar, String str, boolean z8, g gVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = fVar.f3536a;
        }
        if ((i8 & 2) != 0) {
            z8 = fVar.f3537b;
        }
        if ((i8 & 4) != 0) {
            gVar = fVar.f3538c;
        }
        return fVar.a(str, z8, gVar);
    }

    public final f a(String lastFour, boolean z8, g cvcState) {
        AbstractC3255y.i(lastFour, "lastFour");
        AbstractC3255y.i(cvcState, "cvcState");
        return new f(lastFour, z8, cvcState);
    }

    public final g c() {
        return this.f3538c;
    }

    public final String d() {
        return this.f3536a;
    }

    public final boolean e() {
        return this.f3537b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3255y.d(this.f3536a, fVar.f3536a) && this.f3537b == fVar.f3537b && AbstractC3255y.d(this.f3538c, fVar.f3538c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f3536a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f3537b)) * 31) + this.f3538c.hashCode();
    }

    public String toString() {
        return "CvcRecollectionViewState(lastFour=" + this.f3536a + ", isTestMode=" + this.f3537b + ", cvcState=" + this.f3538c + ")";
    }
}
