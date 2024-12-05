package X4;

import android.content.Context;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3326n;
import l5.C3331s;
import org.json.JSONObject;

/* renamed from: X4.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1506p {

    /* renamed from: d, reason: collision with root package name */
    public static final a f12698d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f12699a;

    /* renamed from: b, reason: collision with root package name */
    private String f12700b;

    /* renamed from: c, reason: collision with root package name */
    private long f12701c;

    /* renamed from: X4.p$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        private final String a(String str, String str2) {
            String str3 = "uptodown.native.1." + str;
            if (str2 != null) {
                return str3 + '.' + str2;
            }
            return str3;
        }

        private final boolean b(String str) {
            if (!AbstractC3159y.d(str, TypedValues.TransitionType.S_DURATION) && !AbstractC3159y.d(str, "speed")) {
                return false;
            }
            return true;
        }

        private final boolean c(String str) {
            if (!AbstractC3159y.d(str, "deeplink") && !AbstractC3159y.d(str, "update")) {
                return false;
            }
            return true;
        }

        private final boolean d(String str) {
            if (!AbstractC3159y.d(str, "responseCode") && !AbstractC3159y.d(str, "exception") && !AbstractC3159y.d(str, CampaignEx.JSON_NATIVE_VIDEO_ERROR) && !AbstractC3159y.d(str, "filehashCalculated")) {
                return false;
            }
            return true;
        }

        private final boolean e(String str) {
            if (!AbstractC3159y.d(str, "host") && !AbstractC3159y.d(str, "connectionType") && !AbstractC3159y.d(str, "downBandwidthKbps") && !AbstractC3159y.d(str, "upBandwidthKbps")) {
                return false;
            }
            return true;
        }

        private final void f(String str, JSONObject jSONObject, Bundle bundle) {
            C3331s c3331s = C3331s.f34529a;
            if (c3331s.c(str)) {
                jSONObject.put(str, bundle.getLong(str));
            } else if (c3331s.b(str)) {
                jSONObject.put(str, bundle.getInt(str));
            } else {
                jSONObject.put(str, bundle.getString(str));
            }
        }

        public final void g(String name, Bundle params, Context context) {
            long j8;
            AbstractC3159y.i(name, "name");
            AbstractC3159y.i(params, "params");
            if (context != null && SettingsPreferences.f29323b.M(context)) {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                C1504n c1504n = new C1504n();
                c1504n.h(context);
                jSONObject2.put("identifier", c1504n.d());
                jSONObject2.put("storeVersionCode", 627);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("occurred_on", currentTimeMillis / 1000);
                if (g6.n.s(name, "download", false)) {
                    JSONObject jSONObject6 = new JSONObject();
                    j8 = currentTimeMillis;
                    String str = null;
                    for (String key : params.keySet()) {
                        if (AbstractC3159y.d(key, "type")) {
                            str = params.getString(key);
                        } else {
                            AbstractC3159y.h(key, "key");
                            if (d(key)) {
                                f(key, jSONObject3, params);
                            } else if (b(key)) {
                                f(key, jSONObject2, params);
                            } else if (e(key)) {
                                f(key, jSONObject4, params);
                            } else if (c(key)) {
                                f(key, jSONObject6, params);
                            } else {
                                f(key, jSONObject, params);
                            }
                        }
                    }
                    if (jSONObject4.length() > 0) {
                        jSONObject2.put("network", jSONObject4);
                    }
                    if (jSONObject6.length() > 0) {
                        jSONObject.put("download", jSONObject6);
                    }
                    jSONObject5.put("messageName", a(name, str));
                } else {
                    j8 = currentTimeMillis;
                    if (g6.n.s(name, "install", false)) {
                        String str2 = null;
                        for (String key2 : params.keySet()) {
                            if (AbstractC3159y.d(key2, "type")) {
                                str2 = params.getString(key2);
                            } else {
                                AbstractC3159y.h(key2, "key");
                                if (d(key2)) {
                                    f(key2, jSONObject3, params);
                                } else {
                                    f(key2, jSONObject, params);
                                }
                            }
                        }
                        jSONObject5.put("messageName", a(name, str2));
                    } else if (g6.n.s(name, "upload", false)) {
                        String str3 = null;
                        for (String key3 : params.keySet()) {
                            if (AbstractC3159y.d(key3, "type")) {
                                str3 = params.getString(key3);
                            } else {
                                AbstractC3159y.h(key3, "key");
                                if (d(key3)) {
                                    f(key3, jSONObject3, params);
                                } else if (e(key3)) {
                                    f(key3, jSONObject4, params);
                                } else if (b(key3)) {
                                    f(key3, jSONObject2, params);
                                } else {
                                    f(key3, jSONObject, params);
                                }
                            }
                        }
                        if (jSONObject4.length() > 0) {
                            jSONObject2.put("network", jSONObject4);
                        }
                        jSONObject5.put("messageName", a(name, str3));
                    }
                }
                if (jSONObject2.length() > 0) {
                    jSONObject5.put("context", jSONObject2);
                }
                if (jSONObject.length() > 0) {
                    jSONObject5.put("payload", jSONObject);
                }
                if (jSONObject3.length() > 0) {
                    jSONObject5.put(CampaignEx.JSON_NATIVE_VIDEO_ERROR, jSONObject3);
                }
                if (!jSONObject5.isNull("messageName")) {
                    String jSONObject7 = jSONObject5.toString();
                    AbstractC3159y.h(jSONObject7, "jsonObjectEvent.toString()");
                    C1506p c1506p = new C1506p();
                    c1506p.e(jSONObject7);
                    c1506p.f(j8);
                    C3326n a8 = C3326n.f34504t.a(context);
                    a8.a();
                    a8.G0(c1506p);
                    a8.g();
                }
            }
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final long a() {
        return this.f12699a;
    }

    public final String b() {
        return this.f12700b;
    }

    public final long c() {
        return this.f12701c;
    }

    public final void d(long j8) {
        this.f12699a = j8;
    }

    public final void e(String str) {
        this.f12700b = str;
    }

    public final void f(long j8) {
        this.f12701c = j8;
    }
}
