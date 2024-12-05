package V3;

import P5.AbstractC1378t;
import V3.n;
import android.os.Debug;
import android.os.Environment;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private final n f10848a;

    /* loaded from: classes4.dex */
    public static final class b extends l {

        /* renamed from: b, reason: collision with root package name */
        private static final a f10852b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final n f10853c = new n("SW02", "An emulator is being used to run the App.", n.b.f10866c);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public b() {
            super(f10853c, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        
            if (j6.n.C(r0, "generic", false, 2, null) == false) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final boolean c() {
            /*
                r7 = this;
                java.lang.String r0 = android.os.Build.FINGERPRINT
                java.lang.String r1 = "FINGERPRINT"
                kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                java.lang.String r2 = "generic"
                r3 = 0
                r4 = 2
                r5 = 0
                boolean r6 = j6.n.C(r0, r2, r3, r4, r5)
                if (r6 != 0) goto L73
                kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                java.lang.String r1 = "unknown"
                boolean r0 = j6.n.C(r0, r1, r3, r4, r5)
                if (r0 != 0) goto L73
                java.lang.String r0 = android.os.Build.MODEL
                java.lang.String r1 = "MODEL"
                kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                java.lang.String r6 = "Emulator"
                boolean r6 = j6.n.H(r0, r6, r3, r4, r5)
                if (r6 != 0) goto L73
                kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                java.lang.String r6 = "Android SDK built for x86"
                boolean r6 = j6.n.H(r0, r6, r3, r4, r5)
                if (r6 != 0) goto L73
                kotlin.jvm.internal.AbstractC3255y.h(r0, r1)
                java.lang.String r1 = "google_sdk"
                boolean r0 = j6.n.H(r0, r1, r3, r4, r5)
                if (r0 != 0) goto L73
                java.lang.String r0 = android.os.Build.MANUFACTURER
                java.lang.String r6 = "MANUFACTURER"
                kotlin.jvm.internal.AbstractC3255y.h(r0, r6)
                java.lang.String r6 = "Genymotion"
                boolean r0 = j6.n.H(r0, r6, r3, r4, r5)
                if (r0 != 0) goto L73
                java.lang.String r0 = android.os.Build.BRAND
                java.lang.String r6 = "BRAND"
                kotlin.jvm.internal.AbstractC3255y.h(r0, r6)
                boolean r0 = j6.n.C(r0, r2, r3, r4, r5)
                if (r0 == 0) goto L6b
                java.lang.String r0 = android.os.Build.DEVICE
                java.lang.String r6 = "DEVICE"
                kotlin.jvm.internal.AbstractC3255y.h(r0, r6)
                boolean r0 = j6.n.C(r0, r2, r3, r4, r5)
                if (r0 != 0) goto L73
            L6b:
                java.lang.String r0 = android.os.Build.PRODUCT
                boolean r0 = kotlin.jvm.internal.AbstractC3255y.d(r1, r0)
                if (r0 == 0) goto L74
            L73:
                r3 = 1
            L74:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: V3.l.b.c():boolean");
        }

        @Override // V3.l
        public boolean a() {
            return c();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends l {

        /* renamed from: b, reason: collision with root package name */
        private static final a f10854b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final List f10855c = AbstractC1378t.p("/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/");

        /* renamed from: d, reason: collision with root package name */
        private static final n f10856d = new n("SW01", "The device is jailbroken.", n.b.f10866c);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public c() {
            super(f10856d, null);
        }

        private final boolean c() {
            List list = f10855c;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (new File(((String) it.next()) + DownloadCommon.DOWNLOAD_REPORT_SUCCESS).exists()) {
                    return true;
                }
            }
            return false;
        }

        private final boolean d() {
            return new File(Environment.getRootDirectory().toString() + "/Superuser").isDirectory();
        }

        @Override // V3.l
        public boolean a() {
            if (!c() && !d()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends l {

        /* renamed from: b, reason: collision with root package name */
        private static final a f10857b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final n f10858c = new n("SW02", "The integrity of the SDK has been tampered.", n.b.f10866c);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public d() {
            super(f10858c, null);
        }

        private final boolean c() {
            Field[] declaredFields = Z3.b.class.getDeclaredFields();
            AbstractC3255y.h(declaredFields, "getDeclaredFields(...)");
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (true ^ field.isSynthetic()) {
                    arrayList.add(field);
                }
            }
            if (arrayList.size() != 8) {
                return false;
            }
            return true;
        }

        private final boolean d() {
            Method[] declaredMethods = Z3.b.class.getDeclaredMethods();
            AbstractC3255y.h(declaredMethods, "getDeclaredMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                if (true ^ method.isSynthetic()) {
                    arrayList.add(method);
                }
            }
            if (arrayList.size() != 5) {
                return false;
            }
            return true;
        }

        @Override // V3.l
        public boolean a() {
            if (c() && d()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends l {

        /* renamed from: b, reason: collision with root package name */
        private static final a f10859b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        private static final n f10860c = new n("SW05", "The OS or the OS version is not supported.", n.b.f10866c);

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public e() {
            super(f10860c, null);
        }

        @Override // V3.l
        public boolean a() {
            return false;
        }
    }

    public /* synthetic */ l(n nVar, AbstractC3247p abstractC3247p) {
        this(nVar);
    }

    public abstract boolean a();

    public final n b() {
        return this.f10848a;
    }

    /* loaded from: classes4.dex */
    public static final class a extends l {

        /* renamed from: c, reason: collision with root package name */
        private static final C0218a f10849c = new C0218a(null);

        /* renamed from: d, reason: collision with root package name */
        private static final n f10850d = new n("SW04", "A debugger is attached to the App.", n.b.f10865b);

        /* renamed from: b, reason: collision with root package name */
        private final boolean f10851b;

        /* renamed from: V3.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0218a {
            private C0218a() {
            }

            public /* synthetic */ C0218a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        public /* synthetic */ a(boolean z8, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? Debug.isDebuggerConnected() : z8);
        }

        @Override // V3.l
        public boolean a() {
            return this.f10851b;
        }

        public a(boolean z8) {
            super(f10850d, null);
            this.f10851b = z8;
        }
    }

    private l(n nVar) {
        this.f10848a = nVar;
    }
}
