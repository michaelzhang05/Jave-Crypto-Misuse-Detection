package X4;

import X4.L;
import X4.T;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X4.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1498h implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private long f12543A;

    /* renamed from: A0, reason: collision with root package name */
    private String f12544A0;

    /* renamed from: B, reason: collision with root package name */
    private long f12545B;

    /* renamed from: B0, reason: collision with root package name */
    private int f12546B0;

    /* renamed from: C, reason: collision with root package name */
    private int f12547C;

    /* renamed from: C0, reason: collision with root package name */
    private String f12548C0;

    /* renamed from: D, reason: collision with root package name */
    private String f12549D;

    /* renamed from: D0, reason: collision with root package name */
    private c f12550D0;

    /* renamed from: E, reason: collision with root package name */
    private String f12551E;

    /* renamed from: E0, reason: collision with root package name */
    private HashMap f12552E0;

    /* renamed from: F, reason: collision with root package name */
    private String f12553F;

    /* renamed from: F0, reason: collision with root package name */
    private int f12554F0;

    /* renamed from: G, reason: collision with root package name */
    private String f12555G;

    /* renamed from: G0, reason: collision with root package name */
    private int f12556G0;

    /* renamed from: H, reason: collision with root package name */
    private String f12557H;

    /* renamed from: H0, reason: collision with root package name */
    private int f12558H0;

    /* renamed from: I, reason: collision with root package name */
    private String f12559I;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f12560I0;

    /* renamed from: J, reason: collision with root package name */
    private int f12561J;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f12562J0;

    /* renamed from: K, reason: collision with root package name */
    private ArrayList f12563K;

    /* renamed from: K0, reason: collision with root package name */
    private transient ArrayList f12564K0;

    /* renamed from: L, reason: collision with root package name */
    private ArrayList f12565L;

    /* renamed from: M, reason: collision with root package name */
    private String f12566M;

    /* renamed from: N, reason: collision with root package name */
    private String f12567N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f12568O;

    /* renamed from: P, reason: collision with root package name */
    private ArrayList f12569P;

    /* renamed from: Q, reason: collision with root package name */
    private ArrayList f12570Q;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList f12571R;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList f12572S;

    /* renamed from: T, reason: collision with root package name */
    private ArrayList f12573T;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f12574U;

    /* renamed from: V, reason: collision with root package name */
    private H f12575V;

    /* renamed from: W, reason: collision with root package name */
    private String f12576W;

    /* renamed from: X, reason: collision with root package name */
    private String f12577X;

    /* renamed from: Y, reason: collision with root package name */
    private String f12578Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f12579Z;

    /* renamed from: a, reason: collision with root package name */
    private long f12580a;

    /* renamed from: b, reason: collision with root package name */
    private String f12581b;

    /* renamed from: c, reason: collision with root package name */
    private String f12582c;

    /* renamed from: d, reason: collision with root package name */
    private long f12583d;

    /* renamed from: e, reason: collision with root package name */
    private String f12584e;

    /* renamed from: f, reason: collision with root package name */
    private String f12585f;

    /* renamed from: g, reason: collision with root package name */
    private String f12586g;

    /* renamed from: h, reason: collision with root package name */
    private String f12587h;

    /* renamed from: i, reason: collision with root package name */
    private int f12588i;

    /* renamed from: j, reason: collision with root package name */
    private int f12589j;

    /* renamed from: k, reason: collision with root package name */
    private String f12590k;

    /* renamed from: l, reason: collision with root package name */
    private String f12591l;

    /* renamed from: m, reason: collision with root package name */
    private String f12592m;

    /* renamed from: n, reason: collision with root package name */
    private String f12593n;

    /* renamed from: o, reason: collision with root package name */
    private String f12594o;

    /* renamed from: p, reason: collision with root package name */
    private int f12595p;

    /* renamed from: p0, reason: collision with root package name */
    private String f12596p0;

    /* renamed from: q, reason: collision with root package name */
    private int f12597q;

    /* renamed from: q0, reason: collision with root package name */
    private String f12598q0;

    /* renamed from: r, reason: collision with root package name */
    private int f12599r;

    /* renamed from: r0, reason: collision with root package name */
    private String f12600r0;

    /* renamed from: s, reason: collision with root package name */
    private int f12601s;

    /* renamed from: s0, reason: collision with root package name */
    private String f12602s0;

    /* renamed from: t, reason: collision with root package name */
    private int f12603t;

    /* renamed from: t0, reason: collision with root package name */
    private String f12604t0;

    /* renamed from: u, reason: collision with root package name */
    private int f12605u;

    /* renamed from: u0, reason: collision with root package name */
    private String f12606u0;

    /* renamed from: v, reason: collision with root package name */
    private int f12607v;

    /* renamed from: v0, reason: collision with root package name */
    private long f12608v0;

    /* renamed from: w, reason: collision with root package name */
    private String f12609w;

    /* renamed from: w0, reason: collision with root package name */
    private String f12610w0;

    /* renamed from: x, reason: collision with root package name */
    private C1501k f12611x;

    /* renamed from: x0, reason: collision with root package name */
    private String f12612x0;

    /* renamed from: y, reason: collision with root package name */
    private int f12613y;

    /* renamed from: y0, reason: collision with root package name */
    private String f12614y0;

    /* renamed from: z, reason: collision with root package name */
    private String f12615z;

    /* renamed from: z0, reason: collision with root package name */
    private int f12616z0;

    /* renamed from: L0, reason: collision with root package name */
    public static final b f12542L0 = new b(null);
    public static Parcelable.Creator<C1498h> CREATOR = new a();

    /* renamed from: X4.h$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1498h createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new C1498h(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1498h[] newArray(int i8) {
            return new C1498h[i8];
        }
    }

    /* renamed from: X4.h$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final C1498h a(JSONObject jsonObjectData) {
            AbstractC3159y.i(jsonObjectData, "jsonObjectData");
            C1498h c1498h = new C1498h();
            c1498h.b(jsonObjectData);
            return c1498h;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: X4.h$c */
    /* loaded from: classes5.dex */
    public enum c {
        UPDATE,
        PROMOTED,
        LATEST,
        EDITOR_CHOICE,
        TRENDING,
        NONE
    }

    public C1498h() {
        this.f12583d = -1L;
        this.f12543A = -1L;
        this.f12545B = -1L;
        this.f12550D0 = c.NONE;
        this.f12552E0 = new HashMap();
    }

    private final void s1(JSONObject jSONObject) {
        if (!jSONObject.isNull("appID")) {
            this.f12580a = jSONObject.getLong("appID");
        }
        if (!jSONObject.isNull("name")) {
            this.f12581b = jSONObject.getString("name");
        }
        if (!jSONObject.isNull("license")) {
            this.f12587h = jSONObject.getString("license");
        }
        if (!jSONObject.isNull("lastVersionCode")) {
            this.f12583d = jSONObject.getLong("lastVersionCode");
        }
        if (!jSONObject.isNull("shortDescription")) {
            this.f12585f = jSONObject.getString("shortDescription");
        }
        if (!jSONObject.isNull("iconURL")) {
            this.f12591l = jSONObject.getString("iconURL");
        } else if (!jSONObject.isNull(RewardPlus.ICON)) {
            this.f12591l = jSONObject.getString(RewardPlus.ICON);
        }
        if (!jSONObject.isNull("feature")) {
            this.f12592m = jSONObject.getString("feature");
        } else if (!jSONObject.isNull("imageURL")) {
            this.f12592m = jSONObject.getString("imageURL");
        }
        if (!jSONObject.isNull("author")) {
            this.f12593n = jSONObject.getString("author");
        }
        if (!jSONObject.isNull("size")) {
            this.f12586g = jSONObject.getString("size");
        }
        if (!jSONObject.isNull("downloads")) {
            this.f12588i = jSONObject.getInt("downloads");
        }
        if (!jSONObject.isNull("weeklyDownloads")) {
            this.f12589j = jSONObject.getInt("weeklyDownloads");
        }
        if (!jSONObject.isNull("lastUpdate")) {
            this.f12590k = jSONObject.getString("lastUpdate");
        }
        if (!jSONObject.isNull("urlShare")) {
            this.f12584e = jSONObject.getString("urlShare");
        }
        if (!jSONObject.isNull("description")) {
            String string = jSONObject.getString("description");
            AbstractC3159y.h(string, "jsonObjectData.getString(\"description\")");
            this.f12594o = g6.n.A(g6.n.A(g6.n.A(string, "</h2>", "</h2><br />", false, 4, null), "</h3>", "</h3><br />", false, 4, null), "\n", "<br />", false, 4, null);
        }
        if (!jSONObject.isNull(CampaignEx.JSON_KEY_STAR)) {
            this.f12595p = jSONObject.getInt(CampaignEx.JSON_KEY_STAR);
        }
        if (!jSONObject.isNull("ratingCount")) {
            this.f12597q = jSONObject.getInt("ratingCount");
        }
        if (!jSONObject.isNull("ratingCount1")) {
            this.f12599r = jSONObject.getInt("ratingCount1");
        }
        if (!jSONObject.isNull("ratingCount2")) {
            this.f12601s = jSONObject.getInt("ratingCount2");
        }
        if (!jSONObject.isNull("ratingCount3")) {
            this.f12603t = jSONObject.getInt("ratingCount3");
        }
        if (!jSONObject.isNull("ratingCount4")) {
            this.f12605u = jSONObject.getInt("ratingCount4");
        }
        if (!jSONObject.isNull("ratingCount5")) {
            this.f12607v = jSONObject.getInt("ratingCount5");
        }
        if (!jSONObject.isNull("packagename")) {
            this.f12609w = jSONObject.getString("packagename");
        } else if (!jSONObject.isNull("packageName")) {
            this.f12609w = jSONObject.getString("packageName");
        }
        if (!jSONObject.isNull("categoryData")) {
            C1501k c1501k = new C1501k(0, null, null, 7, null);
            this.f12611x = c1501k;
            AbstractC3159y.f(c1501k);
            JSONObject jSONObject2 = jSONObject.getJSONObject("categoryData");
            AbstractC3159y.h(jSONObject2, "jsonObjectData.getJSONObject(\"categoryData\")");
            c1501k.s(jSONObject2);
        }
        if (!jSONObject.isNull("permissionCount")) {
            this.f12613y = jSONObject.getInt("permissionCount");
        }
        if (!jSONObject.isNull("md5Signature")) {
            this.f12549D = jSONObject.getString("md5Signature");
        }
        if (!jSONObject.isNull("activeADEX")) {
            this.f12547C = jSONObject.getInt("activeADEX");
        }
        if (!jSONObject.isNull("pegi")) {
            this.f12553F = jSONObject.getString("pegi");
        }
        if (!jSONObject.isNull("technicalData")) {
            this.f12557H = jSONObject.getString("technicalData");
        }
        if (!jSONObject.isNull("versionRequired")) {
            this.f12559I = jSONObject.getString("versionRequired");
        }
        if (!jSONObject.isNull("fromUnity")) {
            this.f12561J = jSONObject.getInt("fromUnity");
        }
        if (!jSONObject.isNull("compatibleFile")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("compatibleFile");
            if (!jSONObject3.isNull("densities")) {
                JSONArray jSONArray = jSONObject3.getJSONArray("densities");
                this.f12563K = new ArrayList();
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    ArrayList arrayList = this.f12563K;
                    if (arrayList != null) {
                        arrayList.add(jSONArray.getString(i8));
                    }
                }
            }
            if (!jSONObject3.isNull("abis")) {
                JSONArray jSONArray2 = jSONObject3.getJSONArray("abis");
                this.f12565L = new ArrayList();
                int length2 = jSONArray2.length();
                for (int i9 = 0; i9 < length2; i9++) {
                    ArrayList arrayList2 = this.f12565L;
                    if (arrayList2 != null) {
                        arrayList2.add(jSONArray2.getString(i9));
                    }
                }
            }
            if (!jSONObject3.isNull("fileID")) {
                this.f12543A = jSONObject3.getLong("fileID");
            }
            if (!jSONObject3.isNull("minSDK")) {
                this.f12615z = jSONObject3.getString("minSDK");
            }
            if (!jSONObject3.isNull("version")) {
                this.f12582c = jSONObject3.getString("version");
            }
            if (!jSONObject3.isNull("sha256")) {
                this.f12555G = jSONObject3.getString("sha256");
            }
            if (!jSONObject3.isNull("url_apk")) {
                this.f12551E = jSONObject3.getString("url_apk");
            }
        }
        if (!jSONObject.isNull("website")) {
            this.f12566M = jSONObject.getString("website");
        }
        if (!jSONObject.isNull("downloadStatus")) {
            String string2 = jSONObject.getString("downloadStatus");
            this.f12567N = string2;
            if (g6.n.t(string2, "PreRegister", false, 2, null)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("preRegister");
                if (!jSONObject4.isNull("date")) {
                    this.f12576W = jSONObject4.getString("date");
                }
                if (!jSONObject4.isNull("countPreRegistered")) {
                    this.f12577X = jSONObject4.getString("countPreRegistered");
                }
            }
        }
        if (!jSONObject.isNull("newFeatures")) {
            this.f12578Y = jSONObject.getString("newFeatures");
        }
        if (!jSONObject.isNull("onBoard")) {
            this.f12579Z = jSONObject.getInt("onBoard");
        }
        if (!jSONObject.isNull("responsibilities")) {
            this.f12596p0 = jSONObject.getString("responsibilities");
        }
        if (!jSONObject.isNull(TypedValues.CycleType.S_WAVE_PHASE)) {
            this.f12598q0 = jSONObject.getString(TypedValues.CycleType.S_WAVE_PHASE);
        }
        if (!jSONObject.isNull("deviceType")) {
            this.f12600r0 = jSONObject.getString("deviceType");
        }
        if (!jSONObject.isNull("translations")) {
            this.f12552E0 = new HashMap();
            if (jSONObject.getJSONObject("translations") != null) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("translations");
                if (!jSONObject5.isNull("try")) {
                    HashMap hashMap = this.f12552E0;
                    AbstractC3159y.f(hashMap);
                    String string3 = jSONObject5.getString("try");
                    AbstractC3159y.h(string3, "jsonObjectTranslations.g…ring(TRANSLATION_KEY_TRY)");
                    hashMap.put("try", string3);
                }
                if (!jSONObject5.isNull("supportedDevice")) {
                    HashMap hashMap2 = this.f12552E0;
                    AbstractC3159y.f(hashMap2);
                    String string4 = jSONObject5.getString("supportedDevice");
                    AbstractC3159y.h(string4, "jsonObjectTranslations.g…ION_KEY_SUPPORTED_DEVICE)");
                    hashMap2.put("supportedDevice", string4);
                }
            }
        }
        if (!jSONObject.isNull("readingModeText")) {
            this.f12602s0 = jSONObject.getString("readingModeText");
        }
        if (!jSONObject.isNull("externalDownloadURL")) {
            this.f12604t0 = jSONObject.getString("externalDownloadURL");
        }
        if (!jSONObject.isNull("externalDownloadText")) {
            this.f12606u0 = jSONObject.getString("externalDownloadText");
        }
        if (!jSONObject.isNull("organizationID")) {
            this.f12608v0 = jSONObject.getLong("organizationID");
        }
        if (!jSONObject.isNull("editorNameNew")) {
            this.f12610w0 = jSONObject.getString("editorNameNew");
        }
        if (!jSONObject.isNull("editorAvatar")) {
            this.f12612x0 = jSONObject.getString("editorAvatar");
        }
        if (!jSONObject.isNull("showReviewedBy")) {
            this.f12546B0 = jSONObject.getInt("showReviewedBy");
        }
        if (!jSONObject.isNull("editorJobTitle")) {
            this.f12614y0 = jSONObject.getString("editorJobTitle");
        }
        if (!jSONObject.isNull("totalVersions")) {
            this.f12616z0 = jSONObject.getInt("totalVersions");
        }
        if (!jSONObject.isNull("disclaimerText")) {
            this.f12544A0 = jSONObject.getString("disclaimerText");
        }
        if (!jSONObject.isNull("tagID")) {
            int i10 = jSONObject.getInt("tagID");
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    this.f12550D0 = c.EDITOR_CHOICE;
                                }
                            } else {
                                this.f12550D0 = c.PROMOTED;
                            }
                        } else {
                            this.f12550D0 = c.UPDATE;
                        }
                    } else {
                        this.f12550D0 = c.LATEST;
                    }
                } else {
                    this.f12550D0 = c.TRENDING;
                }
            } else {
                this.f12550D0 = c.NONE;
            }
            if (!jSONObject.isNull("tag")) {
                this.f12548C0 = jSONObject.getString("tag");
            }
        }
        if (!jSONObject.isNull("promoted")) {
            this.f12554F0 = jSONObject.getInt("promoted");
        }
        if (!jSONObject.isNull("containsAds")) {
            this.f12556G0 = jSONObject.getInt("containsAds");
        }
        if (!jSONObject.isNull("hasAlternatives")) {
            if (jSONObject.getBoolean("hasAlternatives")) {
                this.f12558H0 = 1;
            } else {
                this.f12558H0 = 0;
            }
        }
    }

    public final int A0() {
        return this.f12613y;
    }

    public final void A1(ArrayList arrayList) {
        this.f12571R = arrayList;
    }

    public final String B0() {
        return this.f12598q0;
    }

    public final void B1(H h8) {
        this.f12575V = h8;
    }

    public final String C0() {
        return this.f12576W;
    }

    public final void C1(ArrayList arrayList) {
        this.f12568O = arrayList;
    }

    public final String D0() {
        return this.f12577X;
    }

    public final void D1(ArrayList arrayList) {
        this.f12573T = arrayList;
    }

    public final ArrayList E0() {
        return this.f12570Q;
    }

    public final void E1(ArrayList arrayList) {
        this.f12569P = arrayList;
    }

    public final int F0() {
        return this.f12595p;
    }

    public final void F1(ArrayList arrayList) {
        this.f12574U = arrayList;
    }

    public final String G() {
        return this.f12544A0;
    }

    public final int G0() {
        return this.f12597q;
    }

    public final int H0() {
        return this.f12599r;
    }

    public final String I() {
        return this.f12567N;
    }

    public final int I0() {
        return this.f12601s;
    }

    public final int J0() {
        return this.f12603t;
    }

    public final int K0() {
        return this.f12605u;
    }

    public final String L() {
        return this.f12551E;
    }

    public final int L0() {
        return this.f12607v;
    }

    public final String M0() {
        return this.f12602s0;
    }

    public final ArrayList N0() {
        return this.f12571R;
    }

    public final H O0() {
        return this.f12575V;
    }

    public final String P0() {
        return this.f12596p0;
    }

    public final int Q() {
        return this.f12588i;
    }

    public final ArrayList Q0() {
        return this.f12568O;
    }

    public final ArrayList R0() {
        return this.f12573T;
    }

    public final String S0() {
        return this.f12555G;
    }

    public final String T() {
        return this.f12612x0;
    }

    public final String T0() {
        return this.f12585f;
    }

    public final int U0() {
        return this.f12546B0;
    }

    public final String V() {
        return this.f12614y0;
    }

    public final ArrayList V0() {
        return this.f12569P;
    }

    public final String W0() {
        return this.f12586g;
    }

    public final String X() {
        return this.f12610w0;
    }

    public final ArrayList X0() {
        return this.f12565L;
    }

    public final String Y() {
        return this.f12606u0;
    }

    public final ArrayList Y0() {
        return this.f12563K;
    }

    public final String Z() {
        return this.f12604t0;
    }

    public final String Z0() {
        return this.f12548C0;
    }

    public final ArrayList a0() {
        return this.f12572S;
    }

    public final c a1() {
        return this.f12550D0;
    }

    public final void b(JSONObject jsonObjectData) {
        AbstractC3159y.i(jsonObjectData, "jsonObjectData");
        if (jsonObjectData.has(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
            JSONObject jSONObject = jsonObjectData.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            AbstractC3159y.h(jSONObject, "jsonObjectData.getJSONObject(\"app\")");
            s1(jSONObject);
        } else {
            s1(jsonObjectData);
        }
        if (jsonObjectData.has("videos")) {
            JSONArray jSONArray = jsonObjectData.getJSONArray("videos");
            this.f12574U = new ArrayList();
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                T.b bVar = T.f12452c;
                Object obj = jSONArray.get(i8);
                AbstractC3159y.g(obj, "null cannot be cast to non-null type org.json.JSONObject");
                T a8 = bVar.a((JSONObject) obj);
                ArrayList arrayList = this.f12574U;
                AbstractC3159y.f(arrayList);
                arrayList.add(a8);
            }
        }
        if (jsonObjectData.has("screenshots")) {
            JSONArray jSONArray2 = jsonObjectData.getJSONArray("screenshots");
            this.f12573T = new ArrayList();
            int length2 = jSONArray2.length();
            for (int i9 = 0; i9 < length2; i9++) {
                L.b bVar2 = L.f12406e;
                Object obj2 = jSONArray2.get(i9);
                AbstractC3159y.g(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                L b8 = bVar2.b((JSONObject) obj2);
                ArrayList arrayList2 = this.f12573T;
                if (arrayList2 != null) {
                    arrayList2.add(b8);
                }
            }
        }
    }

    public final String b0() {
        return this.f12592m;
    }

    public final String b1() {
        return this.f12557H;
    }

    public final boolean c() {
        if (!r1() && !o1() && l1()) {
            return true;
        }
        return false;
    }

    public final String c0() {
        if (this.f12592m != null) {
            UptodownApp.a aVar = UptodownApp.f28003B;
            if (aVar.A() > 0) {
                return this.f12592m + ':' + aVar.A() + ":webp";
            }
            return e0();
        }
        return null;
    }

    public final int c1() {
        return this.f12616z0;
    }

    public final String d0() {
        if (this.f12592m != null) {
            return this.f12592m + UptodownApp.f28003B.q() + ":webp";
        }
        return null;
    }

    public final String d1(String key) {
        AbstractC3159y.i(key, "key");
        HashMap hashMap = this.f12552E0;
        if (hashMap != null) {
            return (String) hashMap.get(key);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        String str = this.f12576W;
        if (str != null && str.length() != 0) {
            String str2 = this.f12576W;
            AbstractC3159y.f(str2);
            return g6.n.A(str2, "-", "/", false, 4, null);
        }
        return null;
    }

    public final String e0() {
        if (this.f12592m != null) {
            return this.f12592m + UptodownApp.f28003B.r() + ":webp";
        }
        return null;
    }

    public final String e1() {
        return this.f12584e;
    }

    public final int f() {
        return this.f12547C;
    }

    public final long f0() {
        return this.f12543A;
    }

    public final long f1() {
        return this.f12545B;
    }

    public final int g0() {
        return this.f12561J;
    }

    public final String g1() {
        return this.f12582c;
    }

    public final int h0() {
        return this.f12558H0;
    }

    public final String h1() {
        return this.f12559I;
    }

    public final long i() {
        return this.f12580a;
    }

    public final String i0() {
        if (this.f12592m != null) {
            return this.f12592m + UptodownApp.f28003B.s() + ":webp";
        }
        return null;
    }

    public final ArrayList i1() {
        return this.f12574U;
    }

    public final long j(I responseJson) {
        int i8;
        JSONObject jSONObject;
        AbstractC3159y.i(responseJson, "responseJson");
        try {
            if (!responseJson.b() && responseJson.d() != null) {
                String d8 = responseJson.d();
                AbstractC3159y.f(d8);
                JSONObject jSONObject2 = new JSONObject(d8);
                if (!jSONObject2.isNull("success")) {
                    i8 = jSONObject2.getInt("success");
                } else {
                    i8 = 0;
                }
                if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                } else {
                    jSONObject = null;
                }
                if (i8 == 1 && jSONObject != null && !jSONObject.isNull("appID")) {
                    return jSONObject.getLong("appID");
                }
            }
            return 0L;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return -1L;
        }
    }

    public final String j0() {
        return this.f12591l;
    }

    public final String j1() {
        return this.f12566M;
    }

    public final String k() {
        return this.f12593n;
    }

    public final String k0(int i8) {
        if (this.f12591l != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(':');
            sb.append(i8);
            return this.f12591l + sb.toString() + ":webp";
        }
        return null;
    }

    public final boolean k1() {
        if (this.f12543A >= 0) {
            return true;
        }
        return false;
    }

    public final String l0() {
        if (this.f12591l != null) {
            return this.f12591l + UptodownApp.f28003B.t() + ":webp";
        }
        return null;
    }

    public final boolean l1() {
        if (this.f12616z0 > 1) {
            return true;
        }
        return false;
    }

    public final String m0() {
        if (this.f12591l != null) {
            return this.f12591l + UptodownApp.f28003B.u() + ":webp";
        }
        return null;
    }

    public final boolean m1() {
        return AbstractC3159y.d(this.f12567N, "Discontinued");
    }

    public final C1501k n() {
        return this.f12611x;
    }

    public final String n0() {
        return this.f12590k;
    }

    public final boolean n1() {
        if (this.f12567N != null && !p1() && !m1() && !o1() && !r1()) {
            return true;
        }
        return false;
    }

    public final int o() {
        return this.f12556G0;
    }

    public final long o0() {
        return this.f12583d;
    }

    public final boolean o1() {
        return AbstractC3159y.d(this.f12567N, "ExternalDownload");
    }

    public final String p0() {
        return this.f12587h;
    }

    public final boolean p1() {
        return AbstractC3159y.d(this.f12567N, "PreRegister");
    }

    public final String q0() {
        return this.f12549D;
    }

    public final boolean q1() {
        if (this.f12554F0 == 1) {
            return true;
        }
        return false;
    }

    public final String r0() {
        return this.f12615z;
    }

    public final boolean r1() {
        return AbstractC3159y.d(this.f12567N, "ReadingMode");
    }

    public final String s() {
        return this.f12594o;
    }

    public final String s0() {
        return this.f12581b;
    }

    public final String t0() {
        return this.f12578Y;
    }

    public final void t1(long j8) {
        this.f12580a = j8;
    }

    public String toString() {
        return "AppInfo(appID=" + this.f12580a + ", name=" + this.f12581b + ", versionName=" + this.f12582c + ", lastVersionCode=" + this.f12583d + ", urlShare=" + this.f12584e + ", shortDescription=" + this.f12585f + ", size=" + this.f12586g + ", license=" + this.f12587h + ", downloads=" + this.f12588i + ", weeklyDownloads=" + this.f12589j + ", lastUpdate=" + this.f12590k + ", icon=" + this.f12591l + ", feature=" + this.f12592m + ", author=" + this.f12593n + ", description=" + this.f12594o + ", rating=" + this.f12595p + ", ratingCount=" + this.f12597q + ", ratingCount1=" + this.f12599r + ", ratingCount2=" + this.f12601s + ", ratingCount3=" + this.f12603t + ", ratingCount4=" + this.f12605u + ", ratingCount5=" + this.f12607v + ", packagename=" + this.f12609w + ", screenShots=" + this.f12573T + ", category=" + this.f12611x + ", permissionCount=" + this.f12613y + ", minsdk=" + this.f12615z + ", similars=" + this.f12569P + ", promotedApps=" + this.f12570Q + ", relatedPosts=" + this.f12571R + ", md5signature=" + this.f12549D + ", downloadUrl=" + this.f12551E + ", reviews=" + this.f12568O + ", fileID=" + this.f12543A + ", oldVersions=" + this.f12564K0 + ", activeADEX=" + this.f12547C + ", sha256=" + this.f12555G + ", technicalData=" + this.f12557H + ", versionRequired=" + this.f12559I + ", fromUnity=" + this.f12561J + ", webAuthor=" + this.f12566M + ", downloadStatus=" + this.f12567N + ", devOnBoard=" + this.f12579Z + ", responsibilities=" + this.f12596p0 + ", phase=" + this.f12598q0 + ", readingModeText=" + this.f12602s0 + ", externalDownloadUrl=" + this.f12604t0 + ", externalDownloadText=" + this.f12606u0 + ", organizationID=" + this.f12608v0 + ", editorName=" + this.f12610w0 + ", totalVersions=" + this.f12616z0 + ", disclaimerText=" + this.f12544A0 + ')';
    }

    public final int u() {
        return this.f12579Z;
    }

    public final boolean u0() {
        return this.f12560I0;
    }

    public final void u1(ArrayList arrayList) {
        this.f12572S = arrayList;
    }

    public final boolean v0() {
        return this.f12562J0;
    }

    public final void v1(String str) {
        this.f12592m = str;
    }

    public final ArrayList w0() {
        return this.f12564K0;
    }

    public final void w1(boolean z8) {
        this.f12560I0 = z8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeLong(this.f12580a);
        parcel.writeString(this.f12581b);
        parcel.writeString(this.f12582c);
        parcel.writeLong(this.f12583d);
        parcel.writeString(this.f12584e);
        parcel.writeString(this.f12585f);
        parcel.writeString(this.f12586g);
        parcel.writeString(this.f12587h);
        parcel.writeInt(this.f12588i);
        parcel.writeInt(this.f12589j);
        parcel.writeString(this.f12590k);
        parcel.writeString(this.f12591l);
        parcel.writeString(this.f12592m);
        parcel.writeString(this.f12593n);
        parcel.writeString(this.f12594o);
        parcel.writeInt(this.f12595p);
        parcel.writeInt(this.f12597q);
        parcel.writeInt(this.f12599r);
        parcel.writeInt(this.f12601s);
        parcel.writeInt(this.f12603t);
        parcel.writeInt(this.f12605u);
        parcel.writeInt(this.f12607v);
        parcel.writeString(this.f12609w);
        parcel.writeParcelable(this.f12611x, i8);
        parcel.writeInt(this.f12613y);
        parcel.writeString(this.f12615z);
        parcel.writeString(this.f12549D);
        parcel.writeString(this.f12551E);
        parcel.writeLong(this.f12543A);
        parcel.writeInt(this.f12547C);
        parcel.writeString(this.f12555G);
        parcel.writeString(this.f12557H);
        parcel.writeString(this.f12559I);
        parcel.writeInt(this.f12561J);
        parcel.writeStringList(this.f12563K);
        parcel.writeStringList(this.f12565L);
        parcel.writeString(this.f12566M);
        parcel.writeString(this.f12567N);
        parcel.writeString(this.f12553F);
        parcel.writeInt(this.f12579Z);
        parcel.writeString(this.f12600r0);
        parcel.writeMap(this.f12552E0);
        parcel.writeString(this.f12602s0);
        parcel.writeString(this.f12604t0);
        parcel.writeString(this.f12606u0);
        parcel.writeLong(this.f12608v0);
        parcel.writeString(this.f12610w0);
        parcel.writeInt(this.f12616z0);
        parcel.writeString(this.f12596p0);
        parcel.writeString(this.f12578Y);
        parcel.writeString(this.f12576W);
        parcel.writeString(this.f12577X);
        parcel.writeString(this.f12612x0);
        parcel.writeString(this.f12614y0);
        parcel.writeString(this.f12544A0);
        parcel.writeInt(this.f12546B0);
        parcel.writeInt(this.f12556G0);
        parcel.writeInt(this.f12558H0);
    }

    public final long x0() {
        return this.f12608v0;
    }

    public final void x1(boolean z8) {
        this.f12562J0 = z8;
    }

    public final String y0() {
        return this.f12609w;
    }

    public final void y1(ArrayList arrayList) {
        this.f12564K0 = arrayList;
    }

    public final String z() {
        return this.f12600r0;
    }

    public final String z0() {
        return this.f12553F;
    }

    public final void z1(ArrayList arrayList) {
        this.f12570Q = arrayList;
    }

    public C1498h(Parcel source) {
        Object readParcelable;
        AbstractC3159y.i(source, "source");
        this.f12583d = -1L;
        this.f12543A = -1L;
        this.f12545B = -1L;
        this.f12550D0 = c.NONE;
        this.f12552E0 = new HashMap();
        this.f12580a = source.readLong();
        this.f12581b = source.readString();
        this.f12582c = source.readString();
        this.f12583d = source.readLong();
        this.f12584e = source.readString();
        this.f12585f = source.readString();
        this.f12586g = source.readString();
        this.f12587h = source.readString();
        this.f12588i = source.readInt();
        this.f12589j = source.readInt();
        this.f12590k = source.readString();
        this.f12591l = source.readString();
        this.f12592m = source.readString();
        this.f12593n = source.readString();
        this.f12594o = source.readString();
        this.f12595p = source.readInt();
        this.f12597q = source.readInt();
        this.f12599r = source.readInt();
        this.f12601s = source.readInt();
        this.f12603t = source.readInt();
        this.f12605u = source.readInt();
        this.f12607v = source.readInt();
        this.f12609w = source.readString();
        if (Build.VERSION.SDK_INT >= 33) {
            readParcelable = source.readParcelable(C1501k.class.getClassLoader(), C1501k.class);
            this.f12611x = (C1501k) readParcelable;
        } else {
            this.f12611x = (C1501k) source.readParcelable(C1501k.class.getClassLoader());
        }
        this.f12613y = source.readInt();
        this.f12615z = source.readString();
        this.f12549D = source.readString();
        this.f12551E = source.readString();
        this.f12543A = source.readLong();
        this.f12547C = source.readInt();
        this.f12555G = source.readString();
        this.f12557H = source.readString();
        this.f12559I = source.readString();
        this.f12561J = source.readInt();
        this.f12563K = source.createStringArrayList();
        this.f12565L = source.createStringArrayList();
        this.f12566M = source.readString();
        this.f12567N = source.readString();
        this.f12553F = source.readString();
        this.f12579Z = source.readInt();
        this.f12600r0 = source.readString();
        HashMap readHashMap = source.readHashMap(ClassLoader.getSystemClassLoader());
        AbstractC3159y.g(readHashMap, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        this.f12552E0 = readHashMap;
        this.f12602s0 = source.readString();
        this.f12604t0 = source.readString();
        this.f12606u0 = source.readString();
        this.f12608v0 = source.readLong();
        this.f12610w0 = source.readString();
        this.f12616z0 = source.readInt();
        this.f12596p0 = source.readString();
        this.f12578Y = source.readString();
        this.f12576W = source.readString();
        this.f12577X = source.readString();
        this.f12612x0 = source.readString();
        this.f12614y0 = source.readString();
        this.f12544A0 = source.readString();
        this.f12546B0 = source.readInt();
        this.f12556G0 = source.readInt();
        this.f12558H0 = source.readInt();
    }
}
