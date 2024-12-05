package x4;

import io.liteglue.SQLiteNDKNativeDriver;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    static boolean f9837a = false;

    public e() {
        if (f9837a) {
            return;
        }
        System.loadLibrary("sqlc-ndk-native-driver");
        if (SQLiteNDKNativeDriver.sqlc_api_version_check(4) != 0) {
            throw new RuntimeException("native library version mismatch");
        }
        f9837a = true;
    }

    public d a(String str, int i6) {
        return new f(str, i6);
    }
}
