package a5;

import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: a5.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1629A {

    /* renamed from: a, reason: collision with root package name */
    private long f13938a;

    /* renamed from: b, reason: collision with root package name */
    private String f13939b;

    /* renamed from: c, reason: collision with root package name */
    private String f13940c;

    /* renamed from: d, reason: collision with root package name */
    private String f13941d;

    /* renamed from: e, reason: collision with root package name */
    private String f13942e;

    /* renamed from: f, reason: collision with root package name */
    private String f13943f;

    /* renamed from: g, reason: collision with root package name */
    private String f13944g;

    /* renamed from: h, reason: collision with root package name */
    private String f13945h;

    /* renamed from: i, reason: collision with root package name */
    private String f13946i;

    /* renamed from: j, reason: collision with root package name */
    private long f13947j;

    /* renamed from: k, reason: collision with root package name */
    private C1641h f13948k;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f13949l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f13950m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    private ArrayList f13951n = new ArrayList();

    public final String a() {
        return this.f13946i;
    }

    public final ArrayList b() {
        return this.f13950m;
    }

    public final String c() {
        return this.f13944g;
    }

    public final String d() {
        if (this.f13944g != null) {
            return this.f13944g + UptodownApp.f29058B.r() + ":webp";
        }
        return null;
    }

    public final String e() {
        return this.f13945h;
    }

    public final ArrayList f() {
        return this.f13949l;
    }

    public final String g() {
        return this.f13942e;
    }

    public final C1641h h() {
        return this.f13948k;
    }

    public final ArrayList i() {
        return this.f13951n;
    }

    public final String j() {
        return this.f13939b;
    }

    public final String k() {
        return this.f13943f;
    }

    public final String l() {
        return this.f13941d;
    }

    public final String m() {
        return this.f13940c;
    }

    public final ArrayList n(JSONArray jsonArray) {
        AbstractC3255y.i(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            C1641h c1641h = new C1641h();
            JSONObject jsonObjectCarouselApp = jsonArray.getJSONObject(i8);
            AbstractC3255y.h(jsonObjectCarouselApp, "jsonObjectCarouselApp");
            c1641h.a(jsonObjectCarouselApp);
            arrayList.add(c1641h);
        }
        return arrayList;
    }

    public final void o(JSONObject jsonObject) {
        AbstractC3255y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("info")) {
            JSONObject jSONObject = jsonObject.getJSONObject("info");
            if (!jSONObject.isNull("name")) {
                this.f13939b = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("webpage")) {
                this.f13940c = jSONObject.getString("webpage");
            }
            if (!jSONObject.isNull("twitter")) {
                this.f13941d = jSONObject.getString("twitter");
            }
            if (!jSONObject.isNull("instagram")) {
                this.f13942e = jSONObject.getString("instagram");
            }
            if (!jSONObject.isNull("tiktok")) {
                this.f13943f = jSONObject.getString("tiktok");
            }
            if (!jSONObject.isNull("feature")) {
                this.f13944g = jSONObject.getString("feature");
            }
            if (!jSONObject.isNull(RewardPlus.ICON)) {
                this.f13945h = jSONObject.getString(RewardPlus.ICON);
            }
            if (!jSONObject.isNull("mainAppID")) {
                this.f13947j = jSONObject.getLong("mainAppID");
            }
            if (!jSONObject.isNull("organizationID")) {
                this.f13938a = jSONObject.getLong("organizationID");
            }
            if (!jSONObject.isNull("bio")) {
                this.f13946i = jSONObject.getString("bio");
            }
        }
        if (!jsonObject.isNull("mainApp")) {
            C1641h c1641h = new C1641h();
            JSONObject jSONObject2 = jsonObject.getJSONObject("mainApp");
            AbstractC3255y.h(jSONObject2, "jsonObject.getJSONObject(\"mainApp\")");
            c1641h.a(jSONObject2);
            this.f13948k = c1641h;
        }
        if (!jsonObject.isNull("importantApps")) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jsonObject.optJSONArray("importantApps");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    C1641h c1641h2 = new C1641h();
                    JSONObject jsonObjectImportantApp = optJSONArray.getJSONObject(i8);
                    AbstractC3255y.h(jsonObjectImportantApp, "jsonObjectImportantApp");
                    c1641h2.a(jsonObjectImportantApp);
                    arrayList.add(c1641h2);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f13949l = arrayList;
            }
        }
        if (!jsonObject.isNull("carouselApps")) {
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("carouselApps");
            int length2 = jSONArray.length();
            for (int i9 = 0; i9 < length2; i9++) {
                C1641h c1641h3 = new C1641h();
                JSONObject jsonObjectCarouselApp = jSONArray.getJSONObject(i9);
                AbstractC3255y.h(jsonObjectCarouselApp, "jsonObjectCarouselApp");
                c1641h3.a(jsonObjectCarouselApp);
                arrayList2.add(c1641h3);
            }
            if (!arrayList2.isEmpty()) {
                this.f13950m = arrayList2;
            }
        }
        if (!jsonObject.isNull("apps")) {
            ArrayList arrayList3 = new ArrayList();
            JSONArray jSONArray2 = jsonObject.getJSONArray("apps");
            int length3 = jSONArray2.length();
            for (int i10 = 0; i10 < length3; i10++) {
                C1641h c1641h4 = new C1641h();
                JSONObject jsonObjectCarouselApp2 = jSONArray2.getJSONObject(i10);
                AbstractC3255y.h(jsonObjectCarouselApp2, "jsonObjectCarouselApp");
                c1641h4.a(jsonObjectCarouselApp2);
                arrayList3.add(c1641h4);
            }
            if (!arrayList3.isEmpty()) {
                this.f13951n = arrayList3;
            }
        }
    }

    public final void p(ArrayList arrayList) {
        AbstractC3255y.i(arrayList, "<set-?>");
        this.f13951n = arrayList;
    }
}
