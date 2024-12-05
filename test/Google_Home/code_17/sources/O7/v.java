package O7;

import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;

/* loaded from: classes5.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    public final N7.a f8594a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedStorage f8595b;

    /* renamed from: c, reason: collision with root package name */
    public final N7.b f8596c;

    /* renamed from: d, reason: collision with root package name */
    public final P7.j f8597d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8598e;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f8599a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8600b;

        /* renamed from: d, reason: collision with root package name */
        public int f8602d;

        public a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8600b = obj;
            this.f8602d |= Integer.MIN_VALUE;
            return v.this.b(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f8603a;

        /* renamed from: c, reason: collision with root package name */
        public int f8605c;

        public b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8603a = obj;
            this.f8605c |= Integer.MIN_VALUE;
            return v.this.a(this);
        }
    }

    public v(N7.a networkUtil, SharedStorage sharedStorage, N7.b requestApi, P7.j resolver, String packageName, String pCode) {
        AbstractC3255y.i(networkUtil, "networkUtil");
        AbstractC3255y.i(sharedStorage, "sharedStorage");
        AbstractC3255y.i(requestApi, "requestApi");
        AbstractC3255y.i(resolver, "resolver");
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3255y.i(pCode, "pCode");
        this.f8594a = networkUtil;
        this.f8595b = sharedStorage;
        this.f8596c = requestApi;
        this.f8597d = resolver;
        Y y8 = Y.f34167a;
        String format = String.format(AbstractC3255y.q("https://cmp.inmobi.com/", "choice/%s/%s/app-config.json"), Arrays.copyOf(new Object[]{pCode, packageName}, 2));
        AbstractC3255y.h(format, "format(format, *args)");
        this.f8598e = format;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(3:16|17|(2:19|(1:21))(2:22|23))|11|12))|25|6|7|(0)(0)|11|12) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // O7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(S5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof O7.v.b
            if (r0 == 0) goto L13
            r0 = r8
            O7.v$b r0 = (O7.v.b) r0
            int r1 = r0.f8605c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8605c = r1
            goto L18
        L13:
            O7.v$b r0 = new O7.v$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8603a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f8605c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r8)     // Catch: y5.C4208a -> L6b
            goto L5b
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            O5.t.b(r8)
            N7.a r8 = r7.f8594a     // Catch: y5.C4208a -> L6b
            boolean r8 = r8.a()     // Catch: y5.C4208a -> L6b
            if (r8 == 0) goto L5e
            P7.j r8 = r7.f8597d     // Catch: y5.C4208a -> L6b
            com.inmobi.cmp.data.storage.SharedStorage r2 = r7.f8595b     // Catch: y5.C4208a -> L6b
            Q7.a r4 = Q7.a.PORTAL_CONFIG     // Catch: y5.C4208a -> L6b
            java.lang.String r2 = r2.j(r4)     // Catch: y5.C4208a -> L6b
            java.lang.Object r8 = r8.a(r2)     // Catch: y5.C4208a -> L6b
            H6.f r8 = (H6.f) r8     // Catch: y5.C4208a -> L6b
            N7.b r2 = r7.f8596c     // Catch: y5.C4208a -> L6b
            H6.a r8 = r8.f3925b     // Catch: y5.C4208a -> L6b
            java.lang.String r8 = r8.f3900r     // Catch: y5.C4208a -> L6b
            r0.f8605c = r3     // Catch: y5.C4208a -> L6b
            java.lang.Object r8 = r2.a(r8, r0)     // Catch: y5.C4208a -> L6b
            if (r8 != r1) goto L5b
            return r1
        L5b:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: y5.C4208a -> L6b
            goto L6c
        L5e:
            y5.b r0 = y5.C4209b.f41007a     // Catch: y5.C4208a -> L6b
            com.inmobi.cmp.model.ChoiceError r1 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: y5.C4208a -> L6b
            r5 = 0
            r6 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            y5.C4209b.b(r0, r1, r2, r3, r4, r5, r6)     // Catch: y5.C4208a -> L6b
        L6b:
            r8 = 0
        L6c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.v.a(S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // O7.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof O7.v.a
            if (r0 == 0) goto L13
            r0 = r9
            O7.v$a r0 = (O7.v.a) r0
            int r1 = r0.f8602d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8602d = r1
            goto L18
        L13:
            O7.v$a r0 = new O7.v$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8600b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f8602d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f8599a
            O7.v r0 = (O7.v) r0
            O5.t.b(r9)     // Catch: y5.C4208a -> L6b
            goto L50
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            O5.t.b(r9)
            N7.a r9 = r8.f8594a     // Catch: y5.C4208a -> L6a
            boolean r9 = r9.a()     // Catch: y5.C4208a -> L6a
            if (r9 == 0) goto L53
            N7.b r9 = r8.f8596c     // Catch: y5.C4208a -> L6a
            java.lang.String r2 = r8.f8598e     // Catch: y5.C4208a -> L6a
            r0.f8599a = r8     // Catch: y5.C4208a -> L6a
            r0.f8602d = r3     // Catch: y5.C4208a -> L6a
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: y5.C4208a -> L6a
            if (r9 != r1) goto L4f
            return r1
        L4f:
            r0 = r8
        L50:
            java.lang.String r9 = (java.lang.String) r9     // Catch: y5.C4208a -> L6b
            goto L73
        L53:
            y5.b r1 = y5.C4209b.f41007a     // Catch: y5.C4208a -> L6a
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: y5.C4208a -> L6a
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            y5.C4209b.b(r1, r2, r3, r4, r5, r6, r7)     // Catch: y5.C4208a -> L6a
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f8595b     // Catch: y5.C4208a -> L6a
            Q7.a r0 = Q7.a.PORTAL_CONFIG     // Catch: y5.C4208a -> L6a
            java.lang.String r9 = r9.j(r0)     // Catch: y5.C4208a -> L6a
            r0 = r8
            goto L73
        L6a:
            r0 = r8
        L6b:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f8595b
            Q7.a r1 = Q7.a.PORTAL_CONFIG
            java.lang.String r9 = r9.j(r1)
        L73:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f8595b
            Q7.a r2 = Q7.a.PORTAL_CONFIG
            r1.e(r2, r9)
            P7.j r0 = r0.f8597d
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.v.b(S5.d):java.lang.Object");
    }
}
