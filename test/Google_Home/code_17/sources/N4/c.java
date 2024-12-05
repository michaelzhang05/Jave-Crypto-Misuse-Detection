package N4;

import android.os.Build;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.io.File;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private File f7739a;

    /* renamed from: b, reason: collision with root package name */
    private String f7740b;

    /* renamed from: c, reason: collision with root package name */
    private String f7741c;

    /* renamed from: d, reason: collision with root package name */
    private String f7742d;

    /* renamed from: e, reason: collision with root package name */
    private long f7743e;

    /* renamed from: f, reason: collision with root package name */
    private String f7744f;

    private final void b(JSONObject jSONObject) {
        try {
            if (!jSONObject.isNull("name")) {
                this.f7740b = jSONObject.getString("name");
            }
            if (!jSONObject.isNull("sha256")) {
                this.f7741c = jSONObject.getString("sha256");
            }
            if (!jSONObject.isNull(RewardPlus.ICON)) {
                this.f7742d = jSONObject.getString(RewardPlus.ICON);
            }
            if (!jSONObject.isNull("size")) {
                this.f7743e = jSONObject.getLong("size");
            }
            if (!jSONObject.isNull("senderDeviceName")) {
                this.f7744f = jSONObject.getString("senderDeviceName");
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public final void a(File f8) {
        AbstractC3255y.i(f8, "f");
        this.f7739a = f8;
        this.f7740b = f8.getName();
        this.f7741c = Q4.d.f9161a.e(f8.getAbsolutePath());
        this.f7743e = f8.length();
        this.f7744f = Build.MANUFACTURER + ' ' + Build.MODEL;
    }

    public final void c(String json) {
        AbstractC3255y.i(json, "json");
        b(new JSONObject(json));
    }

    public final File d() {
        return this.f7739a;
    }

    public final String e() {
        return this.f7740b;
    }

    public final String f() {
        return this.f7744f;
    }

    public final String g() {
        return this.f7741c;
    }

    public final long h() {
        return this.f7743e;
    }

    public final String i() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f7740b;
            if (str != null) {
                jSONObject.put("name", str);
            }
            String str2 = this.f7741c;
            if (str2 != null) {
                jSONObject.put("sha256", str2);
            }
            String str3 = this.f7742d;
            if (str3 != null) {
                jSONObject.put(RewardPlus.ICON, str3);
            }
            long j8 = this.f7743e;
            if (j8 > 0) {
                jSONObject.put("size", j8);
            }
            String str4 = this.f7744f;
            if (str4 != null) {
                jSONObject.put("senderDeviceName", str4);
            }
            return jSONObject.toString(2);
        } catch (JSONException e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
