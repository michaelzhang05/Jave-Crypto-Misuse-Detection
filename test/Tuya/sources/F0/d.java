package F0;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements b, G0.b {

    /* renamed from: a, reason: collision with root package name */
    private G0.a f2407a;

    private static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // G0.b
    public void a(G0.a aVar) {
        this.f2407a = aVar;
        E0.f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // F0.b
    public void k(String str, Bundle bundle) {
        G0.a aVar = this.f2407a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                E0.f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
