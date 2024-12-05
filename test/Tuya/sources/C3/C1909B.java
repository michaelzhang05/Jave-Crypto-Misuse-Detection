package c3;

import M5.AbstractC1246t;
import M5.N;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import b3.C1860E;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1909B implements InterfaceC3845a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f14894c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final b f14895b = new b();

    /* renamed from: c3.B$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: c3.B$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14896b = new a(null);

        /* renamed from: c3.B$b$a */
        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1860E.b a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            C1860E.b.EnumC0353b a8 = C1860E.b.EnumC0353b.f14290b.a(v2.e.l(json, "type"));
            if (a8 != null) {
                v2.e eVar = v2.e.f38789a;
                return new C1860E.b(a8, eVar.i(json, RewardPlus.AMOUNT), v2.e.l(json, "currency"), v2.e.l(json, "description"), eVar.i(json, "quantity"));
            }
            return null;
        }
    }

    /* renamed from: c3.B$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14897b = new a(null);

        /* renamed from: c3.B$c$a */
        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1860E.c a(JSONObject json) {
            com.stripe.android.model.a aVar;
            AbstractC3159y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            if (optJSONObject != null) {
                aVar = new C1916b().a(optJSONObject);
            } else {
                aVar = null;
            }
            return new C1860E.c(aVar, v2.e.l(json, "carrier"), v2.e.l(json, "name"), v2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE), v2.e.l(json, "tracking_number"));
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1860E a(JSONObject json) {
        C1860E.c cVar;
        AbstractC3159y.i(json, "json");
        JSONArray optJSONArray = json.optJSONArray("items");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        d6.i s8 = d6.m.s(0, optJSONArray.length());
        ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1246t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            arrayList.add(optJSONArray.optJSONObject(((N) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject : arrayList) {
            b bVar = this.f14895b;
            AbstractC3159y.f(jSONObject);
            C1860E.b a8 = bVar.a(jSONObject);
            if (a8 != null) {
                arrayList2.add(a8);
            }
        }
        Integer i8 = v2.e.f38789a.i(json, RewardPlus.AMOUNT);
        String l8 = v2.e.l(json, "currency");
        String l9 = v2.e.l(json, NotificationCompat.CATEGORY_EMAIL);
        JSONObject optJSONObject = json.optJSONObject("shipping");
        if (optJSONObject != null) {
            cVar = new c().a(optJSONObject);
        } else {
            cVar = null;
        }
        return new C1860E(i8, l8, l9, arrayList2, cVar);
    }
}
