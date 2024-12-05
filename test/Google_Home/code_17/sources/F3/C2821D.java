package f3;

import P5.AbstractC1378t;
import P5.N;
import P5.Q;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import e3.C2783G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2821D implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final b f31874b = new b(null);

    /* renamed from: f3.D$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final C0733a f31875b = new C0733a(null);

        /* renamed from: f3.D$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0733a {
            private C0733a() {
            }

            public /* synthetic */ C0733a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        @Override // z2.InterfaceC4225a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2783G.a a(JSONObject json) {
            List list;
            AbstractC3255y.i(json, "json");
            String l8 = y2.e.l(json, "threeDSServerTransID");
            String l9 = y2.e.l(json, "acsChallengeMandated");
            String l10 = y2.e.l(json, "acsSignedContent");
            String string = json.getString("acsTransID");
            String l11 = y2.e.l(json, "acsURL");
            String l12 = y2.e.l(json, "authenticationType");
            String l13 = y2.e.l(json, "cardholderInfo");
            String string2 = json.getString("messageType");
            String string3 = json.getString("messageVersion");
            String l14 = y2.e.l(json, "sdkTransID");
            String l15 = y2.e.l(json, "transStatus");
            JSONArray optJSONArray = json.optJSONArray("messageExtension");
            if (optJSONArray != null) {
                list = new c().c(optJSONArray);
            } else {
                list = null;
            }
            return new C2783G.a(l8, l9, l10, string, l11, l12, l13, list, string2, string3, l14, l15);
        }
    }

    /* renamed from: f3.D$b */
    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: f3.D$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31876b = new a(null);

        /* renamed from: f3.D$c$a */
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
        public C2783G.c a(JSONObject json) {
            Map h8;
            AbstractC3255y.i(json, "json");
            JSONObject optJSONObject = json.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONObject != null) {
                JSONArray names = optJSONObject.names();
                if (names == null) {
                    names = new JSONArray();
                }
                g6.i s8 = g6.m.s(0, names.length());
                ArrayList<String> arrayList = new ArrayList(AbstractC1378t.x(s8, 10));
                Iterator it = s8.iterator();
                while (it.hasNext()) {
                    arrayList.add(names.getString(((N) it).nextInt()));
                }
                ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
                for (String str : arrayList) {
                    arrayList2.add(Q.e(O5.x.a(str, optJSONObject.getString(str))));
                }
                h8 = Q.h();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    h8 = Q.q(h8, (Map) it2.next());
                }
            } else {
                h8 = Q.h();
            }
            return new C2783G.c(y2.e.l(json, "name"), json.optBoolean("criticalityIndicator"), y2.e.l(json, "id"), Q.y(h8));
        }

        public final List c(JSONArray jsonArray) {
            AbstractC3255y.i(jsonArray, "jsonArray");
            g6.i s8 = g6.m.s(0, jsonArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = jsonArray.optJSONObject(((N) it).nextInt());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a((JSONObject) it2.next()));
            }
            return arrayList2;
        }
    }

    /* renamed from: f3.D$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC4225a {

        /* renamed from: b, reason: collision with root package name */
        private static final a f31877b = new a(null);

        /* renamed from: f3.D$d$a */
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
        public C2783G.d a(JSONObject json) {
            AbstractC3255y.i(json, "json");
            return new C2783G.d(json.getString("threeDSServerTransID"), y2.e.l(json, "acsTransID"), y2.e.l(json, "dsTransID"), json.getString("errorCode"), json.getString("errorComponent"), json.getString("errorDescription"), json.getString("errorDetail"), y2.e.l(json, "errorMessageType"), json.getString("messageType"), json.getString("messageVersion"), y2.e.l(json, "sdkTransID"));
        }
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2783G a(JSONObject json) {
        C2783G.a aVar;
        AbstractC3255y.i(json, "json");
        String string = json.getString("id");
        long j8 = json.getLong("created");
        boolean z8 = json.getBoolean("livemode");
        String string2 = json.getString("source");
        String optString = json.optString("state");
        JSONObject optJSONObject = json.optJSONObject("ares");
        C2783G.d dVar = null;
        if (optJSONObject != null) {
            aVar = new a().a(optJSONObject);
        } else {
            aVar = null;
        }
        JSONObject optJSONObject2 = json.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ERROR);
        if (optJSONObject2 != null) {
            dVar = new d().a(optJSONObject2);
        }
        return new C2783G(string, aVar, Long.valueOf(j8), string2, optString, z8, dVar, y2.e.l(json, "fallback_redirect_url"), y2.e.l(json, "creq"));
    }
}
