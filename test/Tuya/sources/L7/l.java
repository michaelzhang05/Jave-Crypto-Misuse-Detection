package L7;

import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.AbstractC3995b;

/* loaded from: classes5.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f6736a;

    /* renamed from: b, reason: collision with root package name */
    public final K7.a f6737b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedStorage f6738c;

    /* renamed from: d, reason: collision with root package name */
    public final K7.b f6739d;

    /* renamed from: e, reason: collision with root package name */
    public final M7.j f6740e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6741f;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6742a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6743b;

        /* renamed from: d, reason: collision with root package name */
        public int f6745d;

        public a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6743b = obj;
            this.f6745d |= Integer.MIN_VALUE;
            return l.this.a(this);
        }
    }

    public l(Locale appLocale, K7.a networkUtil, SharedStorage sharedStorage, K7.b requestApi, M7.j resolver) {
        AbstractC3159y.i(appLocale, "appLocale");
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(sharedStorage, "sharedStorage");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(resolver, "resolver");
        this.f6736a = appLocale;
        this.f6737b = networkUtil;
        this.f6738c = sharedStorage;
        this.f6739d = requestApi;
        this.f6740e = resolver;
        this.f6741f = "google-basic-consent/v1/purposes-";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // L7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(P5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof L7.l.a
            if (r0 == 0) goto L13
            r0 = r9
            L7.l$a r0 = (L7.l.a) r0
            int r1 = r0.f6745d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6745d = r1
            goto L18
        L13:
            L7.l$a r0 = new L7.l$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6743b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f6745d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f6742a
            L7.l r0 = (L7.l) r0
            L5.t.b(r9)     // Catch: v5.C3831a -> L6d
            goto L52
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            L5.t.b(r9)
            K7.a r9 = r8.f6737b     // Catch: v5.C3831a -> L6c
            boolean r9 = r9.a()     // Catch: v5.C3831a -> L6c
            if (r9 == 0) goto L55
            K7.b r9 = r8.f6739d     // Catch: v5.C3831a -> L6c
            java.lang.String r2 = r8.b()     // Catch: v5.C3831a -> L6c
            r0.f6742a = r8     // Catch: v5.C3831a -> L6c
            r0.f6745d = r3     // Catch: v5.C3831a -> L6c
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: v5.C3831a -> L6c
            if (r9 != r1) goto L51
            return r1
        L51:
            r0 = r8
        L52:
            java.lang.String r9 = (java.lang.String) r9     // Catch: v5.C3831a -> L6d
            goto L75
        L55:
            v5.b r1 = v5.C3832b.f38876a     // Catch: v5.C3831a -> L6c
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L6c
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            v5.C3832b.b(r1, r2, r3, r4, r5, r6, r7)     // Catch: v5.C3831a -> L6c
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f6738c     // Catch: v5.C3831a -> L6c
            N7.a r0 = N7.a.GOOGLE_BASIC_CONSENT     // Catch: v5.C3831a -> L6c
            java.lang.String r9 = r9.j(r0)     // Catch: v5.C3831a -> L6c
            r0 = r8
            goto L75
        L6c:
            r0 = r8
        L6d:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f6738c
            N7.a r1 = N7.a.GOOGLE_BASIC_CONSENT
            java.lang.String r9 = r9.j(r1)
        L75:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f6738c
            N7.a r2 = N7.a.GOOGLE_BASIC_CONSENT
            r1.e(r2, r9)
            M7.j r0 = r0.f6740e
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.l.a(P5.d):java.lang.Object");
    }

    public final String b() {
        String language = this.f6738c.j(N7.a.PORTAL_CHOICE_LANG);
        AbstractC3159y.i(language, "key");
        int[] a8 = AbstractC3995b.a(26);
        int length = a8.length;
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                int i9 = a8[i8];
                i8++;
                if (g6.n.s(B6.a.b(i9), language, true) && !g6.n.s(language, "autoDetectedLanguage", true)) {
                    break;
                }
            } else {
                language = this.f6736a.getLanguage();
                break;
            }
        }
        StringBuilder a9 = AbstractC3689a.a("https://cmp.inmobi.com/");
        a9.append(this.f6741f);
        AbstractC3159y.h(language, "language");
        String lowerCase = language.toLowerCase(this.f6736a);
        AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        a9.append(lowerCase);
        a9.append(".json");
        return a9.toString();
    }
}
