package M7;

import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public e f7416a;

    /* renamed from: b, reason: collision with root package name */
    public n f7417b;

    /* renamed from: c, reason: collision with root package name */
    public i f7418c;

    public r(e coreUiLabels, n premiumUiLabels, i mobileUiLabels) {
        AbstractC3255y.i(coreUiLabels, "coreUiLabels");
        AbstractC3255y.i(premiumUiLabels, "premiumUiLabels");
        AbstractC3255y.i(mobileUiLabels, "mobileUiLabels");
        this.f7416a = coreUiLabels;
        this.f7417b = premiumUiLabels;
        this.f7418c = mobileUiLabels;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (AbstractC3255y.d(this.f7416a, rVar.f7416a) && AbstractC3255y.d(this.f7417b, rVar.f7417b) && AbstractC3255y.d(this.f7418c, rVar.f7418c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f7418c.hashCode() + ((this.f7417b.hashCode() + (this.f7416a.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("TranslationsText(coreUiLabels=");
        a8.append(this.f7416a);
        a8.append(", premiumUiLabels=");
        a8.append(this.f7417b);
        a8.append(", mobileUiLabels=");
        a8.append(this.f7418c);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ r(e eVar, n nVar, i iVar, int i8) {
        this((i8 & 1) != 0 ? new e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143) : null, (i8 & 2) != 0 ? new n(null, null, null, null, null, null, null, null, null, null, 1023) : null, (i8 & 4) != 0 ? new i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767) : null);
    }
}
