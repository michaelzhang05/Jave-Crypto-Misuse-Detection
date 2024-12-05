package com.google.android.gms.dynamite;

import O.C1264h;
import R.AbstractC1317n;
import R.AbstractC1319p;
import a0.AbstractC1546a;
import a0.AbstractC1547b;
import a0.AbstractC1549d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.DynamiteApi;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f15215h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f15216i = null;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f15217j = false;

    /* renamed from: k, reason: collision with root package name */
    private static int f15218k = -1;

    /* renamed from: l, reason: collision with root package name */
    private static Boolean f15219l;

    /* renamed from: q, reason: collision with root package name */
    private static m f15224q;

    /* renamed from: r, reason: collision with root package name */
    private static n f15225r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f15226a;

    /* renamed from: m, reason: collision with root package name */
    private static final ThreadLocal f15220m = new ThreadLocal();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadLocal f15221n = new com.google.android.gms.dynamite.b();

    /* renamed from: o, reason: collision with root package name */
    private static final b.a f15222o = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final b f15209b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final b f15210c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final b f15211d = new f();

    /* renamed from: e, reason: collision with root package name */
    public static final b f15212e = new g();

    /* renamed from: f, reason: collision with root package name */
    public static final b f15213f = new h();

    /* renamed from: g, reason: collision with root package name */
    public static final b f15214g = new i();

    /* renamed from: p, reason: collision with root package name */
    public static final b f15223p = new j();

    @DynamiteApi
    /* loaded from: classes3.dex */
    public static class DynamiteLoaderClassLoader {

        @Nullable
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes3.dex */
    public static class a extends Exception {
        /* synthetic */ a(String str, a0.f fVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, a0.f fVar) {
            super(str, th);
        }
    }

    /* loaded from: classes3.dex */
    public interface b {

        /* loaded from: classes3.dex */
        public interface a {
            int a(Context context, String str, boolean z8);

            int b(Context context, String str);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0377b {

            /* renamed from: a, reason: collision with root package name */
            public int f15227a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f15228b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f15229c = 0;
        }

        C0377b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        AbstractC1319p.l(context);
        this.f15226a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!AbstractC1317n.a(declaredField.get(null), str)) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e8) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e8.getMessage())));
            return 0;
        }
    }

    public static int c(Context context, String str) {
        return f(context, str, false);
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0226: MOVE (r6 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:551), block:B:168:0x0226 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context r18, com.google.android.gms.dynamite.DynamiteModule.b r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$b, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01bf -> B:24:0x01c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01c1 -> B:24:0x01c4). Please report as a decompilation issue!!! */
    public static int f(Context context, String str, boolean z8) {
        Field declaredField;
        Throwable th;
        RemoteException e8;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f15215h;
                Cursor cursor2 = null;
                int i8 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e9) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e9.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                i(classLoader);
                            } catch (a unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!k(context)) {
                                return 0;
                            }
                            if (!f15217j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int g8 = g(context, str, z8, true);
                                        String str2 = f15216i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a8 = AbstractC1549d.a();
                                            if (a8 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    AbstractC1547b.a();
                                                    String str3 = f15216i;
                                                    AbstractC1319p.l(str3);
                                                    a8 = AbstractC1546a.a(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f15216i;
                                                    AbstractC1319p.l(str4);
                                                    a8 = new com.google.android.gms.dynamite.a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            i(a8);
                                            declaredField.set(null, a8);
                                            f15215h = bool2;
                                            return g8;
                                        }
                                        return g8;
                                    } catch (a unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        }
                        f15215h = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return g(context, str, z8, false);
                    } catch (a e10) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e10.getMessage());
                        return 0;
                    }
                }
                m l8 = l(context);
                try {
                    if (l8 != null) {
                        try {
                            int l9 = l8.l();
                            if (l9 >= 3) {
                                k kVar = (k) f15220m.get();
                                if (kVar != null && (cursor = kVar.f15230a) != null) {
                                    i8 = cursor.getInt(0);
                                } else {
                                    Cursor cursor3 = (Cursor) Z.b.l(l8.r0(Z.b.m0(context), str, z8, ((Long) f15221n.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i9 = cursor3.getInt(0);
                                                if (i9 <= 0 || !j(cursor3)) {
                                                    cursor2 = cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                i8 = i9;
                                            }
                                        } catch (RemoteException e11) {
                                            e8 = e11;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e8.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            return i8;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                }
                            } else if (l9 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i8 = l8.n0(Z.b.m0(context), str, z8);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i8 = l8.m0(Z.b.m0(context), str, z8);
                            }
                        } catch (RemoteException e12) {
                            e8 = e12;
                        }
                    }
                    return i8;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            W.f.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        r8.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(android.content.Context r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule h(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void i(ClassLoader classLoader) {
        n nVar;
        a0.f fVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof n) {
                    nVar = (n) queryLocalInterface;
                } else {
                    nVar = new n(iBinder);
                }
            }
            f15225r = nVar;
        } catch (ClassNotFoundException e8) {
            e = e8;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (IllegalAccessException e9) {
            e = e9;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (InstantiationException e10) {
            e = e10;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (NoSuchMethodException e11) {
            e = e11;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new a("Failed to instantiate dynamite loader", e, fVar);
        }
    }

    private static boolean j(Cursor cursor) {
        k kVar = (k) f15220m.get();
        if (kVar != null && kVar.f15230a == null) {
            kVar.f15230a = cursor;
            return true;
        }
        return false;
    }

    private static boolean k(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f15219l)) {
            return true;
        }
        boolean z8 = false;
        if (f15219l == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C1264h.f().h(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z8 = true;
            }
            f15219l = Boolean.valueOf(z8);
            if (z8 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f15217j = true;
            }
        }
        if (!z8) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z8;
    }

    private static m l(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f15224q;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof m) {
                        mVar = (m) queryLocalInterface;
                    } else {
                        mVar = new m(iBinder);
                    }
                }
                if (mVar != null) {
                    f15224q = mVar;
                    return mVar;
                }
            } catch (Exception e8) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e8.getMessage());
            }
            return null;
        }
    }

    public Context b() {
        return this.f15226a;
    }

    public IBinder d(String str) {
        try {
            return (IBinder) this.f15226a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e8) {
            throw new a("Failed to instantiate module class: ".concat(String.valueOf(str)), e8, null);
        }
    }
}
