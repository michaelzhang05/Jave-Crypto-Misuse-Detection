package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.c f3186a = androidx.concurrent.futures.c.r();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f3187b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c f3188c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            PackageManager.PackageInfoFlags of;
            PackageInfo packageInfo;
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(0L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
            return packageInfo;
        }
    }

    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f3189a;

        /* renamed from: b, reason: collision with root package name */
        final int f3190b;

        /* renamed from: c, reason: collision with root package name */
        final long f3191c;

        /* renamed from: d, reason: collision with root package name */
        final long f3192d;

        b(int i6, int i7, long j6, long j7) {
            this.f3189a = i6;
            this.f3190b = i7;
            this.f3191c = j6;
            this.f3192d = j7;
        }

        static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f3189a);
                dataOutputStream.writeInt(this.f3190b);
                dataOutputStream.writeLong(this.f3191c);
                dataOutputStream.writeLong(this.f3192d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3190b == bVar.f3190b && this.f3191c == bVar.f3191c && this.f3189a == bVar.f3189a && this.f3192d == bVar.f3192d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f3190b), Long.valueOf(this.f3191c), Integer.valueOf(this.f3189a), Long.valueOf(this.f3192d));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f3193a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f3194b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f3195c;

        c(int i6, boolean z5, boolean z6) {
            this.f3193a = i6;
            this.f3195c = z6;
            this.f3194b = z5;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return (Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context) : packageManager.getPackageInfo(context.getPackageName(), 0)).lastUpdateTime;
    }

    private static c b(int i6, boolean z5, boolean z6) {
        c cVar = new c(i6, z5, z6);
        f3188c = cVar;
        f3186a.n(cVar);
        return f3188c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(20:14|(1:78)(1:18)|19|(1:77)(1:23)|24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
    
        r3 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009d, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.q.c c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.q.c(android.content.Context, boolean):androidx.profileinstaller.q$c");
    }
}
