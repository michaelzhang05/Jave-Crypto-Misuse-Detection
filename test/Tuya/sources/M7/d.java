package M7;

import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class d {
    public static String a(String str, String str2, JSONObject jSONObject, String str3, String str4) {
        AbstractC3159y.h(str, str2);
        String optString = jSONObject.optString(str3);
        AbstractC3159y.h(optString, str4);
        return optString;
    }
}
