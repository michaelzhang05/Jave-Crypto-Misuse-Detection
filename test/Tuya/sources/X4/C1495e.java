package X4;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X4.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1495e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f12503d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f12504a;

    /* renamed from: b, reason: collision with root package name */
    private String f12505b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f12506c;

    /* renamed from: X4.e$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final ArrayList a() {
        return this.f12506c;
    }

    public final String b() {
        return this.f12505b;
    }

    public final String c() {
        return this.f12504a;
    }

    public final void d(JSONObject jsonData) {
        AbstractC3159y.i(jsonData, "jsonData");
        if (!jsonData.isNull(CampaignEx.JSON_KEY_TITLE)) {
            this.f12504a = jsonData.getString(CampaignEx.JSON_KEY_TITLE);
        }
        if (!jsonData.isNull("description")) {
            this.f12505b = jsonData.getString("description");
        }
        if (!jsonData.isNull("apps")) {
            JSONArray jSONArray = jsonData.getJSONArray("apps");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                C1498h c1498h = new C1498h();
                JSONObject jsonObjectApp = jSONArray.getJSONObject(i8);
                AbstractC3159y.h(jsonObjectApp, "jsonObjectApp");
                c1498h.b(jsonObjectApp);
                arrayList.add(c1498h);
            }
            this.f12506c = arrayList;
        }
    }
}
