package a5;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private String f13994a;

    /* renamed from: b, reason: collision with root package name */
    private int f13995b;

    /* renamed from: c, reason: collision with root package name */
    private String f13996c;

    public final void a(Context context) {
        AbstractC3255y.i(context, "context");
        if (this.f13995b == 526) {
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            aVar.c1(context, true);
            aVar.k1(context, 628);
            String str = this.f13994a;
            if (str != null && str.length() != 0) {
                String str2 = this.f13994a;
                AbstractC3255y.f(str2);
                JSONObject jSONObject = new JSONObject(str2);
                if (!jSONObject.isNull("url_update")) {
                    aVar.i1(context, jSONObject.getString("url_update"));
                }
            }
        }
    }

    public final boolean b() {
        int i8 = this.f13995b;
        if (i8 >= 200 && i8 < 300) {
            return false;
        }
        return true;
    }

    public final String c() {
        return this.f13996c;
    }

    public final String d() {
        return this.f13994a;
    }

    public final int e() {
        return this.f13995b;
    }

    public final boolean f() {
        String str;
        if (!b() && (str = this.f13994a) != null) {
            AbstractC3255y.f(str);
            if (str.length() > 0) {
                String str2 = this.f13994a;
                AbstractC3255y.f(str2);
                JSONObject jSONObject = new JSONObject(str2);
                if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final String g(JSONObject jsonObject) {
        AbstractC3255y.i(jsonObject, "jsonObject");
        String str = null;
        try {
            if (jsonObject.isNull("errorMsg")) {
                return null;
            }
            Object obj = jsonObject.get("errorMsg");
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = jsonObject.getJSONArray("errorMsg");
                int length = jSONArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    if (str != null && !AbstractC3255y.d(str, "")) {
                        Y y8 = Y.f34167a;
                        String format = String.format("%s\n%s", Arrays.copyOf(new Object[]{str, jSONArray.getString(i8)}, 2));
                        AbstractC3255y.h(format, "format(...)");
                        str = format;
                    } else {
                        str = jSONArray.getString(i8);
                    }
                }
                return str;
            }
            if (!(obj instanceof String)) {
                return null;
            }
            return (String) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void h(String str) {
        this.f13996c = str;
    }

    public final void i(String str) {
        this.f13994a = str;
    }

    public final void j(int i8) {
        this.f13995b = i8;
    }
}
