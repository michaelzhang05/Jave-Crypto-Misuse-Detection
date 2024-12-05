package O7;

import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final N7.a f8545a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedStorage f8546b;

    /* renamed from: c, reason: collision with root package name */
    public final N7.b f8547c;

    /* renamed from: d, reason: collision with root package name */
    public final P7.j f8548d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8549e;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f8550a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8551b;

        /* renamed from: d, reason: collision with root package name */
        public int f8553d;

        public a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8551b = obj;
            this.f8553d |= Integer.MIN_VALUE;
            return p.this.a(this);
        }
    }

    public p(N7.a networkUtil, SharedStorage sharedStorage, N7.b requestApi, P7.j resolver) {
        AbstractC3255y.i(networkUtil, "networkUtil");
        AbstractC3255y.i(sharedStorage, "sharedStorage");
        AbstractC3255y.i(requestApi, "requestApi");
        AbstractC3255y.i(resolver, "resolver");
        this.f8545a = networkUtil;
        this.f8546b = sharedStorage;
        this.f8547c = requestApi;
        this.f8548d = resolver;
        this.f8549e = "tcfv2/google-atp-list.json";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // O7.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof O7.p.a
            if (r0 == 0) goto L13
            r0 = r9
            O7.p$a r0 = (O7.p.a) r0
            int r1 = r0.f8553d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8553d = r1
            goto L18
        L13:
            O7.p$a r0 = new O7.p$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8551b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f8553d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f8550a
            O7.p r0 = (O7.p) r0
            O5.t.b(r9)     // Catch: y5.C4208a -> L2d
            goto L82
        L2d:
            goto L9f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            O5.t.b(r9)
            N7.a r9 = r8.f8545a     // Catch: y5.C4208a -> L85
            boolean r9 = r9.a()     // Catch: y5.C4208a -> L85
            if (r9 == 0) goto L87
            boolean r9 = r8.b()     // Catch: y5.C4208a -> L85
            if (r9 == 0) goto L87
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f8546b     // Catch: y5.C4208a -> L85
            Q7.a r2 = Q7.a.GOOGLE_VENDOR_LAST_UPDATE     // Catch: y5.C4208a -> L85
            long r4 = java.lang.System.currentTimeMillis()     // Catch: y5.C4208a -> L85
            r9.getClass()     // Catch: y5.C4208a -> L85
            java.lang.String r6 = "preferenceKey"
            kotlin.jvm.internal.AbstractC3255y.i(r2, r6)     // Catch: y5.C4208a -> L85
            android.content.SharedPreferences r9 = r9.f18900a     // Catch: y5.C4208a -> L85
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch: y5.C4208a -> L85
            java.lang.String r2 = "editor"
            kotlin.jvm.internal.AbstractC3255y.h(r9, r2)     // Catch: y5.C4208a -> L85
            java.lang.String r2 = "googleVendorLastUpdate"
            r9.putLong(r2, r4)     // Catch: y5.C4208a -> L85
            r9.apply()     // Catch: y5.C4208a -> L85
            N7.b r9 = r8.f8547c     // Catch: y5.C4208a -> L85
            java.lang.String r2 = "https://cmp.inmobi.com/"
            java.lang.String r4 = r8.f8549e     // Catch: y5.C4208a -> L85
            java.lang.String r2 = kotlin.jvm.internal.AbstractC3255y.q(r2, r4)     // Catch: y5.C4208a -> L85
            r0.f8550a = r8     // Catch: y5.C4208a -> L85
            r0.f8553d = r3     // Catch: y5.C4208a -> L85
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: y5.C4208a -> L85
            if (r9 != r1) goto L81
            return r1
        L81:
            r0 = r8
        L82:
            java.lang.String r9 = (java.lang.String) r9     // Catch: y5.C4208a -> L2d
            goto Lb0
        L85:
            goto L9e
        L87:
            y5.b r1 = y5.C4209b.f41007a     // Catch: y5.C4208a -> L85
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: y5.C4208a -> L85
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            y5.C4209b.b(r1, r2, r3, r4, r5, r6, r7)     // Catch: y5.C4208a -> L85
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f8546b     // Catch: y5.C4208a -> L85
            Q7.a r0 = Q7.a.GOOGLE_VENDOR_LIST     // Catch: y5.C4208a -> L85
            java.lang.String r9 = r9.j(r0)     // Catch: y5.C4208a -> L85
            r0 = r8
            goto Lb0
        L9e:
            r0 = r8
        L9f:
            boolean r9 = r0.b()
            if (r9 == 0) goto La8
            java.lang.String r9 = ""
            goto Lb0
        La8:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f8546b
            Q7.a r1 = Q7.a.GOOGLE_VENDOR_LIST
            java.lang.String r9 = r9.j(r1)
        Lb0:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f8546b
            Q7.a r2 = Q7.a.GOOGLE_VENDOR_LIST
            r1.e(r2, r9)
            P7.j r0 = r0.f8548d
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.p.a(S5.d):java.lang.Object");
    }

    public final boolean b() {
        SharedStorage sharedStorage = this.f8546b;
        Q7.a preferenceKey = Q7.a.GOOGLE_VENDOR_LAST_UPDATE;
        sharedStorage.getClass();
        AbstractC3255y.i(preferenceKey, "preferenceKey");
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - sharedStorage.f18900a.getLong("googleVendorLastUpdate", 0L)) < 0) {
            return false;
        }
        return true;
    }
}
