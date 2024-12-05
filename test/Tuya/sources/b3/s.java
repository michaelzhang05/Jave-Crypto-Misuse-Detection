package b3;

import M5.Q;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: k, reason: collision with root package name */
    private static final a f14548k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f14549a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14550b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f14551c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14552d;

    /* renamed from: e, reason: collision with root package name */
    private final L f14553e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14554f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14555g;

    /* renamed from: h, reason: collision with root package name */
    private final String f14556h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f14557i;

    /* renamed from: j, reason: collision with root package name */
    private final String f14558j;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public s(String uniqueId, String str, Boolean bool, String str2, L l8, String str3, String str4, String str5, Integer num, String str6) {
        AbstractC3159y.i(uniqueId, "uniqueId");
        this.f14549a = uniqueId;
        this.f14550b = str;
        this.f14551c = bool;
        this.f14552d = str2;
        this.f14553e = l8;
        this.f14554f = str3;
        this.f14555g = str4;
        this.f14556h = str5;
        this.f14557i = num;
        this.f14558j = str6;
    }

    public final Map a() {
        String str;
        L5.r a8 = L5.x.a("unique_id", this.f14549a);
        L5.r a9 = L5.x.a("initial_institution", this.f14550b);
        L5.r a10 = L5.x.a("manual_entry_only", this.f14551c);
        L5.r a11 = L5.x.a("search_session", this.f14552d);
        L l8 = this.f14553e;
        if (l8 != null) {
            str = l8.b();
        } else {
            str = null;
        }
        return Q.k(a8, a9, a10, a11, L5.x.a("verification_method", str), L5.x.a("customer", this.f14555g), L5.x.a("on_behalf_of", this.f14556h), L5.x.a("hosted_surface", this.f14554f), L5.x.a(RewardPlus.AMOUNT, this.f14557i), L5.x.a("currency", this.f14558j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3159y.d(this.f14549a, sVar.f14549a) && AbstractC3159y.d(this.f14550b, sVar.f14550b) && AbstractC3159y.d(this.f14551c, sVar.f14551c) && AbstractC3159y.d(this.f14552d, sVar.f14552d) && this.f14553e == sVar.f14553e && AbstractC3159y.d(this.f14554f, sVar.f14554f) && AbstractC3159y.d(this.f14555g, sVar.f14555g) && AbstractC3159y.d(this.f14556h, sVar.f14556h) && AbstractC3159y.d(this.f14557i, sVar.f14557i) && AbstractC3159y.d(this.f14558j, sVar.f14558j)) {
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
        int hashCode9 = this.f14549a.hashCode() * 31;
        String str = this.f14550b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode9 + hashCode) * 31;
        Boolean bool = this.f14551c;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f14552d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        L l8 = this.f14553e;
        if (l8 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l8.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f14554f;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str4 = this.f14555g;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.f14556h;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Integer num = this.f14557i;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str6 = this.f14558j;
        if (str6 != null) {
            i8 = str6.hashCode();
        }
        return i16 + i8;
    }

    public String toString() {
        return "CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId=" + this.f14549a + ", initialInstitution=" + this.f14550b + ", manualEntryOnly=" + this.f14551c + ", searchSession=" + this.f14552d + ", verificationMethod=" + this.f14553e + ", hostedSurface=" + this.f14554f + ", customer=" + this.f14555g + ", onBehalfOf=" + this.f14556h + ", amount=" + this.f14557i + ", currency=" + this.f14558j + ")";
    }
}
