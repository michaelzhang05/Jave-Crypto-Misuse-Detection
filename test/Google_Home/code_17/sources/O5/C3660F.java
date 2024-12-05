package o5;

import a5.C1639f;
import a5.C1641h;
import a5.C1647n;
import a5.C1649p;
import a5.I;
import a5.K;
import a5.M;
import a5.Q;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import b5.ResultReceiverC1979d;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.uptodown.activities.preferences.SettingsPreferences;
import j6.C3205d;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p5.C3781c;

/* renamed from: o5.F, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3660F {

    /* renamed from: c, reason: collision with root package name */
    public static final a f36486c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f36487a;

    /* renamed from: b, reason: collision with root package name */
    private ResultReceiverC1979d f36488b;

    /* renamed from: o5.F$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final byte[] a(String string) {
            AbstractC3255y.i(string, "string");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(string.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bytes = string.getBytes(C3205d.f34020b);
            AbstractC3255y.h(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            byte[] compressed = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            AbstractC3255y.h(compressed, "compressed");
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
            AbstractC3255y.i(context, "context");
            return j6.n.A("https://www.uptodown.com/turbo?platform=android", "www", b(SettingsPreferences.f30353b.q(context)), false, 4, null);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C3660F(Context context) {
        AbstractC3255y.i(context, "context");
        this.f36487a = context;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private final a5.I A(java.lang.String r26, java.util.HashMap r27, java.lang.String r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 4519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.C3660F.A(java.lang.String, java.util.HashMap, java.lang.String, boolean):a5.I");
    }

    static /* synthetic */ I B(C3660F c3660f, String str, HashMap hashMap, String str2, boolean z8, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        return c3660f.A(str, hashMap, str2, z8);
    }

    private final I C(String str, HashMap hashMap) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        if (this.f36488b != null) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "\n*******Request*******\n" + str);
            ResultReceiverC1979d resultReceiverC1979d = this.f36488b;
            if (resultReceiverC1979d != null) {
                resultReceiverC1979d.send(137, bundle);
            }
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                jSONObject3.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject = jSONObject3;
        } else {
            jSONObject = null;
        }
        I a8 = new C3781c().a(jSONObject2, jSONObject, this.f36488b, this.f36487a, str);
        a8.a(this.f36487a);
        return a8;
    }

    private final JSONArray C0(ArrayList arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                JSONObject jSONObject = new JSONObject();
                if (((C1639f) arrayList.get(i8)).g() != null) {
                    jSONObject.put("name", ((C1639f) arrayList.get(i8)).g());
                } else if (((C1639f) arrayList.get(i8)).z() != null) {
                    jSONObject.put("name", ((C1639f) arrayList.get(i8)).z());
                } else if (((C1639f) arrayList.get(i8)).J() != null) {
                    jSONObject.put("name", ((C1639f) arrayList.get(i8)).J());
                }
                jSONObject.put("packagename", ((C1639f) arrayList.get(i8)).J());
                if (((C1639f) arrayList.get(i8)).J() != null) {
                    C3667g c3667g = new C3667g();
                    Context context = this.f36487a;
                    String J8 = ((C1639f) arrayList.get(i8)).J();
                    AbstractC3255y.f(J8);
                    String h8 = c3667g.h(context, J8);
                    if (new C3667g().w(h8)) {
                        jSONObject.put("installerPackagename", h8);
                    }
                }
                jSONObject.put("versionCode", ((C1639f) arrayList.get(i8)).f0());
                jSONObject.put("versionName", ((C1639f) arrayList.get(i8)).h0());
                jSONObject.put("isSystemApp", ((C1639f) arrayList.get(i8)).k0());
                jSONObject.put("md5", ((C1639f) arrayList.get(i8)).w());
                jSONObject.put("sha256Base", ((C1639f) arrayList.get(i8)).X());
                jSONObject.put("md5Signature", ((C1639f) arrayList.get(i8)).x());
                jSONObject.put("minSDKVersion", ((C1639f) arrayList.get(i8)).y());
                if (((C1639f) arrayList.get(i8)).d0() > 0) {
                    jSONObject.put("targetSDKVersion", ((C1639f) arrayList.get(i8)).d0());
                }
                if (((C1639f) arrayList.get(i8)).H() != null) {
                    AbstractC3255y.f(((C1639f) arrayList.get(i8)).H());
                    if (!r5.isEmpty()) {
                        JSONArray jSONArray2 = new JSONArray();
                        ArrayList H8 = ((C1639f) arrayList.get(i8)).H();
                        AbstractC3255y.f(H8);
                        Iterator it = H8.iterator();
                        while (it.hasNext()) {
                            a5.r rVar = (a5.r) it.next();
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
                if (((C1639f) arrayList.get(i8)).b0() != null) {
                    AbstractC3255y.f(((C1639f) arrayList.get(i8)).b0());
                    if (!r5.isEmpty()) {
                        JSONArray jSONArray3 = new JSONArray();
                        ArrayList b02 = ((C1639f) arrayList.get(i8)).b0();
                        AbstractC3255y.f(b02);
                        Iterator it2 = b02.iterator();
                        while (it2.hasNext()) {
                            a5.r rVar2 = (a5.r) it2.next();
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

    private final String D0(C1647n c1647n) {
        String jSONObject = c1647n.j().toString(2);
        AbstractC3255y.h(jSONObject, "jsonObjectDevice.toString(2)");
        return jSONObject;
    }

    private final String E0(a5.w wVar) {
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
            AbstractC3255y.h(jSONObject2, "jsonObject.toString(2)");
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
        AbstractC3255y.h(sb2, "result.toString()");
        return sb2;
    }

    public static /* synthetic */ I k0(C3660F c3660f, String str, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return c3660f.j0(str, i8);
    }

    public static /* synthetic */ I m0(C3660F c3660f, String str, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return c3660f.l0(str, i8);
    }

    private final HashMap r() {
        HashMap hashMap = new HashMap();
        C1647n c1647n = new C1647n();
        c1647n.i(this.f36487a);
        String c8 = c1647n.c();
        if (c8 != null && c8.length() != 0) {
            hashMap.put("countryIsoCode", c8);
        }
        return hashMap;
    }

    public final I A0(String email, String pass) {
        AbstractC3255y.i(email, "email");
        AbstractC3255y.i(pass, "pass");
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        String f8 = Q4.d.f9161a.f(pass);
        AbstractC3255y.f(f8);
        hashMap.put(HintConstants.AUTOFILL_HINT_PASSWORD, f8);
        return B(this, C3672l.f36501a.a() + "/eapi/v2/user/login", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I B0(long j8, int i8, int i9) {
        C1647n c1647n = new C1647n();
        c1647n.h(this.f36487a);
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/app/" + j8 + "/device/" + c1647n.d() + "/compatible/versions", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I D(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/apps/latest-updates", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I E(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/apps/latest-updates-home", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I F() {
        return B(this, C3672l.f36501a.a() + "/eapi/main-app", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final ArrayList F0(I res) {
        int i8;
        JSONArray jSONArray;
        AbstractC3255y.i(res, "res");
        ArrayList arrayList = new ArrayList();
        if (!res.b() && res.d() != null) {
            String d8 = res.d();
            AbstractC3255y.f(d8);
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
                    AbstractC3255y.h(jSONObject2, "jsonArrayTop.getJSONObject(i)");
                    arrayList.add(C1641h.f14163L0.a(jSONObject2));
                }
            }
        }
        return arrayList;
    }

    public final I G(long j8) {
        return A(C3672l.f36501a.a() + "/eapi/app/" + j8 + "/my-comment", null, ShareTarget.METHOD_GET, true);
    }

    public final I H(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/apps/new-releases", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I H0(long j8, String text) {
        String str;
        AbstractC3255y.i(text, "text");
        HashMap hashMap = new HashMap();
        hashMap.put(MimeTypes.BASE_TYPE_TEXT, text);
        try {
            PackageManager packageManager = this.f36487a.getPackageManager();
            AbstractC3255y.h(packageManager, "context.packageManager");
            String packageName = this.f36487a.getPackageName();
            AbstractC3255y.h(packageName, "context.packageName");
            str = ' ' + Q4.q.d(packageManager, packageName, 0).versionName;
        } catch (Exception e8) {
            e8.printStackTrace();
            str = "";
        }
        hashMap.put("uagent", "uptodownandroid" + str);
        return A(C3672l.f36501a.a() + "/eapi/comments/" + j8 + "/answers", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I I(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/apps/new-releases-home", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I I0(long j8, K review) {
        String str;
        String str2;
        AbstractC3255y.i(review, "review");
        HashMap hashMap = new HashMap();
        if (review.u() != null) {
            String u8 = review.u();
            AbstractC3255y.f(u8);
            if (u8.length() > 0) {
                String u9 = review.u();
                AbstractC3255y.f(u9);
                hashMap.put(MimeTypes.BASE_TYPE_TEXT, u9);
            }
        }
        hashMap.put(CampaignEx.JSON_KEY_STAR, String.valueOf(review.s()));
        try {
            PackageManager packageManager = this.f36487a.getPackageManager();
            AbstractC3255y.h(packageManager, "context.packageManager");
            String packageName = this.f36487a.getPackageName();
            AbstractC3255y.h(packageName, "context.packageName");
            str = ' ' + Q4.q.d(packageManager, packageName, 0).versionName;
        } catch (Exception e8) {
            e8.printStackTrace();
            str = "";
        }
        hashMap.put("uagent", "uptodownandroid" + str);
        Q e9 = Q.f14058k.e(this.f36487a);
        if (e9 != null) {
            str2 = e9.getId();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            String id = e9.getId();
            AbstractC3255y.f(id);
            hashMap.put("id_user", id);
        }
        return A(C3672l.f36501a.a() + "/eapi/apps/" + j8 + "/comments", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I J(long j8, int i8) {
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(i8));
        return B(this, C3672l.f36501a.a() + "/eapi/organization/" + j8 + "/apps", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I J0(String email, String email2) {
        AbstractC3255y.i(email, "email");
        AbstractC3255y.i(email2, "email2");
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        hashMap.put("email2", email2);
        return B(this, C3672l.f36501a.a() + "/eapi/user/recoverPasswordMail", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I K(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/organization/" + j8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I K0(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/apps/" + j8 + "/relatedPosts", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I L0(C1647n device, boolean z8) {
        AbstractC3255y.i(device, "device");
        JSONObject j8 = device.j();
        String str = C3672l.f36501a.b() + "/eapi/v2/tracker/device";
        HashMap hashMap = new HashMap();
        String jSONObject = j8.toString();
        AbstractC3255y.h(jSONObject, "jsonObjectDevice.toString()");
        hashMap.put("device", jSONObject);
        if (z8) {
            return C(str, hashMap);
        }
        return B(this, str, hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I M(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/apps/" + j8 + "/permissions", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I M0(ArrayList apps, String identifier, boolean z8) {
        AbstractC3255y.i(apps, "apps");
        AbstractC3255y.i(identifier, "identifier");
        String str = C3672l.f36501a.b() + "/eapi/v3/tracker/apps/save";
        JSONArray C02 = C0(apps);
        if (this.f36488b != null) {
            Iterator it = apps.iterator();
            int i8 = 0;
            int i9 = 0;
            while (it.hasNext()) {
                C1639f c1639f = (C1639f) it.next();
                if (c1639f.b0() != null) {
                    ArrayList b02 = c1639f.b0();
                    AbstractC3255y.f(b02);
                    i8 += b02.size();
                }
                if (c1639f.H() != null) {
                    ArrayList H8 = c1639f.H();
                    AbstractC3255y.f(H8);
                    i9 += H8.size();
                }
            }
            String str2 = "apps count = " + apps.size() + ", splits count = " + i8 + ", obbs count = " + i9;
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str2);
            ResultReceiverC1979d resultReceiverC1979d = this.f36488b;
            if (resultReceiverC1979d != null) {
                resultReceiverC1979d.send(137, bundle);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("identifier", identifier);
        hashMap.put("apps", String.valueOf(C02));
        hashMap.put("app_version", "628");
        if (z8) {
            return C(str, hashMap);
        }
        return B(this, str, hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I N(String identifier) {
        AbstractC3255y.i(identifier, "identifier");
        return B(this, C3672l.f36501a.a() + "/eapi/v2/virus-total-by-identifier/" + identifier + "/report", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I N0(String text, int i8, int i9) {
        String str;
        int i10;
        boolean z8;
        AbstractC3255y.i(text, "text");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        String str2 = null;
        try {
            String f8 = new j6.j("\\n").f(text, " ");
            int length = f8.length() - 1;
            int i11 = 0;
            boolean z9 = false;
            while (i11 <= length) {
                if (!z9) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (AbstractC3255y.k(f8.charAt(i10), 32) <= 0) {
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
        return B(this, C3672l.f36501a.a() + "/eapi/v2/apps/search/" + str, hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I O(int i8, int i9, String orderBy, String direction) {
        AbstractC3255y.i(orderBy, "orderBy");
        AbstractC3255y.i(direction, "direction");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        hashMap.put("sort[field]", orderBy);
        hashMap.put("sort[direction]", direction);
        hashMap.putAll(r());
        return B(this, C3672l.f36501a.a() + "/eapi/pre-register", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I O0(C1647n device, M m8, ResultReceiverC1979d resultReceiverC1979d) {
        String str;
        AbstractC3255y.i(device, "device");
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
        if (resultReceiverC1979d != null) {
            String e8 = j6.n.e("\n                " + ("\n*******Params*******\n\n\nDevice\n") + "\n                " + D02 + "\n                ");
            StringBuilder sb = new StringBuilder();
            sb.append(e8);
            sb.append("\n\nSettingsUTD\n");
            String e9 = j6.n.e("\n                " + sb.toString() + "\n                " + str + "\n                ");
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, e9);
            resultReceiverC1979d.send(137, bundle);
        }
        return B(this, C3672l.f36501a.b() + "/eapi/v2/tracker/identifier/" + device.d() + "/settings", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I P() {
        return A(C3672l.f36501a.a() + "/eapi/pre-register-apps-by-user", r(), ShareTarget.METHOD_GET, true);
    }

    public final I P0(String email, String suggestion, C1647n device, a5.w memory) {
        AbstractC3255y.i(email, "email");
        AbstractC3255y.i(suggestion, "suggestion");
        AbstractC3255y.i(device, "device");
        AbstractC3255y.i(memory, "memory");
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        hashMap.put(NotificationCompat.CATEGORY_MESSAGE, suggestion);
        hashMap.put("device", D0(device));
        hashMap.put("memory", E0(memory));
        if (this.f36488b != null) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "\n*******Request sendSuggestion*******\n");
            ResultReceiverC1979d resultReceiverC1979d = this.f36488b;
            if (resultReceiverC1979d != null) {
                resultReceiverC1979d.send(137, bundle);
            }
        }
        return B(this, C3672l.f36501a.a() + "/eapi/nativeapp/sendsuggestion", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I Q(long j8) {
        if (j8 == 0) {
            new C3678r(this.f36487a).a("getProgramAppIdZero");
            I i8 = new I();
            i8.j(MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", 0);
            i8.i(jSONObject.toString());
            return i8;
        }
        HashMap hashMap = new HashMap();
        C1647n c1647n = new C1647n();
        c1647n.i(this.f36487a);
        String c8 = c1647n.c();
        if (c8 != null && c8.length() != 0) {
            hashMap.put("countryIsoCode", c8);
        }
        return B(this, C3672l.f36501a.a() + "/eapi/v2/apps/" + j8 + "/device/" + c1647n.d(), hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I Q0(long j8) {
        HashMap hashMap = new HashMap();
        hashMap.put("avatarID", String.valueOf(j8));
        return A(C3672l.f36501a.a() + "/eapi/user/avatar", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I R(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/apps/" + j8 + "/promoted", new HashMap(), ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I R0(String name, String pass, String email) {
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(pass, "pass");
        AbstractC3255y.i(email, "email");
        HashMap hashMap = new HashMap();
        hashMap.put(HintConstants.AUTOFILL_HINT_USERNAME, name);
        String f8 = Q4.d.f9161a.f(pass);
        AbstractC3255y.f(f8);
        hashMap.put(HintConstants.AUTOFILL_HINT_PASSWORD, f8);
        hashMap.put(NotificationCompat.CATEGORY_EMAIL, email);
        hashMap.put("terms", "1");
        return B(this, C3672l.f36501a.a() + "/eapi/user/signup", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I S(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3672l.f36501a.a() + "/eapi/categories/" + i8 + "/apps/news", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I S0(String accessToken, String provider) {
        AbstractC3255y.i(accessToken, "accessToken");
        AbstractC3255y.i(provider, "provider");
        HashMap hashMap = new HashMap();
        hashMap.put("provider", provider);
        hashMap.put("accessToken", accessToken);
        return B(this, C3672l.f36501a.a() + "/eapi/user/usertokenSignup", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I T(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/v2/apps/recent/featured", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I T0(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/" + j8 + "/similar", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I U(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/comments/" + j8 + "/answers", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I V(long j8, int i8, int i9, String ordination) {
        AbstractC3255y.i(ordination, "ordination");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        hashMap.put("order", ordination);
        return B(this, C3672l.f36501a.a() + "/eapi/apps/" + j8 + "/comments", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I W(long j8, int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/apps/" + j8 + "/comments-with-text", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I X(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/app/" + j8 + "/screenshots", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I Y(String identifier) {
        AbstractC3255y.i(identifier, "identifier");
        return A(C3672l.f36501a.b() + "/eapi/v2/tracker/device/" + identifier + "/status", null, ShareTarget.METHOD_GET, false);
    }

    public final I Z(String userID) {
        AbstractC3255y.i(userID, "userID");
        return B(this, C3672l.f36501a.a() + "/eapi/turbosubscription/get-url-portal/" + userID + '/', null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I a(long j8) {
        return A(C3672l.f36501a.a() + "/eapi/app/" + j8 + "/pre-register/add", r(), ShareTarget.METHOD_POST, true);
    }

    public final I a0(int i8, int i9) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        return B(this, C3672l.f36501a.a() + "/eapi/v2/app/top-platform", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I b(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/app/" + j8 + "/alternatives", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I b0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3672l.f36501a.a() + "/eapi/category/" + i8 + "/apps/top", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I c() {
        return B(this, C3672l.f36501a.a() + "/eapi/event-log/version", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I c0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3672l.f36501a.a() + "/eapi/v2/leaf-category/" + i8 + "/apps/top", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I d(long j8) {
        return A(C3672l.f36501a.a() + "/eapi/app/" + j8 + "/pre-register/cancel", r(), ShareTarget.METHOD_POST, true);
    }

    public final I d0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3672l.f36501a.a() + "/eapi/floating-category/" + i8 + "/apps", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I e(String password, String repeatPassword) {
        AbstractC3255y.i(password, "password");
        AbstractC3255y.i(repeatPassword, "repeatPassword");
        HashMap hashMap = new HashMap();
        hashMap.put("password1", password);
        hashMap.put("password2", repeatPassword);
        return A(C3672l.f36501a.a() + "/eapi/user/set-new-password", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I e0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3672l.f36501a.a() + "/eapi/v2/apps/category/" + i8 + "/top/featured", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I f(String username, int i8) {
        AbstractC3255y.i(username, "username");
        HashMap hashMap = new HashMap();
        hashMap.put(HintConstants.AUTOFILL_HINT_NEW_USERNAME, username);
        hashMap.put("usernameFormatID", String.valueOf(i8));
        return A(C3672l.f36501a.a() + "/eapi/user/change-username", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I f0(int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i9));
        hashMap.put("page[offset]", String.valueOf(i10));
        return B(this, C3672l.f36501a.a() + "/eapi/floating-category/" + i8 + "/apps-list", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final boolean g(I res) {
        long j8;
        JSONObject jSONObject;
        AbstractC3255y.i(res, "res");
        boolean z8 = false;
        if (res.b()) {
            if (res.e() == 503) {
                if (res.d() != null) {
                    String d8 = res.d();
                    AbstractC3255y.f(d8);
                    if (d8.length() > 0) {
                        try {
                            String d9 = res.d();
                            AbstractC3255y.f(d9);
                            jSONObject = new JSONObject(d9);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                        if (!jSONObject.isNull("seconds")) {
                            j8 = jSONObject.getLong("seconds");
                            SettingsPreferences.f30353b.f1(this.f36487a, j8);
                            C3674n a8 = C3674n.f36505t.a(this.f36487a);
                            a8.a();
                            a8.N();
                            a8.l();
                        }
                    }
                }
                j8 = 86400;
                SettingsPreferences.f30353b.f1(this.f36487a, j8);
                C3674n a82 = C3674n.f36505t.a(this.f36487a);
                a82.a();
                a82.N();
                a82.l();
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
        C1647n c1647n = new C1647n();
        c1647n.h(this.f36487a);
        return A(C3672l.f36501a.b() + "/eapi/androidtracker/device-apps-installed/" + c1647n.d(), null, ShareTarget.METHOD_GET, false);
    }

    public final I h(long j8) {
        return A(C3672l.f36501a.a() + "/eapi/app/" + j8 + "/pre-registered", r(), ShareTarget.METHOD_GET, true);
    }

    public final I h0() {
        return B(this, C3672l.f36501a.a() + "/eapi/turbosubscription/get-turbo-products", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I i(String costumerId, String priceId, String productType) {
        AbstractC3255y.i(costumerId, "costumerId");
        AbstractC3255y.i(priceId, "priceId");
        AbstractC3255y.i(productType, "productType");
        HashMap hashMap = new HashMap();
        hashMap.put("userID", costumerId);
        hashMap.put("priceID", priceId);
        hashMap.put("productType", productType);
        C1647n c1647n = new C1647n();
        c1647n.i(this.f36487a);
        hashMap.put("country", String.valueOf(c1647n.c()));
        return A(C3672l.f36501a.a() + "/eapi/turbosubscription/subscription-stripe", hashMap, ShareTarget.METHOD_POST, true);
    }

    public final I i0(String identifier) {
        AbstractC3255y.i(identifier, "identifier");
        return B(this, C3672l.f36501a.b() + "/eapi/v2/tracker/updates/" + identifier, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I j(ArrayList categories, int i8, int i9) {
        AbstractC3255y.i(categories, "categories");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        String obj = categories.toString();
        AbstractC3255y.h(obj, "categories.toString()");
        hashMap.put("categoryIDs", obj);
        return B(this, C3672l.f36501a.a() + "/eapi/floating-category/additional/apps", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I j0(String fileId, int i8) {
        AbstractC3255y.i(fileId, "fileId");
        HashMap hashMap = new HashMap();
        hashMap.put("update", String.valueOf(i8));
        return B(this, C3672l.f36501a.a() + "/eapi/apps/file/" + fileId + "/downloadUrl", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I k(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/app/" + j8 + "/affiliated-app", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I l(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/v2/app/" + j8 + "/abis", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I l0(String idFichero, int i8) {
        AbstractC3255y.i(idFichero, "idFichero");
        HashMap hashMap = new HashMap();
        hashMap.put("update", String.valueOf(i8));
        return B(this, C3672l.f36501a.a() + "/eapi/apps/file/" + idFichero + "/resumeDownloadURL", hashMap, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I m(String packagename) {
        AbstractC3255y.i(packagename, "packagename");
        return B(this, C3672l.f36501a.a() + "/eapi/apps/byPackagename/" + packagename, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I n(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/v2/app/" + j8 + "/languages", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I n0(String str, String str2) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("packagename", str);
            jSONObject.put("md5Signature", str2);
            String jSONObject2 = jSONObject.toString();
            AbstractC3255y.h(jSONObject2, "jsonApp.toString()");
            hashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject2);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return B(this, C3672l.f36501a.a() + "/eapi/nativeapp/getappurlbypackagenamemd5signature", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I o() {
        return B(this, C3672l.f36501a.a() + "/eapi/v2/app/floating-banner", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I o0() {
        return A(C3672l.f36501a.a() + "/eapi/v2/user/avatars", null, ShareTarget.METHOD_GET, true);
    }

    public final I p() {
        return B(this, C3672l.f36501a.a() + "/eapi/categories/parents", new HashMap(), ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I p0(String userID, int i8, int i9) {
        boolean z8;
        AbstractC3255y.i(userID, "userID");
        HashMap hashMap = new HashMap();
        hashMap.put("page[limit]", String.valueOf(i8));
        hashMap.put("page[offset]", String.valueOf(i9));
        Q e8 = Q.f14058k.e(this.f36487a);
        if (e8 != null && AbstractC3255y.d(e8.getId(), userID)) {
            z8 = true;
        } else {
            z8 = false;
        }
        return A(C3672l.f36501a.a() + "/eapi/user/" + userID + "/comments", hashMap, ShareTarget.METHOD_GET, z8);
    }

    public final I q(int i8) {
        return B(this, C3672l.f36501a.a() + "/eapi/v2/categories/" + i8 + "/leaf-categories", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I q0() {
        return A(C3672l.f36501a.a() + "/eapi/user/getUpdatedData", null, ShareTarget.METHOD_GET, true);
    }

    public final I r0(String userID) {
        AbstractC3255y.i(userID, "userID");
        return A(C3672l.f36501a.a() + "/eapi/user/" + userID + "/reviews-number", null, ShareTarget.METHOD_GET, false);
    }

    public final I s(String identifier) {
        AbstractC3255y.i(identifier, "identifier");
        return B(this, C3672l.f36501a.b() + "/eapi/v2/tracker/device/" + identifier, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I s0() {
        return A(C3672l.f36501a.a() + "/eapi/user/username-formats", null, ShareTarget.METHOD_GET, true);
    }

    public final I t(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/faq/" + j8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I t0(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/apps/" + j8 + "/video", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I u(String identifier) {
        AbstractC3255y.i(identifier, "identifier");
        return B(this, C3672l.f36501a.b() + "/eapi/v2/tracker/app-to-upload/" + identifier, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I u0(String fileId) {
        AbstractC3255y.i(fileId, "fileId");
        return B(this, C3672l.f36501a.a() + "/eapi/v2/virus-total/" + fileId + "/report", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I v() {
        return B(this, C3672l.f36501a.a() + "/eapi/categories/floating", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I v0(String sha256) {
        AbstractC3255y.i(sha256, "sha256");
        return B(this, C3672l.f36501a.a() + "/eapi/v2/virus-total-by-sha256/" + sha256 + "/report", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I w(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/floating-categories/app/" + j8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I w0() {
        return B(this, "https://adservice.google.com/getconfig/pubvendors", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I x(int i8) {
        return B(this, C3672l.f36501a.a() + "/eapi/floating-category-related/" + i8, null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I x0(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/answer/" + j8 + "/like", null, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I y() {
        return B(this, C3672l.f36501a.a() + "/eapi/home/features", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I y0(long j8) {
        return B(this, C3672l.f36501a.a() + "/eapi/comment/" + j8 + "/like", null, ShareTarget.METHOD_POST, false, 8, null);
    }

    public final I z() {
        return B(this, C3672l.f36501a.a() + "/eapi/v2/app/interstitial-banner", null, ShareTarget.METHOD_GET, false, 8, null);
    }

    public final I z0(ArrayList events) {
        AbstractC3255y.i(events, "events");
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            C1649p c1649p = (C1649p) it.next();
            if (c1649p.b() != null) {
                String b8 = c1649p.b();
                AbstractC3255y.f(b8);
                jSONArray.put(new JSONObject(b8));
            }
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC3255y.h(jSONArray2, "eventsJson.toString()");
        hashMap.put("events", jSONArray2);
        return B(this, C3672l.f36501a.a() + "/eapi/logs/event", hashMap, ShareTarget.METHOD_POST, false, 8, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3660F(Context context, ResultReceiverC1979d resultReceiverC1979d) {
        this(context);
        AbstractC3255y.i(context, "context");
        this.f36488b = resultReceiverC1979d;
    }
}
