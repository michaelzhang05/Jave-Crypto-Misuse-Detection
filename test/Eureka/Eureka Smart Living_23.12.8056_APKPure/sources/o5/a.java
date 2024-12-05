package o5;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* loaded from: classes.dex */
public abstract class a {
    private static File a(String str, String str2) {
        if (str2.startsWith(str)) {
            return new File(str2);
        }
        return new File(str + "/" + str2);
    }

    public static long b() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            return c(Environment.getExternalStorageDirectory().getPath()) / 1024;
        }
        return -1L;
    }

    public static long c(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (IllegalArgumentException unused) {
            return 0L;
        }
    }

    public static boolean d(String str) {
        if (!e() || str.equals("")) {
            return false;
        }
        return a(Environment.getExternalStorageDirectory().toString(), str).exists();
    }

    public static boolean e() {
        return Environment.getExternalStorageState().equals("mounted");
    }
}
