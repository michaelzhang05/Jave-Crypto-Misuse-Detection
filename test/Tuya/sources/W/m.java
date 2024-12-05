package W;

import R.AbstractC1319p;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static String f11958a;

    /* renamed from: b, reason: collision with root package name */
    private static int f11959b;

    public static String a() {
        BufferedReader bufferedReader;
        String processName;
        if (f11958a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f11958a = processName;
            } else {
                int i8 = f11959b;
                if (i8 == 0) {
                    i8 = Process.myPid();
                    f11959b = i8;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i8 > 0) {
                    try {
                        String str2 = "/proc/" + i8 + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                AbstractC1319p.l(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                j.a(bufferedReader2);
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
                    j.a(bufferedReader);
                }
                f11958a = str;
            }
        }
        return f11958a;
    }
}
