package e3;

import P5.Q;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: k, reason: collision with root package name */
    private static final a f31554k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f31555a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31556b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f31557c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31558d;

    /* renamed from: e, reason: collision with root package name */
    private final L f31559e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31560f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31561g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31562h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f31563i;

    /* renamed from: j, reason: collision with root package name */
    private final String f31564j;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public s(String uniqueId, String str, Boolean bool, String str2, L l8, String str3, String str4, String str5, Integer num, String str6) {
        AbstractC3255y.i(uniqueId, "uniqueId");
        this.f31555a = uniqueId;
        this.f31556b = str;
        this.f31557c = bool;
        this.f31558d = str2;
        this.f31559e = l8;
        this.f31560f = str3;
        this.f31561g = str4;
        this.f31562h = str5;
        this.f31563i = num;
        this.f31564j = str6;
    }

    public final Map a() {
        String str;
        O5.r a8 = O5.x.a("unique_id", this.f31555a);
        O5.r a9 = O5.x.a("initial_institution", this.f31556b);
        O5.r a10 = O5.x.a("manual_entry_only", this.f31557c);
        O5.r a11 = O5.x.a("search_session", this.f31558d);
        L l8 = this.f31559e;
        if (l8 != null) {
            str = l8.b();
        } else {
            str = null;
        }
        return Q.k(a8, a9, a10, a11, O5.x.a("verification_method", str), O5.x.a("customer", this.f31561g), O5.x.a("on_behalf_of", this.f31562h), O5.x.a("hosted_surface", this.f31560f), O5.x.a(RewardPlus.AMOUNT, this.f31563i), O5.x.a("currency", this.f31564j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3255y.d(this.f31555a, sVar.f31555a) && AbstractC3255y.d(this.f31556b, sVar.f31556b) && AbstractC3255y.d(this.f31557c, sVar.f31557c) && AbstractC3255y.d(this.f31558d, sVar.f31558d) && this.f31559e == sVar.f31559e && AbstractC3255y.d(this.f31560f, sVar.f31560f) && AbstractC3255y.d(this.f31561g, sVar.f31561g) && AbstractC3255y.d(this.f31562h, sVar.f31562h) && AbstractC3255y.d(this.f31563i, sVar.f31563i) && AbstractC3255y.d(this.f31564j, sVar.f31564j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = this.f31555a.hashCode() * 31;
        String str = this.f31556b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode9 + hashCode) * 31;
        Boolean bool = this.f31557c;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f31558d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        L l8 = this.f31559e;
        if (l8 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l8.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f31560f;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str4 = this.f31561g;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.f31562h;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Integer num = this.f31563i;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str6 = this.f31564j;
        if (str6 != null) {
            i8 = str6.hashCode();
        }
        return i16 + i8;
    }

    public String toString() {
        return "CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId=" + this.f31555a + ", initialInstitution=" + this.f31556b + ", manualEntryOnly=" + this.f31557c + ", searchSession=" + this.f31558d + ", verificationMethod=" + this.f31559e + ", hostedSurface=" + this.f31560f + ", customer=" + this.f31561g + ", onBehalfOf=" + this.f31562h + ", amount=" + this.f31563i + ", currency=" + this.f31564j + ")";
    }
}
