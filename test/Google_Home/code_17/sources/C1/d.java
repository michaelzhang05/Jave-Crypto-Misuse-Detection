package C1;

import H1.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1178a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f1179b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1180c;

    /* renamed from: d, reason: collision with root package name */
    private final c f1181d;

    private d(boolean z8, Float f8, boolean z9, c cVar) {
        this.f1178a = z8;
        this.f1179b = f8;
        this.f1180c = z9;
        this.f1181d = cVar;
    }

    public static d b(boolean z8, c cVar) {
        g.d(cVar, "Position is null");
        return new d(false, null, z8, cVar);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f1178a);
            if (this.f1178a) {
                jSONObject.put("skipOffset", this.f1179b);
            }
            jSONObject.put("autoPlay", this.f1180c);
            jSONObject.put("position", this.f1181d);
        } catch (JSONException e8) {
            H1.d.b("VastProperties: JSON error", e8);
        }
        return jSONObject;
    }
}
