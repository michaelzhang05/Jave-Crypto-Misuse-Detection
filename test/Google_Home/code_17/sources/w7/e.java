package w7;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class e implements w {

    /* renamed from: c, reason: collision with root package name */
    private static final Map f40411c;

    /* renamed from: a, reason: collision with root package name */
    private final int f40412a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40413b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b("SHA-256", 32, 16, 67, 10), new e(1, "XMSS_SHA2_10_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 16), new e(2, "XMSS_SHA2_16_256"));
        hashMap.put(b("SHA-256", 32, 16, 67, 20), new e(3, "XMSS_SHA2_20_256"));
        hashMap.put(b("SHA-512", 64, 16, 131, 10), new e(4, "XMSS_SHA2_10_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 16), new e(5, "XMSS_SHA2_16_512"));
        hashMap.put(b("SHA-512", 64, 16, 131, 20), new e(6, "XMSS_SHA2_20_512"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 10), new e(7, "XMSS_SHAKE_10_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 16), new e(8, "XMSS_SHAKE_16_256"));
        hashMap.put(b("SHAKE128", 32, 16, 67, 20), new e(9, "XMSS_SHAKE_20_256"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 10), new e(10, "XMSS_SHAKE_10_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 16), new e(11, "XMSS_SHAKE_16_512"));
        hashMap.put(b("SHAKE256", 64, 16, 131, 20), new e(12, "XMSS_SHAKE_20_512"));
        f40411c = DesugarCollections.unmodifiableMap(hashMap);
    }

    private e(int i8, String str) {
        this.f40412a = i8;
        this.f40413b = str;
    }

    private static String b(String str, int i8, int i9, int i10, int i11) {
        if (str != null) {
            return str + "-" + i8 + "-" + i9 + "-" + i10 + "-" + i11;
        }
        throw new NullPointerException("algorithmName == null");
    }

    public static e c(String str, int i8, int i9, int i10, int i11) {
        if (str != null) {
            return (e) f40411c.get(b(str, i8, i9, i10, i11));
        }
        throw new NullPointerException("algorithmName == null");
    }

    @Override // w7.w
    public int a() {
        return this.f40412a;
    }

    public String toString() {
        return this.f40413b;
    }
}
