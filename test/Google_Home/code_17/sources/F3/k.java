package f3;

import P5.AbstractC1378t;
import P5.N;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import e3.C2779C;
import e3.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class k implements InterfaceC4225a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f31894c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final l f31895b = new l();

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
    public e3.t a(JSONObject json) {
        C2779C c2779c;
        List m8;
        Integer num;
        String str;
        boolean z8;
        AbstractC3255y.i(json, "json");
        if (!AbstractC3255y.d("customer", y2.e.l(json, "object"))) {
            return null;
        }
        String l8 = y2.e.l(json, "id");
        String l9 = y2.e.l(json, "default_source");
        JSONObject optJSONObject = json.optJSONObject("shipping");
        if (optJSONObject != null) {
            c2779c = new y().a(optJSONObject);
        } else {
            c2779c = null;
        }
        JSONObject optJSONObject2 = json.optJSONObject("sources");
        if (optJSONObject2 != null && AbstractC3255y.d("list", y2.e.l(optJSONObject2, "object"))) {
            y2.e eVar = y2.e.f40920a;
            boolean f8 = eVar.f(optJSONObject2, "has_more");
            Integer i8 = eVar.i(optJSONObject2, "total_count");
            String l10 = y2.e.l(optJSONObject2, "url");
            JSONArray optJSONArray = optJSONObject2.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            g6.i s8 = g6.m.s(0, optJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1378t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((N) it).nextInt()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                l lVar = this.f31895b;
                AbstractC3255y.f(jSONObject);
                com.stripe.android.model.g a8 = lVar.a(jSONObject);
                if (a8 != null) {
                    arrayList2.add(a8);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((com.stripe.android.model.g) obj).a() != K.f31377c) {
                    arrayList3.add(obj);
                }
            }
            num = i8;
            str = l10;
            m8 = arrayList3;
            z8 = f8;
        } else {
            m8 = AbstractC1378t.m();
            num = null;
            str = null;
            z8 = false;
        }
        return new e3.t(l8, l9, c2779c, m8, z8, num, str, y2.e.l(json, "description"), y2.e.l(json, NotificationCompat.CATEGORY_EMAIL), json.optBoolean("livemode", false));
    }
}
