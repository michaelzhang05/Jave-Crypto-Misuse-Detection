package X4;

import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private int f12333a;

    /* renamed from: b, reason: collision with root package name */
    private String f12334b;

    public final void a(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("positives")) {
            this.f12333a = jsonObject.getInt("positives");
        }
        if (!jsonObject.isNull("sha256")) {
            this.f12334b = jsonObject.getString("sha256");
        }
    }

    public final int b() {
        return this.f12333a;
    }

    public final String c() {
        return this.f12334b;
    }
}
