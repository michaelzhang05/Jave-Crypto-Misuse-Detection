package a5;

import a5.L;
import a5.T;
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
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: a5.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1641h implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private long f14164A;

    /* renamed from: A0, reason: collision with root package name */
    private String f14165A0;

    /* renamed from: B, reason: collision with root package name */
    private long f14166B;

    /* renamed from: B0, reason: collision with root package name */
    private int f14167B0;

    /* renamed from: C, reason: collision with root package name */
    private int f14168C;

    /* renamed from: C0, reason: collision with root package name */
    private String f14169C0;

    /* renamed from: D, reason: collision with root package name */
    private String f14170D;

    /* renamed from: D0, reason: collision with root package name */
    private c f14171D0;

    /* renamed from: E, reason: collision with root package name */
    private String f14172E;

    /* renamed from: E0, reason: collision with root package name */
    private HashMap f14173E0;

    /* renamed from: F, reason: collision with root package name */
    private String f14174F;

    /* renamed from: F0, reason: collision with root package name */
    private int f14175F0;

    /* renamed from: G, reason: collision with root package name */
    private String f14176G;

    /* renamed from: G0, reason: collision with root package name */
    private int f14177G0;

    /* renamed from: H, reason: collision with root package name */
    private String f14178H;

    /* renamed from: H0, reason: collision with root package name */
    private int f14179H0;

    /* renamed from: I, reason: collision with root package name */
    private String f14180I;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f14181I0;

    /* renamed from: J, reason: collision with root package name */
    private int f14182J;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f14183J0;

    /* renamed from: K, reason: collision with root package name */
    private ArrayList f14184K;

    /* renamed from: K0, reason: collision with root package name */
    private transient ArrayList f14185K0;

    /* renamed from: L, reason: collision with root package name */
    private ArrayList f14186L;

    /* renamed from: M, reason: collision with root package name */
    private String f14187M;

    /* renamed from: N, reason: collision with root package name */
    private String f14188N;

    /* renamed from: O, reason: collision with root package name */
    private ArrayList f14189O;

    /* renamed from: P, reason: collision with root package name */
    private ArrayList f14190P;

    /* renamed from: Q, reason: collision with root package name */
    private ArrayList f14191Q;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList f14192R;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList f14193S;

    /* renamed from: T, reason: collision with root package name */
    private ArrayList f14194T;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f14195U;

    /* renamed from: V, reason: collision with root package name */
    private H f14196V;

    /* renamed from: W, reason: collision with root package name */
    private String f14197W;

    /* renamed from: X, reason: collision with root package name */
    private String f14198X;

    /* renamed from: Y, reason: collision with root package name */
    private String f14199Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f14200Z;

    /* renamed from: a, reason: collision with root package name */
    private long f14201a;

    /* renamed from: b, reason: collision with root package name */
    private String f14202b;

    /* renamed from: c, reason: collision with root package name */
    private String f14203c;

    /* renamed from: d, reason: collision with root package name */
    private long f14204d;

    /* renamed from: e, reason: collision with root package name */
    private String f14205e;

    /* renamed from: f, reason: collision with root package name */
    private String f14206f;

    /* renamed from: g, reason: collision with root package name */
    private String f14207g;

    /* renamed from: h, reason: collision with root package name */
    private String f14208h;

    /* renamed from: i, reason: collision with root package name */
    private int f14209i;

    /* renamed from: j, reason: collision with root package name */
    private int f14210j;

    /* renamed from: k, reason: collision with root package name */
    private String f14211k;

    /* renamed from: l, reason: collision with root package name */
    private String f14212l;

    /* renamed from: m, reason: collision with root package name */
    private String f14213m;

    /* renamed from: n, reason: collision with root package name */
    private String f14214n;

    /* renamed from: o, reason: collision with root package name */
    private String f14215o;

    /* renamed from: p, reason: collision with root package name */
    private int f14216p;

    /* renamed from: p0, reason: collision with root package name */
    private String f14217p0;

    /* renamed from: q, reason: collision with root package name */
    private int f14218q;

    /* renamed from: q0, reason: collision with root package name */
    private String f14219q0;

    /* renamed from: r, reason: collision with root package name */
    private int f14220r;

    /* renamed from: r0, reason: collision with root package name */
    private String f14221r0;

    /* renamed from: s, reason: collision with root package name */
    private int f14222s;

    /* renamed from: s0, reason: collision with root package name */
    private String f14223s0;

    /* renamed from: t, reason: collision with root package name */
    private int f14224t;

    /* renamed from: t0, reason: collision with root package name */
    private String f14225t0;

    /* renamed from: u, reason: collision with root package name */
    private int f14226u;

    /* renamed from: u0, reason: collision with root package name */
    private String f14227u0;

    /* renamed from: v, reason: collision with root package name */
    private int f14228v;

    /* renamed from: v0, reason: collision with root package name */
    private long f14229v0;

    /* renamed from: w, reason: collision with root package name */
    private String f14230w;

    /* renamed from: w0, reason: collision with root package name */
    private String f14231w0;

    /* renamed from: x, reason: collision with root package name */
    private C1644k f14232x;

    /* renamed from: x0, reason: collision with root package name */
    private String f14233x0;

    /* renamed from: y, reason: collision with root package name */
    private int f14234y;

    /* renamed from: y0, reason: collision with root package name */
    private String f14235y0;

    /* renamed from: z, reason: collision with root package name */
    private String f14236z;

    /* renamed from: z0, reason: collision with root package name */
    private int f14237z0;

    /* renamed from: L0, reason: collision with root package name */
    public static final b f14163L0 = new b(null);
    public static Parcelable.Creator<C1641h> CREATOR = new a();

    /* renamed from: a5.h$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1641h createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
            return new C1641h(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1641h[] newArray(int i8) {
            return new C1641h[i8];
        }
    }

    /* renamed from: a5.h$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final C1641h a(JSONObject jsonObjectData) {
            AbstractC3255y.i(jsonObjectData, "jsonObjectData");
            C1641h c1641h = new C1641h();
            c1641h.a(jsonObjectData);
            return c1641h;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: a5.h$c */
    /* loaded from: classes5.dex */
    public enum c {
        UPDATE,
        PROMOTED,
        LATEST,
        EDITOR_CHOICE,
        TRENDING,
        NONE
    }

    public C1641h() {
        this.f14204d = -1L;
        this.f14164A = -1L;
        this.f14166B = -1L;
        this.f14171D0 = c.NONE;
        this.f14173E0 = new HashMap();
    }

    private final void s1(JSONObject jSONObject) {
        if (!jSONObject.isNull("appID")) {
            this.f14201a = jSONObject.getLong("appID");
        }
        if (!jSONObject.isNull("name")) {
            this.f14202b = jSONObject.getString("name");
        }
        if (!jSONObject.isNull("license")) {
            this.f14208h = jSONObject.getString("license");
        }
        if (!jSONObject.isNull("lastVersionCode")) {
            this.f14204d = jSONObject.getLong("lastVersionCode");
        }
        if (!jSONObject.isNull("shortDescription")) {
            this.f14206f = jSONObject.getString("shortDescription");
        }
        if (!jSONObject.isNull("iconURL")) {
            this.f14212l = jSONObject.getString("iconURL");
        } else if (!jSONObject.isNull(RewardPlus.ICON)) {
            this.f14212l = jSONObject.getString(RewardPlus.ICON);
        }
        if (!jSONObject.isNull("feature")) {
            this.f14213m = jSONObject.getString("feature");
        } else if (!jSONObject.isNull("imageURL")) {
            this.f14213m = jSONObject.getString("imageURL");
        }
        if (!jSONObject.isNull("author")) {
            this.f14214n = jSONObject.getString("author");
        }
        if (!jSONObject.isNull("size")) {
            this.f14207g = jSONObject.getString("size");
        }
        if (!jSONObject.isNull("downloads")) {
            this.f14209i = jSONObject.getInt("downloads");
        }
        if (!jSONObject.isNull("weeklyDownloads")) {
            this.f14210j = jSONObject.getInt("weeklyDownloads");
        }
        if (!jSONObject.isNull("lastUpdate")) {
            this.f14211k = jSONObject.getString("lastUpdate");
        }
        if (!jSONObject.isNull("urlShare")) {
            this.f14205e = jSONObject.getString("urlShare");
        }
        if (!jSONObject.isNull("description")) {
            String string = jSONObject.getString("description");
            AbstractC3255y.h(string, "jsonObjectData.getString(\"description\")");
            this.f14215o = j6.n.A(j6.n.A(j6.n.A(string, "</h2>", "</h2><br />", false, 4, null), "</h3>", "</h3><br />", false, 4, null), "\n", "<br />", false, 4, null);
        }
        if (!jSONObject.isNull(CampaignEx.JSON_KEY_STAR)) {
            this.f14216p = jSONObject.getInt(CampaignEx.JSON_KEY_STAR);
        }
        if (!jSONObject.isNull("ratingCount")) {
            this.f14218q = jSONObject.getInt("ratingCount");
        }
        if (!jSONObject.isNull("ratingCount1")) {
            this.f14220r = jSONObject.getInt("ratingCount1");
        }
        if (!jSONObject.isNull("ratingCount2")) {
            this.f14222s = jSONObject.getInt("ratingCount2");
        }
        if (!jSONObject.isNull("ratingCount3")) {
            this.f14224t = jSONObject.getInt("ratingCount3");
        }
        if (!jSONObject.isNull("ratingCount4")) {
            this.f14226u = jSONObject.getInt("ratingCount4");
        }
        if (!jSONObject.isNull("ratingCount5")) {
            this.f14228v = jSONObject.getInt("ratingCount5");
        }
        if (!jSONObject.isNull("packagename")) {
            this.f14230w = jSONObject.getString("packagename");
        } else if (!jSONObject.isNull("packageName")) {
            this.f14230w = jSONObject.getString("packageName");
        }
        if (!jSONObject.isNull("categoryData")) {
            C1644k c1644k = new C1644k(0, null, null, 7, null);
            this.f14232x = c1644k;
            AbstractC3255y.f(c1644k);
            JSONObject jSONObject2 = jSONObject.getJSONObject("categoryData");
            AbstractC3255y.h(jSONObject2, "jsonObjectData.getJSONObject(\"categoryData\")");
            c1644k.v(jSONObject2);
        }
        if (!jSONObject.isNull("permissionCount")) {
            this.f14234y = jSONObject.getInt("permissionCount");
        }
        if (!jSONObject.isNull("md5Signature")) {
            this.f14170D = jSONObject.getString("md5Signature");
        }
        if (!jSONObject.isNull("activeADEX")) {
            this.f14168C = jSONObject.getInt("activeADEX");
        }
        if (!jSONObject.isNull("pegi")) {
            this.f14174F = jSONObject.getString("pegi");
        }
        if (!jSONObject.isNull("technicalData")) {
            this.f14178H = jSONObject.getString("technicalData");
        }
        if (!jSONObject.isNull("versionRequired")) {
            this.f14180I = jSONObject.getString("versionRequired");
        }
        if (!jSONObject.isNull("fromUnity")) {
            this.f14182J = jSONObject.getInt("fromUnity");
        }
        if (!jSONObject.isNull("compatibleFile")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("compatibleFile");
            if (!jSONObject3.isNull("densities")) {
                JSONArray jSONArray = jSONObject3.getJSONArray("densities");
                this.f14184K = new ArrayList();
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    ArrayList arrayList = this.f14184K;
                    if (arrayList != null) {
                        arrayList.add(jSONArray.getString(i8));
                    }
                }
            }
            if (!jSONObject3.isNull("abis")) {
                JSONArray jSONArray2 = jSONObject3.getJSONArray("abis");
                this.f14186L = new ArrayList();
                int length2 = jSONArray2.length();
                for (int i9 = 0; i9 < length2; i9++) {
                    ArrayList arrayList2 = this.f14186L;
                    if (arrayList2 != null) {
                        arrayList2.add(jSONArray2.getString(i9));
                    }
                }
            }
            if (!jSONObject3.isNull("fileID")) {
                this.f14164A = jSONObject3.getLong("fileID");
            }
            if (!jSONObject3.isNull("minSDK")) {
                this.f14236z = jSONObject3.getString("minSDK");
            }
            if (!jSONObject3.isNull("version")) {
                this.f14203c = jSONObject3.getString("version");
            }
            if (!jSONObject3.isNull("sha256")) {
                this.f14176G = jSONObject3.getString("sha256");
            }
            if (!jSONObject3.isNull("url_apk")) {
                this.f14172E = jSONObject3.getString("url_apk");
            }
        }
        if (!jSONObject.isNull("website")) {
            this.f14187M = jSONObject.getString("website");
        }
        if (!jSONObject.isNull("downloadStatus")) {
            String string2 = jSONObject.getString("downloadStatus");
            this.f14188N = string2;
            if (j6.n.t(string2, "PreRegister", false, 2, null)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("preRegister");
                if (!jSONObject4.isNull("date")) {
                    this.f14197W = jSONObject4.getString("date");
                }
                if (!jSONObject4.isNull("countPreRegistered")) {
                    this.f14198X = jSONObject4.getString("countPreRegistered");
                }
            }
        }
        if (!jSONObject.isNull("newFeatures")) {
            this.f14199Y = jSONObject.getString("newFeatures");
        }
        if (!jSONObject.isNull("onBoard")) {
            this.f14200Z = jSONObject.getInt("onBoard");
        }
        if (!jSONObject.isNull("responsibilities")) {
            this.f14217p0 = jSONObject.getString("responsibilities");
        }
        if (!jSONObject.isNull(TypedValues.CycleType.S_WAVE_PHASE)) {
            this.f14219q0 = jSONObject.getString(TypedValues.CycleType.S_WAVE_PHASE);
        }
        if (!jSONObject.isNull("deviceType")) {
            this.f14221r0 = jSONObject.getString("deviceType");
        }
        if (!jSONObject.isNull("translations")) {
            this.f14173E0 = new HashMap();
            if (jSONObject.getJSONObject("translations") != null) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("translations");
                if (!jSONObject5.isNull("try")) {
                    HashMap hashMap = this.f14173E0;
                    AbstractC3255y.f(hashMap);
                    String string3 = jSONObject5.getString("try");
                    AbstractC3255y.h(string3, "jsonObjectTranslations.g…ring(TRANSLATION_KEY_TRY)");
                    hashMap.put("try", string3);
                }
                if (!jSONObject5.isNull("supportedDevice")) {
                    HashMap hashMap2 = this.f14173E0;
                    AbstractC3255y.f(hashMap2);
                    String string4 = jSONObject5.getString("supportedDevice");
                    AbstractC3255y.h(string4, "jsonObjectTranslations.g…ION_KEY_SUPPORTED_DEVICE)");
                    hashMap2.put("supportedDevice", string4);
                }
            }
        }
        if (!jSONObject.isNull("readingModeText")) {
            this.f14223s0 = jSONObject.getString("readingModeText");
        }
        if (!jSONObject.isNull("externalDownloadURL")) {
            this.f14225t0 = jSONObject.getString("externalDownloadURL");
        }
        if (!jSONObject.isNull("externalDownloadText")) {
            this.f14227u0 = jSONObject.getString("externalDownloadText");
        }
        if (!jSONObject.isNull("organizationID")) {
            this.f14229v0 = jSONObject.getLong("organizationID");
        }
        if (!jSONObject.isNull("editorNameNew")) {
            this.f14231w0 = jSONObject.getString("editorNameNew");
        }
        if (!jSONObject.isNull("editorAvatar")) {
            this.f14233x0 = jSONObject.getString("editorAvatar");
        }
        if (!jSONObject.isNull("showReviewedBy")) {
            this.f14167B0 = jSONObject.getInt("showReviewedBy");
        }
        if (!jSONObject.isNull("editorJobTitle")) {
            this.f14235y0 = jSONObject.getString("editorJobTitle");
        }
        if (!jSONObject.isNull("totalVersions")) {
            this.f14237z0 = jSONObject.getInt("totalVersions");
        }
        if (!jSONObject.isNull("disclaimerText")) {
            this.f14165A0 = jSONObject.getString("disclaimerText");
        }
        if (!jSONObject.isNull("tagID")) {
            int i10 = jSONObject.getInt("tagID");
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 == 5) {
                                    this.f14171D0 = c.EDITOR_CHOICE;
                                }
                            } else {
                                this.f14171D0 = c.PROMOTED;
                            }
                        } else {
                            this.f14171D0 = c.UPDATE;
                        }
                    } else {
                        this.f14171D0 = c.LATEST;
                    }
                } else {
                    this.f14171D0 = c.TRENDING;
                }
            } else {
                this.f14171D0 = c.NONE;
            }
            if (!jSONObject.isNull("tag")) {
                this.f14169C0 = jSONObject.getString("tag");
            }
        }
        if (!jSONObject.isNull("promoted")) {
            this.f14175F0 = jSONObject.getInt("promoted");
        }
        if (!jSONObject.isNull("containsAds")) {
            this.f14177G0 = jSONObject.getInt("containsAds");
        }
        if (!jSONObject.isNull("hasAlternatives")) {
            if (jSONObject.getBoolean("hasAlternatives")) {
                this.f14179H0 = 1;
            } else {
                this.f14179H0 = 0;
            }
        }
    }

    public final int A0() {
        return this.f14234y;
    }

    public final void A1(ArrayList arrayList) {
        this.f14192R = arrayList;
    }

    public final String B0() {
        return this.f14219q0;
    }

    public final void B1(H h8) {
        this.f14196V = h8;
    }

    public final String C0() {
        return this.f14197W;
    }

    public final void C1(ArrayList arrayList) {
        this.f14189O = arrayList;
    }

    public final String D0() {
        return this.f14198X;
    }

    public final void D1(ArrayList arrayList) {
        this.f14194T = arrayList;
    }

    public final ArrayList E0() {
        return this.f14191Q;
    }

    public final void E1(ArrayList arrayList) {
        this.f14190P = arrayList;
    }

    public final int F0() {
        return this.f14216p;
    }

    public final void F1(ArrayList arrayList) {
        this.f14195U = arrayList;
    }

    public final int G0() {
        return this.f14218q;
    }

    public final String H() {
        return this.f14172E;
    }

    public final int H0() {
        return this.f14220r;
    }

    public final int I0() {
        return this.f14222s;
    }

    public final int J() {
        return this.f14209i;
    }

    public final int J0() {
        return this.f14224t;
    }

    public final int K0() {
        return this.f14226u;
    }

    public final int L0() {
        return this.f14228v;
    }

    public final String M0() {
        return this.f14223s0;
    }

    public final ArrayList N0() {
        return this.f14192R;
    }

    public final H O0() {
        return this.f14196V;
    }

    public final String P0() {
        return this.f14217p0;
    }

    public final ArrayList Q0() {
        return this.f14189O;
    }

    public final ArrayList R0() {
        return this.f14194T;
    }

    public final String S0() {
        return this.f14176G;
    }

    public final String T0() {
        return this.f14206f;
    }

    public final String U() {
        return this.f14233x0;
    }

    public final int U0() {
        return this.f14167B0;
    }

    public final ArrayList V0() {
        return this.f14190P;
    }

    public final String W() {
        return this.f14235y0;
    }

    public final String W0() {
        return this.f14207g;
    }

    public final String X() {
        return this.f14231w0;
    }

    public final ArrayList X0() {
        return this.f14186L;
    }

    public final String Y() {
        return this.f14227u0;
    }

    public final ArrayList Y0() {
        return this.f14184K;
    }

    public final String Z() {
        return this.f14225t0;
    }

    public final String Z0() {
        return this.f14169C0;
    }

    public final void a(JSONObject jsonObjectData) {
        AbstractC3255y.i(jsonObjectData, "jsonObjectData");
        if (jsonObjectData.has(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
            JSONObject jSONObject = jsonObjectData.getJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            AbstractC3255y.h(jSONObject, "jsonObjectData.getJSONObject(\"app\")");
            s1(jSONObject);
        } else {
            s1(jsonObjectData);
        }
        if (jsonObjectData.has("videos")) {
            JSONArray jSONArray = jsonObjectData.getJSONArray("videos");
            this.f14195U = new ArrayList();
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                T.b bVar = T.f14073c;
                Object obj = jSONArray.get(i8);
                AbstractC3255y.g(obj, "null cannot be cast to non-null type org.json.JSONObject");
                T a8 = bVar.a((JSONObject) obj);
                ArrayList arrayList = this.f14195U;
                AbstractC3255y.f(arrayList);
                arrayList.add(a8);
            }
        }
        if (jsonObjectData.has("screenshots")) {
            JSONArray jSONArray2 = jsonObjectData.getJSONArray("screenshots");
            this.f14194T = new ArrayList();
            int length2 = jSONArray2.length();
            for (int i9 = 0; i9 < length2; i9++) {
                L.b bVar2 = L.f14027e;
                Object obj2 = jSONArray2.get(i9);
                AbstractC3255y.g(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                L b8 = bVar2.b((JSONObject) obj2);
                ArrayList arrayList2 = this.f14194T;
                if (arrayList2 != null) {
                    arrayList2.add(b8);
                }
            }
        }
    }

    public final ArrayList a0() {
        return this.f14193S;
    }

    public final c a1() {
        return this.f14171D0;
    }

    public final boolean b() {
        if (!r1() && !o1() && l1()) {
            return true;
        }
        return false;
    }

    public final String b0() {
        return this.f14213m;
    }

    public final String b1() {
        return this.f14178H;
    }

    public final String c0() {
        if (this.f14213m != null) {
            UptodownApp.a aVar = UptodownApp.f29058B;
            if (aVar.A() > 0) {
                return this.f14213m + ':' + aVar.A() + ":webp";
            }
            return e0();
        }
        return null;
    }

    public final int c1() {
        return this.f14237z0;
    }

    public final String d0() {
        if (this.f14213m != null) {
            return this.f14213m + UptodownApp.f29058B.q() + ":webp";
        }
        return null;
    }

    public final String d1(String key) {
        AbstractC3255y.i(key, "key");
        HashMap hashMap = this.f14173E0;
        if (hashMap != null) {
            return (String) hashMap.get(key);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e0() {
        if (this.f14213m != null) {
            return this.f14213m + UptodownApp.f29058B.r() + ":webp";
        }
        return null;
    }

    public final String e1() {
        return this.f14205e;
    }

    public final long f0() {
        return this.f14164A;
    }

    public final long f1() {
        return this.f14166B;
    }

    public final String g() {
        String str = this.f14197W;
        if (str != null && str.length() != 0) {
            String str2 = this.f14197W;
            AbstractC3255y.f(str2);
            return j6.n.A(str2, "-", "/", false, 4, null);
        }
        return null;
    }

    public final int g0() {
        return this.f14182J;
    }

    public final String g1() {
        return this.f14203c;
    }

    public final int h() {
        return this.f14168C;
    }

    public final int h0() {
        return this.f14179H0;
    }

    public final String h1() {
        return this.f14180I;
    }

    public final long i() {
        return this.f14201a;
    }

    public final String i0() {
        if (this.f14213m != null) {
            return this.f14213m + UptodownApp.f29058B.s() + ":webp";
        }
        return null;
    }

    public final ArrayList i1() {
        return this.f14195U;
    }

    public final String j0() {
        return this.f14212l;
    }

    public final String j1() {
        return this.f14187M;
    }

    public final String k0(int i8) {
        if (this.f14212l != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(':');
            sb.append(i8);
            return this.f14212l + sb.toString() + ":webp";
        }
        return null;
    }

    public final boolean k1() {
        if (this.f14164A >= 0) {
            return true;
        }
        return false;
    }

    public final long l(I responseJson) {
        int i8;
        JSONObject jSONObject;
        AbstractC3255y.i(responseJson, "responseJson");
        try {
            if (!responseJson.b() && responseJson.d() != null) {
                String d8 = responseJson.d();
                AbstractC3255y.f(d8);
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

    public final String l0() {
        if (this.f14212l != null) {
            return this.f14212l + UptodownApp.f29058B.t() + ":webp";
        }
        return null;
    }

    public final boolean l1() {
        if (this.f14237z0 > 1) {
            return true;
        }
        return false;
    }

    public final String m0() {
        if (this.f14212l != null) {
            return this.f14212l + UptodownApp.f29058B.u() + ":webp";
        }
        return null;
    }

    public final boolean m1() {
        return AbstractC3255y.d(this.f14188N, "Discontinued");
    }

    public final String n0() {
        return this.f14211k;
    }

    public final boolean n1() {
        if (this.f14188N != null && !p1() && !m1() && !o1() && !r1()) {
            return true;
        }
        return false;
    }

    public final long o0() {
        return this.f14204d;
    }

    public final boolean o1() {
        return AbstractC3255y.d(this.f14188N, "ExternalDownload");
    }

    public final String p() {
        return this.f14214n;
    }

    public final String p0() {
        return this.f14208h;
    }

    public final boolean p1() {
        return AbstractC3255y.d(this.f14188N, "PreRegister");
    }

    public final String q0() {
        return this.f14170D;
    }

    public final boolean q1() {
        if (this.f14175F0 == 1) {
            return true;
        }
        return false;
    }

    public final String r0() {
        return this.f14236z;
    }

    public final boolean r1() {
        return AbstractC3255y.d(this.f14188N, "ReadingMode");
    }

    public final C1644k s() {
        return this.f14232x;
    }

    public final String s0() {
        return this.f14202b;
    }

    public final String t0() {
        return this.f14199Y;
    }

    public final void t1(long j8) {
        this.f14201a = j8;
    }

    public String toString() {
        return "AppInfo(appID=" + this.f14201a + ", name=" + this.f14202b + ", versionName=" + this.f14203c + ", lastVersionCode=" + this.f14204d + ", urlShare=" + this.f14205e + ", shortDescription=" + this.f14206f + ", size=" + this.f14207g + ", license=" + this.f14208h + ", downloads=" + this.f14209i + ", weeklyDownloads=" + this.f14210j + ", lastUpdate=" + this.f14211k + ", icon=" + this.f14212l + ", feature=" + this.f14213m + ", author=" + this.f14214n + ", description=" + this.f14215o + ", rating=" + this.f14216p + ", ratingCount=" + this.f14218q + ", ratingCount1=" + this.f14220r + ", ratingCount2=" + this.f14222s + ", ratingCount3=" + this.f14224t + ", ratingCount4=" + this.f14226u + ", ratingCount5=" + this.f14228v + ", packagename=" + this.f14230w + ", screenShots=" + this.f14194T + ", category=" + this.f14232x + ", permissionCount=" + this.f14234y + ", minsdk=" + this.f14236z + ", similars=" + this.f14190P + ", promotedApps=" + this.f14191Q + ", relatedPosts=" + this.f14192R + ", md5signature=" + this.f14170D + ", downloadUrl=" + this.f14172E + ", reviews=" + this.f14189O + ", fileID=" + this.f14164A + ", oldVersions=" + this.f14185K0 + ", activeADEX=" + this.f14168C + ", sha256=" + this.f14176G + ", technicalData=" + this.f14178H + ", versionRequired=" + this.f14180I + ", fromUnity=" + this.f14182J + ", webAuthor=" + this.f14187M + ", downloadStatus=" + this.f14188N + ", devOnBoard=" + this.f14200Z + ", responsibilities=" + this.f14217p0 + ", phase=" + this.f14219q0 + ", readingModeText=" + this.f14223s0 + ", externalDownloadUrl=" + this.f14225t0 + ", externalDownloadText=" + this.f14227u0 + ", organizationID=" + this.f14229v0 + ", editorName=" + this.f14231w0 + ", totalVersions=" + this.f14237z0 + ", disclaimerText=" + this.f14165A0 + ')';
    }

    public final int u() {
        return this.f14177G0;
    }

    public final boolean u0() {
        return this.f14181I0;
    }

    public final void u1(ArrayList arrayList) {
        this.f14193S = arrayList;
    }

    public final String v() {
        return this.f14215o;
    }

    public final boolean v0() {
        return this.f14183J0;
    }

    public final void v1(String str) {
        this.f14213m = str;
    }

    public final int w() {
        return this.f14200Z;
    }

    public final ArrayList w0() {
        return this.f14185K0;
    }

    public final void w1(boolean z8) {
        this.f14181I0 = z8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeLong(this.f14201a);
        parcel.writeString(this.f14202b);
        parcel.writeString(this.f14203c);
        parcel.writeLong(this.f14204d);
        parcel.writeString(this.f14205e);
        parcel.writeString(this.f14206f);
        parcel.writeString(this.f14207g);
        parcel.writeString(this.f14208h);
        parcel.writeInt(this.f14209i);
        parcel.writeInt(this.f14210j);
        parcel.writeString(this.f14211k);
        parcel.writeString(this.f14212l);
        parcel.writeString(this.f14213m);
        parcel.writeString(this.f14214n);
        parcel.writeString(this.f14215o);
        parcel.writeInt(this.f14216p);
        parcel.writeInt(this.f14218q);
        parcel.writeInt(this.f14220r);
        parcel.writeInt(this.f14222s);
        parcel.writeInt(this.f14224t);
        parcel.writeInt(this.f14226u);
        parcel.writeInt(this.f14228v);
        parcel.writeString(this.f14230w);
        parcel.writeParcelable(this.f14232x, i8);
        parcel.writeInt(this.f14234y);
        parcel.writeString(this.f14236z);
        parcel.writeString(this.f14170D);
        parcel.writeString(this.f14172E);
        parcel.writeLong(this.f14164A);
        parcel.writeInt(this.f14168C);
        parcel.writeString(this.f14176G);
        parcel.writeString(this.f14178H);
        parcel.writeString(this.f14180I);
        parcel.writeInt(this.f14182J);
        parcel.writeStringList(this.f14184K);
        parcel.writeStringList(this.f14186L);
        parcel.writeString(this.f14187M);
        parcel.writeString(this.f14188N);
        parcel.writeString(this.f14174F);
        parcel.writeInt(this.f14200Z);
        parcel.writeString(this.f14221r0);
        parcel.writeMap(this.f14173E0);
        parcel.writeString(this.f14223s0);
        parcel.writeString(this.f14225t0);
        parcel.writeString(this.f14227u0);
        parcel.writeLong(this.f14229v0);
        parcel.writeString(this.f14231w0);
        parcel.writeInt(this.f14237z0);
        parcel.writeString(this.f14217p0);
        parcel.writeString(this.f14199Y);
        parcel.writeString(this.f14197W);
        parcel.writeString(this.f14198X);
        parcel.writeString(this.f14233x0);
        parcel.writeString(this.f14235y0);
        parcel.writeString(this.f14165A0);
        parcel.writeInt(this.f14167B0);
        parcel.writeInt(this.f14177G0);
        parcel.writeInt(this.f14179H0);
    }

    public final String x() {
        return this.f14221r0;
    }

    public final long x0() {
        return this.f14229v0;
    }

    public final void x1(boolean z8) {
        this.f14183J0 = z8;
    }

    public final String y() {
        return this.f14165A0;
    }

    public final String y0() {
        return this.f14230w;
    }

    public final void y1(ArrayList arrayList) {
        this.f14185K0 = arrayList;
    }

    public final String z() {
        return this.f14188N;
    }

    public final String z0() {
        return this.f14174F;
    }

    public final void z1(ArrayList arrayList) {
        this.f14191Q = arrayList;
    }

    public C1641h(Parcel source) {
        Object readParcelable;
        AbstractC3255y.i(source, "source");
        this.f14204d = -1L;
        this.f14164A = -1L;
        this.f14166B = -1L;
        this.f14171D0 = c.NONE;
        this.f14173E0 = new HashMap();
        this.f14201a = source.readLong();
        this.f14202b = source.readString();
        this.f14203c = source.readString();
        this.f14204d = source.readLong();
        this.f14205e = source.readString();
        this.f14206f = source.readString();
        this.f14207g = source.readString();
        this.f14208h = source.readString();
        this.f14209i = source.readInt();
        this.f14210j = source.readInt();
        this.f14211k = source.readString();
        this.f14212l = source.readString();
        this.f14213m = source.readString();
        this.f14214n = source.readString();
        this.f14215o = source.readString();
        this.f14216p = source.readInt();
        this.f14218q = source.readInt();
        this.f14220r = source.readInt();
        this.f14222s = source.readInt();
        this.f14224t = source.readInt();
        this.f14226u = source.readInt();
        this.f14228v = source.readInt();
        this.f14230w = source.readString();
        if (Build.VERSION.SDK_INT >= 33) {
            readParcelable = source.readParcelable(C1644k.class.getClassLoader(), C1644k.class);
            this.f14232x = (C1644k) readParcelable;
        } else {
            this.f14232x = (C1644k) source.readParcelable(C1644k.class.getClassLoader());
        }
        this.f14234y = source.readInt();
        this.f14236z = source.readString();
        this.f14170D = source.readString();
        this.f14172E = source.readString();
        this.f14164A = source.readLong();
        this.f14168C = source.readInt();
        this.f14176G = source.readString();
        this.f14178H = source.readString();
        this.f14180I = source.readString();
        this.f14182J = source.readInt();
        this.f14184K = source.createStringArrayList();
        this.f14186L = source.createStringArrayList();
        this.f14187M = source.readString();
        this.f14188N = source.readString();
        this.f14174F = source.readString();
        this.f14200Z = source.readInt();
        this.f14221r0 = source.readString();
        HashMap readHashMap = source.readHashMap(ClassLoader.getSystemClassLoader());
        AbstractC3255y.g(readHashMap, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
        this.f14173E0 = readHashMap;
        this.f14223s0 = source.readString();
        this.f14225t0 = source.readString();
        this.f14227u0 = source.readString();
        this.f14229v0 = source.readLong();
        this.f14231w0 = source.readString();
        this.f14237z0 = source.readInt();
        this.f14217p0 = source.readString();
        this.f14199Y = source.readString();
        this.f14197W = source.readString();
        this.f14198X = source.readString();
        this.f14233x0 = source.readString();
        this.f14235y0 = source.readString();
        this.f14165A0 = source.readString();
        this.f14167B0 = source.readInt();
        this.f14177G0 = source.readInt();
        this.f14179H0 = source.readInt();
    }
}
