package R4;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9645a = false;

    /* renamed from: b, reason: collision with root package name */
    public static int f9646b = 20000;

    /* renamed from: R4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    class C0194a extends T4.a {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Set f9647p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0194a(int i8, boolean z8, String[] strArr, Set set) {
            super(i8, z8, strArr);
            this.f9647p = set;
        }

        @Override // T4.a
        public void c(int i8, String str) {
            if (i8 == 158) {
                this.f9647p.addAll(Arrays.asList(str.split(" ")));
            }
            super.c(i8, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9648a;

        static {
            int[] iArr = new int[c.values().length];
            f9648a = iArr;
            try {
                iArr[c.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9648a[c.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9648a[c.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9648a[c.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum c {
        VERBOSE,
        ERROR,
        DEBUG,
        WARN
    }

    private static void a(T4.b bVar, T4.a aVar) {
        while (!aVar.i()) {
            e("RootShell v1.4", bVar.G(aVar));
            e("RootShell v1.4", "Processed " + aVar.f10061d + " of " + aVar.f10060c + " output from command.");
            synchronized (aVar) {
                try {
                    if (!aVar.i()) {
                        aVar.wait(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                    }
                } catch (InterruptedException e8) {
                    e8.printStackTrace();
                }
            }
            if (!aVar.h() && !aVar.i()) {
                boolean z8 = bVar.f10092l;
                if (!z8 && !bVar.f10093m) {
                    e("RootShell v1.4", "Waiting for a command to be executed in a shell that is not executing and not reading! \n\n Command: " + aVar.g());
                    Exception exc = new Exception();
                    exc.setStackTrace(Thread.currentThread().getStackTrace());
                    exc.printStackTrace();
                } else if (z8 && !bVar.f10093m) {
                    e("RootShell v1.4", "Waiting for a command to be executed in a shell that is executing but not reading! \n\n Command: " + aVar.g());
                    Exception exc2 = new Exception();
                    exc2.setStackTrace(Thread.currentThread().getStackTrace());
                    exc2.printStackTrace();
                } else {
                    e("RootShell v1.4", "Waiting for a command to be executed in a shell that is not reading! \n\n Command: " + aVar.g());
                    Exception exc3 = new Exception();
                    exc3.setStackTrace(Thread.currentThread().getStackTrace());
                    exc3.printStackTrace();
                }
            }
        }
    }

    public static boolean b() {
        HashSet<String> hashSet = new HashSet();
        try {
            c("Checking for Root access");
            C0194a c0194a = new C0194a(158, false, new String[]{"id"}, hashSet);
            T4.b.L().w(c0194a);
            a(T4.b.L(), c0194a);
            for (String str : hashSet) {
                c(str);
                if (str.toLowerCase().contains("uid=0")) {
                    c("Access Given");
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void c(String str) {
        f(null, str, c.DEBUG, null);
    }

    public static void d(String str, c cVar, Exception exc) {
        f(null, str, cVar, exc);
    }

    public static void e(String str, String str2) {
        f(str, str2, c.DEBUG, null);
    }

    public static void f(String str, String str2, c cVar, Exception exc) {
        if (str2 != null && !str2.equals("") && f9645a) {
            if (str == null) {
                str = "RootShell v1.4";
            }
            int i8 = b.f9648a[cVar.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4) {
                            Log.w(str, str2);
                            return;
                        }
                        return;
                    }
                    Log.d(str, str2);
                    return;
                }
                Log.e(str, str2, exc);
                return;
            }
            Log.v(str, str2);
        }
    }
}
