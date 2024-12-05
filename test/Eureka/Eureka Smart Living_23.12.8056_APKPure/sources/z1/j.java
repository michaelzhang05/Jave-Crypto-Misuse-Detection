package z1;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static String f9934a;

    /* renamed from: b, reason: collision with root package name */
    private static int f9935b;

    public static String a() {
        BufferedReader bufferedReader;
        if (f9934a == null) {
            int i6 = f9935b;
            if (i6 == 0) {
                i6 = Process.myPid();
                f9935b = i6;
            }
            String str = null;
            str = null;
            str = null;
            BufferedReader bufferedReader2 = null;
            if (i6 > 0) {
                try {
                    String str2 = "/proc/" + i6 + "/cmdline";
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str2));
                        try {
                            String readLine = bufferedReader.readLine();
                            v1.n.h(readLine);
                            str = readLine.trim();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            h.a(bufferedReader2);
                            throw th;
                        }
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                } catch (IOException unused2) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                h.a(bufferedReader);
            }
            f9934a = str;
        }
        return f9934a;
    }
}
