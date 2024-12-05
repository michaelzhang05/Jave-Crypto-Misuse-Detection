package c3;

import b3.C1869d;
import b3.EnumC1870e;
import b3.EnumC1871f;
import b3.K;
import com.stripe.android.model.SourceTypeModel;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class z implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14979b = new a(null);

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
    public SourceTypeModel.Card a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        String l8 = v2.e.l(json, "address_line1_check");
        String l9 = v2.e.l(json, "address_zip_check");
        EnumC1870e a8 = C1869d.f14414v.a(v2.e.l(json, "brand"));
        String l10 = v2.e.l(json, "country");
        String l11 = v2.e.l(json, "cvc_check");
        String l12 = v2.e.l(json, "dynamic_last4");
        v2.e eVar = v2.e.f38789a;
        return new SourceTypeModel.Card(l8, l9, a8, l10, l11, l12, eVar.i(json, "exp_month"), eVar.i(json, "exp_year"), EnumC1871f.f14461b.a(v2.e.l(json, "funding")), v2.e.l(json, "last4"), SourceTypeModel.Card.ThreeDSecureStatus.f24115b.a(v2.e.l(json, "three_d_secure")), K.f14370b.a(v2.e.l(json, "tokenization_method")));
    }
}
