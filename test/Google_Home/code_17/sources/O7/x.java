package O7;

import P5.AbstractC1378t;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f8606a;

    /* renamed from: b, reason: collision with root package name */
    public final N7.a f8607b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedStorage f8608c;

    /* renamed from: d, reason: collision with root package name */
    public final N7.b f8609d;

    /* renamed from: e, reason: collision with root package name */
    public P7.j f8610e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8611f;

    /* renamed from: g, reason: collision with root package name */
    public M7.r f8612g;

    /* renamed from: h, reason: collision with root package name */
    public M7.e f8613h;

    /* renamed from: i, reason: collision with root package name */
    public M7.i f8614i;

    /* renamed from: j, reason: collision with root package name */
    public M7.n f8615j;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8616a;

        static {
            int[] iArr = new int[ChoiceError.values().length];
            iArr[ChoiceError.NETWORK_FILE_NOT_FOUND_ERROR.ordinal()] = 1;
            f8616a = iArr;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f8617a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8618b;

        /* renamed from: d, reason: collision with root package name */
        public int f8620d;

        public b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8618b = obj;
            this.f8620d |= Integer.MIN_VALUE;
            return x.this.c(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f8621a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f8622b;

        /* renamed from: d, reason: collision with root package name */
        public int f8624d;

        public c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8622b = obj;
            this.f8624d |= Integer.MIN_VALUE;
            return x.this.a(this);
        }
    }

    public x(Locale appLocale, N7.a networkUtil, SharedStorage shareStorage, N7.b requestApi, P7.j resolver) {
        AbstractC3255y.i(appLocale, "appLocale");
        AbstractC3255y.i(networkUtil, "networkUtil");
        AbstractC3255y.i(shareStorage, "shareStorage");
        AbstractC3255y.i(requestApi, "requestApi");
        AbstractC3255y.i(resolver, "resolver");
        this.f8606a = appLocale;
        this.f8607b = networkUtil;
        this.f8608c = shareStorage;
        this.f8609d = requestApi;
        this.f8610e = resolver;
        this.f8611f = "tcfv2/translations/";
        this.f8613h = new M7.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143);
        this.f8614i = new M7.i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767);
        this.f8615j = new M7.n(null, null, null, null, null, null, null, null, null, null, 1023);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // O7.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(S5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof O7.x.c
            if (r0 == 0) goto L13
            r0 = r13
            O7.x$c r0 = (O7.x.c) r0
            int r1 = r0.f8624d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8624d = r1
            goto L18
        L13:
            O7.x$c r0 = new O7.x$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f8622b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f8624d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f8621a
            O7.x r0 = (O7.x) r0
            O5.t.b(r13)
            goto L94
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            java.lang.Object r2 = r0.f8621a
            O7.x r2 = (O7.x) r2
            O5.t.b(r13)     // Catch: y5.C4208a -> L40
            goto L5f
        L40:
            r13 = move-exception
            goto L7c
        L42:
            O5.t.b(r13)
            N7.a r13 = r12.f8607b     // Catch: y5.C4208a -> L62
            boolean r13 = r13.a()     // Catch: y5.C4208a -> L62
            if (r13 == 0) goto L65
            N7.b r13 = r12.f8609d     // Catch: y5.C4208a -> L62
            java.lang.String r2 = r12.j()     // Catch: y5.C4208a -> L62
            r0.f8621a = r12     // Catch: y5.C4208a -> L62
            r0.f8624d = r4     // Catch: y5.C4208a -> L62
            java.lang.Object r13 = r13.b(r2, r0)     // Catch: y5.C4208a -> L62
            if (r13 != r1) goto L5e
            return r1
        L5e:
            r2 = r12
        L5f:
            java.lang.String r13 = (java.lang.String) r13     // Catch: y5.C4208a -> L40
            goto La0
        L62:
            r13 = move-exception
            r2 = r12
            goto L7c
        L65:
            y5.b r5 = y5.C4209b.f41007a     // Catch: y5.C4208a -> L62
            com.inmobi.cmp.model.ChoiceError r6 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: y5.C4208a -> L62
            r10 = 0
            r11 = 30
            r7 = 0
            r8 = 0
            r9 = 0
            y5.C4209b.b(r5, r6, r7, r8, r9, r10, r11)     // Catch: y5.C4208a -> L62
            com.inmobi.cmp.data.storage.SharedStorage r13 = r12.f8608c     // Catch: y5.C4208a -> L62
            Q7.a r2 = Q7.a.TRANSLATIONS_TEXT     // Catch: y5.C4208a -> L62
            java.lang.String r13 = r13.j(r2)     // Catch: y5.C4208a -> L62
            r2 = r12
            goto La0
        L7c:
            com.inmobi.cmp.model.ChoiceError r13 = r13.f41006a
            int[] r5 = O7.x.a.f8616a
            int r13 = r13.ordinal()
            r13 = r5[r13]
            if (r13 != r4) goto L98
            r0.f8621a = r2
            r0.f8624d = r3
            java.lang.Object r13 = r2.c(r0)
            if (r13 != r1) goto L93
            return r1
        L93:
            r0 = r2
        L94:
            java.lang.String r13 = (java.lang.String) r13
            r2 = r0
            goto La0
        L98:
            com.inmobi.cmp.data.storage.SharedStorage r13 = r2.f8608c
            Q7.a r0 = Q7.a.TRANSLATIONS_TEXT
            java.lang.String r13 = r13.j(r0)
        La0:
            com.inmobi.cmp.data.storage.SharedStorage r0 = r2.f8608c
            Q7.a r1 = Q7.a.TRANSLATIONS_TEXT
            r0.e(r1, r13)
            P7.j r0 = r2.f8610e
            java.lang.Object r13 = r0.a(r13)
            M7.r r13 = (M7.r) r13
            r2.f8612g = r13
            if (r13 != 0) goto Lb9
            java.lang.String r13 = "translationsText"
            kotlin.jvm.internal.AbstractC3255y.y(r13)
            r13 = 0
        Lb9:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.x.a(S5.d):java.lang.Object");
    }

    @Override // O7.w
    public void b(H6.f portalConfig) {
        AbstractC3255y.i(portalConfig, "portalConfig");
        this.f8613h = portalConfig.f3927d;
        this.f8614i = portalConfig.f3928e;
        this.f8615j = portalConfig.f3929f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(S5.d r78) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.x.c(S5.d):java.lang.Object");
    }

    @Override // O7.w
    public M7.m d() {
        String str;
        k();
        if (this.f8613h.f7289X.length() == 0) {
            M7.r rVar = this.f8612g;
            if (rVar == null) {
                AbstractC3255y.y("translationsText");
                rVar = null;
            }
            str = rVar.f7416a.f7289X;
        } else {
            str = this.f8613h.f7289X;
        }
        return new M7.m(str, i());
    }

    @Override // O7.w
    public M7.h e() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        k();
        M7.r rVar = null;
        if (this.f8613h.f7307r.length() == 0) {
            M7.r rVar2 = this.f8612g;
            if (rVar2 == null) {
                AbstractC3255y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f7416a.f7307r;
        } else {
            str = this.f8613h.f7307r;
        }
        String str11 = str;
        if (this.f8613h.f7272G.length() == 0) {
            M7.r rVar3 = this.f8612g;
            if (rVar3 == null) {
                AbstractC3255y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f7416a.f7272G;
        } else {
            str2 = this.f8613h.f7272G;
        }
        String str12 = str2;
        if (this.f8613h.f7276K.length() == 0) {
            M7.r rVar4 = this.f8612g;
            if (rVar4 == null) {
                AbstractC3255y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f7416a.f7276K;
        } else {
            str3 = this.f8613h.f7276K;
        }
        String str13 = str3;
        if (this.f8613h.f7277L.length() == 0) {
            M7.r rVar5 = this.f8612g;
            if (rVar5 == null) {
                AbstractC3255y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f7416a.f7277L;
        } else {
            str4 = this.f8613h.f7277L;
        }
        String str14 = str4;
        if (this.f8613h.f7278M.length() == 0) {
            M7.r rVar6 = this.f8612g;
            if (rVar6 == null) {
                AbstractC3255y.y("translationsText");
                rVar6 = null;
            }
            str5 = rVar6.f7416a.f7278M;
        } else {
            str5 = this.f8613h.f7278M;
        }
        String str15 = str5;
        if (this.f8614i.f7341b.length() == 0) {
            M7.r rVar7 = this.f8612g;
            if (rVar7 == null) {
                AbstractC3255y.y("translationsText");
                rVar7 = null;
            }
            str6 = rVar7.f7418c.f7341b;
        } else {
            str6 = this.f8614i.f7341b;
        }
        String str16 = str6;
        if (this.f8613h.f7282Q.length() == 0) {
            M7.r rVar8 = this.f8612g;
            if (rVar8 == null) {
                AbstractC3255y.y("translationsText");
                rVar8 = null;
            }
            str7 = rVar8.f7416a.f7282Q;
        } else {
            str7 = this.f8613h.f7282Q;
        }
        String str17 = str7;
        if (this.f8613h.f7306q.length() == 0) {
            M7.r rVar9 = this.f8612g;
            if (rVar9 == null) {
                AbstractC3255y.y("translationsText");
                rVar9 = null;
            }
            str8 = rVar9.f7416a.f7306q;
        } else {
            str8 = this.f8613h.f7306q;
        }
        String str18 = str8;
        if (this.f8614i.f7343d.length() == 0) {
            M7.r rVar10 = this.f8612g;
            if (rVar10 == null) {
                AbstractC3255y.y("translationsText");
                rVar10 = null;
            }
            str9 = rVar10.f7418c.f7343d;
        } else {
            str9 = this.f8614i.f7343d;
        }
        String str19 = str9;
        if (this.f8614i.f7344e.length() == 0) {
            M7.r rVar11 = this.f8612g;
            if (rVar11 == null) {
                AbstractC3255y.y("translationsText");
            } else {
                rVar = rVar11;
            }
            str10 = rVar.f7418c.f7344e;
        } else {
            str10 = this.f8614i.f7344e;
        }
        return new M7.h(str11, str12, str13, str14, str15, str16, str17, str18, str19, str10, i());
    }

    @Override // O7.w
    public M7.j f() {
        String str;
        String w02;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        k();
        M7.r rVar = null;
        if (this.f8613h.f7290a.length() == 0) {
            M7.r rVar2 = this.f8612g;
            if (rVar2 == null) {
                AbstractC3255y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f7416a.f7290a;
        } else {
            str = this.f8613h.f7290a;
        }
        String str15 = str;
        if (this.f8614i.f7354o.isEmpty()) {
            M7.r rVar3 = this.f8612g;
            if (rVar3 == null) {
                AbstractC3255y.y("translationsText");
                rVar3 = null;
            }
            w02 = AbstractC1378t.w0(rVar3.f7418c.f7354o, " ", null, null, 0, null, null, 62, null);
        } else {
            w02 = AbstractC1378t.w0(this.f8614i.f7354o, " ", null, null, 0, null, null, 62, null);
        }
        String str16 = w02;
        if (this.f8613h.f7307r.length() == 0) {
            M7.r rVar4 = this.f8612g;
            if (rVar4 == null) {
                AbstractC3255y.y("translationsText");
                rVar4 = null;
            }
            str2 = rVar4.f7416a.f7307r;
        } else {
            str2 = this.f8613h.f7307r;
        }
        String str17 = str2;
        if (this.f8613h.f7282Q.length() == 0) {
            M7.r rVar5 = this.f8612g;
            if (rVar5 == null) {
                AbstractC3255y.y("translationsText");
                rVar5 = null;
            }
            str3 = rVar5.f7416a.f7282Q;
        } else {
            str3 = this.f8613h.f7282Q;
        }
        String str18 = str3;
        if (this.f8614i.f7345f.length() == 0) {
            M7.r rVar6 = this.f8612g;
            if (rVar6 == null) {
                AbstractC3255y.y("translationsText");
                rVar6 = null;
            }
            str4 = rVar6.f7418c.f7345f;
        } else {
            str4 = this.f8614i.f7345f;
        }
        String str19 = str4;
        if (this.f8613h.f7304o.length() == 0) {
            M7.r rVar7 = this.f8612g;
            if (rVar7 == null) {
                AbstractC3255y.y("translationsText");
                rVar7 = null;
            }
            str5 = rVar7.f7416a.f7304o;
        } else {
            str5 = this.f8613h.f7304o;
        }
        String str20 = str5;
        if (this.f8613h.f7292c.length() == 0) {
            M7.r rVar8 = this.f8612g;
            if (rVar8 == null) {
                AbstractC3255y.y("translationsText");
                rVar8 = null;
            }
            str6 = rVar8.f7416a.f7292c;
        } else {
            str6 = this.f8613h.f7292c;
        }
        String str21 = str6;
        if (this.f8613h.f7305p.length() == 0) {
            M7.r rVar9 = this.f8612g;
            if (rVar9 == null) {
                AbstractC3255y.y("translationsText");
                rVar9 = null;
            }
            str7 = rVar9.f7416a.f7305p;
        } else {
            str7 = this.f8613h.f7305p;
        }
        String str22 = str7;
        if (this.f8613h.f7266A.length() == 0) {
            M7.r rVar10 = this.f8612g;
            if (rVar10 == null) {
                AbstractC3255y.y("translationsText");
                rVar10 = null;
            }
            str8 = rVar10.f7416a.f7266A;
        } else {
            str8 = this.f8613h.f7266A;
        }
        String str23 = str8;
        if (this.f8613h.f7306q.length() == 0) {
            M7.r rVar11 = this.f8612g;
            if (rVar11 == null) {
                AbstractC3255y.y("translationsText");
                rVar11 = null;
            }
            str9 = rVar11.f7416a.f7306q;
        } else {
            str9 = this.f8613h.f7306q;
        }
        String str24 = str9;
        if (this.f8614i.f7348i.length() == 0) {
            M7.r rVar12 = this.f8612g;
            if (rVar12 == null) {
                AbstractC3255y.y("translationsText");
                rVar12 = null;
            }
            str10 = rVar12.f7418c.f7348i;
        } else {
            str10 = this.f8614i.f7348i;
        }
        String str25 = str10;
        if (this.f8614i.f7349j.length() == 0) {
            M7.r rVar13 = this.f8612g;
            if (rVar13 == null) {
                AbstractC3255y.y("translationsText");
                rVar13 = null;
            }
            str11 = rVar13.f7418c.f7349j;
        } else {
            str11 = this.f8614i.f7349j;
        }
        String str26 = str11;
        if (this.f8614i.f7350k.length() == 0) {
            M7.r rVar14 = this.f8612g;
            if (rVar14 == null) {
                AbstractC3255y.y("translationsText");
                rVar14 = null;
            }
            str12 = rVar14.f7418c.f7350k;
        } else {
            str12 = this.f8614i.f7350k;
        }
        String str27 = str12;
        if (this.f8614i.f7351l.length() == 0) {
            M7.r rVar15 = this.f8612g;
            if (rVar15 == null) {
                AbstractC3255y.y("translationsText");
                rVar15 = null;
            }
            str13 = rVar15.f7418c.f7351l;
        } else {
            str13 = this.f8614i.f7351l;
        }
        String str28 = str13;
        String i8 = i();
        if (this.f8613h.f7267B.length() == 0) {
            M7.r rVar16 = this.f8612g;
            if (rVar16 == null) {
                AbstractC3255y.y("translationsText");
            } else {
                rVar = rVar16;
            }
            str14 = rVar.f7416a.f7267B;
        } else {
            str14 = this.f8613h.f7267B;
        }
        return new M7.j(str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, i8, str14);
    }

    @Override // O7.w
    public M7.k g() {
        String str;
        String upperCase;
        String upperCase2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        k();
        M7.r rVar = null;
        if (this.f8613h.f7282Q.length() == 0) {
            M7.r rVar2 = this.f8612g;
            if (rVar2 == null) {
                AbstractC3255y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f7416a.f7282Q;
        } else {
            str = this.f8613h.f7282Q;
        }
        String str13 = str;
        if (this.f8613h.f7307r.length() == 0) {
            M7.r rVar3 = this.f8612g;
            if (rVar3 == null) {
                AbstractC3255y.y("translationsText");
                rVar3 = null;
            }
            upperCase = rVar3.f7416a.f7307r.toUpperCase(this.f8606a);
            AbstractC3255y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        } else {
            upperCase = this.f8613h.f7307r.toUpperCase(this.f8606a);
            AbstractC3255y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        }
        String str14 = upperCase;
        if (this.f8613h.f7308s.length() == 0) {
            M7.r rVar4 = this.f8612g;
            if (rVar4 == null) {
                AbstractC3255y.y("translationsText");
                rVar4 = null;
            }
            upperCase2 = rVar4.f7416a.f7308s.toUpperCase(this.f8606a);
            AbstractC3255y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        } else {
            upperCase2 = this.f8613h.f7308s.toUpperCase(this.f8606a);
            AbstractC3255y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        }
        String str15 = upperCase2;
        if (this.f8613h.f7310u.length() == 0) {
            M7.r rVar5 = this.f8612g;
            if (rVar5 == null) {
                AbstractC3255y.y("translationsText");
                rVar5 = null;
            }
            str2 = rVar5.f7416a.f7310u;
        } else {
            str2 = this.f8613h.f7310u;
        }
        String str16 = str2;
        if (this.f8613h.f7309t.length() == 0) {
            M7.r rVar6 = this.f8612g;
            if (rVar6 == null) {
                AbstractC3255y.y("translationsText");
                rVar6 = null;
            }
            str3 = rVar6.f7416a.f7309t;
        } else {
            str3 = this.f8613h.f7309t;
        }
        String str17 = str3;
        if (this.f8613h.f7311v.length() == 0) {
            M7.r rVar7 = this.f8612g;
            if (rVar7 == null) {
                AbstractC3255y.y("translationsText");
                rVar7 = null;
            }
            str4 = rVar7.f7416a.f7311v;
        } else {
            str4 = this.f8613h.f7311v;
        }
        String str18 = str4;
        if (this.f8613h.f7270E.length() == 0) {
            M7.r rVar8 = this.f8612g;
            if (rVar8 == null) {
                AbstractC3255y.y("translationsText");
                rVar8 = null;
            }
            str5 = rVar8.f7416a.f7270E;
        } else {
            str5 = this.f8613h.f7270E;
        }
        String str19 = str5;
        if (this.f8613h.f7283R.length() == 0) {
            M7.r rVar9 = this.f8612g;
            if (rVar9 == null) {
                AbstractC3255y.y("translationsText");
                rVar9 = null;
            }
            str6 = rVar9.f7416a.f7283R;
        } else {
            str6 = this.f8613h.f7283R;
        }
        String str20 = str6;
        if (this.f8613h.f7284S.length() == 0) {
            M7.r rVar10 = this.f8612g;
            if (rVar10 == null) {
                AbstractC3255y.y("translationsText");
                rVar10 = null;
            }
            str7 = rVar10.f7416a.f7284S;
        } else {
            str7 = this.f8613h.f7284S;
        }
        String str21 = str7;
        if (this.f8613h.f7285T.length() == 0) {
            M7.r rVar11 = this.f8612g;
            if (rVar11 == null) {
                AbstractC3255y.y("translationsText");
                rVar11 = null;
            }
            str8 = rVar11.f7416a.f7285T;
        } else {
            str8 = this.f8613h.f7285T;
        }
        String str22 = str8;
        if (this.f8613h.f7286U.length() == 0) {
            M7.r rVar12 = this.f8612g;
            if (rVar12 == null) {
                AbstractC3255y.y("translationsText");
                rVar12 = null;
            }
            str9 = rVar12.f7416a.f7286U;
        } else {
            str9 = this.f8613h.f7286U;
        }
        String str23 = str9;
        if (this.f8613h.f7287V.length() == 0) {
            M7.r rVar13 = this.f8612g;
            if (rVar13 == null) {
                AbstractC3255y.y("translationsText");
                rVar13 = null;
            }
            str10 = rVar13.f7416a.f7287V;
        } else {
            str10 = this.f8613h.f7287V;
        }
        String str24 = str10;
        if (this.f8613h.f7288W.length() == 0) {
            M7.r rVar14 = this.f8612g;
            if (rVar14 == null) {
                AbstractC3255y.y("translationsText");
                rVar14 = null;
            }
            str11 = rVar14.f7416a.f7288W;
        } else {
            str11 = this.f8613h.f7288W;
        }
        String str25 = str11;
        if (this.f8613h.f7289X.length() == 0) {
            M7.r rVar15 = this.f8612g;
            if (rVar15 == null) {
                AbstractC3255y.y("translationsText");
            } else {
                rVar = rVar15;
            }
            str12 = rVar.f7416a.f7289X;
        } else {
            str12 = this.f8613h.f7289X;
        }
        return new M7.k(str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str12, str23, str24, str25, i());
    }

    @Override // O7.w
    public M7.q h() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        k();
        M7.r rVar = null;
        if (this.f8613h.f7282Q.length() == 0) {
            M7.r rVar2 = this.f8612g;
            if (rVar2 == null) {
                AbstractC3255y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f7416a.f7282Q;
        } else {
            str = this.f8613h.f7282Q;
        }
        String str6 = str;
        if (this.f8613h.f7266A.length() == 0) {
            M7.r rVar3 = this.f8612g;
            if (rVar3 == null) {
                AbstractC3255y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f7416a.f7266A;
        } else {
            str2 = this.f8613h.f7266A;
        }
        String str7 = str2;
        if (this.f8613h.f7292c.length() == 0) {
            M7.r rVar4 = this.f8612g;
            if (rVar4 == null) {
                AbstractC3255y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f7416a.f7292c;
        } else {
            str3 = this.f8613h.f7292c;
        }
        String str8 = str3;
        if (this.f8614i.f7341b.length() == 0) {
            M7.r rVar5 = this.f8612g;
            if (rVar5 == null) {
                AbstractC3255y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f7418c.f7341b;
        } else {
            str4 = this.f8614i.f7341b;
        }
        String str9 = str4;
        if (this.f8614i.f7351l.length() == 0) {
            M7.r rVar6 = this.f8612g;
            if (rVar6 == null) {
                AbstractC3255y.y("translationsText");
            } else {
                rVar = rVar6;
            }
            str5 = rVar.f7418c.f7351l;
        } else {
            str5 = this.f8614i.f7351l;
        }
        return new M7.q(str6, str7, str8, str9, str5, i());
    }

    public final String i() {
        if (this.f8613h.f7312w.length() == 0) {
            M7.r rVar = this.f8612g;
            if (rVar == null) {
                AbstractC3255y.y("translationsText");
                rVar = null;
            }
            return rVar.f7416a.f7312w;
        }
        return this.f8613h.f7312w;
    }

    public final String j() {
        String language = this.f8608c.j(Q7.a.PORTAL_CHOICE_LANG);
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
                language = this.f8606a.getLanguage();
                break;
            }
        }
        StringBuilder a9 = AbstractC4062a.a("https://cmp.inmobi.com/");
        a9.append(this.f8611f);
        AbstractC3255y.h(language, "language");
        String lowerCase = language.toLowerCase(this.f8606a);
        AbstractC3255y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        a9.append(lowerCase);
        a9.append(".json");
        return a9.toString();
    }

    public final void k() {
        M7.r rVar;
        if (this.f8612g == null) {
            String j8 = this.f8608c.j(Q7.a.TRANSLATIONS_TEXT);
            if (j8.length() > 0) {
                rVar = (M7.r) this.f8610e.a(j8);
            } else {
                rVar = new M7.r(null, null, null, 7);
            }
            this.f8612g = rVar;
        }
    }

    @Override // O7.w
    public M7.a b() {
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        M7.r rVar = null;
        if (this.f8615j.f7397c.length() == 0) {
            M7.r rVar2 = this.f8612g;
            if (rVar2 == null) {
                AbstractC3255y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f7417b.f7397c;
        } else {
            str = this.f8615j.f7397c;
        }
        String str5 = str;
        if (this.f8615j.f7398d.isEmpty()) {
            M7.r rVar3 = this.f8612g;
            if (rVar3 == null) {
                AbstractC3255y.y("translationsText");
                rVar3 = null;
            }
            list = rVar3.f7417b.f7398d;
        } else {
            list = this.f8615j.f7398d;
        }
        List list2 = list;
        if (this.f8615j.f7401g.length() == 0) {
            M7.r rVar4 = this.f8612g;
            if (rVar4 == null) {
                AbstractC3255y.y("translationsText");
                rVar4 = null;
            }
            str2 = rVar4.f7417b.f7401g;
        } else {
            str2 = this.f8615j.f7401g;
        }
        String str6 = str2;
        if (this.f8615j.f7402h.length() == 0) {
            M7.r rVar5 = this.f8612g;
            if (rVar5 == null) {
                AbstractC3255y.y("translationsText");
                rVar5 = null;
            }
            str3 = rVar5.f7417b.f7402h;
        } else {
            str3 = this.f8615j.f7402h;
        }
        String str7 = str3;
        if (this.f8615j.f7400f.length() == 0) {
            M7.r rVar6 = this.f8612g;
            if (rVar6 == null) {
                AbstractC3255y.y("translationsText");
            } else {
                rVar = rVar6;
            }
            str4 = rVar.f7417b.f7400f;
        } else {
            str4 = this.f8615j.f7400f;
        }
        return new M7.a(str5, list2, str6, str7, str4, i());
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
    
        if (r0 == null) goto L66;
     */
    @Override // O7.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public M7.g c() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.x.c():M7.g");
    }

    @Override // O7.w
    public M7.l a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        k();
        M7.r rVar = null;
        if (this.f8614i.f7345f.length() == 0) {
            M7.r rVar2 = this.f8612g;
            if (rVar2 == null) {
                AbstractC3255y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f7418c.f7345f;
        } else {
            str = this.f8614i.f7345f;
        }
        String str7 = str;
        if (this.f8613h.f7269D.length() == 0) {
            M7.r rVar3 = this.f8612g;
            if (rVar3 == null) {
                AbstractC3255y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f7416a.f7269D;
        } else {
            str2 = this.f8613h.f7269D;
        }
        String str8 = str2;
        if (this.f8614i.f7341b.length() == 0) {
            M7.r rVar4 = this.f8612g;
            if (rVar4 == null) {
                AbstractC3255y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f7418c.f7341b;
        } else {
            str3 = this.f8614i.f7341b;
        }
        String str9 = str3;
        if (this.f8613h.f7306q.length() == 0) {
            M7.r rVar5 = this.f8612g;
            if (rVar5 == null) {
                AbstractC3255y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f7416a.f7306q;
        } else {
            str4 = this.f8613h.f7306q;
        }
        String str10 = str4;
        if (this.f8614i.f7343d.length() == 0) {
            M7.r rVar6 = this.f8612g;
            if (rVar6 == null) {
                AbstractC3255y.y("translationsText");
                rVar6 = null;
            }
            str5 = rVar6.f7418c.f7343d;
        } else {
            str5 = this.f8614i.f7343d;
        }
        String str11 = str5;
        if (this.f8614i.f7344e.length() == 0) {
            M7.r rVar7 = this.f8612g;
            if (rVar7 == null) {
                AbstractC3255y.y("translationsText");
            } else {
                rVar = rVar7;
            }
            str6 = rVar.f7418c.f7344e;
        } else {
            str6 = this.f8614i.f7344e;
        }
        return new M7.l(str7, str8, str9, str10, str11, str6, i());
    }
}
