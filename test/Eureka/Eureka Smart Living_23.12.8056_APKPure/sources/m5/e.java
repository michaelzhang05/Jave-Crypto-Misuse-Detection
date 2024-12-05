package m5;

import org.json.JSONArray;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private JSONArray f7924a;

    public e(JSONArray jSONArray) {
        this.f7924a = jSONArray;
    }

    public boolean a(int i6) {
        return this.f7924a.getBoolean(i6);
    }

    public String b(int i6) {
        return this.f7924a.getString(i6);
    }
}
