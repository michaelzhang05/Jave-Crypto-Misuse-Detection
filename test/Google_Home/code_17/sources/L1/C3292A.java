package l1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import m1.InterfaceC3402b;
import n1.C3461f;

/* renamed from: l1.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3292A {

    /* renamed from: a, reason: collision with root package name */
    public static final C3292A f34222a = new C3292A();

    /* renamed from: b, reason: collision with root package name */
    private static final U0.a f34223b;

    static {
        U0.a i8 = new W0.d().j(C3300c.f34282a).k(true).i();
        AbstractC3255y.h(i8, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f34223b = i8;
    }

    private C3292A() {
    }

    private final EnumC3301d d(InterfaceC3402b interfaceC3402b) {
        if (interfaceC3402b == null) {
            return EnumC3301d.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (interfaceC3402b.a()) {
            return EnumC3301d.COLLECTION_ENABLED;
        }
        return EnumC3301d.COLLECTION_DISABLED;
    }

    public final z a(A0.f firebaseApp, y sessionDetails, C3461f sessionsSettings, Map subscribers, String firebaseInstallationId, String firebaseAuthenticationToken) {
        AbstractC3255y.i(firebaseApp, "firebaseApp");
        AbstractC3255y.i(sessionDetails, "sessionDetails");
        AbstractC3255y.i(sessionsSettings, "sessionsSettings");
        AbstractC3255y.i(subscribers, "subscribers");
        AbstractC3255y.i(firebaseInstallationId, "firebaseInstallationId");
        AbstractC3255y.i(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new z(EnumC3306i.SESSION_START, new C3294C(sessionDetails.b(), sessionDetails.a(), sessionDetails.c(), sessionDetails.d(), new C3302e(d((InterfaceC3402b) subscribers.get(InterfaceC3402b.a.PERFORMANCE)), d((InterfaceC3402b) subscribers.get(InterfaceC3402b.a.CRASHLYTICS)), sessionsSettings.b()), firebaseInstallationId, firebaseAuthenticationToken), b(firebaseApp));
    }

    public final C3299b b(A0.f firebaseApp) {
        String valueOf;
        String str;
        long longVersionCode;
        AbstractC3255y.i(firebaseApp, "firebaseApp");
        Context k8 = firebaseApp.k();
        AbstractC3255y.h(k8, "firebaseApp.applicationContext");
        String packageName = k8.getPackageName();
        PackageInfo packageInfo = k8.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = valueOf;
        String c8 = firebaseApp.n().c();
        AbstractC3255y.h(c8, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        AbstractC3255y.h(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC3255y.h(RELEASE, "RELEASE");
        t tVar = t.LOG_ENVIRONMENT_PROD;
        AbstractC3255y.h(packageName, "packageName");
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str = str2;
        } else {
            str = str3;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC3255y.h(MANUFACTURER, "MANUFACTURER");
        v vVar = v.f34361a;
        Context k9 = firebaseApp.k();
        AbstractC3255y.h(k9, "firebaseApp.applicationContext");
        u d8 = vVar.d(k9);
        Context k10 = firebaseApp.k();
        AbstractC3255y.h(k10, "firebaseApp.applicationContext");
        return new C3299b(c8, MODEL, "2.0.4", RELEASE, tVar, new C3298a(packageName, str, str2, MANUFACTURER, d8, vVar.c(k10)));
    }

    public final U0.a c() {
        return f34223b;
    }
}
