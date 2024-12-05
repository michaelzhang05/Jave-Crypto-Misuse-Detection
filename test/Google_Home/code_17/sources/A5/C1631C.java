package a5;

import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* renamed from: a5.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1631C {

    /* renamed from: a, reason: collision with root package name */
    private int f13954a;

    /* renamed from: b, reason: collision with root package name */
    private String f13955b;

    public final void a(JSONObject jsonObject) {
        AbstractC3255y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("positives")) {
            this.f13954a = jsonObject.getInt("positives");
        }
        if (!jsonObject.isNull("sha256")) {
            this.f13955b = jsonObject.getString("sha256");
        }
    }

    public final int b() {
        return this.f13954a;
    }

    public final String c() {
        return this.f13955b;
    }
}
