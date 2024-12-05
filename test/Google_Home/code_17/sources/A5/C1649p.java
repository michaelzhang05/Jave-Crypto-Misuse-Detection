package a5;

import android.content.Context;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3674n;
import o5.C3679s;
import org.json.JSONObject;

/* renamed from: a5.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1649p {

    /* renamed from: d, reason: collision with root package name */
    public static final a f14319d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private long f14320a;

    /* renamed from: b, reason: collision with root package name */
    private String f14321b;

    /* renamed from: c, reason: collision with root package name */
    private long f14322c;

    /* renamed from: a5.p$a */
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
            if (!AbstractC3255y.d(str, TypedValues.TransitionType.S_DURATION) && !AbstractC3255y.d(str, "speed")) {
                return false;
            }
            return true;
        }

        private final boolean c(String str) {
            if (!AbstractC3255y.d(str, "deeplink") && !AbstractC3255y.d(str, "update")) {
                return false;
            }
            return true;
        }

        private final boolean d(String str) {
            if (!AbstractC3255y.d(str, "responseCode") && !AbstractC3255y.d(str, "exception") && !AbstractC3255y.d(str, CampaignEx.JSON_NATIVE_VIDEO_ERROR) && !AbstractC3255y.d(str, "filehashCalculated")) {
                return false;
            }
            return true;
        }

        private final boolean e(String str) {
            if (!AbstractC3255y.d(str, "host") && !AbstractC3255y.d(str, "connectionType") && !AbstractC3255y.d(str, "downBandwidthKbps") && !AbstractC3255y.d(str, "upBandwidthKbps")) {
                return false;
            }
            return true;
        }

        private final void f(String str, JSONObject jSONObject, Bundle bundle) {
            C3679s c3679s = C3679s.f36530a;
            if (c3679s.c(str)) {
                jSONObject.put(str, bundle.getLong(str));
            } else if (c3679s.b(str)) {
                jSONObject.put(str, bundle.getInt(str));
            } else {
                jSONObject.put(str, bundle.getString(str));
            }
        }

        public final void g(String name, Bundle params, Context context) {
            long j8;
            AbstractC3255y.i(name, "name");
            AbstractC3255y.i(params, "params");
            if (context != null && SettingsPreferences.f30353b.M(context)) {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                C1647n c1647n = new C1647n();
                c1647n.h(context);
                jSONObject2.put("identifier", c1647n.d());
                jSONObject2.put("storeVersionCode", 628);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("occurred_on", currentTimeMillis / 1000);
                if (j6.n.s(name, "download", false)) {
                    JSONObject jSONObject6 = new JSONObject();
                    j8 = currentTimeMillis;
                    String str = null;
                    for (String key : params.keySet()) {
                        if (AbstractC3255y.d(key, "type")) {
                            str = params.getString(key);
                        } else {
                            AbstractC3255y.h(key, "key");
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
                    if (j6.n.s(name, "install", false)) {
                        String str2 = null;
                        for (String key2 : params.keySet()) {
                            if (AbstractC3255y.d(key2, "type")) {
                                str2 = params.getString(key2);
                            } else {
                                AbstractC3255y.h(key2, "key");
                                if (d(key2)) {
                                    f(key2, jSONObject3, params);
                                } else {
                                    f(key2, jSONObject, params);
                                }
                            }
                        }
                        jSONObject5.put("messageName", a(name, str2));
                    } else if (j6.n.s(name, "upload", false)) {
                        String str3 = null;
                        for (String key3 : params.keySet()) {
                            if (AbstractC3255y.d(key3, "type")) {
                                str3 = params.getString(key3);
                            } else {
                                AbstractC3255y.h(key3, "key");
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
                    AbstractC3255y.h(jSONObject7, "jsonObjectEvent.toString()");
                    C1649p c1649p = new C1649p();
                    c1649p.e(jSONObject7);
                    c1649p.f(j8);
                    C3674n a8 = C3674n.f36505t.a(context);
                    a8.a();
                    a8.G0(c1649p);
                    a8.l();
                }
            }
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public final long a() {
        return this.f14320a;
    }

    public final String b() {
        return this.f14321b;
    }

    public final long c() {
        return this.f14322c;
    }

    public final void d(long j8) {
        this.f14320a = j8;
    }

    public final void e(String str) {
        this.f14321b = str;
    }

    public final void f(long j8) {
        this.f14322c = j8;
    }
}
