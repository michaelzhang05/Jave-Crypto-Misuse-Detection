package l5;

import X4.C1496f;
import X4.C1498h;
import X4.C1504n;
import X4.C1506p;
import X4.I;
import X4.K;
import X4.M;
import X4.Q;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.uptodown.activities.preferences.SettingsPreferences;
import g6.C2728d;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m5.C3438c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l5.F, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3312F {

    /* renamed from: c, reason: collision with root package name */
    public static final a f34485c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f34486a;

    /* renamed from: b, reason: collision with root package name */
    private Y4.d f34487b;

    /* renamed from: l5.F$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final byte[] a(String string) {
            AbstractC3159y.i(string, "string");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(string.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bytes = string.getBytes(C2728d.f31293b);
            AbstractC3159y.h(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            byte[] compressed = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            AbstractC3159y.h(compressed, "compressed");
            return compressed;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0011. Please report as an issue. */
        public final String b(String str) {
            String str2;
            if (str == null) {
                return "en";
            }
            switch (str.hashCode()) {
                case 3121:
                    str2 = "ar";
                    if (!str.equals("ar")) {
                        return "en";
                    }
                    return str2;
                case 3179:
                    if (!str.equals("cn")) {
                        return "en";
                    }
                    return "cn";
                case 3201:
                    str2 = DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR;
                    if (!str.equals(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR)) {
                        return "en";
                    }
                    return str2;
                case 3241:
                    str.equals("en");
                    return "en";
                case 3246:
                    str2 = "es";
                    if (!str.equals("es")) {
                        return "en";
                    }
                    return str2;
                case 3276:
                    str2 = "fr";
                    if (!str.equals("fr")) {
                        return "en";
                    }
                    return str2;
                case 3329:
                    if (!str.equals("hi")) {
                        return "en";
                    }
                    return "in";
                case 3355:
                    if (!str.equals("id")) {
                        return "en";
                    }
                    return "id";
                case 3365:
                    if (!str.equals("in")) {
                        return "en";
                    }
                    return "id";
                case 3371:
                    str2 = "it";
                    if (!str.equals("it")) {
                        return "en";
                    }
                    return str2;
                case 3383:
                    if (!str.equals("ja")) {
                        return "en";
                    }
                    return "jp";
                case 3428:
                    if (!str.equals("ko")) {
                        return "en";
                    }
                    return "kr";
                case 3431:
                    if (!str.equals("kr")) {
                        return "en";
                    }
                    return "kr";
                case 3588:
                    if (!str.equals("pt")) {
                        return "en";
                    }
                    return TtmlNode.TAG_BR;
                case 3645:
                    str2 = "ro";
                    if (!str.equals("ro")) {
                        return "en";
                    }
                    return str2;
                case 3651:
                    str2 = "ru";
                    if (!str.equals("ru")) {
                        return "en";
                    }
                    return str2;
                case 3700:
                    str2 = "th";
                    if (!str.equals("th")) {
                        return "en";
                    }
                    return str2;
                case 3710:
                    str2 = "tr";
                    if (!str.equals("tr")) {
                        return "en";
                    }
                    return str2;
                case 3763:
                    str2 = "vi";
                    if (!str.equals("vi")) {
                        return "en";
                    }
                    return str2;
                case 3886:
                    if (!str.equals("zh")) {
                        return "en";
                    }
                    return "cn";
                default:
                    return "en";
            }
        }

        public final String c(Context context) {
            AbstractC3159y.i(context, "context");
            return g6.n.A("https://www.uptodown.com/turbo?platform=android", "www", b(SettingsPreferences.f29323b.q(context)), false, 4, null);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3312F(Context context) {
        AbstractC3159y.i(context, "context");
        this.f34486a = context;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final X4.I A(java.lang.String r26, java.util.HashMap r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 4519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C3312F.A(java.lang.String, java.util.HashMap, java.lang.String, boolean):X4.I");
    }

    static /* synthetic */ I B(C3312F c3312f, String str, HashMap hashMap, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        return c3312f.A(str, hashMap, str2, z8);
    }

    private final I C(String str, HashMap hashMap) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        if (this.f34487b != null) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "\n*******Request*******\n" + str);
            Y4.d dVar = this.f34487b;
            if (dVar != null) {
                dVar.send(137, bundle);
            }
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                jSONObject3.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject = jSONObject3;
        } else {
            jSONObject = null;
        }
        I a8 = new C3438c().a(jSONObject2, jSONObject, this.f34487b, this.f34486a, str);
        a8.a(this.f34486a);
        return a8;
    }

    private final JSONArray C0(ArrayList arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                JSONObject jSONObject = new JSONObject();
                if (((C1496f) arrayList.get(i8)).e() != null) {
                    jSONObject.put("name", ((C1496f) arrayList.get(i8)).e());
                } else if (((C1496f) arrayList.get(i8)).I() != null) {
                    jSONObject.put("name", ((C1496f) arrayList.get(i8)).I());
                } else if (((C1496f) arrayList.get(i8)).Q() != null) {
                    jSONObject.put("name", ((C1496f) arrayList.get(i8)).Q());
                }
                jSONObject.put("packagename", ((C1496f) arrayList.get(i8)).Q());
                if (((C1496f) arrayList.get(i8)).Q() != null) {
                    C3319g c3319g = new C3319g();
                    Context context = this.f34486a;
                    String Q8 = ((C1496f) arrayList.get(i8)).Q();
                    AbstractC3159y.f(Q8);
                    String h8 = c3319g.h(context, Q8);
                    if (new C3319g().w(h8)) {
                        jSONObject.put("installerPackagename", h8);
                    }
                }
                jSONObject.put("versionCode", ((C1496f) arrayList.get(i8)).f0());
                jSONObject.put("versionName", ((C1496f) arrayList.get(i8)).h0());
                jSONObject.put("isSystemApp", ((C1496f) arrayList.get(i8)).k0());
                jSONObject.put("md5", ((C1496f) arrayList.get(i8)).u());
                jSONObject.put("sha256Base", ((C1496f) arrayList.get(i8)).X());
                jSONObject.put("md5Signature", ((C1496f) arrayList.get(i8)).z());
                jSONObject.put("minSDKVersion", ((C1496f) arrayList.get(i8)).G());
                if (((C1496f) arrayList.get(i8)).d0() > 0) {
                    jSONObject.put("targetSDKVersion", ((C1496f) arrayList.get(i8)).d0());
                }
                if (((C1496f) arrayList.get(i8)).L() != null) {
                    AbstractC3159y.f(((C1496f) arrayList.get(i8)).L());
                    if (!r5.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList L8 = ((C1496f) arrayList.get(i8)).L();
                        AbstractC3159y.f(L8);
                        Iterator it = L8.iterator();
                        while (it.hasNext()) {
                            X4.r rVar = (X4.r) it.next();
                            if (rVar.b() != null && rVar.d() != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("name", rVar.c());
                                jSONObject2.put("md5", rVar.b());
                                jSONObject2.put("sha256", rVar.d());
                                jSONArray2.put(jSONObject2);
                            }
                        }
                        if (jSONArray2.length() > 0) {
                            jSONObject.put("obbs", jSONArray2);
                        }
                    }
                }
                if (((C1496f) arrayList.get(i8)).b0() != null) {
                    AbstractC3159y.f(((C1496f) arrayList.get(i8)).b0());
                    if (!r5.isEmpty()) {
                        JSONArray jSONArray3 = new JSONArray();
                        ArrayList b02 = ((C1496f) arrayList.get(i8)).b0();
                        AbstractC3159y.f(b02);
                        Iterator it2 = b02.iterator();
                        while (it2.hasNext()) {
                            X4.r rVar2 = (X4.r) it2.next();
                            if (rVar2.b() != null && rVar2.d() != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", rVar2.c());
                                jSONObject3.put("md5", rVar2.b());
                                jSONObject3.put("sha256", rVar2.d());
                                jSONArray3.put(jSONObject3);
                            }
                        }
                        if (jSONArray3.length() > 0) {
                            jSONObject.put("splits", jSONArray3);
                        }
                    }
                }
                if (jSONObject.length() > 0) {
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private final String D0(C1504n c1504n) {
        String jSONObject = c1504n.j().toString(2);
        AbstractC3159y.h(jSONObject, "jsonObjectDevice.toString(2)");
        return jSONObject;
    }

    private final String E0(X4.w wVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (wVar.c() > 0) {
                jSONObject.put("total_memory", wVar.c());
            }
            if (wVar.a() > 0) {
                jSONObject.put("free_memory", wVar.a());
            }
            if (wVar.d() > 0) {
                jSONObject.put("total_ram_memory", wVar.d());
            }
            if (wVar.a() > 0) {
                jSONObject.put("free_ram_memory", wVar.b());
            }
            String jSONObject2 = jSONObject.toString(2);
            AbstractC3159y.h(jSONObject2, "jsonObject.toString(2)");
            return jSONObject2;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return "";
        }
    }

    private final JSONObject G0(M m8) {
        if (m8 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lang", m8.d());
                if (m8.i()) {
                    jSONObject.put("notifications_on", 1);
                } else {
                    jSONObject.put("notifications_on", 0);
                }
                jSONObject.put("notifications_frecuency", Integer.parseInt(m8.c()));
                if (m8.j()) {
                    jSONObject.put("only_wifi", 1);
                } else {
                    jSONObject.put("only_wifi", 0);
                }
                jSONObject.put("download_updates_options", m8.g());
                if (m8.f()) {
                    jSONObject.put("delete_apk", 1);
                } else {
                    jSONObject.put("delete_apk", 0);
                }
                if (m8.h()) {
                    jSONObject.put("install_apk_root", 1);
                } else {
                    jSONObject.put("install_apk_root", 0);
                }
                jSONObject.put("versioncode", m8.e());
                return jSONObject;
            } catch (JSONException e8) {
                e8.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private final String L(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        boolean z8 = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (z8) {
                z8 = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(str, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
            sb.append("=");
            sb.append(URLEncoder.encode(str2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME));
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "result.toString()");
        return sb2;
    }

    public static /* synthetic */ I k0(C3312F c3312f, String str, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return c3312f.j0(str, i8);
    }

    public static /* synthetic */ I m0(C3312F c3312f, String str, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return c3312f.l0(str, i8);
    }

    private final HashMap r() {
        HashMap hashMap = new HashMap();
        C1504n c1504n = new C1504n();
        c1504n.i(this.f34486a);
        String c8 = c1504n.c();
        if (c8 != null && c8.length() != 0) {
            hashMap.put("countryIsoCode", c8);
        }
        return hashMap;
    }

    public final I A0(String email, String pass) {
        AbstractC3159y.i(email, "email");
        AbstractC3159y.i(pass, "pass");
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        String f8 = N4.d.f7201a.f(pass);
        AbstractC3159y.f(f8);
        hashMap.put(HintConstants.AUTOFILL_HINT_PASSWORD, f8);
        return B(this, C3324l.f34500a.a() + "/eapi/v2/user/login", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I B0(long j8, int i8, int i9) {
        C1504n c1504n = new C1504n();
        c1504n.h(this.f34486a);
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/app/" + j8 + "/device/" + c1504n.d() + "/compatible/versions", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I D(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/apps/latest-updates", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I E(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/apps/latest-updates-home", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I F() {
        return B(this, C3324l.f34500a.a() + "/eapi/main-app", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final ArrayList F0(I res) {
        int i8;
        JSONArray jSONArray;
        AbstractC3159y.i(res, "res");
        ArrayList arrayList = new ArrayList();
        if (!res.b() && res.d() != null) {
            String d8 = res.d();
            AbstractC3159y.f(d8);
            JSONObject jSONObject = new JSONObject(d8);
            if (!jSONObject.isNull("success")) {
                i8 = jSONObject.getInt("success");
            } else {
                i8 = 0;
            }
            if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
            } else {
                jSONArray = null;
            }
            if (i8 == 1 && jSONArray != null) {
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                    AbstractC3159y.h(jSONObject2, "jsonArrayTop.getJSONObject(i)");
                    arrayList.add(C1498h.f12542L0.a(jSONObject2));
                }
            }
        }
        return arrayList;
    }

    public final I G(long j8) {
        return A(C3324l.f34500a.a() + "/eapi/app/" + j8 + "/my-comment", null, ShareTarget.METHOD_GET, true);
    }

    public final I H(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/apps/new-releases", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I H0(long j8, String text) {
        String str;
        AbstractC3159y.i(text, "text");
        HashMap hashMap = new HashMap();
        hashMap.put(MimeTypes.BASE_TYPE_TEXT, text);
        try {
            PackageManager packageManager = this.f34486a.getPackageManager();
            AbstractC3159y.h(packageManager, "context.packageManager");
            String packageName = this.f34486a.getPackageName();
            AbstractC3159y.h(packageName, "context.packageName");
            str = ' ' + N4.q.d(packageManager, packageName, 0).versionName;
        } catch (Exception e8) {
            e8.printStackTrace();
            str = "";
        }
        hashMap.put("uagent", "uptodownandroid" + str);
        return A(C3324l.f34500a.a() + "/eapi/comments/" + j8 + "/answers", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I I(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/apps/new-releases-home", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I I0(long j8, K review) {
        String str;
        String str2;
        AbstractC3159y.i(review, "review");
        HashMap hashMap = new HashMap();
        if (review.o() != null) {
            String o8 = review.o();
            AbstractC3159y.f(o8);
            if (o8.length() > 0) {
                String o9 = review.o();
                AbstractC3159y.f(o9);
                hashMap.put(MimeTypes.BASE_TYPE_TEXT, o9);
            }
        }
        hashMap.put(CampaignEx.JSON_KEY_STAR, String.valueOf(review.n()));
        try {
            PackageManager packageManager = this.f34486a.getPackageManager();
            AbstractC3159y.h(packageManager, "context.packageManager");
            String packageName = this.f34486a.getPackageName();
            AbstractC3159y.h(packageName, "context.packageName");
            str = ' ' + N4.q.d(packageManager, packageName, 0).versionName;
        } catch (Exception e8) {
            e8.printStackTrace();
            str = "";
        }
        hashMap.put("uagent", "uptodownandroid" + str);
        Q e9 = Q.f12437k.e(this.f34486a);
        if (e9 != null) {
            str2 = e9.getId();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            String id = e9.getId();
            AbstractC3159y.f(id);
            hashMap.put("id_user", id);
        }
        return A(C3324l.f34500a.a() + "/eapi/apps/" + j8 + "/comments", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I J(long j8, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i8));
        return B(this, C3324l.f34500a.a() + "/eapi/organization/" + j8 + "/apps", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I J0(String email, String email2) {
        AbstractC3159y.i(email, "email");
        AbstractC3159y.i(email2, "email2");
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        hashMap.put("email2", email2);
        return B(this, C3324l.f34500a.a() + "/eapi/user/recoverPasswordMail", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I K(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/organization/" + j8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I K0(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/apps/" + j8 + "/relatedPosts", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I L0(C1504n device, boolean z8) {
        AbstractC3159y.i(device, "device");
        JSONObject j8 = device.j();
        String str = C3324l.f34500a.b() + "/eapi/v2/tracker/device";
        HashMap hashMap = new HashMap();
        String jSONObject = j8.toString();
        AbstractC3159y.h(jSONObject, "jsonObjectDevice.toString()");
        hashMap.put("device", jSONObject);
        if (z8) {
            return C(str, hashMap);
        }
        return B(this, str, hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I M(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/apps/" + j8 + "/permissions", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I M0(ArrayList apps, String identifier, boolean z8) {
        AbstractC3159y.i(apps, "apps");
        AbstractC3159y.i(identifier, "identifier");
        String str = C3324l.f34500a.b() + "/eapi/v3/tracker/apps/save";
        JSONArray C02 = C0(apps);
        if (this.f34487b != null) {
            Iterator it = apps.iterator();
            int i8 = 0;
            int i9 = 0;
            while (it.hasNext()) {
                C1496f c1496f = (C1496f) it.next();
                if (c1496f.b0() != null) {
                    ArrayList b02 = c1496f.b0();
                    AbstractC3159y.f(b02);
                    i8 += b02.size();
                }
                if (c1496f.L() != null) {
                    ArrayList L8 = c1496f.L();
                    AbstractC3159y.f(L8);
                    i9 += L8.size();
                }
            }
            String str2 = "apps count = " + apps.size() + ", splits count = " + i8 + ", obbs count = " + i9;
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str2);
            Y4.d dVar = this.f34487b;
            if (dVar != null) {
                dVar.send(137, bundle);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("identifier", identifier);
        hashMap.put("apps", String.valueOf(C02));
        hashMap.put("app_version", "627");
        if (z8) {
            return C(str, hashMap);
        }
        return B(this, str, hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I N(String identifier) {
        AbstractC3159y.i(identifier, "identifier");
        return B(this, C3324l.f34500a.a() + "/eapi/v2/virus-total-by-identifier/" + identifier + "/report", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I N0(String text, int i8, int i9) {
        String str;
        int i10;
        boolean z8;
        AbstractC3159y.i(text, "text");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        String str2 = null;
        try {
            String f8 = new g6.j("\\n").f(text, " ");
            int length = f8.length() - 1;
            int i11 = 0;
            boolean z9 = false;
            while (i11 <= length) {
                if (!z9) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (AbstractC3159y.k(f8.charAt(i10), 32) <= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z9) {
                    if (!z8) {
                        z9 = true;
                    } else {
                        i11++;
                    }
                } else {
                    if (!z8) {
                        break;
                    }
                    length--;
                }
            }
            str2 = f8.subSequence(i11, length + 1).toString();
            str = URLEncoder.encode(str2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        } catch (UnsupportedEncodingException e8) {
            e8.printStackTrace();
            str = str2;
        }
        return B(this, C3324l.f34500a.a() + "/eapi/v2/apps/search/" + str, hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I O(int i8, int i9, String orderBy, String direction) {
        AbstractC3159y.i(orderBy, "orderBy");
        AbstractC3159y.i(direction, "direction");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        hashMap.put("sort[field]", orderBy);
        hashMap.put("sort[direction]", direction);
        hashMap.putAll(r());
        return B(this, C3324l.f34500a.a() + "/eapi/pre-register", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I O0(C1504n device, M m8, Y4.d dVar) {
        String str;
        AbstractC3159y.i(device, "device");
        HashMap hashMap = new HashMap();
        String D02 = D0(device);
        hashMap.put("device", D02);
        JSONObject G02 = G0(m8);
        if (G02 != null) {
            str = G02.toString();
            hashMap.put("settings", str);
        } else {
            str = null;
        }
        if (dVar != null) {
            String e8 = g6.n.e("\n                " + ("\n*******Params*******\n\n\nDevice\n") + "\n                " + D02 + "\n                ");
            StringBuilder sb = new StringBuilder();
            sb.append(e8);
            sb.append("\n\nSettingsUTD\n");
            String e9 = g6.n.e("\n                " + sb.toString() + "\n                " + str + "\n                ");
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, e9);
            dVar.send(137, bundle);
        }
        return B(this, C3324l.f34500a.b() + "/eapi/v2/tracker/identifier/" + device.d() + "/settings", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I P() {
        return A(C3324l.f34500a.a() + "/eapi/pre-register-apps-by-user", r(), ShareTarget.METHOD_GET, true);
    }

    public final I P0(String email, String suggestion, C1504n device, X4.w memory) {
        AbstractC3159y.i(email, "email");
        AbstractC3159y.i(suggestion, "suggestion");
        AbstractC3159y.i(device, "device");
        AbstractC3159y.i(memory, "memory");
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        hashMap.put(NotificationCompat.CATEGORY_MESSAGE, suggestion);
        hashMap.put("device", D0(device));
        hashMap.put("memory", E0(memory));
        if (this.f34487b != null) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "\n*******Request sendSuggestion*******\n");
            Y4.d dVar = this.f34487b;
            if (dVar != null) {
                dVar.send(137, bundle);
            }
        }
        return B(this, C3324l.f34500a.a() + "/eapi/nativeapp/sendsuggestion", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I Q(long j8) {
        if (j8 == 0) {
            new C3330r(this.f34486a).a("getProgramAppIdZero");
            I i8 = new I();
            i8.j(MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", 0);
            i8.i(jSONObject.toString());
            return i8;
        }
        HashMap hashMap = new HashMap();
        C1504n c1504n = new C1504n();
        c1504n.i(this.f34486a);
        String c8 = c1504n.c();
        if (c8 != null && c8.length() != 0) {
            hashMap.put("countryIsoCode", c8);
        }
        return B(this, C3324l.f34500a.a() + "/eapi/v2/apps/" + j8 + "/device/" + c1504n.d(), hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I Q0(long j8) {
        HashMap hashMap = new HashMap();
        hashMap.put("avatarID", String.valueOf(j8));
        return A(C3324l.f34500a.a() + "/eapi/user/avatar", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I R(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/apps/" + j8 + "/promoted", new HashMap(), ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I R0(String name, String pass, String email) {
        AbstractC3159y.i(name, "name");
        AbstractC3159y.i(pass, "pass");
        AbstractC3159y.i(email, "email");
        HashMap hashMap = new HashMap();
        hashMap.put(HintConstants.AUTOFILL_HINT_USERNAME, name);
        String f8 = N4.d.f7201a.f(pass);
        AbstractC3159y.f(f8);
        hashMap.put(HintConstants.AUTOFILL_HINT_PASSWORD, f8);
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        hashMap.put("terms", "1");
        return B(this, C3324l.f34500a.a() + "/eapi/user/signup", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I S(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3324l.f34500a.a() + "/eapi/categories/" + i8 + "/apps/news", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I S0(String accessToken, String provider) {
        AbstractC3159y.i(accessToken, "accessToken");
        AbstractC3159y.i(provider, "provider");
        HashMap hashMap = new HashMap();
        hashMap.put("provider", provider);
        hashMap.put("accessToken", accessToken);
        return B(this, C3324l.f34500a.a() + "/eapi/user/usertokenSignup", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I T(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/v2/apps/recent/featured", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I T0(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/" + j8 + "/similar", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I U(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/comments/" + j8 + "/answers", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I V(long j8, int i8, int i9, String ordination) {
        AbstractC3159y.i(ordination, "ordination");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        hashMap.put("order", ordination);
        return B(this, C3324l.f34500a.a() + "/eapi/apps/" + j8 + "/comments", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I W(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/apps/" + j8 + "/comments-with-text", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I X(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/app/" + j8 + "/screenshots", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I Y(String identifier) {
        AbstractC3159y.i(identifier, "identifier");
        return A(C3324l.f34500a.b() + "/eapi/v2/tracker/device/" + identifier + "/status", null, ShareTarget.METHOD_GET, false);
    }

    public final I Z(String userID) {
        AbstractC3159y.i(userID, "userID");
        return B(this, C3324l.f34500a.a() + "/eapi/turbosubscription/get-url-portal/" + userID + '/', null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I a(long j8) {
        return A(C3324l.f34500a.a() + "/eapi/app/" + j8 + "/pre-register/add", r(), ShareTarget.METHOD_POST, true);
    }

    public final I a0(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3324l.f34500a.a() + "/eapi/v2/app/top-platform", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I b(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/app/" + j8 + "/alternatives", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I b0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3324l.f34500a.a() + "/eapi/category/" + i8 + "/apps/top", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I c() {
        return B(this, C3324l.f34500a.a() + "/eapi/event-log/version", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I c0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3324l.f34500a.a() + "/eapi/v2/leaf-category/" + i8 + "/apps/top", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I d(long j8) {
        return A(C3324l.f34500a.a() + "/eapi/app/" + j8 + "/pre-register/cancel", r(), ShareTarget.METHOD_POST, true);
    }

    public final I d0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3324l.f34500a.a() + "/eapi/floating-category/" + i8 + "/apps", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I e(String password, String repeatPassword) {
        AbstractC3159y.i(password, "password");
        AbstractC3159y.i(repeatPassword, "repeatPassword");
        HashMap hashMap = new HashMap();
        hashMap.put("password1", password);
        hashMap.put("password2", repeatPassword);
        return A(C3324l.f34500a.a() + "/eapi/user/set-new-password", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I e0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3324l.f34500a.a() + "/eapi/v2/apps/category/" + i8 + "/top/featured", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I f(String username, int i8) {
        AbstractC3159y.i(username, "username");
        HashMap hashMap = new HashMap();
        hashMap.put(HintConstants.AUTOFILL_HINT_NEW_USERNAME, username);
        hashMap.put("usernameFormatID", String.valueOf(i8));
        return A(C3324l.f34500a.a() + "/eapi/user/change-username", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I f0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3324l.f34500a.a() + "/eapi/floating-category/" + i8 + "/apps-list", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final boolean g(I res) {
        long j8;
        JSONObject jSONObject;
        AbstractC3159y.i(res, "res");
        boolean z8 = false;
        if (res.b()) {
            if (res.e() == 503) {
                if (res.d() != null) {
                    String d8 = res.d();
                    AbstractC3159y.f(d8);
                    if (d8.length() > 0) {
                        try {
                            String d9 = res.d();
                            AbstractC3159y.f(d9);
                            jSONObject = new JSONObject(d9);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        if (!jSONObject.isNull("seconds")) {
                            j8 = jSONObject.getLong("seconds");
                            SettingsPreferences.f29323b.f1(this.f34486a, j8);
                            C3326n a8 = C3326n.f34504t.a(this.f34486a);
                            a8.a();
                            a8.N();
                            a8.g();
                        }
                    }
                }
                j8 = 86400;
                SettingsPreferences.f29323b.f1(this.f34486a, j8);
                C3326n a82 = C3326n.f34504t.a(this.f34486a);
                a82.a();
                a82.N();
                a82.g();
            }
            return false;
        }
        String d10 = res.d();
        if (d10 == null || d10.length() == 0) {
            z8 = true;
        }
        return !z8;
    }

    public final I g0() {
        C1504n c1504n = new C1504n();
        c1504n.h(this.f34486a);
        return A(C3324l.f34500a.b() + "/eapi/androidtracker/device-apps-installed/" + c1504n.d(), null, ShareTarget.METHOD_GET, false);
    }

    public final I h(long j8) {
        return A(C3324l.f34500a.a() + "/eapi/app/" + j8 + "/pre-registered", r(), ShareTarget.METHOD_GET, true);
    }

    public final I h0() {
        return B(this, C3324l.f34500a.a() + "/eapi/turbosubscription/get-turbo-products", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I i(String costumerId, String priceId, String productType) {
        AbstractC3159y.i(costumerId, "costumerId");
        AbstractC3159y.i(priceId, "priceId");
        AbstractC3159y.i(productType, "productType");
        HashMap hashMap = new HashMap();
        hashMap.put("userID", costumerId);
        hashMap.put("priceID", priceId);
        hashMap.put("productType", productType);
        C1504n c1504n = new C1504n();
        c1504n.i(this.f34486a);
        hashMap.put("country", String.valueOf(c1504n.c()));
        return A(C3324l.f34500a.a() + "/eapi/turbosubscription/subscription-stripe", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I i0(String identifier) {
        AbstractC3159y.i(identifier, "identifier");
        return B(this, C3324l.f34500a.b() + "/eapi/v2/tracker/updates/" + identifier, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I j(ArrayList categories, int i8, int i9) {
        AbstractC3159y.i(categories, "categories");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        String obj = categories.toString();
        AbstractC3159y.h(obj, "categories.toString()");
        hashMap.put("categoryIDs", obj);
        return B(this, C3324l.f34500a.a() + "/eapi/floating-category/additional/apps", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I j0(String fileId, int i8) {
        AbstractC3159y.i(fileId, "fileId");
        HashMap hashMap = new HashMap();
        hashMap.put("update", String.valueOf(i8));
        return B(this, C3324l.f34500a.a() + "/eapi/apps/file/" + fileId + "/downloadUrl", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I k(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/app/" + j8 + "/affiliated-app", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I l(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/v2/app/" + j8 + "/abis", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I l0(String idFichero, int i8) {
        AbstractC3159y.i(idFichero, "idFichero");
        HashMap hashMap = new HashMap();
        hashMap.put("update", String.valueOf(i8));
        return B(this, C3324l.f34500a.a() + "/eapi/apps/file/" + idFichero + "/resumeDownloadURL", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I m(String packagename) {
        AbstractC3159y.i(packagename, "packagename");
        return B(this, C3324l.f34500a.a() + "/eapi/apps/byPackagename/" + packagename, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I n(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/v2/app/" + j8 + "/languages", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I n0(String str, String str2) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packagename", str);
            jSONObject.put("md5Signature", str2);
            String jSONObject2 = jSONObject.toString();
            AbstractC3159y.h(jSONObject2, "jsonApp.toString()");
            hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject2);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return B(this, C3324l.f34500a.a() + "/eapi/nativeapp/getappurlbypackagenamemd5signature", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I o() {
        return B(this, C3324l.f34500a.a() + "/eapi/v2/app/floating-banner", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I o0() {
        return A(C3324l.f34500a.a() + "/eapi/v2/user/avatars", null, ShareTarget.METHOD_GET, true);
    }

    public final I p() {
        return B(this, C3324l.f34500a.a() + "/eapi/categories/parents", new HashMap(), ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I p0(String userID, int i8, int i9) {
        boolean z8;
        AbstractC3159y.i(userID, "userID");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        Q e8 = Q.f12437k.e(this.f34486a);
        if (e8 != null && AbstractC3159y.d(e8.getId(), userID)) {
            z8 = true;
        } else {
            z8 = false;
        }
        return A(C3324l.f34500a.a() + "/eapi/user/" + userID + "/comments", hashMap, ShareTarget.METHOD_GET, z8);
    }

    public final I q(int i8) {
        return B(this, C3324l.f34500a.a() + "/eapi/v2/categories/" + i8 + "/leaf-categories", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I q0() {
        return A(C3324l.f34500a.a() + "/eapi/user/getUpdatedData", null, ShareTarget.METHOD_GET, true);
    }

    public final I r0(String userID) {
        AbstractC3159y.i(userID, "userID");
        return A(C3324l.f34500a.a() + "/eapi/user/" + userID + "/reviews-number", null, ShareTarget.METHOD_GET, false);
    }

    public final I s(String identifier) {
        AbstractC3159y.i(identifier, "identifier");
        return B(this, C3324l.f34500a.b() + "/eapi/v2/tracker/device/" + identifier, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I s0() {
        return A(C3324l.f34500a.a() + "/eapi/user/username-formats", null, ShareTarget.METHOD_GET, true);
    }

    public final I t(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/faq/" + j8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I t0(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/apps/" + j8 + "/video", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I u(String identifier) {
        AbstractC3159y.i(identifier, "identifier");
        return B(this, C3324l.f34500a.b() + "/eapi/v2/tracker/app-to-upload/" + identifier, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I u0(String fileId) {
        AbstractC3159y.i(fileId, "fileId");
        return B(this, C3324l.f34500a.a() + "/eapi/v2/virus-total/" + fileId + "/report", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I v() {
        return B(this, C3324l.f34500a.a() + "/eapi/categories/floating", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I v0(String sha256) {
        AbstractC3159y.i(sha256, "sha256");
        return B(this, C3324l.f34500a.a() + "/eapi/v2/virus-total-by-sha256/" + sha256 + "/report", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I w(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/floating-categories/app/" + j8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I w0() {
        return B(this, "https://adservice.google.com/getconfig/pubvendors", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I x(int i8) {
        return B(this, C3324l.f34500a.a() + "/eapi/floating-category-related/" + i8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I x0(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/answer/" + j8 + "/like", null, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I y() {
        return B(this, C3324l.f34500a.a() + "/eapi/home/features", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I y0(long j8) {
        return B(this, C3324l.f34500a.a() + "/eapi/comment/" + j8 + "/like", null, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I z() {
        return B(this, C3324l.f34500a.a() + "/eapi/v2/app/interstitial-banner", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I z0(ArrayList events) {
        AbstractC3159y.i(events, "events");
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            C1506p c1506p = (C1506p) it.next();
            if (c1506p.b() != null) {
                String b8 = c1506p.b();
                AbstractC3159y.f(b8);
                jSONArray.put(new JSONObject(b8));
            }
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC3159y.h(jSONArray2, "eventsJson.toString()");
        hashMap.put("events", jSONArray2);
        return B(this, C3324l.f34500a.a() + "/eapi/logs/event", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3312F(Context context, Y4.d dVar) {
        this(context);
        AbstractC3159y.i(context, "context");
        this.f34487b = dVar;
    }
}
