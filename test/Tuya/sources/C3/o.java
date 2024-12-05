package c3;

import M5.AbstractC1246t;
import M5.N;
import M5.Q;
import b3.v;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.i;
import com.stripe.android.model.j;
import com.stripe.android.model.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class o implements InterfaceC3845a {

    /* renamed from: e, reason: collision with root package name */
    public static final b f14932e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f14933f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final v f14934g = new v();

    /* renamed from: b, reason: collision with root package name */
    private final b3.v f14935b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14936c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f14937d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14938a = new a();

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

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public o(b3.v params, String apiKey, Function0 timeProvider) {
        AbstractC3159y.i(params, "params");
        AbstractC3159y.i(apiKey, "apiKey");
        AbstractC3159y.i(timeProvider, "timeProvider");
        this.f14935b = params;
        this.f14936c = apiKey;
        this.f14937d = timeProvider;
    }

    private final boolean c(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("card_brand_choice");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean("eligible", false);
    }

    private final j.c.a d(JSONObject jSONObject) {
        j.c.a.InterfaceC0508c i8;
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
            d6.i s8 = d6.m.s(0, optJSONArray.length());
            m8 = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                int nextInt = ((N) it).nextInt();
                v vVar = f14934g;
                JSONObject optJSONObject = optJSONArray.optJSONObject(nextInt);
                AbstractC3159y.h(optJSONObject, "optJSONObject(...)");
                com.stripe.android.model.o a8 = vVar.a(optJSONObject);
                if (a8 != null) {
                    m8.add(a8);
                }
            }
        } else {
            m8 = AbstractC1246t.m();
        }
        j.c.C0512c f8 = f(jSONObject.optJSONObject("customer_session"));
        if (f8 == null) {
            return null;
        }
        String optString = jSONObject.optString("default_payment_method");
        AbstractC3159y.f(optString);
        if (!g6.n.u(optString)) {
            str = optString;
        }
        return new j.c(m8, str, f8);
    }

    private final j.c.C0512c f(JSONObject jSONObject) {
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
        return new j.c.C0512c(optString, optBoolean, optString2, optInt, optString3, d8);
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
            return new j.c.a.b.C0506b(AbstractC3159y.d(optJSONObject.optString("payment_method_remove"), "enabled"));
        }
        return j.c.a.b.C0504a.f24287a;
    }

    private final Map h(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        AbstractC3159y.h(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof Boolean) {
                AbstractC3159y.f(next);
                linkedHashMap.put(next, obj);
            }
        }
        return Q.y(linkedHashMap);
    }

    private final j.c.a.InterfaceC0508c i(JSONObject jSONObject) {
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
            Iterator<E> it = o.b.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC3159y.d(((o.b) next).e(), optString3)) {
                    obj = next;
                    break;
                }
            }
            return new j.c.a.InterfaceC0508c.b(AbstractC3159y.d(optString, "enabled"), AbstractC3159y.d(optString2, "enabled"), (o.b) obj);
        }
        return j.c.a.InterfaceC0508c.C0509a.f24289a;
    }

    private final StripeIntent j(String str, JSONObject jSONObject, JSONArray jSONArray, List list, JSONArray jSONArray2, String str2) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            jSONObject2 = jSONObject.optJSONObject(this.f14935b.getType());
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
        b3.v vVar = this.f14935b;
        if (vVar instanceof v.b) {
            return new u().a(jSONObject2);
        }
        if (vVar instanceof v.c) {
            return new x().a(jSONObject2);
        }
        if (vVar instanceof v.a) {
            i.b b8 = ((v.a) vVar).b().b();
            if (b8 instanceof i.b.a) {
                return new m(str, (i.b.a) ((v.a) this.f14935b).b().b(), this.f14936c, this.f14937d).a(jSONObject2);
            }
            if (b8 instanceof i.b.C0502b) {
                return new n(str, (i.b.C0502b) ((v.a) this.f14935b).b().b(), this.f14936c, this.f14937d).a(jSONObject2);
            }
            throw new L5.p();
        }
        throw new L5.p();
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.stripe.android.model.j a(JSONObject json) {
        String str;
        String str2;
        JSONArray jSONArray;
        boolean z8;
        boolean z9;
        Map h8;
        AbstractC3159y.i(json, "json");
        v2.e eVar = v2.e.f38789a;
        JSONObject d8 = eVar.d(eVar.k(json, "payment_method_preference"));
        String l8 = v2.e.l(d8, "object");
        if (d8 == null || !AbstractC3159y.d("payment_method_preference", l8)) {
            return null;
        }
        String optString = d8.optString("country_code");
        List a8 = InterfaceC3845a.f38994a.a(json.optJSONArray("unactivated_payment_method_types"));
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(a8, 10));
        Iterator it = a8.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            AbstractC3159y.h(lowerCase, "toLowerCase(...)");
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
        AbstractC3159y.f(optString);
        StripeIntent j8 = j(optString2, d8, optJSONArray3, arrayList, jSONArray, optString);
        String optString3 = json.optString("merchant_country");
        boolean c8 = c(json);
        String optString4 = json.optString("google_pay_preference");
        if (j8 == null) {
            return null;
        }
        return new com.stripe.android.model.j(new j.d(InterfaceC3845a.f38994a.a(jSONArray), z8, map, z9), str, str2, j8, e8, optString3, c8, !AbstractC3159y.d(optString4, "disabled"), null, 256, null);
    }

    public /* synthetic */ o(b3.v vVar, String str, Function0 function0, int i8, AbstractC3151p abstractC3151p) {
        this(vVar, str, (i8 & 4) != 0 ? a.f14938a : function0);
    }
}
