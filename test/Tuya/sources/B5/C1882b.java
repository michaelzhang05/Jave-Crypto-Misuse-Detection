package b5;

import android.content.Context;
import android.content.pm.PackageManager;
import c5.k;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* renamed from: b5.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1882b {

    /* renamed from: a, reason: collision with root package name */
    public final String f14785a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14786b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14787c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14788d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14789e;

    public C1882b(Context context) {
        AbstractC3159y.i(context, "context");
        String packageName = context.getPackageName();
        AbstractC3159y.h(packageName, "context.packageName");
        this.f14785a = packageName;
        k kVar = k.f14991a;
        PackageManager packageManager = context.getPackageManager();
        AbstractC3159y.h(packageManager, "context.packageManager");
        this.f14786b = kVar.b(packageManager, packageName);
        this.f14787c = String.valueOf(kVar.d(context));
        this.f14788d = kVar.f(context);
        this.f14789e = "115";
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packagename", this.f14785a);
        String str = this.f14788d;
        if (str != null) {
            jSONObject.put("version", str);
        }
        jSONObject.put("uptodownSDKVersion", this.f14789e);
        jSONObject.put("versionCode", this.f14787c);
        String str2 = this.f14786b;
        if (str2 != null) {
            jSONObject.put("md5Signature", str2);
        }
        return jSONObject;
    }
}
