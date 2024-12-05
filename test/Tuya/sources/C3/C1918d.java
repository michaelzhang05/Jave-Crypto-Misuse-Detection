package c3;

import b3.C1869d;
import b3.EnumC1870e;
import b3.EnumC1871f;
import b3.K;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1918d implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14911b = new a(null);

    /* renamed from: c3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1869d a(JSONObject json) {
        int i8;
        Integer num;
        Integer num2;
        AbstractC3159y.i(json, "json");
        if (!AbstractC3159y.d("card", json.optString("object"))) {
            return null;
        }
        v2.e eVar = v2.e.f38789a;
        Integer i9 = eVar.i(json, "exp_month");
        int i10 = -1;
        if (i9 != null) {
            i8 = i9.intValue();
        } else {
            i8 = -1;
        }
        Integer valueOf = Integer.valueOf(i8);
        int intValue = valueOf.intValue();
        if (intValue >= 1 && intValue <= 12) {
            num = valueOf;
        } else {
            num = null;
        }
        Integer i11 = eVar.i(json, "exp_year");
        if (i11 != null) {
            i10 = i11.intValue();
        }
        Integer valueOf2 = Integer.valueOf(i10);
        if (valueOf2.intValue() < 0) {
            num2 = null;
        } else {
            num2 = valueOf2;
        }
        String l8 = v2.e.l(json, "address_city");
        String l9 = v2.e.l(json, "address_line1");
        String l10 = v2.e.l(json, "address_line1_check");
        String l11 = v2.e.l(json, "address_line2");
        String l12 = v2.e.l(json, "address_country");
        String l13 = v2.e.l(json, "address_state");
        String l14 = v2.e.l(json, "address_zip");
        String l15 = v2.e.l(json, "address_zip_check");
        EnumC1870e a8 = C1869d.f14414v.a(v2.e.l(json, "brand"));
        String g8 = eVar.g(json, "country");
        String l16 = v2.e.l(json, "customer");
        String h8 = v2.e.h(json, "currency");
        String l17 = v2.e.l(json, "cvc_check");
        return new C1869d(num, num2, v2.e.l(json, "name"), l9, l10, l11, l8, l13, l14, l15, l12, v2.e.l(json, "last4"), a8, EnumC1871f.f14461b.a(v2.e.l(json, "funding")), v2.e.l(json, "fingerprint"), g8, h8, l16, l17, v2.e.l(json, "id"), K.f14370b.a(v2.e.l(json, "tokenization_method")));
    }
}
