package A2;

import android.util.Log;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f84a = new e();

    /* renamed from: b, reason: collision with root package name */
    private static final String f85b = e.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private static final String f86c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f87c = new a("ReactNative", 0, "com.facebook.react.bridge.NativeModule", "react-native");

        /* renamed from: d, reason: collision with root package name */
        public static final a f88d = new a("Flutter", 1, "io.flutter.embedding.engine.FlutterEngine", "flutter");

        /* renamed from: e, reason: collision with root package name */
        public static final a f89e = new a("Cordova", 2, "org.apache.cordova.CordovaActivity", "cordova");

        /* renamed from: f, reason: collision with root package name */
        public static final a f90f = new a("Unity", 3, "com.unity3d.player.UnityPlayerActivity", "unity");

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f91g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ R5.a f92h;

        /* renamed from: a, reason: collision with root package name */
        private final String f93a;

        /* renamed from: b, reason: collision with root package name */
        private final String f94b;

        static {
            a[] a8 = a();
            f91g = a8;
            f92h = R5.b.a(a8);
        }

        private a(String str, int i8, String str2, String str3) {
            this.f93a = str2;
            this.f94b = str3;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f87c, f88d, f89e, f90f};
        }

        public static R5.a c() {
            return f92h;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f91g.clone();
        }

        public final String b() {
            return this.f93a;
        }

        public final String d() {
            return this.f94b;
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
                if (f84a.b(((a) obj).b())) {
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
        f86c = str;
    }

    private e() {
    }

    private final boolean b(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e8) {
            Log.d(f85b, str + " not found: " + e8);
            return false;
        }
    }

    public final String a() {
        return f86c;
    }
}
