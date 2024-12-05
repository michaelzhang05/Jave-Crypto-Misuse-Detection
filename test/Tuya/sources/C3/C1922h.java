package c3;

import M5.AbstractC1246t;
import M5.N;
import b3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1922h implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14916b = new a(null);

    /* renamed from: c3.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private final o.d c(JSONObject jSONObject) {
        o.d.e.a aVar = o.d.e.f14521b;
        String string = jSONObject.getString("type");
        AbstractC3159y.h(string, "getString(...)");
        Locale locale = Locale.ROOT;
        String lowerCase = string.toLowerCase(locale);
        AbstractC3159y.h(lowerCase, "toLowerCase(...)");
        o.d.e a8 = aVar.a(lowerCase);
        o.d.EnumC0358d.a aVar2 = o.d.EnumC0358d.f14511b;
        String string2 = jSONObject.getString("state");
        AbstractC3159y.h(string2, "getString(...)");
        String lowerCase2 = string2.toLowerCase(locale);
        AbstractC3159y.h(lowerCase2, "toLowerCase(...)");
        return new o.d(a8, aVar2.a(lowerCase2));
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b3.o a(JSONObject json) {
        List m8;
        AbstractC3159y.i(json, "json");
        JSONObject optJSONObject = json.optJSONObject("consumer_session");
        if (optJSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("verification_sessions");
        if (optJSONArray != null) {
            d6.i s8 = d6.m.s(0, optJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1246t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((N) it).nextInt()));
            }
            m8 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                AbstractC3159y.f(jSONObject);
                o.d c8 = c(jSONObject);
                if (c8 != null) {
                    m8.add(c8);
                }
            }
        } else {
            m8 = AbstractC1246t.m();
        }
        List list = m8;
        String string = optJSONObject.getString("client_secret");
        AbstractC3159y.h(string, "getString(...)");
        String string2 = optJSONObject.getString("email_address");
        AbstractC3159y.h(string2, "getString(...)");
        String string3 = optJSONObject.getString("redacted_formatted_phone_number");
        AbstractC3159y.h(string3, "getString(...)");
        String string4 = optJSONObject.getString("redacted_phone_number");
        AbstractC3159y.h(string4, "getString(...)");
        return new b3.o(string, string2, string3, string4, list);
    }
}
