package f3;

import P5.AbstractC1378t;
import com.stripe.android.model.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class n implements InterfaceC4225a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f31902f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f31903b;

    /* renamed from: c, reason: collision with root package name */
    private final i.b.C0498b f31904c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31905d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f31906e;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public n(String str, i.b.C0498b setupMode, String apiKey, Function0 timeProvider) {
        AbstractC3255y.i(setupMode, "setupMode");
        AbstractC3255y.i(apiKey, "apiKey");
        AbstractC3255y.i(timeProvider, "timeProvider");
        this.f31903b = str;
        this.f31904c = setupMode;
        this.f31905d = apiKey;
        this.f31906e = timeProvider;
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.u a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        InterfaceC4225a.C0936a c0936a = InterfaceC4225a.f41117a;
        List a8 = c0936a.a(json.optJSONArray("payment_method_types"));
        List a9 = c0936a.a(json.optJSONArray("unactivated_payment_method_types"));
        List a10 = c0936a.a(json.optJSONArray("link_funding_sources"));
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(a10, 10));
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            AbstractC3255y.h(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        String l8 = y2.e.l(json, "country_code");
        return new com.stripe.android.model.u(this.f31903b, null, ((Number) this.f31906e.invoke()).longValue(), l8, null, null, j6.n.H(this.f31905d, "live", false, 2, null), null, null, a8, null, this.f31904c.G(), null, a9, arrayList, null, null, 69760, null);
    }
}
