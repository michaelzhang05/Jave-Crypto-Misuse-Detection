package X4;

import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private long f12317a;

    /* renamed from: b, reason: collision with root package name */
    private String f12318b;

    /* renamed from: c, reason: collision with root package name */
    private String f12319c;

    /* renamed from: d, reason: collision with root package name */
    private String f12320d;

    /* renamed from: e, reason: collision with root package name */
    private String f12321e;

    /* renamed from: f, reason: collision with root package name */
    private String f12322f;

    /* renamed from: g, reason: collision with root package name */
    private String f12323g;

    /* renamed from: h, reason: collision with root package name */
    private String f12324h;

    /* renamed from: i, reason: collision with root package name */
    private String f12325i;

    /* renamed from: j, reason: collision with root package name */
    private long f12326j;

    /* renamed from: k, reason: collision with root package name */
    private C1498h f12327k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f12328l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f12329m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f12330n = new ArrayList();

    public final String a() {
        return this.f12325i;
    }

    public final ArrayList b() {
        return this.f12329m;
    }

    public final String c() {
        return this.f12323g;
    }

    public final String d() {
        if (this.f12323g != null) {
            return this.f12323g + UptodownApp.f28003B.r() + ":webp";
        }
        return null;
    }

    public final String e() {
        return this.f12324h;
    }

    public final ArrayList f() {
        return this.f12328l;
    }

    public final String g() {
        return this.f12321e;
    }

    public final C1498h h() {
        return this.f12327k;
    }

    public final ArrayList i() {
        return this.f12330n;
    }

    public final String j() {
        return this.f12318b;
    }

    public final String k() {
        return this.f12322f;
    }

    public final String l() {
        return this.f12320d;
    }

    public final String m() {
        return this.f12319c;
    }

    public final ArrayList n(JSONArray jsonArray) {
        AbstractC3159y.i(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            C1498h c1498h = new C1498h();
            JSONObject jsonObjectCarouselApp = jsonArray.getJSONObject(i8);
            AbstractC3159y.h(jsonObjectCarouselApp, "jsonObjectCarouselApp");
            c1498h.b(jsonObjectCarouselApp);
            arrayList.add(c1498h);
        }
        return arrayList;
    }

    public final void o(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("info")) {
            JSONObject jSONObject = jsonObject.getJSONObject("info");
            if (!jSONObject.isNull("name")) {
                this.f12318b = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("webpage")) {
                this.f12319c = jSONObject.getString("webpage");
            }
            if (!jSONObject.isNull("twitter")) {
                this.f12320d = jSONObject.getString("twitter");
            }
            if (!jSONObject.isNull("instagram")) {
                this.f12321e = jSONObject.getString("instagram");
            }
            if (!jSONObject.isNull("tiktok")) {
                this.f12322f = jSONObject.getString("tiktok");
            }
            if (!jSONObject.isNull("feature")) {
                this.f12323g = jSONObject.getString("feature");
            }
            if (!jSONObject.isNull(RewardPlus.ICON)) {
                this.f12324h = jSONObject.getString(RewardPlus.ICON);
            }
            if (!jSONObject.isNull("mainAppID")) {
                this.f12326j = jSONObject.getLong("mainAppID");
            }
            if (!jSONObject.isNull("organizationID")) {
                this.f12317a = jSONObject.getLong("organizationID");
            }
            if (!jSONObject.isNull("bio")) {
                this.f12325i = jSONObject.getString("bio");
            }
        }
        if (!jsonObject.isNull("mainApp")) {
            C1498h c1498h = new C1498h();
            JSONObject jSONObject2 = jsonObject.getJSONObject("mainApp");
            AbstractC3159y.h(jSONObject2, "jsonObject.getJSONObject(\"mainApp\")");
            c1498h.b(jSONObject2);
            this.f12327k = c1498h;
        }
        if (!jsonObject.isNull("importantApps")) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jsonObject.optJSONArray("importantApps");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    C1498h c1498h2 = new C1498h();
                    JSONObject jsonObjectImportantApp = optJSONArray.getJSONObject(i8);
                    AbstractC3159y.h(jsonObjectImportantApp, "jsonObjectImportantApp");
                    c1498h2.b(jsonObjectImportantApp);
                    arrayList.add(c1498h2);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f12328l = arrayList;
            }
        }
        if (!jsonObject.isNull("carouselApps")) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("carouselApps");
            int length2 = jSONArray.length();
            for (int i9 = 0; i9 < length2; i9++) {
                C1498h c1498h3 = new C1498h();
                JSONObject jsonObjectCarouselApp = jSONArray.getJSONObject(i9);
                AbstractC3159y.h(jsonObjectCarouselApp, "jsonObjectCarouselApp");
                c1498h3.b(jsonObjectCarouselApp);
                arrayList2.add(c1498h3);
            }
            if (!arrayList2.isEmpty()) {
                this.f12329m = arrayList2;
            }
        }
        if (!jsonObject.isNull("apps")) {
            ArrayList arrayList3 = new ArrayList();
            JSONArray jSONArray2 = jsonObject.getJSONArray("apps");
            int length3 = jSONArray2.length();
            for (int i10 = 0; i10 < length3; i10++) {
                C1498h c1498h4 = new C1498h();
                JSONObject jsonObjectCarouselApp2 = jSONArray2.getJSONObject(i10);
                AbstractC3159y.h(jsonObjectCarouselApp2, "jsonObjectCarouselApp");
                c1498h4.b(jsonObjectCarouselApp2);
                arrayList3.add(c1498h4);
            }
            if (!arrayList3.isEmpty()) {
                this.f12330n = arrayList3;
            }
        }
    }

    public final void p(ArrayList arrayList) {
        AbstractC3159y.i(arrayList, "<set-?>");
        this.f12330n = arrayList;
    }
}
