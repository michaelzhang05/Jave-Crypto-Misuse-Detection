package D2;

import android.util.Log;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1786a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final String f1787b = e.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private static final String f1788c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f1789c = new a("ReactNative", 0, "com.facebook.react.bridge.NativeModule", "react-native");

        /* renamed from: d, reason: collision with root package name */
        public static final a f1790d = new a("Flutter", 1, "io.flutter.embedding.engine.FlutterEngine", "flutter");

        /* renamed from: e, reason: collision with root package name */
        public static final a f1791e = new a("Cordova", 2, "org.apache.cordova.CordovaActivity", "cordova");

        /* renamed from: f, reason: collision with root package name */
        public static final a f1792f = new a("Unity", 3, "com.unity3d.player.UnityPlayerActivity", "unity");

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f1793g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ U5.a f1794h;

        /* renamed from: a, reason: collision with root package name */
        private final String f1795a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1796b;

        static {
            a[] a8 = a();
            f1793g = a8;
            f1794h = U5.b.a(a8);
        }

        private a(String str, int i8, String str2, String str3) {
            this.f1795a = str2;
            this.f1796b = str3;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f1789c, f1790d, f1791e, f1792f};
        }

        public static U5.a c() {
            return f1794h;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f1793g.clone();
        }

        public final String b() {
            return this.f1795a;
        }

        public final String d() {
            return this.f1796b;
        }
    }

    static {
        String str;
        Object obj;
        Iterator<E> it = a.c().iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                if (f1786a.b(((a) obj).b())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        a aVar = (a) obj;
        if (aVar != null) {
            str = aVar.d();
        }
        f1788c = str;
    }

    private e() {
    }

    private final boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e8) {
            Log.d(f1787b, str + " not found: " + e8);
            return false;
        }
    }

    public final String a() {
        return f1788c;
    }
}
