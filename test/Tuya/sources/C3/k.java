package c3;

import M5.AbstractC1246t;
import M5.N;
import androidx.core.app.NotificationCompat;
import b3.C1858C;
import b3.K;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class k implements InterfaceC3845a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f14919c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final l f14920b = new l();

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
    public b3.t a(JSONObject json) {
        C1858C c1858c;
        List m8;
        Integer num;
        String str;
        boolean z8;
        AbstractC3159y.i(json, "json");
        if (!AbstractC3159y.d("customer", v2.e.l(json, "object"))) {
            return null;
        }
        String l8 = v2.e.l(json, "id");
        String l9 = v2.e.l(json, "default_source");
        JSONObject optJSONObject = json.optJSONObject("shipping");
        if (optJSONObject != null) {
            c1858c = new y().a(optJSONObject);
        } else {
            c1858c = null;
        }
        JSONObject optJSONObject2 = json.optJSONObject("sources");
        if (optJSONObject2 != null && AbstractC3159y.d("list", v2.e.l(optJSONObject2, "object"))) {
            v2.e eVar = v2.e.f38789a;
            boolean f8 = eVar.f(optJSONObject2, "has_more");
            Integer i8 = eVar.i(optJSONObject2, "total_count");
            String l10 = v2.e.l(optJSONObject2, "url");
            JSONArray optJSONArray = optJSONObject2.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            d6.i s8 = d6.m.s(0, optJSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList(AbstractC1246t.x(s8, 10));
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(((N) it).nextInt()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (JSONObject jSONObject : arrayList) {
                l lVar = this.f14920b;
                AbstractC3159y.f(jSONObject);
                com.stripe.android.model.g a8 = lVar.a(jSONObject);
                if (a8 != null) {
                    arrayList2.add(a8);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((com.stripe.android.model.g) obj).b() != K.f14371c) {
                    arrayList3.add(obj);
                }
            }
            num = i8;
            str = l10;
            m8 = arrayList3;
            z8 = f8;
        } else {
            m8 = AbstractC1246t.m();
            num = null;
            str = null;
            z8 = false;
        }
        return new b3.t(l8, l9, c1858c, m8, z8, num, str, v2.e.l(json, "description"), v2.e.l(json, NotificationCompat.CATEGORY_EMAIL), json.optBoolean("livemode", false));
    }
}
