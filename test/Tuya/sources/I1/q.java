package i1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import j1.InterfaceC3048b;
import java.util.Map;
import k1.C3106f;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f31523a = new q();

    /* renamed from: b, reason: collision with root package name */
    private static final S0.a f31524b;

    static {
        S0.a i8 = new U0.d().j(C2769c.f31437a).k(true).i();
        AbstractC3159y.h(i8, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f31524b = i8;
    }

    private q() {
    }

    private final EnumC2770d d(InterfaceC3048b interfaceC3048b) {
        if (interfaceC3048b == null) {
            return EnumC2770d.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (interfaceC3048b.b()) {
            return EnumC2770d.COLLECTION_ENABLED;
        }
        return EnumC2770d.COLLECTION_DISABLED;
    }

    public final C2768b a(y0.e firebaseApp) {
        String valueOf;
        long longVersionCode;
        AbstractC3159y.i(firebaseApp, "firebaseApp");
        Context k8 = firebaseApp.k();
        AbstractC3159y.h(k8, "firebaseApp.applicationContext");
        String packageName = k8.getPackageName();
        PackageInfo packageInfo = k8.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String c8 = firebaseApp.n().c();
        AbstractC3159y.h(c8, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        AbstractC3159y.h(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC3159y.h(RELEASE, "RELEASE");
        m mVar = m.LOG_ENVIRONMENT_PROD;
        AbstractC3159y.h(packageName, "packageName");
        String str = packageInfo.versionName;
        if (str == null) {
            str = valueOf;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        AbstractC3159y.h(MANUFACTURER, "MANUFACTURER");
        return new C2768b(c8, MODEL, "1.0.2", RELEASE, mVar, new C2767a(packageName, str, valueOf, MANUFACTURER));
    }

    public final S0.a b() {
        return f31524b;
    }

    public final p c(y0.e firebaseApp, o sessionDetails, C3106f sessionsSettings, Map subscribers) {
        AbstractC3159y.i(firebaseApp, "firebaseApp");
        AbstractC3159y.i(sessionDetails, "sessionDetails");
        AbstractC3159y.i(sessionsSettings, "sessionsSettings");
        AbstractC3159y.i(subscribers, "subscribers");
        return new p(i.SESSION_START, new s(sessionDetails.b(), sessionDetails.a(), sessionDetails.c(), sessionDetails.d(), new C2771e(d((InterfaceC3048b) subscribers.get(InterfaceC3048b.a.PERFORMANCE)), d((InterfaceC3048b) subscribers.get(InterfaceC3048b.a.CRASHLYTICS)), sessionsSettings.b()), null, 32, null), a(firebaseApp));
    }
}
