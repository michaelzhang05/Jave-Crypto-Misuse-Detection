package f3;

import e3.C2790d;
import e3.EnumC2791e;
import e3.EnumC2792f;
import e3.K;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2828d implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31886b = new a(null);

    /* renamed from: f3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2790d a(JSONObject json) {
        int i8;
        Integer num;
        Integer num2;
        AbstractC3255y.i(json, "json");
        if (!AbstractC3255y.d("card", json.optString("object"))) {
            return null;
        }
        y2.e eVar = y2.e.f40920a;
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
        String l8 = y2.e.l(json, "address_city");
        String l9 = y2.e.l(json, "address_line1");
        String l10 = y2.e.l(json, "address_line1_check");
        String l11 = y2.e.l(json, "address_line2");
        String l12 = y2.e.l(json, "address_country");
        String l13 = y2.e.l(json, "address_state");
        String l14 = y2.e.l(json, "address_zip");
        String l15 = y2.e.l(json, "address_zip_check");
        EnumC2791e a8 = C2790d.f31420v.a(y2.e.l(json, "brand"));
        String g8 = eVar.g(json, "country");
        String l16 = y2.e.l(json, "customer");
        String h8 = y2.e.h(json, "currency");
        String l17 = y2.e.l(json, "cvc_check");
        return new C2790d(num, num2, y2.e.l(json, "name"), l9, l10, l11, l8, l13, l14, l15, l12, y2.e.l(json, "last4"), a8, EnumC2792f.f31467b.a(y2.e.l(json, "funding")), y2.e.l(json, "fingerprint"), g8, h8, l16, l17, y2.e.l(json, "id"), K.f31376b.a(y2.e.l(json, "tokenization_method")));
    }
}
