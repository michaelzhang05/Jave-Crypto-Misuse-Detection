package f3;

import com.stripe.android.model.SourceTypeModel;
import e3.C2790d;
import e3.EnumC2791e;
import e3.EnumC2792f;
import e3.K;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class z implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31954b = new a(null);

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
    public SourceTypeModel.Card a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        String l8 = y2.e.l(json, "address_line1_check");
        String l9 = y2.e.l(json, "address_zip_check");
        EnumC2791e a8 = C2790d.f31420v.a(y2.e.l(json, "brand"));
        String l10 = y2.e.l(json, "country");
        String l11 = y2.e.l(json, "cvc_check");
        String l12 = y2.e.l(json, "dynamic_last4");
        y2.e eVar = y2.e.f40920a;
        return new SourceTypeModel.Card(l8, l9, a8, l10, l11, l12, eVar.i(json, "exp_month"), eVar.i(json, "exp_year"), EnumC2792f.f31467b.a(y2.e.l(json, "funding")), y2.e.l(json, "last4"), SourceTypeModel.Card.ThreeDSecureStatus.f25170b.a(y2.e.l(json, "three_d_secure")), K.f31376b.a(y2.e.l(json, "tokenization_method")));
    }
}
