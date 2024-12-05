package v4;

import M1.a;
import O5.I;
import O5.InterfaceC1355k;
import O5.l;
import O5.s;
import O5.t;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: v4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4103b {

    /* renamed from: b, reason: collision with root package name */
    private static final a f40142b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f40143c = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f40144a;

    /* renamed from: v4.b$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: v4.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0911b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40145a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40145a = iArr;
        }
    }

    /* renamed from: v4.b$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f40147b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f40148c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f40149d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, long j8) {
            super(0);
            this.f40147b = context;
            this.f40148c = str;
            this.f40149d = j8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M1.a invoke() {
            try {
                return M1.a.G(C4103b.this.f(this.f40147b, this.f40148c), 1, 1, this.f40149d);
            } catch (IOException e8) {
                Log.e("stripe_image_disk_cache", "error opening cache", e8);
                return null;
            }
        }
    }

    public C4103b(Context context, String cacheFolder, long j8) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(cacheFolder, "cacheFolder");
        this.f40144a = l.b(new c(context, cacheFolder, j8));
    }

    private final Bitmap.CompressFormat b(String str) {
        Bitmap.CompressFormat b8;
        EnumC4105d a8 = EnumC4105d.f40152c.a(str);
        if (a8 != null && (b8 = a8.b()) != null) {
            return b8;
        }
        throw new IllegalArgumentException("Unexpected image format: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File f(Context context, String str) {
        String path = context.getCacheDir().getPath();
        AbstractC3255y.h(path, "getPath(...)");
        return new File(path + File.separator + str);
    }

    private final M1.a g() {
        return (M1.a) this.f40144a.getValue();
    }

    private final int i(Bitmap.CompressFormat compressFormat) {
        int i8 = C0911b.f40145a[compressFormat.ordinal()];
        if (i8 == 1) {
            return 80;
        }
        if (i8 != 2) {
            if (i8 == 3) {
                return 80;
            }
            throw new IllegalArgumentException("Unexpected compress format: " + compressFormat);
        }
        return 100;
    }

    private final String j(String str) {
        return String.valueOf(str.hashCode());
    }

    private final boolean k(Bitmap bitmap, a.c cVar, Bitmap.CompressFormat compressFormat, int i8) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(cVar.f(0), 8192);
            try {
                boolean compress = bitmap.compress(compressFormat, i8, bufferedOutputStream2);
                bufferedOutputStream2.close();
                return compress;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean c(String key) {
        a.e eVar;
        AbstractC3255y.i(key, "key");
        boolean z8 = false;
        try {
            M1.a g8 = g();
            if (g8 != null) {
                eVar = g8.E(j(key));
            } else {
                eVar = null;
            }
            if (eVar != null) {
                z8 = true;
            }
            if (eVar != null) {
                eVar.close();
            }
        } catch (IOException e8) {
            Log.e("stripe_image_disk_cache", "error reading from cache", e8);
        }
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap e(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "image not in cache: "
            java.lang.String r1 = "key"
            kotlin.jvm.internal.AbstractC3255y.i(r8, r1)
            java.lang.String r8 = r7.j(r8)
            r1 = 0
            M1.a r2 = r7.g()     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L1a
            if (r2 == 0) goto L1d
            M1.a$e r2 = r2.E(r8)     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L1a
            goto L1e
        L17:
            r8 = move-exception
            goto L89
        L1a:
            r2 = move-exception
            r3 = r1
            goto L54
        L1d:
            r2 = r1
        L1e:
            if (r2 != 0) goto L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r3.<init>()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r3.append(r0)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r3.append(r8)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r7.d(r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            return r1
        L33:
            r8 = move-exception
            r1 = r2
            goto L89
        L36:
            r3 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L54
        L3b:
            r3 = 0
            java.io.InputStream r3 = r2.a(r3)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            java.lang.String r4 = "getInputStream(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r3, r4)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r5 = 8192(0x2000, float:1.148E-41)
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r2.close()
            goto L60
        L54:
            java.lang.String r4 = "stripe_image_disk_cache"
            java.lang.String r5 = "error getting bitmap from cache"
            android.util.Log.e(r4, r5, r2)     // Catch: java.lang.Throwable -> L87
            if (r3 == 0) goto L60
            r3.close()
        L60:
            if (r1 != 0) goto L72
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            goto L83
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "image read from disk "
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L83:
            r7.d(r8)
            return r1
        L87:
            r8 = move-exception
            r1 = r3
        L89:
            if (r1 == 0) goto L8e
            r1.close()
        L8e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C4103b.e(java.lang.String):android.graphics.Bitmap");
    }

    public final void h(String key, Bitmap data) {
        a.c cVar;
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(data, "data");
        String j8 = j(key);
        if (c(key)) {
            d("Image already cached");
            return;
        }
        I i8 = null;
        try {
            M1.a g8 = g();
            if (g8 != null) {
                cVar = g8.A(j8);
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return;
            }
            try {
                Bitmap.CompressFormat b8 = b(key);
                if (k(data, cVar, b8, i(b8))) {
                    M1.a g9 = g();
                    if (g9 != null) {
                        g9.flush();
                    }
                    cVar.e();
                    d("image put on disk cache " + j8);
                    return;
                }
                cVar.a();
                Log.e("stripe_image_disk_cache", "ERROR on: image put on disk cache " + j8);
            } catch (IOException unused) {
                Log.e("stripe_image_disk_cache", "ERROR on: image put on disk cache " + j8);
                try {
                    s.a aVar = s.f8302b;
                    if (cVar != null) {
                        cVar.a();
                        i8 = I.f8278a;
                    }
                    s.b(i8);
                } catch (Throwable th) {
                    s.a aVar2 = s.f8302b;
                    s.b(t.a(th));
                }
            }
        } catch (IOException unused2) {
            cVar = null;
        }
    }

    public /* synthetic */ C4103b(Context context, String str, long j8, int i8, AbstractC3247p abstractC3247p) {
        this(context, str, (i8 & 4) != 0 ? 10485760L : j8);
    }

    private final void d(String str) {
    }
}
