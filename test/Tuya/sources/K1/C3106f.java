package k1;

import a1.InterfaceC1554e;
import a6.InterfaceC1579d;
import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import e6.i;
import h6.AbstractC2760c;
import h6.C2758a;
import h6.EnumC2761d;
import i1.C2768b;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.U;

/* renamed from: k1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3106f {

    /* renamed from: c, reason: collision with root package name */
    private static final a f33332c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC1579d f33333d = PreferenceDataStoreDelegateKt.preferencesDataStore$default("firebase_session_settings", null, null, null, 14, null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3108h f33334a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3108h f33335b;

    /* renamed from: k1.f$a */
    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ i[] f33336a = {U.h(new M(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DataStore b(Context context) {
            return (DataStore) C3106f.f33333d.getValue(context, f33336a[0]);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k1.f$b */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33337a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f33338b;

        /* renamed from: d, reason: collision with root package name */
        int f33340d;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33338b = obj;
            this.f33340d |= Integer.MIN_VALUE;
            return C3106f.this.g(this);
        }
    }

    public C3106f(InterfaceC3108h localOverrideSettings, InterfaceC3108h remoteSettings) {
        AbstractC3159y.i(localOverrideSettings, "localOverrideSettings");
        AbstractC3159y.i(remoteSettings, "remoteSettings");
        this.f33334a = localOverrideSettings;
        this.f33335b = remoteSettings;
    }

    private final boolean e(double d8) {
        if (0.0d > d8 || d8 > 1.0d) {
            return false;
        }
        return true;
    }

    private final boolean f(long j8) {
        if (C2758a.C(j8) && C2758a.x(j8)) {
            return true;
        }
        return false;
    }

    public final double b() {
        Double c8 = this.f33334a.c();
        if (c8 != null) {
            double doubleValue = c8.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double c9 = this.f33335b.c();
        if (c9 != null) {
            double doubleValue2 = c9.doubleValue();
            if (e(doubleValue2)) {
                return doubleValue2;
            }
            return 1.0d;
        }
        return 1.0d;
    }

    public final long c() {
        C2758a b8 = this.f33334a.b();
        if (b8 != null) {
            long L8 = b8.L();
            if (f(L8)) {
                return L8;
            }
        }
        C2758a b9 = this.f33335b.b();
        if (b9 != null) {
            long L9 = b9.L();
            if (f(L9)) {
                return L9;
            }
        }
        C2758a.C0756a c0756a = C2758a.f31409b;
        return AbstractC2760c.s(30, EnumC2761d.f31420f);
    }

    public final boolean d() {
        Boolean a8 = this.f33334a.a();
        if (a8 != null) {
            return a8.booleanValue();
        }
        Boolean a9 = this.f33335b.a();
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
    public final java.lang.Object g(P5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof k1.C3106f.b
            if (r0 == 0) goto L13
            r0 = r6
            k1.f$b r0 = (k1.C3106f.b) r0
            int r1 = r0.f33340d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33340d = r1
            goto L18
        L13:
            k1.f$b r0 = new k1.f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f33338b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f33340d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f33337a
            k1.f r2 = (k1.C3106f) r2
            L5.t.b(r6)
            goto L4d
        L3c:
            L5.t.b(r6)
            k1.h r6 = r5.f33334a
            r0.f33337a = r5
            r0.f33340d = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            k1.h r6 = r2.f33335b
            r2 = 0
            r0.f33337a = r2
            r0.f33340d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            L5.I r6 = L5.I.f6487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C3106f.g(P5.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3106f(Context context, P5.g blockingDispatcher, P5.g backgroundDispatcher, InterfaceC1554e firebaseInstallationsApi, C2768b appInfo) {
        this(new C3102b(context), new C3103c(backgroundDispatcher, firebaseInstallationsApi, appInfo, new C3104d(appInfo, blockingDispatcher, null, 4, null), f33332c.b(context)));
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(blockingDispatcher, "blockingDispatcher");
        AbstractC3159y.i(backgroundDispatcher, "backgroundDispatcher");
        AbstractC3159y.i(firebaseInstallationsApi, "firebaseInstallationsApi");
        AbstractC3159y.i(appInfo, "appInfo");
    }
}
