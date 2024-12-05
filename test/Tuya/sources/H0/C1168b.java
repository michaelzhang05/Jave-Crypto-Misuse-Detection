package H0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* renamed from: H0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1168b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3279a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3280b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3281c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3282d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3283e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3284f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3285g;

    /* renamed from: h, reason: collision with root package name */
    public final E0.e f3286h;

    public C1168b(String str, String str2, List list, String str3, String str4, String str5, String str6, E0.e eVar) {
        this.f3279a = str;
        this.f3280b = str2;
        this.f3281c = list;
        this.f3282d = str3;
        this.f3283e = str4;
        this.f3284f = str5;
        this.f3285g = str6;
        this.f3286h = eVar;
    }

    public static C1168b a(Context context, z zVar, String str, String str2, List list, E0.e eVar) {
        String packageName = context.getPackageName();
        String g8 = zVar.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b8 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C1168b(str, str2, list, g8, packageName, b8, str3, eVar);
    }

    private static String b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return Integer.toString(packageInfo.versionCode);
    }
}
