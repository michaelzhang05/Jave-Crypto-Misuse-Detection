package e5;

import android.content.Context;
import android.content.pm.PackageManager;
import f5.k;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* renamed from: e5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2803b {

    /* renamed from: a, reason: collision with root package name */
    public final String f31791a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31792b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31793c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31794d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31795e;

    public C2803b(Context context) {
        AbstractC3255y.i(context, "context");
        String packageName = context.getPackageName();
        AbstractC3255y.h(packageName, "context.packageName");
        this.f31791a = packageName;
        k kVar = k.f31966a;
        PackageManager packageManager = context.getPackageManager();
        AbstractC3255y.h(packageManager, "context.packageManager");
        this.f31792b = kVar.b(packageManager, packageName);
        this.f31793c = String.valueOf(kVar.d(context));
        this.f31794d = kVar.f(context);
        this.f31795e = "115";
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packagename", this.f31791a);
        String str = this.f31794d;
        if (str != null) {
            jSONObject.put("version", str);
        }
        jSONObject.put("uptodownSDKVersion", this.f31795e);
        jSONObject.put("versionCode", this.f31793c);
        String str2 = this.f31792b;
        if (str2 != null) {
            jSONObject.put("md5Signature", str2);
        }
        return jSONObject;
    }
}
