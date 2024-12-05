package E7;

import U6.C1456n;

/* loaded from: classes5.dex */
abstract class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1456n a(String str) {
        if (str.equals("SHA-256")) {
            return X6.a.f13454c;
        }
        if (str.equals("SHA-512")) {
            return X6.a.f13458e;
        }
        if (str.equals("SHAKE128")) {
            return X6.a.f13474m;
        }
        if (str.equals("SHAKE256")) {
            return X6.a.f13476n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
