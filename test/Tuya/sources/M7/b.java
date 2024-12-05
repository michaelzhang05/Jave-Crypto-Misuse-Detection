package M7;

import android.content.Context;
import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.MBridgeConstans;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.C3832b;
import y5.C3994a;

/* loaded from: classes5.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7074a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f7075b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f7076c;

    public b(Context context, Locale appLocale) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(appLocale, "appLocale");
        this.f7074a = context;
        this.f7075b = appLocale;
    }

    @Override // M7.j
    public Object a(String jsonString) {
        Long valueOf;
        AbstractC3159y.i(jsonString, "jsonString");
        try {
            if (jsonString.length() == 0) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f7074a.getResources().openRawResource(I1.d.f3886a)));
                try {
                    jsonString = bufferedReader.readLine();
                    V5.b.a(bufferedReader, null);
                } finally {
                }
            }
            JSONObject jSONObject = new JSONObject(jsonString);
            this.f7076c = jSONObject;
            I7.a aVar = I7.a.f4330a;
            String string = jSONObject.getString("lastUpdated");
            AbstractC3159y.h(string, "cmpListJson.getString(\"lastUpdated\")");
            Date a8 = I7.a.a(aVar, string, null, this.f7075b, 2);
            if (a8 == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(a8.getTime());
            }
            return new y5.g(valueOf, b());
        } catch (JSONException unused) {
            C3832b.b(C3832b.f38876a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new y5.g(null, null, 3);
        }
    }

    public final Map b() {
        int length;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = this.f7076c;
        if (jSONObject == null) {
            AbstractC3159y.y("cmpListJson");
            jSONObject = null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("cmps");
        JSONArray names = jSONObject2.names();
        int i8 = 0;
        if (names == null) {
            length = 0;
        } else {
            length = names.length();
        }
        while (i8 < length) {
            int i9 = i8 + 1;
            if (names == null || (str = names.getString(i8)) == null) {
                str = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
            int i10 = jSONObject3.getInt("id");
            String string = jSONObject3.getString("name");
            AbstractC3159y.h(string, "cmp.getString(\"name\")");
            linkedHashMap.put(str, new C3994a(i10, string, jSONObject3.getBoolean("isCommercial")));
            i8 = i9;
        }
        return linkedHashMap;
    }
}
