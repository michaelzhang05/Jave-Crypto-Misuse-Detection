package B7;

import R6.C1347n;

/* loaded from: classes5.dex */
abstract class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1347n a(String str) {
        if (str.equals("SHA-256")) {
            return U6.a.f11784c;
        }
        if (str.equals("SHA-512")) {
            return U6.a.f11788e;
        }
        if (str.equals("SHAKE128")) {
            return U6.a.f11804m;
        }
        if (str.equals("SHAKE256")) {
            return U6.a.f11806n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
