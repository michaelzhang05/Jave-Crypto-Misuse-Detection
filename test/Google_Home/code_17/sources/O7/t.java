package O7;

import com.inmobi.cmp.data.storage.SharedStorage;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;

/* loaded from: classes5.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f8581a;

    /* renamed from: b, reason: collision with root package name */
    public final N7.a f8582b;

    /* renamed from: c, reason: collision with root package name */
    public final N7.b f8583c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedStorage f8584d;

    /* renamed from: e, reason: collision with root package name */
    public final B5.h f8585e;

    /* renamed from: f, reason: collision with root package name */
    public final F6.g f8586f;

    /* renamed from: g, reason: collision with root package name */
    public final P7.j f8587g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8588h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8589i;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f8590a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8591b;

        /* renamed from: d, reason: collision with root package name */
        public int f8593d;

        public a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8591b = obj;
            this.f8593d |= Integer.MIN_VALUE;
            return t.this.a(this);
        }
    }

    public t(Locale appLocale, N7.a networkUtil, N7.b requestApi, SharedStorage sharedStorage, B5.h jurisdiction, F6.g state, P7.j resolver) {
        AbstractC3255y.i(appLocale, "appLocale");
        AbstractC3255y.i(networkUtil, "networkUtil");
        AbstractC3255y.i(requestApi, "requestApi");
        AbstractC3255y.i(sharedStorage, "sharedStorage");
        AbstractC3255y.i(jurisdiction, "jurisdiction");
        AbstractC3255y.i(state, "state");
        AbstractC3255y.i(resolver, "resolver");
        this.f8581a = appLocale;
        this.f8582b = networkUtil;
        this.f8583c = requestApi;
        this.f8584d = sharedStorage;
        this.f8585e = jurisdiction;
        this.f8586f = state;
        this.f8587g = resolver;
        this.f8588h = "us-mspa/v1/purposes-state-%s-";
        this.f8589i = "us-mspa/v1/purposes-national-";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // O7.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof O7.t.a
            if (r0 == 0) goto L13
            r0 = r9
            O7.t$a r0 = (O7.t.a) r0
            int r1 = r0.f8593d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8593d = r1
            goto L18
        L13:
            O7.t$a r0 = new O7.t$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8591b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f8593d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f8590a
            O7.t r0 = (O7.t) r0
            O5.t.b(r9)     // Catch: y5.C4208a -> L6d
            goto L52
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            O5.t.b(r9)
            N7.a r9 = r8.f8582b     // Catch: y5.C4208a -> L6c
            boolean r9 = r9.a()     // Catch: y5.C4208a -> L6c
            if (r9 == 0) goto L55
            N7.b r9 = r8.f8583c     // Catch: y5.C4208a -> L6c
            java.lang.String r2 = r8.b()     // Catch: y5.C4208a -> L6c
            r0.f8590a = r8     // Catch: y5.C4208a -> L6c
            r0.f8593d = r3     // Catch: y5.C4208a -> L6c
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
            com.inmobi.cmp.data.storage.SharedStorage r9 = r8.f8584d     // Catch: y5.C4208a -> L6c
            Q7.a r0 = Q7.a.MSPA_PURPOSES     // Catch: y5.C4208a -> L6c
            java.lang.String r9 = r9.j(r0)     // Catch: y5.C4208a -> L6c
            r0 = r8
            goto L75
        L6c:
            r0 = r8
        L6d:
            com.inmobi.cmp.data.storage.SharedStorage r9 = r0.f8584d
            Q7.a r1 = Q7.a.MSPA_PURPOSES
            java.lang.String r9 = r9.j(r1)
        L75:
            com.inmobi.cmp.data.storage.SharedStorage r1 = r0.f8584d
            Q7.a r2 = Q7.a.MSPA_PURPOSES
            r1.e(r2, r9)
            P7.j r0 = r0.f8587g
            java.lang.Object r9 = r0.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.t.a(S5.d):java.lang.Object");
    }

    public final String b() {
        String str;
        String str2;
        B5.h hVar = this.f8585e;
        B5.h value = B5.h.STATE_AND_NATIONAL;
        if (hVar == value) {
            F6.g state = this.f8586f;
            AbstractC3255y.i(state, "state");
            AbstractC3255y.i(state, "state");
            int ordinal = state.ordinal();
            String str3 = DownloadCommon.DOWNLOAD_REPORT_CANCEL;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str2 = "co";
                } else if (ordinal == 2) {
                    str2 = "ct";
                } else if (ordinal == 3) {
                    str2 = "ut";
                } else if (ordinal == 4) {
                    str2 = "va";
                } else {
                    str2 = "";
                }
            } else {
                str2 = DownloadCommon.DOWNLOAD_REPORT_CANCEL;
            }
            if (str2.length() > 0) {
                F6.d dVar = F6.d.f2830a;
                AbstractC3255y.i(value, "value");
                F6.d.f2837h = value;
                Y y8 = Y.f34167a;
                String str4 = this.f8588h;
                F6.g state2 = this.f8586f;
                AbstractC3255y.i(state2, "state");
                int ordinal2 = state2.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        str3 = "co";
                    } else if (ordinal2 == 2) {
                        str3 = "ct";
                    } else if (ordinal2 == 3) {
                        str3 = "ut";
                    } else if (ordinal2 == 4) {
                        str3 = "va";
                    } else {
                        str3 = "";
                    }
                }
                str = String.format(str4, Arrays.copyOf(new Object[]{str3}, 1));
                AbstractC3255y.h(str, "format(format, *args)");
                StringBuilder sb = new StringBuilder();
                sb.append("https://cmp.inmobi.com/");
                sb.append(str);
                String lowerCase = "EN".toLowerCase(this.f8581a);
                AbstractC3255y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                sb.append(lowerCase);
                sb.append(".json");
                return sb.toString();
            }
        }
        F6.d dVar2 = F6.d.f2830a;
        B5.h value2 = B5.h.NATIONAL;
        AbstractC3255y.i(value2, "value");
        F6.d.f2837h = value2;
        str = this.f8589i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://cmp.inmobi.com/");
        sb2.append(str);
        String lowerCase2 = "EN".toLowerCase(this.f8581a);
        AbstractC3255y.h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        sb2.append(lowerCase2);
        sb2.append(".json");
        return sb2.toString();
    }
}
