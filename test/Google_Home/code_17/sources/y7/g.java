package y7;

import U6.Y;
import a7.C1677a;
import h7.AbstractC2969a;

/* loaded from: classes5.dex */
abstract class g {
    /* JADX INFO: Access modifiers changed from: package-private */
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
    public static b7.e b(C1677a c1677a) {
        if (c1677a.l().o(Y6.a.f13584i)) {
            return AbstractC2969a.b();
        }
        if (c1677a.l().o(X6.a.f13460f)) {
            return AbstractC2969a.c();
        }
        if (c1677a.l().o(X6.a.f13454c)) {
            return AbstractC2969a.d();
        }
        if (c1677a.l().o(X6.a.f13456d)) {
            return AbstractC2969a.e();
        }
        if (c1677a.l().o(X6.a.f13458e)) {
            return AbstractC2969a.j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + c1677a.l());
    }
}
