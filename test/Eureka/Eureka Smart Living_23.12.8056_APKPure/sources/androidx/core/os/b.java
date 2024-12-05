package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2146a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f2147b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2148c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2149d;

    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final int f2150a;

        /* renamed from: b, reason: collision with root package name */
        static final int f2151b;

        /* renamed from: c, reason: collision with root package name */
        static final int f2152c;

        /* renamed from: d, reason: collision with root package name */
        static final int f2153d;

        static {
            int extensionVersion;
            int extensionVersion2;
            int extensionVersion3;
            int extensionVersion4;
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            f2150a = extensionVersion;
            extensionVersion2 = SdkExtensions.getExtensionVersion(31);
            f2151b = extensionVersion2;
            extensionVersion3 = SdkExtensions.getExtensionVersion(33);
            f2152c = extensionVersion3;
            extensionVersion4 = SdkExtensions.getExtensionVersion(1000000);
            f2153d = extensionVersion4;
        }
    }

    static {
        int i6 = Build.VERSION.SDK_INT;
        f2146a = i6 >= 30 ? a.f2150a : 0;
        f2147b = i6 >= 30 ? a.f2151b : 0;
        f2148c = i6 >= 30 ? a.f2152c : 0;
        f2149d = i6 >= 30 ? a.f2153d : 0;
    }

    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c() {
        int i6 = Build.VERSION.SDK_INT;
        return i6 >= 33 || (i6 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
