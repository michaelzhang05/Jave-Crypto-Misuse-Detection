package J0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* renamed from: J0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1267b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4655a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4656b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4657c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4658d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4659e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4660f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4661g;

    /* renamed from: h, reason: collision with root package name */
    public final G0.g f4662h;

    public C1267b(String str, String str2, List list, String str3, String str4, String str5, String str6, G0.g gVar) {
        this.f4655a = str;
        this.f4656b = str2;
        this.f4657c = list;
        this.f4658d = str3;
        this.f4659e = str4;
        this.f4660f = str5;
        this.f4661g = str6;
        this.f4662h = gVar;
    }

    public static C1267b a(Context context, D d8, String str, String str2, List list, G0.g gVar) {
        String packageName = context.getPackageName();
        String g8 = d8.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b8 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C1267b(str, str2, list, g8, packageName, b8, str3, gVar);
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
