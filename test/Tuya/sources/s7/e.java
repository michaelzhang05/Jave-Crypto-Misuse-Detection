package s7;

import R6.C1347n;
import R6.Y;
import Z6.g;
import Z6.j;
import Z6.k;
import java.util.HashMap;
import java.util.Map;
import k7.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final X6.a f38035a;

    /* renamed from: b, reason: collision with root package name */
    static final X6.a f38036b;

    /* renamed from: c, reason: collision with root package name */
    static final X6.a f38037c;

    /* renamed from: d, reason: collision with root package name */
    static final X6.a f38038d;

    /* renamed from: e, reason: collision with root package name */
    static final X6.a f38039e;

    /* renamed from: f, reason: collision with root package name */
    static final X6.a f38040f;

    /* renamed from: g, reason: collision with root package name */
    static final X6.a f38041g;

    /* renamed from: h, reason: collision with root package name */
    static final X6.a f38042h;

    /* renamed from: i, reason: collision with root package name */
    static final Map f38043i;

    static {
        C1347n c1347n = k7.e.f33676X;
        f38035a = new X6.a(c1347n);
        C1347n c1347n2 = k7.e.f33677Y;
        f38036b = new X6.a(c1347n2);
        f38037c = new X6.a(U6.a.f11798j);
        f38038d = new X6.a(U6.a.f11794h);
        f38039e = new X6.a(U6.a.f11784c);
        f38040f = new X6.a(U6.a.f11788e);
        f38041g = new X6.a(U6.a.f11804m);
        f38042h = new X6.a(U6.a.f11806n);
        HashMap hashMap = new HashMap();
        f38043i = hashMap;
        hashMap.put(c1347n, E7.d.a(5));
        hashMap.put(c1347n2, E7.d.a(6));
    }

    public static X6.a a(String str) {
        if (str.equals("SHA-1")) {
            return new X6.a(V6.a.f11946i, Y.f8796a);
        }
        if (str.equals("SHA-224")) {
            return new X6.a(U6.a.f11790f);
        }
        if (str.equals("SHA-256")) {
            return new X6.a(U6.a.f11784c);
        }
        if (str.equals("SHA-384")) {
            return new X6.a(U6.a.f11786d);
        }
        if (str.equals("SHA-512")) {
            return new X6.a(U6.a.f11788e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Y6.e b(C1347n c1347n) {
        if (c1347n.r(U6.a.f11784c)) {
            return new g();
        }
        if (c1347n.r(U6.a.f11788e)) {
            return new j();
        }
        if (c1347n.r(U6.a.f11804m)) {
            return new k(128);
        }
        if (c1347n.r(U6.a.f11806n)) {
            return new k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c1347n);
    }

    public static String c(C1347n c1347n) {
        if (c1347n.r(V6.a.f11946i)) {
            return "SHA-1";
        }
        if (c1347n.r(U6.a.f11790f)) {
            return "SHA-224";
        }
        if (c1347n.r(U6.a.f11784c)) {
            return "SHA-256";
        }
        if (c1347n.r(U6.a.f11786d)) {
            return "SHA-384";
        }
        if (c1347n.r(U6.a.f11788e)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + c1347n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X6.a d(int i8) {
        if (i8 != 5) {
            if (i8 == 6) {
                return f38036b;
            }
            throw new IllegalArgumentException("unknown security category: " + i8);
        }
        return f38035a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(X6.a aVar) {
        return ((Integer) f38043i.get(aVar.m())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X6.a f(String str) {
        if (str.equals("SHA3-256")) {
            return f38037c;
        }
        if (str.equals("SHA-512/256")) {
            return f38038d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(h hVar) {
        X6.a p8 = hVar.p();
        if (p8.m().r(f38037c.m())) {
            return "SHA3-256";
        }
        if (p8.m().r(f38038d.m())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + p8.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static X6.a h(String str) {
        if (str.equals("SHA-256")) {
            return f38039e;
        }
        if (str.equals("SHA-512")) {
            return f38040f;
        }
        if (str.equals("SHAKE128")) {
            return f38041g;
        }
        if (str.equals("SHAKE256")) {
            return f38042h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
