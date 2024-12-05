package a5;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: a5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1638e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14124d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f14125a;

    /* renamed from: b, reason: collision with root package name */
    private String f14126b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f14127c;

    /* renamed from: a5.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public final ArrayList a() {
        return this.f14127c;
    }

    public final String b() {
        return this.f14126b;
    }

    public final String c() {
        return this.f14125a;
    }

    public final void d(JSONObject jsonData) {
        AbstractC3255y.i(jsonData, "jsonData");
        if (!jsonData.isNull(CampaignEx.JSON_KEY_TITLE)) {
            this.f14125a = jsonData.getString(CampaignEx.JSON_KEY_TITLE);
        }
        if (!jsonData.isNull("description")) {
            this.f14126b = jsonData.getString("description");
        }
        if (!jsonData.isNull("apps")) {
            JSONArray jSONArray = jsonData.getJSONArray("apps");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                C1641h c1641h = new C1641h();
                JSONObject jsonObjectApp = jSONArray.getJSONObject(i8);
                AbstractC3255y.h(jsonObjectApp, "jsonObjectApp");
                c1641h.a(jsonObjectApp);
                arrayList.add(c1641h);
            }
            this.f14127c = arrayList;
        }
    }
}
