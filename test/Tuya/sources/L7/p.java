package L7;

import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final K7.a f6754a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedStorage f6755b;

    /* renamed from: c, reason: collision with root package name */
    public final K7.b f6756c;

    /* renamed from: d, reason: collision with root package name */
    public final M7.j f6757d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6758e;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6759a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6760b;

        /* renamed from: d, reason: collision with root package name */
        public int f6762d;

        public a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6760b = obj;
            this.f6762d |= Integer.MIN_VALUE;
            return p.this.a(this);
        }
    }

    public p(K7.a networkUtil, SharedStorage sharedStorage, K7.b requestApi, M7.j resolver) {
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(resolver, "resolver");
        this.f6754a = networkUtil;
        this.f6755b = sharedStorage;
        this.f6756c = requestApi;
        this.f6757d = resolver;
        this.f6758e = "tcfv2/google-atp-list.json";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // L7.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof L7.p.a
            if (r0 == 0) goto L13
            r0 = r9
            L7.p$a r0 = (L7.p.a) r0
            int r1 = r0.f6762d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6762d = r1
            goto L18
        L13:
            L7.p$a r0 = new L7.p$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6760b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f6762d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f6759a
            L7.p r0 = (L7.p) r0
            L5.t.b(r9)     // Catch: v5.C3831a -> L2d
            goto L82
        L2d:
            goto L9f
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            L5.t.b(r9)
            K7.a r9 = r8.f6754a     // Catch: v5.C3831a -> L85
            boolean r9 = r9.a()     // Catch: v5.C3831a -> L85
            if (r9 == 0) goto L87
            boolean r9 = r8.b()     // Catch: v5.C3831a -> L85
            if (r9 == 0) goto L87
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f6755b     // Catch: v5.C3831a -> L85
            N7.a r2 = N7.a.GOOGLE_VENDOR_LAST_UPDATE     // Catch: v5.C3831a -> L85
            long r4 = java.lang.System.currentTimeMillis()     // Catch: v5.C3831a -> L85
            r9.getClass()     // Catch: v5.C3831a -> L85
            java.lang.String r6 = "preferenceKey"
            kotlin.jvm.internal.AbstractC3159y.i(r2, r6)     // Catch: v5.C3831a -> L85
            android.content.SharedPreferences r9 = r9.f17845a     // Catch: v5.C3831a -> L85
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch: v5.C3831a -> L85
            java.lang.String r2 = "editor"
            kotlin.jvm.internal.AbstractC3159y.h(r9, r2)     // Catch: v5.C3831a -> L85
            java.lang.String r2 = "googleVendorLastUpdate"
            r9.putLong(r2, r4)     // Catch: v5.C3831a -> L85
            r9.apply()     // Catch: v5.C3831a -> L85
            K7.b r9 = r8.f6756c     // Catch: v5.C3831a -> L85
            java.lang.String r2 = "https://cmp.inmobi.com/"
            java.lang.String r4 = r8.f6758e     // Catch: v5.C3831a -> L85
            java.lang.String r2 = kotlin.jvm.internal.AbstractC3159y.q(r2, r4)     // Catch: v5.C3831a -> L85
            r0.f6759a = r8     // Catch: v5.C3831a -> L85
            r0.f6762d = r3     // Catch: v5.C3831a -> L85
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: v5.C3831a -> L85
            if (r9 != r1) goto L81
            return r1
        L81:
            r0 = r8
        L82:
            java.lang.String r9 = (java.lang.String) r9     // Catch: v5.C3831a -> L2d
            goto Lb0
        L85:
            goto L9e
        L87:
            v5.b r1 = v5.C3832b.f38876a     // Catch: v5.C3831a -> L85
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L85
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            v5.C3832b.b(r1, r2, r3, r4, r5, r6, r7)     // Catch: v5.C3831a -> L85
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f6755b     // Catch: v5.C3831a -> L85
            N7.a r0 = N7.a.GOOGLE_VENDOR_LIST     // Catch: v5.C3831a -> L85
            java.lang.String r9 = r9.j(r0)     // Catch: v5.C3831a -> L85
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
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f6755b
            N7.a r1 = N7.a.GOOGLE_VENDOR_LIST
            java.lang.String r9 = r9.j(r1)
        Lb0:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f6755b
            N7.a r2 = N7.a.GOOGLE_VENDOR_LIST
            r1.e(r2, r9)
            M7.j r0 = r0.f6757d
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.p.a(P5.d):java.lang.Object");
    }

    public final boolean b() {
        SharedStorage sharedStorage = this.f6755b;
        N7.a preferenceKey = N7.a.GOOGLE_VENDOR_LAST_UPDATE;
        sharedStorage.getClass();
        AbstractC3159y.i(preferenceKey, "preferenceKey");
        if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - sharedStorage.f17845a.getLong("googleVendorLastUpdate", 0L)) < 0) {
            return false;
        }
        return true;
    }
}
