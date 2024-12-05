package a5;

import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private int f14069a = -1;

    /* renamed from: b, reason: collision with root package name */
    private String f14070b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14071c;

    /* renamed from: d, reason: collision with root package name */
    private int f14072d;

    public final void a(JSONObject jsonObject) {
        AbstractC3255y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("id")) {
            this.f14069a = jsonObject.getInt("id");
        }
        if (!jsonObject.isNull("name")) {
            this.f14070b = jsonObject.getString("name");
        }
        if (!jsonObject.isNull("isChecked")) {
            this.f14071c = jsonObject.getBoolean("isChecked");
        }
        if (!jsonObject.isNull("isTurbo")) {
            this.f14072d = jsonObject.getInt("isTurbo");
        }
    }

    public final int b() {
        return this.f14069a;
    }

    public final String c() {
        return this.f14070b;
    }

    public final boolean d() {
        return this.f14071c;
    }

    public final boolean e() {
        if (this.f14072d == 1) {
            return true;
        }
        return false;
    }
}
