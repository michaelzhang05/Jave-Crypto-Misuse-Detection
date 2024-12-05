package f3;

import P5.AbstractC1378t;
import P5.N;
import e3.C2797k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2830f implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2830f f31889b = new C2830f();

    private C2830f() {
    }

    private final C2797k.e c(JSONObject jSONObject) {
        String l8 = y2.e.l(jSONObject, "type");
        if (l8 == null) {
            return null;
        }
        String lowerCase = l8.toLowerCase(Locale.ROOT);
        AbstractC3255y.h(lowerCase, "toLowerCase(...)");
        if (AbstractC3255y.d(lowerCase, "card")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("card_details");
            String string = jSONObject.getString("id");
            AbstractC3255y.h(string, "getString(...)");
            String string2 = jSONObject2.getString("last4");
            AbstractC3255y.h(string2, "getString(...)");
            return new C2797k.b(string, string2);
        }
        if (!AbstractC3255y.d(lowerCase, "bank_account")) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("bank_account_details");
        String string3 = jSONObject.getString("id");
        AbstractC3255y.h(string3, "getString(...)");
        String string4 = jSONObject3.getString("last4");
        AbstractC3255y.h(string4, "getString(...)");
        return new C2797k.a(string3, string4, y2.e.l(jSONObject3, "bank_name"));
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2797k a(JSONObject json) {
        List m8;
        C2797k.e c8;
        AbstractC3255y.i(json, "json");
        JSONArray optJSONArray = json.optJSONArray("redacted_payment_details");
        if (optJSONArray != null) {
            g6.i s8 = g6.m.s(0, optJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1378t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((N) it).nextInt()));
            }
            m8 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                C2830f c2830f = f31889b;
                AbstractC3255y.f(jSONObject);
                C2797k.e c9 = c2830f.c(jSONObject);
                if (c9 != null) {
                    m8.add(c9);
                }
            }
        } else {
            JSONObject optJSONObject = json.optJSONObject("redacted_payment_details");
            if (optJSONObject != null && (c8 = f31889b.c(optJSONObject)) != null) {
                m8 = AbstractC1378t.e(c8);
            } else {
                m8 = AbstractC1378t.m();
            }
        }
        return new C2797k(m8);
    }
}
