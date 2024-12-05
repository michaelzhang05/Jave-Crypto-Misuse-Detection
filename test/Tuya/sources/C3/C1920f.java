package c3;

import M5.AbstractC1246t;
import M5.N;
import b3.C1876k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1920f implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    public static final C1920f f14914b = new C1920f();

    private C1920f() {
    }

    private final C1876k.e c(JSONObject jSONObject) {
        String l8 = v2.e.l(jSONObject, "type");
        if (l8 == null) {
            return null;
        }
        String lowerCase = l8.toLowerCase(Locale.ROOT);
        AbstractC3159y.h(lowerCase, "toLowerCase(...)");
        if (AbstractC3159y.d(lowerCase, "card")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("card_details");
            String string = jSONObject.getString("id");
            AbstractC3159y.h(string, "getString(...)");
            String string2 = jSONObject2.getString("last4");
            AbstractC3159y.h(string2, "getString(...)");
            return new C1876k.b(string, string2);
        }
        if (!AbstractC3159y.d(lowerCase, "bank_account")) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("bank_account_details");
        String string3 = jSONObject.getString("id");
        AbstractC3159y.h(string3, "getString(...)");
        String string4 = jSONObject3.getString("last4");
        AbstractC3159y.h(string4, "getString(...)");
        return new C1876k.a(string3, string4, v2.e.l(jSONObject3, "bank_name"));
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1876k a(JSONObject json) {
        List m8;
        C1876k.e c8;
        AbstractC3159y.i(json, "json");
        JSONArray optJSONArray = json.optJSONArray("redacted_payment_details");
        if (optJSONArray != null) {
            d6.i s8 = d6.m.s(0, optJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1246t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((N) it).nextInt()));
            }
            m8 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                C1920f c1920f = f14914b;
                AbstractC3159y.f(jSONObject);
                C1876k.e c9 = c1920f.c(jSONObject);
                if (c9 != null) {
                    m8.add(c9);
                }
            }
        } else {
            JSONObject optJSONObject = json.optJSONObject("redacted_payment_details");
            if (optJSONObject != null && (c8 = f14914b.c(optJSONObject)) != null) {
                m8 = AbstractC1246t.e(c8);
            } else {
                m8 = AbstractC1246t.m();
            }
        }
        return new C1876k(m8);
    }
}
