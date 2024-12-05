package com.squareup.picasso;

import P6.C1282h;
import P6.InterfaceC1281g;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import i2.InterfaceC2777e;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    static final StringBuilder f23202a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private static final C1282h f23203b = C1282h.f("RIFF");

    /* renamed from: c, reason: collision with root package name */
    private static final C1282h f23204c = C1282h.f("WEBP");

    /* loaded from: classes4.dex */
    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    /* loaded from: classes4.dex */
    private static class b extends Thread {
        b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* loaded from: classes4.dex */
    static class c implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(File file) {
        long j8;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j8 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j8 = 5242880;
        }
        return Math.max(Math.min(j8, 52428800L), 5242880L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(Context context) {
        int memoryClass;
        ActivityManager activityManager = (ActivityManager) o(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            memoryClass = activityManager.getLargeMemoryClass();
        } else {
            memoryClass = activityManager.getMemoryClass();
        }
        return (int) ((memoryClass * 1048576) / 7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        if (r()) {
        } else {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        if (!r()) {
        } else {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(v vVar) {
        StringBuilder sb = f23202a;
        String h8 = h(vVar, sb);
        sb.setLength(0);
        return h8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String h(v vVar, StringBuilder sb) {
        String str = vVar.f23369f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(vVar.f23369f);
        } else {
            Uri uri = vVar.f23367d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(vVar.f23368e);
            }
        }
        sb.append('\n');
        if (vVar.f23377n != 0.0f) {
            sb.append("rotation:");
            sb.append(vVar.f23377n);
            if (vVar.f23380q) {
                sb.append('@');
                sb.append(vVar.f23378o);
                sb.append('x');
                sb.append(vVar.f23379p);
            }
            sb.append('\n');
        }
        if (vVar.c()) {
            sb.append("resize:");
            sb.append(vVar.f23371h);
            sb.append('x');
            sb.append(vVar.f23372i);
            sb.append('\n');
        }
        if (vVar.f23373j) {
            sb.append("centerCrop:");
            sb.append(vVar.f23374k);
            sb.append('\n');
        } else if (vVar.f23375l) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List list = vVar.f23370g;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                sb.append(((InterfaceC2777e) vVar.f23370g.get(i8)).key());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String k(RunnableC2405c runnableC2405c) {
        return l(runnableC2405c, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String l(RunnableC2405c runnableC2405c, String str) {
        StringBuilder sb = new StringBuilder(str);
        AbstractC2403a h8 = runnableC2405c.h();
        if (h8 != null) {
            sb.append(h8.f23207b.d());
        }
        List i8 = runnableC2405c.i();
        if (i8 != null) {
            int size = i8.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (i9 > 0 || h8 != null) {
                    sb.append(", ");
                }
                sb.append(((AbstractC2403a) i8.get(i9)).f23207b.d());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(Resources resources, v vVar) {
        Uri uri;
        int i8 = vVar.f23368e;
        if (i8 == 0 && (uri = vVar.f23367d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                List<String> pathSegments = vVar.f23367d.getPathSegments();
                if (pathSegments != null && !pathSegments.isEmpty()) {
                    if (pathSegments.size() == 1) {
                        try {
                            return Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Last path segment is not a resource ID: " + vVar.f23367d);
                        }
                    }
                    if (pathSegments.size() == 2) {
                        return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    }
                    throw new FileNotFoundException("More than two path segments: " + vVar.f23367d);
                }
                throw new FileNotFoundException("No path segments: " + vVar.f23367d);
            }
            throw new FileNotFoundException("No package provided: " + vVar.f23367d);
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources n(Context context, v vVar) {
        Uri uri;
        if (vVar.f23368e == 0 && (uri = vVar.f23367d) != null) {
            String authority = uri.getAuthority();
            if (authority != null) {
                try {
                    return context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new FileNotFoundException("Unable to obtain resources for package: " + vVar.f23367d);
                }
            }
            throw new FileNotFoundException("No package provided: " + vVar.f23367d);
        }
        return context.getResources();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object o(Context context, String str) {
        return context.getSystemService(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(Context context) {
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
                return false;
            }
            return true;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    static boolean r() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(InterfaceC1281g interfaceC1281g) {
        if (interfaceC1281g.s(0L, f23203b) && interfaceC1281g.s(8L, f23204c)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(String str, String str2, String str3) {
        u(str, str2, str3, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void u(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
