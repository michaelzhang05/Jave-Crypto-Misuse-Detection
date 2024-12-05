package c3;

import M5.AbstractC1246t;
import M5.N;
import M5.Q;
import b3.C1862G;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1911D implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final b f14899b = new b(null);

    /* renamed from: c3.D$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final C0367a f14900b = new C0367a(null);

        /* renamed from: c3.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0367a {
            private C0367a() {
            }

            public /* synthetic */ C0367a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        @Override // w2.InterfaceC3845a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1862G.a a(JSONObject json) {
            List list;
            AbstractC3159y.i(json, "json");
            String l8 = v2.e.l(json, "threeDSServerTransID");
            String l9 = v2.e.l(json, "acsChallengeMandated");
            String l10 = v2.e.l(json, "acsSignedContent");
            String string = json.getString("acsTransID");
            String l11 = v2.e.l(json, "acsURL");
            String l12 = v2.e.l(json, "authenticationType");
            String l13 = v2.e.l(json, "cardholderInfo");
            String string2 = json.getString("messageType");
            String string3 = json.getString("messageVersion");
            String l14 = v2.e.l(json, "sdkTransID");
            String l15 = v2.e.l(json, "transStatus");
            JSONArray optJSONArray = json.optJSONArray("messageExtension");
            if (optJSONArray != null) {
                list = new c().c(optJSONArray);
            } else {
                list = null;
            }
            return new C1862G.a(l8, l9, l10, string, l11, l12, l13, list, string2, string3, l14, l15);
        }
    }

    /* renamed from: c3.D$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: c3.D$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14901b = new a(null);

        /* renamed from: c3.D$c$a */
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
        public C1862G.c a(JSONObject json) {
            Map h8;
            AbstractC3159y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null) {
                JSONArray names = optJSONObject.names();
                if (names == null) {
                    names = new JSONArray();
                }
                d6.i s8 = d6.m.s(0, names.length());
                ArrayList<String> arrayList = new ArrayList(AbstractC1246t.x(s8, 10));
                Iterator it = s8.iterator();
                while (it.hasNext()) {
                    arrayList.add(names.getString(((N) it).nextInt()));
                }
                ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
                for (String str : arrayList) {
                    arrayList2.add(Q.e(L5.x.a(str, optJSONObject.getString(str))));
                }
                h8 = Q.h();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    h8 = Q.q(h8, (Map) it2.next());
                }
            } else {
                h8 = Q.h();
            }
            return new C1862G.c(v2.e.l(json, "name"), json.optBoolean("criticalityIndicator"), v2.e.l(json, "id"), Q.y(h8));
        }

        public final List c(JSONArray jsonArray) {
            AbstractC3159y.i(jsonArray, "jsonArray");
            d6.i s8 = d6.m.s(0, jsonArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = jsonArray.optJSONObject(((N) it).nextInt());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a((JSONObject) it2.next()));
            }
            return arrayList2;
        }
    }

    /* renamed from: c3.D$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC3845a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f14902b = new a(null);

        /* renamed from: c3.D$d$a */
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
        public C1862G.d a(JSONObject json) {
            AbstractC3159y.i(json, "json");
            return new C1862G.d(json.getString("threeDSServerTransID"), v2.e.l(json, "acsTransID"), v2.e.l(json, "dsTransID"), json.getString("errorCode"), json.getString("errorComponent"), json.getString("errorDescription"), json.getString("errorDetail"), v2.e.l(json, "errorMessageType"), json.getString("messageType"), json.getString("messageVersion"), v2.e.l(json, "sdkTransID"));
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1862G a(JSONObject json) {
        C1862G.a aVar;
        AbstractC3159y.i(json, "json");
        String string = json.getString("id");
        long j8 = json.getLong("created");
        boolean z8 = json.getBoolean("livemode");
        String string2 = json.getString("source");
        String optString = json.optString("state");
        JSONObject optJSONObject = json.optJSONObject("ares");
        C1862G.d dVar = null;
        if (optJSONObject != null) {
            aVar = new a().a(optJSONObject);
        } else {
            aVar = null;
        }
        JSONObject optJSONObject2 = json.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ERROR);
        if (optJSONObject2 != null) {
            dVar = new d().a(optJSONObject2);
        }
        return new C1862G(string, aVar, Long.valueOf(j8), string2, optString, z8, dVar, v2.e.l(json, "fallback_redirect_url"), v2.e.l(json, "creq"));
    }
}
