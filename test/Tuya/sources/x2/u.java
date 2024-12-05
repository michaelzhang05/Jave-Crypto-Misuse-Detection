package x2;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.os.EnvironmentCompat;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f39237a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f39238b = new a("WiFi", 0, "Wi-Fi");

        /* renamed from: c, reason: collision with root package name */
        public static final a f39239c = new a("Mobile2G", 1, "2G");

        /* renamed from: d, reason: collision with root package name */
        public static final a f39240d = new a("Mobile3G", 2, "3G");

        /* renamed from: e, reason: collision with root package name */
        public static final a f39241e = new a("Mobile4G", 3, "4G");

        /* renamed from: f, reason: collision with root package name */
        public static final a f39242f = new a("Mobile5G", 4, "5G");

        /* renamed from: g, reason: collision with root package name */
        public static final a f39243g = new a("Unknown", 5, EnvironmentCompat.MEDIA_UNKNOWN);

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ a[] f39244h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ R5.a f39245i;

        /* renamed from: a, reason: collision with root package name */
        private final String f39246a;

        static {
            a[] a8 = a();
            f39244h = a8;
            f39245i = R5.b.a(a8);
        }

        private a(String str, int i8, String str2) {
            this.f39246a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f39238b, f39239c, f39240d, f39241e, f39242f, f39243g};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f39244h.clone();
        }

        public final String b() {
            return this.f39246a;
        }
    }

    private u(ConnectivityManager connectivityManager) {
        this.f39237a = connectivityManager;
    }

    private final a a(int i8) {
        switch (i8) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return a.f39239c;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return a.f39240d;
            case 13:
            case 18:
            case 19:
                return a.f39241e;
            case 20:
                return a.f39242f;
            default:
                return a.f39243g;
        }
    }

    public final String b() {
        a a8;
        NetworkInfo activeNetworkInfo = this.f39237a.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    a8 = a.f39243g;
                } else {
                    a8 = a.f39238b;
                }
            } else {
                a8 = a(activeNetworkInfo.getSubtype());
            }
            return a8.b();
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3159y.i(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            kotlin.jvm.internal.AbstractC3159y.g(r2, r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.u.<init>(android.content.Context):void");
    }
}
