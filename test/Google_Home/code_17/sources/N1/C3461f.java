package n1;

import A0.n;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import d6.InterfaceC2759d;
import h6.i;
import k6.AbstractC3227c;
import k6.C3225a;
import k6.EnumC3228d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.U;
import l1.C3299b;
import l1.v;
import l1.w;

/* renamed from: n1.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3461f {

    /* renamed from: c, reason: collision with root package name */
    public static final b f35323c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC2759d f35324d = PreferenceDataStoreDelegateKt.preferencesDataStore$default(w.f34362a.b(), new ReplaceFileCorruptionHandler(a.f35327a), null, null, 12, null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3463h f35325a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3463h f35326b;

    /* renamed from: n1.f$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35327a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Preferences invoke(CorruptionException ex) {
            AbstractC3255y.i(ex, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + v.f34361a.e() + '.', ex);
            return PreferencesFactory.createEmpty();
        }
    }

    /* renamed from: n1.f$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ i[] f35328a = {U.h(new M(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore b(Context context) {
            return (DataStore) C3461f.f35324d.getValue(context, f35328a[0]);
        }

        public final C3461f c() {
            Object j8 = n.a(A0.c.f72a).j(C3461f.class);
            AbstractC3255y.h(j8, "Firebase.app[SessionsSettings::class.java]");
            return (C3461f) j8;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n1.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35329a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f35330b;

        /* renamed from: d, reason: collision with root package name */
        int f35332d;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35330b = obj;
            this.f35332d |= Integer.MIN_VALUE;
            return C3461f.this.g(this);
        }
    }

    public C3461f(InterfaceC3463h localOverrideSettings, InterfaceC3463h remoteSettings) {
        AbstractC3255y.i(localOverrideSettings, "localOverrideSettings");
        AbstractC3255y.i(remoteSettings, "remoteSettings");
        this.f35325a = localOverrideSettings;
        this.f35326b = remoteSettings;
    }

    private final boolean e(double d8) {
        if (0.0d > d8 || d8 > 1.0d) {
            return false;
        }
        return true;
    }

    private final boolean f(long j8) {
        if (C3225a.G(j8) && C3225a.B(j8)) {
            return true;
        }
        return false;
    }

    public final double b() {
        Double d8 = this.f35325a.d();
        if (d8 != null) {
            double doubleValue = d8.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double d9 = this.f35326b.d();
        if (d9 != null) {
            double doubleValue2 = d9.doubleValue();
            if (e(doubleValue2)) {
                return doubleValue2;
            }
            return 1.0d;
        }
        return 1.0d;
    }

    public final long c() {
        C3225a b8 = this.f35325a.b();
        if (b8 != null) {
            long P8 = b8.P();
            if (f(P8)) {
                return P8;
            }
        }
        C3225a b9 = this.f35326b.b();
        if (b9 != null) {
            long P9 = b9.P();
            if (f(P9)) {
                return P9;
            }
        }
        C3225a.C0782a c0782a = C3225a.f34131b;
        return AbstractC3227c.s(30, EnumC3228d.f34142f);
    }

    public final boolean d() {
        Boolean a8 = this.f35325a.a();
        if (a8 != null) {
            return a8.booleanValue();
        }
        Boolean a9 = this.f35326b.a();
        if (a9 != null) {
            return a9.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(S5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof n1.C3461f.c
            if (r0 == 0) goto L13
            r0 = r6
            n1.f$c r0 = (n1.C3461f.c) r0
            int r1 = r0.f35332d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35332d = r1
            goto L18
        L13:
            n1.f$c r0 = new n1.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35330b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f35332d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f35329a
            n1.f r2 = (n1.C3461f) r2
            O5.t.b(r6)
            goto L4d
        L3c:
            O5.t.b(r6)
            n1.h r6 = r5.f35325a
            r0.f35329a = r5
            r0.f35332d = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            n1.h r6 = r2.f35326b
            r2 = 0
            r0.f35329a = r2
            r0.f35332d = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            O5.I r6 = O5.I.f8278a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C3461f.g(S5.d):java.lang.Object");
    }

    private C3461f(Context context, S5.g gVar, S5.g gVar2, c1.e eVar, C3299b c3299b) {
        this(new C3457b(context), new C3458c(gVar2, eVar, c3299b, new C3459d(c3299b, gVar, null, 4, null), f35323c.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3461f(A0.f r8, S5.g r9, S5.g r10, c1.e r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.AbstractC3255y.i(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.AbstractC3255y.i(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.AbstractC3255y.i(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.AbstractC3255y.i(r11, r0)
            android.content.Context r2 = r8.k()
            java.lang.String r0 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.AbstractC3255y.h(r2, r0)
            l1.A r0 = l1.C3292A.f34222a
            l1.b r6 = r0.b(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C3461f.<init>(A0.f, S5.g, S5.g, c1.e):void");
    }
}
