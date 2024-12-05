package O7;

import com.inmobi.cmp.data.storage.SharedStorage;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f8527a;

    /* renamed from: b, reason: collision with root package name */
    public final N7.a f8528b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedStorage f8529c;

    /* renamed from: d, reason: collision with root package name */
    public final N7.b f8530d;

    /* renamed from: e, reason: collision with root package name */
    public final P7.j f8531e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8532f;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f8533a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8534b;

        /* renamed from: d, reason: collision with root package name */
        public int f8536d;

        public a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8534b = obj;
            this.f8536d |= Integer.MIN_VALUE;
            return l.this.a(this);
        }
    }

    public l(Locale appLocale, N7.a networkUtil, SharedStorage sharedStorage, N7.b requestApi, P7.j resolver) {
        AbstractC3255y.i(appLocale, "appLocale");
        AbstractC3255y.i(networkUtil, "networkUtil");
        AbstractC3255y.i(sharedStorage, "sharedStorage");
        AbstractC3255y.i(requestApi, "requestApi");
        AbstractC3255y.i(resolver, "resolver");
        this.f8527a = appLocale;
        this.f8528b = networkUtil;
        this.f8529c = sharedStorage;
        this.f8530d = requestApi;
        this.f8531e = resolver;
        this.f8532f = "google-basic-consent/v1/purposes-";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // O7.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof O7.l.a
            if (r0 == 0) goto L13
            r0 = r9
            O7.l$a r0 = (O7.l.a) r0
            int r1 = r0.f8536d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8536d = r1
            goto L18
        L13:
            O7.l$a r0 = new O7.l$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8534b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f8536d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f8533a
            O7.l r0 = (O7.l) r0
            O5.t.b(r9)     // Catch: y5.C4208a -> L6d
            goto L52
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            O5.t.b(r9)
            N7.a r9 = r8.f8528b     // Catch: y5.C4208a -> L6c
            boolean r9 = r9.a()     // Catch: y5.C4208a -> L6c
            if (r9 == 0) goto L55
            N7.b r9 = r8.f8530d     // Catch: y5.C4208a -> L6c
            java.lang.String r2 = r8.b()     // Catch: y5.C4208a -> L6c
            r0.f8533a = r8     // Catch: y5.C4208a -> L6c
            r0.f8536d = r3     // Catch: y5.C4208a -> L6c
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: y5.C4208a -> L6c
            if (r9 != r1) goto L51
            return r1
        L51:
            r0 = r8
        L52:
            java.lang.String r9 = (java.lang.String) r9     // Catch: y5.C4208a -> L6d
            goto L75
        L55:
            y5.b r1 = y5.C4209b.f41007a     // Catch: y5.C4208a -> L6c
            com.inmobi.cmp.model.ChoiceError r2 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: y5.C4208a -> L6c
            r6 = 0
            r7 = 30
            r3 = 0
            r4 = 0
            r5 = 0
            y5.C4209b.b(r1, r2, r3, r4, r5, r6, r7)     // Catch: y5.C4208a -> L6c
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f8529c     // Catch: y5.C4208a -> L6c
            Q7.a r0 = Q7.a.GOOGLE_BASIC_CONSENT     // Catch: y5.C4208a -> L6c
            java.lang.String r9 = r9.j(r0)     // Catch: y5.C4208a -> L6c
            r0 = r8
            goto L75
        L6c:
            r0 = r8
        L6d:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f8529c
            Q7.a r1 = Q7.a.GOOGLE_BASIC_CONSENT
            java.lang.String r9 = r9.j(r1)
        L75:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f8529c
            Q7.a r2 = Q7.a.GOOGLE_BASIC_CONSENT
            r1.e(r2, r9)
            P7.j r0 = r0.f8531e
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.l.a(S5.d):java.lang.Object");
    }

    public final String b() {
        String language = this.f8529c.j(Q7.a.PORTAL_CHOICE_LANG);
        AbstractC3255y.i(language, "key");
        int[] a8 = B5.b.a(26);
        int length = a8.length;
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                int i9 = a8[i8];
                i8++;
                if (j6.n.s(E6.a.b(i9), language, true) && !j6.n.s(language, "autoDetectedLanguage", true)) {
                    break;
                }
            } else {
                language = this.f8527a.getLanguage();
                break;
            }
        }
        StringBuilder a9 = AbstractC4062a.a("https://cmp.inmobi.com/");
        a9.append(this.f8532f);
        AbstractC3255y.h(language, "language");
        String lowerCase = language.toLowerCase(this.f8527a);
        AbstractC3255y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        a9.append(lowerCase);
        a9.append(".json");
        return a9.toString();
    }
}
