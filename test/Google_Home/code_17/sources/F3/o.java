package f3;

import P5.AbstractC1378t;
import P5.N;
import P5.Q;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.i;
import com.stripe.android.model.j;
import com.stripe.android.model.o;
import e3.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class o implements InterfaceC4225a {

    /* renamed from: e, reason: collision with root package name */
    public static final b f31907e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f31908f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final v f31909g = new v();

    /* renamed from: b, reason: collision with root package name */
    private final e3.v f31910b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31911c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f31912d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31913a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public o(e3.v params, String apiKey, Function0 timeProvider) {
        AbstractC3255y.i(params, "params");
        AbstractC3255y.i(apiKey, "apiKey");
        AbstractC3255y.i(timeProvider, "timeProvider");
        this.f31910b = params;
        this.f31911c = apiKey;
        this.f31912d = timeProvider;
    }

    private final boolean c(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("card_brand_choice");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean("eligible", false);
    }

    private final j.c.a d(JSONObject jSONObject) {
        j.c.a.InterfaceC0504c i8;
        j.c.a.b g8;
        if (jSONObject == null || (i8 = i(jSONObject.optJSONObject("mobile_payment_element"))) == null || (g8 = g(jSONObject.optJSONObject("customer_sheet"))) == null) {
            return null;
        }
        return new j.c.a(i8, g8);
    }

    private final j.c e(JSONObject jSONObject) {
        List m8;
        String str = null;
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("payment_methods");
        if (optJSONArray != null) {
            g6.i s8 = g6.m.s(0, optJSONArray.length());
            m8 = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                int nextInt = ((N) it).nextInt();
                v vVar = f31909g;
                JSONObject optJSONObject = optJSONArray.optJSONObject(nextInt);
                AbstractC3255y.h(optJSONObject, "optJSONObject(...)");
                com.stripe.android.model.o a8 = vVar.a(optJSONObject);
                if (a8 != null) {
                    m8.add(a8);
                }
            }
        } else {
            m8 = AbstractC1378t.m();
        }
        j.c.C0508c f8 = f(jSONObject.optJSONObject("customer_session"));
        if (f8 == null) {
            return null;
        }
        String optString = jSONObject.optString("default_payment_method");
        AbstractC3255y.f(optString);
        if (!j6.n.u(optString)) {
            str = optString;
        }
        return new j.c(m8, str, f8);
    }

    private final j.c.C0508c f(JSONObject jSONObject) {
        String optString;
        j.c.a d8;
        if (jSONObject == null || (optString = jSONObject.optString("id")) == null) {
            return null;
        }
        boolean optBoolean = jSONObject.optBoolean("livemode");
        String optString2 = jSONObject.optString("api_key");
        if (optString2 == null) {
            return null;
        }
        int optInt = jSONObject.optInt("api_key_expiry");
        String optString3 = jSONObject.optString("customer");
        if (optString3 == null || (d8 = d(jSONObject.optJSONObject("components"))) == null) {
            return null;
        }
        return new j.c.C0508c(optString, optBoolean, optString2, optInt, optString3, d8);
    }

    private final j.c.a.b g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.optBoolean("enabled")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            if (optJSONObject == null) {
                return null;
            }
            return new j.c.a.b.C0502b(AbstractC3255y.d(optJSONObject.optString("payment_method_remove"), "enabled"));
        }
        return j.c.a.b.C0500a.f25342a;
    }

    private final Map h(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        AbstractC3255y.h(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Boolean) {
                AbstractC3255y.f(next);
                linkedHashMap.put(next, obj);
            }
        }
        return Q.y(linkedHashMap);
    }

    private final j.c.a.InterfaceC0504c i(JSONObject jSONObject) {
        Object obj = null;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.optBoolean("enabled")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("features");
            if (optJSONObject == null) {
                return null;
            }
            String optString = optJSONObject.optString("payment_method_save");
            String optString2 = optJSONObject.optString("payment_method_remove");
            String optString3 = optJSONObject.optString("payment_method_save_allow_redisplay_override");
            Iterator<E> it = o.b.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC3255y.d(((o.b) next).g(), optString3)) {
                    obj = next;
                    break;
                }
            }
            return new j.c.a.InterfaceC0504c.b(AbstractC3255y.d(optString, "enabled"), AbstractC3255y.d(optString2, "enabled"), (o.b) obj);
        }
        return j.c.a.InterfaceC0504c.C0505a.f25344a;
    }

    private final StripeIntent j(String str, JSONObject jSONObject, JSONArray jSONArray, List list, JSONArray jSONArray2, String str2) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            jSONObject2 = jSONObject.optJSONObject(this.f31910b.getType());
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONArray != null) {
            jSONObject2.put("payment_method_types", jSONArray);
        }
        jSONObject2.put("unactivated_payment_method_types", list);
        jSONObject2.put("link_funding_sources", jSONArray2);
        jSONObject2.put("country_code", str2);
        e3.v vVar = this.f31910b;
        if (vVar instanceof v.b) {
            return new u().a(jSONObject2);
        }
        if (vVar instanceof v.c) {
            return new x().a(jSONObject2);
        }
        if (vVar instanceof v.a) {
            i.b a8 = ((v.a) vVar).a().a();
            if (a8 instanceof i.b.a) {
                return new m(str, (i.b.a) ((v.a) this.f31910b).a().a(), this.f31911c, this.f31912d).a(jSONObject2);
            }
            if (a8 instanceof i.b.C0498b) {
                return new n(str, (i.b.C0498b) ((v.a) this.f31910b).a().a(), this.f31911c, this.f31912d).a(jSONObject2);
            }
            throw new O5.p();
        }
        throw new O5.p();
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.j a(JSONObject json) {
        String str;
        String str2;
        JSONArray jSONArray;
        boolean z8;
        boolean z9;
        Map h8;
        AbstractC3255y.i(json, "json");
        y2.e eVar = y2.e.f40920a;
        JSONObject d8 = eVar.d(eVar.k(json, "payment_method_preference"));
        String l8 = y2.e.l(d8, "object");
        if (d8 == null || !AbstractC3255y.d("payment_method_preference", l8)) {
            return null;
        }
        String optString = d8.optString("country_code");
        List a8 = InterfaceC4225a.f41117a.a(json.optJSONArray("unactivated_payment_method_types"));
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(a8, 10));
        Iterator it = a8.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            AbstractC3255y.h(lowerCase, "toLowerCase(...)");
            arrayList.add(lowerCase);
        }
        JSONArray optJSONArray = json.optJSONArray("payment_method_specs");
        if (optJSONArray != null) {
            str = optJSONArray.toString();
        } else {
            str = null;
        }
        JSONArray optJSONArray2 = json.optJSONArray("external_payment_method_data");
        if (optJSONArray2 != null) {
            str2 = optJSONArray2.toString();
        } else {
            str2 = null;
        }
        JSONObject optJSONObject = json.optJSONObject("link_settings");
        if (optJSONObject != null) {
            jSONArray = optJSONObject.optJSONArray("link_funding_sources");
        } else {
            jSONArray = null;
        }
        JSONObject optJSONObject2 = json.optJSONObject("link_settings");
        if (optJSONObject2 != null) {
            z8 = optJSONObject2.optBoolean("link_passthrough_mode_enabled");
        } else {
            z8 = false;
        }
        JSONObject optJSONObject3 = json.optJSONObject("link_settings");
        if (optJSONObject3 != null) {
            z9 = optJSONObject3.optBoolean("link_mobile_disable_signup");
        } else {
            z9 = false;
        }
        JSONObject optJSONObject4 = json.optJSONObject("link_settings");
        if (optJSONObject4 == null || (h8 = h(optJSONObject4)) == null) {
            h8 = Q.h();
        }
        Map map = h8;
        JSONArray optJSONArray3 = d8.optJSONArray("ordered_payment_method_types");
        String optString2 = json.optString("session_id");
        j.c e8 = e(json.optJSONObject("customer"));
        AbstractC3255y.f(optString);
        StripeIntent j8 = j(optString2, d8, optJSONArray3, arrayList, jSONArray, optString);
        String optString3 = json.optString("merchant_country");
        boolean c8 = c(json);
        String optString4 = json.optString("google_pay_preference");
        if (j8 == null) {
            return null;
        }
        return new com.stripe.android.model.j(new j.d(InterfaceC4225a.f41117a.a(jSONArray), z8, map, z9), str, str2, j8, e8, optString3, c8, !AbstractC3255y.d(optString4, "disabled"), null, 256, null);
    }

    public /* synthetic */ o(e3.v vVar, String str, Function0 function0, int i8, AbstractC3247p abstractC3247p) {
        this(vVar, str, (i8 & 4) != 0 ? a.f31913a : function0);
    }
}