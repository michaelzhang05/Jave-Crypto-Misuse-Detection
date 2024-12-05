package H6;

import M7.i;
import M7.n;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public g f3924a;

    /* renamed from: b, reason: collision with root package name */
    public a f3925b;

    /* renamed from: c, reason: collision with root package name */
    public e f3926c;

    /* renamed from: d, reason: collision with root package name */
    public M7.e f3927d;

    /* renamed from: e, reason: collision with root package name */
    public i f3928e;

    /* renamed from: f, reason: collision with root package name */
    public n f3929f;

    public f(g premiumProperties, a coreConfig, e nonIabVendorsInfo, M7.e coreUiLabels, i mobileUiLabels, n premiumUiLabels) {
        AbstractC3255y.i(premiumProperties, "premiumProperties");
        AbstractC3255y.i(coreConfig, "coreConfig");
        AbstractC3255y.i(nonIabVendorsInfo, "nonIabVendorsInfo");
        AbstractC3255y.i(coreUiLabels, "coreUiLabels");
        AbstractC3255y.i(mobileUiLabels, "mobileUiLabels");
        AbstractC3255y.i(premiumUiLabels, "premiumUiLabels");
        this.f3924a = premiumProperties;
        this.f3925b = coreConfig;
        this.f3926c = nonIabVendorsInfo;
        this.f3927d = coreUiLabels;
        this.f3928e = mobileUiLabels;
        this.f3929f = premiumUiLabels;
    }

    public final a a() {
        return this.f3925b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3255y.d(this.f3924a, fVar.f3924a) && AbstractC3255y.d(this.f3925b, fVar.f3925b) && AbstractC3255y.d(this.f3926c, fVar.f3926c) && AbstractC3255y.d(this.f3927d, fVar.f3927d) && AbstractC3255y.d(this.f3928e, fVar.f3928e) && AbstractC3255y.d(this.f3929f, fVar.f3929f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3929f.hashCode() + ((this.f3928e.hashCode() + ((this.f3927d.hashCode() + ((this.f3926c.hashCode() + ((this.f3925b.hashCode() + (this.f3924a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("PortalConfig(premiumProperties=");
        a8.append(this.f3924a);
        a8.append(", coreConfig=");
        a8.append(this.f3925b);
        a8.append(", nonIabVendorsInfo=");
        a8.append(this.f3926c);
        a8.append(", coreUiLabels=");
        a8.append(this.f3927d);
        a8.append(", mobileUiLabels=");
        a8.append(this.f3928e);
        a8.append(", premiumUiLabels=");
        a8.append(this.f3929f);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ f(g gVar, a aVar, e eVar, M7.e eVar2, i iVar, n nVar, int i8) {
        this((i8 & 1) != 0 ? new g(null, null, null, 7) : gVar, (i8 & 2) != 0 ? new a(null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, null, null, 0, null, null, null, false, null, false, null, null, null, null, false, null, -1, 8191) : aVar, (i8 & 4) != 0 ? new e(null, null, null, 7) : eVar, (i8 & 8) != 0 ? new M7.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143) : eVar2, (i8 & 16) != 0 ? new i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767) : null, (i8 & 32) != 0 ? new n(null, null, null, null, null, null, null, null, null, null, 1023) : nVar);
    }
}
