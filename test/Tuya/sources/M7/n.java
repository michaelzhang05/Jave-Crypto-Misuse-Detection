package M7;

import com.inmobi.cmp.model.ChoiceError;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.C3832b;

/* loaded from: classes5.dex */
public final class n implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f7086a;

    public n(Locale appLocale) {
        AbstractC3159y.i(appLocale, "appLocale");
        this.f7086a = appLocale;
    }

    @Override // M7.j
    public Object a(String jsonString) {
        AbstractC3159y.i(jsonString, "jsonString");
        try {
            return d(new JSONObject(jsonString));
        } catch (JSONException unused) {
            C3832b.b(C3832b.f38876a, ChoiceError.INVALID_JSON_FORMAT, null, null, null, null, 30);
            return new B6.e();
        }
    }

    public final Map b(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        AbstractC3159y.h(keys, "purposes.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            AbstractC3159y.h(key, "key");
            linkedHashMap.put(key, Integer.valueOf(jSONObject.optInt(key)));
        }
        return linkedHashMap;
    }

    public final Map c(JSONObject jSONObject, int i8) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        AbstractC3159y.h(keys, "features.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(key);
            if (optJSONObject != null) {
                AbstractC3159y.h(key, "key");
                int optInt = optJSONObject.optInt("id");
                String optString = optJSONObject.optString("name");
                linkedHashMap.put(key, new B6.d(optInt, optString, d.a(optString, "feature.optString(\"name\")", optJSONObject, "description", "feature.optString(\"description\")"), e(optJSONObject, i8)));
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B6.e d(org.json.JSONObject r49) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M7.n.d(org.json.JSONObject):B6.e");
    }

    public final String e(JSONObject jSONObject, int i8) {
        String sb;
        if (i8 > 2) {
            JSONArray optJSONArray = jSONObject.optJSONArray("illustrations");
            if (optJSONArray == null) {
                sb = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                int length = optJSONArray.length();
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i9 + 1;
                    Y y8 = Y.f33766a;
                    String format = String.format("* %s", Arrays.copyOf(new Object[]{optJSONArray.getString(i9)}, 1));
                    AbstractC3159y.h(format, "format(format, *args)");
                    sb2.append(format);
                    AbstractC3159y.h(sb2, "append(value)");
                    sb2.append('\n');
                    AbstractC3159y.h(sb2, "append('\\n')");
                    i9 = i10;
                }
                sb = sb2.toString();
                AbstractC3159y.h(sb, "str.toString()");
            }
            if (sb == null) {
                return "";
            }
            return sb;
        }
        String optString = jSONObject.optString("descriptionLegal");
        AbstractC3159y.h(optString, "{\n            feature.op…criptionLegal\")\n        }");
        return optString;
    }

    public final Map f(JSONObject jSONObject, int i8) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        AbstractC3159y.h(keys, "purposes.keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(key);
            if (optJSONObject != null) {
                AbstractC3159y.h(key, "key");
                int optInt = optJSONObject.optInt("id");
                String optString = optJSONObject.optString("name");
                linkedHashMap.put(key, new B6.i(optInt, optString, d.a(optString, "purpose.optString(\"name\")", optJSONObject, "description", "purpose.optString(\"description\")"), e(optJSONObject, i8)));
            }
        }
        return linkedHashMap;
    }
}
