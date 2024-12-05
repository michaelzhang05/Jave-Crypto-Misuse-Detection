package a5;

import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* renamed from: a5.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1630B {

    /* renamed from: a, reason: collision with root package name */
    private String f13952a;

    /* renamed from: b, reason: collision with root package name */
    private String f13953b;

    public final void a(JSONObject jsonObject) {
        AbstractC3255y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("permission")) {
            this.f13952a = jsonObject.getString("permission");
        }
        if (!jsonObject.isNull("description")) {
            this.f13953b = jsonObject.getString("description");
        }
    }

    public final String b() {
        return this.f13952a;
    }

    public final void c(String str) {
        this.f13953b = str;
    }

    public final void d(String str) {
        this.f13952a = str;
    }
}
