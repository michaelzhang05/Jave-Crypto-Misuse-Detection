package L7;

import android.content.Context;
import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6763a;

    /* renamed from: b, reason: collision with root package name */
    public final K7.a f6764b;

    /* renamed from: c, reason: collision with root package name */
    public final Locale f6765c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedStorage f6766d;

    /* renamed from: e, reason: collision with root package name */
    public final K7.b f6767e;

    /* renamed from: f, reason: collision with root package name */
    public final M7.j f6768f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6769g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6770h;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6771a;

        /* renamed from: b, reason: collision with root package name */
        public Object f6772b;

        /* renamed from: c, reason: collision with root package name */
        public int f6773c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f6774d;

        /* renamed from: f, reason: collision with root package name */
        public int f6776f;

        public a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6774d = obj;
            this.f6776f |= Integer.MIN_VALUE;
            return r.this.a(0, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6777a;

        /* renamed from: c, reason: collision with root package name */
        public int f6779c;

        public b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6777a = obj;
            this.f6779c |= Integer.MIN_VALUE;
            return r.this.b(0, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6780a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6781b;

        /* renamed from: d, reason: collision with root package name */
        public int f6783d;

        public c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6781b = obj;
            this.f6783d |= Integer.MIN_VALUE;
            return r.this.c(0, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6784a;

        /* renamed from: b, reason: collision with root package name */
        public Object f6785b;

        /* renamed from: c, reason: collision with root package name */
        public int f6786c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f6787d;

        /* renamed from: f, reason: collision with root package name */
        public int f6789f;

        public d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6787d = obj;
            this.f6789f |= Integer.MIN_VALUE;
            return r.this.d(0, this);
        }
    }

    public r(Context context, K7.a networkUtil, Locale appLocale, SharedStorage sharedStorage, K7.b requestApi, M7.j resolver) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(appLocale, "appLocale");
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(resolver, "resolver");
        this.f6763a = context;
        this.f6764b = networkUtil;
        this.f6765c = appLocale;
        this.f6766d = sharedStorage;
        this.f6767e = requestApi;
        this.f6768f = resolver;
        this.f6769g = "GVL-v%s/vendor-list.json";
        this.f6770h = "GVL-v%s/purposes-%s.json";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // L7.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r8, P5.d r9) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.r.a(int, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r9, P5.d r10) {
        /*
            r8 = this;
            r0 = 2
            r1 = 1
            boolean r2 = r10 instanceof L7.r.b
            if (r2 == 0) goto L15
            r2 = r10
            L7.r$b r2 = (L7.r.b) r2
            int r3 = r2.f6779c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.f6779c = r3
            goto L1a
        L15:
            L7.r$b r2 = new L7.r$b
            r2.<init>(r10)
        L1a:
            java.lang.Object r10 = r2.f6777a
            java.lang.Object r3 = Q5.b.e()
            int r4 = r2.f6779c
            if (r4 == 0) goto L32
            if (r4 != r1) goto L2a
            L5.t.b(r10)     // Catch: v5.C3831a -> L6d
            goto L6a
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            L5.t.b(r10)
            K7.b r10 = r8.f6767e     // Catch: v5.C3831a -> L6d
            kotlin.jvm.internal.Y r4 = kotlin.jvm.internal.Y.f33766a     // Catch: v5.C3831a -> L6d
            java.lang.String r4 = "https://cmp.inmobi.com/"
            java.lang.String r5 = r8.f6770h     // Catch: v5.C3831a -> L6d
            java.lang.String r4 = kotlin.jvm.internal.AbstractC3159y.q(r4, r5)     // Catch: v5.C3831a -> L6d
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.b.c(r9)     // Catch: v5.C3831a -> L6d
            com.inmobi.cmp.data.storage.SharedStorage r5 = r8.f6766d     // Catch: v5.C3831a -> L6d
            N7.a r6 = N7.a.PORTAL_CHOICE_LANG     // Catch: v5.C3831a -> L6d
            java.lang.String r5 = r5.j(r6)     // Catch: v5.C3831a -> L6d
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch: v5.C3831a -> L6d
            r7 = 0
            r6[r7] = r9     // Catch: v5.C3831a -> L6d
            r6[r1] = r5     // Catch: v5.C3831a -> L6d
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r6, r0)     // Catch: v5.C3831a -> L6d
            java.lang.String r9 = java.lang.String.format(r4, r9)     // Catch: v5.C3831a -> L6d
            java.lang.String r0 = "format(format, *args)"
            kotlin.jvm.internal.AbstractC3159y.h(r9, r0)     // Catch: v5.C3831a -> L6d
            r2.f6779c = r1     // Catch: v5.C3831a -> L6d
            java.lang.Object r10 = r10.b(r9, r2)     // Catch: v5.C3831a -> L6d
            if (r10 != r3) goto L6a
            return r3
        L6a:
            java.lang.String r10 = (java.lang.String) r10     // Catch: v5.C3831a -> L6d
            goto L6f
        L6d:
            java.lang.String r10 = ""
        L6f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.r.b(int, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r8, P5.d r9) {
        /*
            r7 = this;
            r0 = 1
            boolean r1 = r9 instanceof L7.r.c
            if (r1 == 0) goto L14
            r1 = r9
            L7.r$c r1 = (L7.r.c) r1
            int r2 = r1.f6783d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.f6783d = r2
            goto L19
        L14:
            L7.r$c r1 = new L7.r$c
            r1.<init>(r9)
        L19:
            java.lang.Object r9 = r1.f6781b
            java.lang.Object r2 = Q5.b.e()
            int r3 = r1.f6783d
            if (r3 == 0) goto L35
            if (r3 != r0) goto L2d
            java.lang.Object r8 = r1.f6780a
            L7.r r8 = (L7.r) r8
            L5.t.b(r9)     // Catch: v5.C3831a -> L88
            goto L6e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            L5.t.b(r9)
            K7.a r9 = r7.f6764b     // Catch: v5.C3831a -> L87
            boolean r9 = r9.a()     // Catch: v5.C3831a -> L87
            if (r9 == 0) goto L71
            K7.b r9 = r7.f6767e     // Catch: v5.C3831a -> L87
            java.lang.String r3 = "https://cmp.inmobi.com/"
            kotlin.jvm.internal.Y r4 = kotlin.jvm.internal.Y.f33766a     // Catch: v5.C3831a -> L87
            java.lang.String r4 = r7.f6769g     // Catch: v5.C3831a -> L87
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.c(r8)     // Catch: v5.C3831a -> L87
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: v5.C3831a -> L87
            r6 = 0
            r5[r6] = r8     // Catch: v5.C3831a -> L87
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r5, r0)     // Catch: v5.C3831a -> L87
            java.lang.String r8 = java.lang.String.format(r4, r8)     // Catch: v5.C3831a -> L87
            java.lang.String r4 = "format(format, *args)"
            kotlin.jvm.internal.AbstractC3159y.h(r8, r4)     // Catch: v5.C3831a -> L87
            java.lang.String r8 = kotlin.jvm.internal.AbstractC3159y.q(r3, r8)     // Catch: v5.C3831a -> L87
            r1.f6780a = r7     // Catch: v5.C3831a -> L87
            r1.f6783d = r0     // Catch: v5.C3831a -> L87
            java.lang.Object r9 = r9.b(r8, r1)     // Catch: v5.C3831a -> L87
            if (r9 != r2) goto L6d
            return r2
        L6d:
            r8 = r7
        L6e:
            java.lang.String r9 = (java.lang.String) r9     // Catch: v5.C3831a -> L88
            goto L90
        L71:
            v5.b r0 = v5.C3832b.f38876a     // Catch: v5.C3831a -> L87
            com.inmobi.cmp.model.ChoiceError r1 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L87
            r5 = 0
            r6 = 30
            r2 = 0
            r3 = 0
            r4 = 0
            v5.C3832b.b(r0, r1, r2, r3, r4, r5, r6)     // Catch: v5.C3831a -> L87
            com.inmobi.cmp.data.storage.SharedStorage r8 = r7.f6766d     // Catch: v5.C3831a -> L87
            N7.a r9 = N7.a.VENDOR_LIST     // Catch: v5.C3831a -> L87
            java.lang.String r9 = r8.j(r9)     // Catch: v5.C3831a -> L87
            goto L90
        L87:
            r8 = r7
        L88:
            com.inmobi.cmp.data.storage.SharedStorage r8 = r8.f6766d
            N7.a r9 = N7.a.VENDOR_LIST
            java.lang.String r9 = r8.j(r9)
        L90:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.r.c(int, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r12, P5.d r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.r.d(int, P5.d):java.lang.Object");
    }
}
