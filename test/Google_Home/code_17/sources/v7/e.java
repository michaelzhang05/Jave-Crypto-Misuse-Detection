package v7;

import U6.C1456n;
import U6.Y;
import a7.C1677a;
import c7.g;
import c7.j;
import c7.k;
import java.util.HashMap;
import java.util.Map;
import n7.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final C1677a f40308a;

    /* renamed from: b, reason: collision with root package name */
    static final C1677a f40309b;

    /* renamed from: c, reason: collision with root package name */
    static final C1677a f40310c;

    /* renamed from: d, reason: collision with root package name */
    static final C1677a f40311d;

    /* renamed from: e, reason: collision with root package name */
    static final C1677a f40312e;

    /* renamed from: f, reason: collision with root package name */
    static final C1677a f40313f;

    /* renamed from: g, reason: collision with root package name */
    static final C1677a f40314g;

    /* renamed from: h, reason: collision with root package name */
    static final C1677a f40315h;

    /* renamed from: i, reason: collision with root package name */
    static final Map f40316i;

    static {
        C1456n c1456n = n7.e.f35668X;
        f40308a = new C1677a(c1456n);
        C1456n c1456n2 = n7.e.f35669Y;
        f40309b = new C1677a(c1456n2);
        f40310c = new C1677a(X6.a.f13468j);
        f40311d = new C1677a(X6.a.f13464h);
        f40312e = new C1677a(X6.a.f13454c);
        f40313f = new C1677a(X6.a.f13458e);
        f40314g = new C1677a(X6.a.f13474m);
        f40315h = new C1677a(X6.a.f13476n);
        HashMap hashMap = new HashMap();
        f40316i = hashMap;
        hashMap.put(c1456n, H7.d.a(5));
        hashMap.put(c1456n2, H7.d.a(6));
    }

    public static C1677a a(String str) {
        if (str.equals("SHA-1")) {
            return new C1677a(Y6.a.f13584i, Y.f10422a);
        }
        if (str.equals("SHA-224")) {
            return new C1677a(X6.a.f13460f);
        }
        if (str.equals("SHA-256")) {
            return new C1677a(X6.a.f13454c);
        }
        if (str.equals("SHA-384")) {
            return new C1677a(X6.a.f13456d);
        }
        if (str.equals("SHA-512")) {
            return new C1677a(X6.a.f13458e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b7.e b(C1456n c1456n) {
        if (c1456n.o(X6.a.f13454c)) {
            return new g();
        }
        if (c1456n.o(X6.a.f13458e)) {
            return new j();
        }
        if (c1456n.o(X6.a.f13474m)) {
            return new k(128);
        }
        if (c1456n.o(X6.a.f13476n)) {
            return new k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c1456n);
    }

    public static String c(C1456n c1456n) {
        if (c1456n.o(Y6.a.f13584i)) {
            return "SHA-1";
        }
        if (c1456n.o(X6.a.f13460f)) {
            return "SHA-224";
        }
        if (c1456n.o(X6.a.f13454c)) {
            return "SHA-256";
        }
        if (c1456n.o(X6.a.f13456d)) {
            return "SHA-384";
        }
        if (c1456n.o(X6.a.f13458e)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + c1456n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1677a d(int i8) {
        if (i8 != 5) {
            if (i8 == 6) {
                return f40309b;
            }
            throw new IllegalArgumentException("unknown security category: " + i8);
        }
        return f40308a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(C1677a c1677a) {
        return ((Integer) f40316i.get(c1677a.l())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1677a f(String str) {
        if (str.equals("SHA3-256")) {
            return f40310c;
        }
        if (str.equals("SHA-512/256")) {
            return f40311d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(h hVar) {
        C1677a m8 = hVar.m();
        if (m8.l().o(f40310c.l())) {
            return "SHA3-256";
        }
        if (m8.l().o(f40311d.l())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + m8.l());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1677a h(String str) {
        if (str.equals("SHA-256")) {
            return f40312e;
        }
        if (str.equals("SHA-512")) {
            return f40313f;
        }
        if (str.equals("SHAKE128")) {
            return f40314g;
        }
        if (str.equals("SHAKE256")) {
            return f40315h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
