package P7;

import android.content.Context;
import com.inmobi.cmp.model.ChoiceError;
import com.mbridge.msdk.MBridgeConstans;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y5.C4209b;

/* loaded from: classes5.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8898a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f8899b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f8900c;

    public b(Context context, Locale appLocale) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(appLocale, "appLocale");
        this.f8898a = context;
        this.f8899b = appLocale;
    }

    @Override // P7.j
    public Object a(String jsonString) {
        Long valueOf;
        AbstractC3255y.i(jsonString, "jsonString");
        try {
            if (jsonString.length() == 0) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f8898a.getResources().openRawResource(L1.d.f5881a)));
                try {
                    jsonString = bufferedReader.readLine();
                    Y5.b.a(bufferedReader, null);
                } finally {
                }
            }
            JSONObject jSONObject = new JSONObject(jsonString);
            this.f8900c = jSONObject;
            L7.a aVar = L7.a.f6325a;
            String string = jSONObject.getString("lastUpdated");
            AbstractC3255y.h(string, "cmpListJson.getString(\"lastUpdated\")");
            Date a8 = L7.a.a(aVar, string, null, this.f8899b, 2);
            if (a8 == null) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(a8.getTime());
            }
            return new B5.g(valueOf, b());
        } catch (JSONException unused) {
            C4209b.b(C4209b.f41007a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new B5.g(null, null, 3);
        }
    }

    public final Map b() {
        int length;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = this.f8900c;
        if (jSONObject == null) {
            AbstractC3255y.y("cmpListJson");
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
            AbstractC3255y.h(string, "cmp.getString(\"name\")");
            linkedHashMap.put(str, new B5.a(i10, string, jSONObject3.getBoolean("isCommercial")));
            i8 = i9;
        }
        return linkedHashMap;
    }
}
