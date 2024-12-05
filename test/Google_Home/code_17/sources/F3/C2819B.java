package f3;

import P5.AbstractC1378t;
import P5.N;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import e3.C2781E;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2819B implements InterfaceC4225a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f31869c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final b f31870b = new b();

    /* renamed from: f3.B$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: f3.B$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31871b = new a(null);

        /* renamed from: f3.B$b$a */
        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2781E.b a(JSONObject json) {
            AbstractC3255y.i(json, "json");
            C2781E.b.EnumC0721b a8 = C2781E.b.EnumC0721b.f31296b.a(y2.e.l(json, "type"));
            if (a8 != null) {
                y2.e eVar = y2.e.f40920a;
                return new C2781E.b(a8, eVar.i(json, RewardPlus.AMOUNT), y2.e.l(json, "currency"), y2.e.l(json, "description"), eVar.i(json, "quantity"));
            }
            return null;
        }
    }

    /* renamed from: f3.B$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31872b = new a(null);

        /* renamed from: f3.B$c$a */
        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2781E.c a(JSONObject json) {
            com.stripe.android.model.a aVar;
            AbstractC3255y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject("address");
            if (optJSONObject != null) {
                aVar = new C2826b().a(optJSONObject);
            } else {
                aVar = null;
            }
            return new C2781E.c(aVar, y2.e.l(json, "carrier"), y2.e.l(json, "name"), y2.e.l(json, HintConstants.AUTOFILL_HINT_PHONE), y2.e.l(json, "tracking_number"));
        }
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2781E a(JSONObject json) {
        C2781E.c cVar;
        AbstractC3255y.i(json, "json");
        JSONArray optJSONArray = json.optJSONArray("items");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        g6.i s8 = g6.m.s(0, optJSONArray.length());
        ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1378t.x(s8, 10));
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            arrayList.add(optJSONArray.optJSONObject(((N) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject : arrayList) {
            b bVar = this.f31870b;
            AbstractC3255y.f(jSONObject);
            C2781E.b a8 = bVar.a(jSONObject);
            if (a8 != null) {
                arrayList2.add(a8);
            }
        }
        Integer i8 = y2.e.f40920a.i(json, RewardPlus.AMOUNT);
        String l8 = y2.e.l(json, "currency");
        String l9 = y2.e.l(json, NotificationCompat.CATEGORY_EMAIL);
        JSONObject optJSONObject = json.optJSONObject("shipping");
        if (optJSONObject != null) {
            cVar = new c().a(optJSONObject);
        } else {
            cVar = null;
        }
        return new C2781E(i8, l8, l9, arrayList2, cVar);
    }
}
