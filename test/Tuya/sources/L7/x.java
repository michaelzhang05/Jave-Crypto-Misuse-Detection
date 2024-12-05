package L7;

import M5.AbstractC1246t;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.AbstractC3995b;

/* loaded from: classes5.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f6815a;

    /* renamed from: b, reason: collision with root package name */
    public final K7.a f6816b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedStorage f6817c;

    /* renamed from: d, reason: collision with root package name */
    public final K7.b f6818d;

    /* renamed from: e, reason: collision with root package name */
    public M7.j f6819e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6820f;

    /* renamed from: g, reason: collision with root package name */
    public J7.r f6821g;

    /* renamed from: h, reason: collision with root package name */
    public J7.e f6822h;

    /* renamed from: i, reason: collision with root package name */
    public J7.i f6823i;

    /* renamed from: j, reason: collision with root package name */
    public J7.n f6824j;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6825a;

        static {
            int[] iArr = new int[ChoiceError.values().length];
            iArr[ChoiceError.NETWORK_FILE_NOT_FOUND_ERROR.ordinal()] = 1;
            f6825a = iArr;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6826a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6827b;

        /* renamed from: d, reason: collision with root package name */
        public int f6829d;

        public b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6827b = obj;
            this.f6829d |= Integer.MIN_VALUE;
            return x.this.c(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public Object f6830a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6831b;

        /* renamed from: d, reason: collision with root package name */
        public int f6833d;

        public c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6831b = obj;
            this.f6833d |= Integer.MIN_VALUE;
            return x.this.a(this);
        }
    }

    public x(Locale appLocale, K7.a networkUtil, SharedStorage shareStorage, K7.b requestApi, M7.j resolver) {
        AbstractC3159y.i(appLocale, "appLocale");
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(shareStorage, "shareStorage");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(resolver, "resolver");
        this.f6815a = appLocale;
        this.f6816b = networkUtil;
        this.f6817c = shareStorage;
        this.f6818d = requestApi;
        this.f6819e = resolver;
        this.f6820f = "tcfv2/translations/";
        this.f6822h = new J7.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 262143);
        this.f6823i = new J7.i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767);
        this.f6824j = new J7.n(null, null, null, null, null, null, null, null, null, null, 1023);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // L7.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(P5.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof L7.x.c
            if (r0 == 0) goto L13
            r0 = r13
            L7.x$c r0 = (L7.x.c) r0
            int r1 = r0.f6833d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6833d = r1
            goto L18
        L13:
            L7.x$c r0 = new L7.x$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f6831b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f6833d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f6830a
            L7.x r0 = (L7.x) r0
            L5.t.b(r13)
            goto L94
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L38:
            java.lang.Object r2 = r0.f6830a
            L7.x r2 = (L7.x) r2
            L5.t.b(r13)     // Catch: v5.C3831a -> L40
            goto L5f
        L40:
            r13 = move-exception
            goto L7c
        L42:
            L5.t.b(r13)
            K7.a r13 = r12.f6816b     // Catch: v5.C3831a -> L62
            boolean r13 = r13.a()     // Catch: v5.C3831a -> L62
            if (r13 == 0) goto L65
            K7.b r13 = r12.f6818d     // Catch: v5.C3831a -> L62
            java.lang.String r2 = r12.j()     // Catch: v5.C3831a -> L62
            r0.f6830a = r12     // Catch: v5.C3831a -> L62
            r0.f6833d = r4     // Catch: v5.C3831a -> L62
            java.lang.Object r13 = r13.b(r2, r0)     // Catch: v5.C3831a -> L62
            if (r13 != r1) goto L5e
            return r1
        L5e:
            r2 = r12
        L5f:
            java.lang.String r13 = (java.lang.String) r13     // Catch: v5.C3831a -> L40
            goto La0
        L62:
            r13 = move-exception
            r2 = r12
            goto L7c
        L65:
            v5.b r5 = v5.C3832b.f38876a     // Catch: v5.C3831a -> L62
            com.inmobi.cmp.model.ChoiceError r6 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> L62
            r10 = 0
            r11 = 30
            r7 = 0
            r8 = 0
            r9 = 0
            v5.C3832b.b(r5, r6, r7, r8, r9, r10, r11)     // Catch: v5.C3831a -> L62
            com.inmobi.cmp.data.storage.SharedStorage r13 = r12.f6817c     // Catch: v5.C3831a -> L62
            N7.a r2 = N7.a.TRANSLATIONS_TEXT     // Catch: v5.C3831a -> L62
            java.lang.String r13 = r13.j(r2)     // Catch: v5.C3831a -> L62
            r2 = r12
            goto La0
        L7c:
            com.inmobi.cmp.model.ChoiceError r13 = r13.f38875a
            int[] r5 = L7.x.a.f6825a
            int r13 = r13.ordinal()
            r13 = r5[r13]
            if (r13 != r4) goto L98
            r0.f6830a = r2
            r0.f6833d = r3
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
            com.inmobi.cmp.data.storage.SharedStorage r13 = r2.f6817c
            N7.a r0 = N7.a.TRANSLATIONS_TEXT
            java.lang.String r13 = r13.j(r0)
        La0:
            com.inmobi.cmp.data.storage.SharedStorage r0 = r2.f6817c
            N7.a r1 = N7.a.TRANSLATIONS_TEXT
            r0.e(r1, r13)
            M7.j r0 = r2.f6819e
            java.lang.Object r13 = r0.a(r13)
            J7.r r13 = (J7.r) r13
            r2.f6821g = r13
            if (r13 != 0) goto Lb9
            java.lang.String r13 = "translationsText"
            kotlin.jvm.internal.AbstractC3159y.y(r13)
            r13 = 0
        Lb9:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.x.a(P5.d):java.lang.Object");
    }

    @Override // L7.w
    public void b(E6.f portalConfig) {
        AbstractC3159y.i(portalConfig, "portalConfig");
        this.f6822h = portalConfig.f2377d;
        this.f6823i = portalConfig.f2378e;
        this.f6824j = portalConfig.f2379f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(P5.d r78) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.x.c(P5.d):java.lang.Object");
    }

    @Override // L7.w
    public J7.m d() {
        String str;
        k();
        if (this.f6822h.f5583X.length() == 0) {
            J7.r rVar = this.f6821g;
            if (rVar == null) {
                AbstractC3159y.y("translationsText");
                rVar = null;
            }
            str = rVar.f5710a.f5583X;
        } else {
            str = this.f6822h.f5583X;
        }
        return new J7.m(str, i());
    }

    @Override // L7.w
    public J7.h e() {
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
        J7.r rVar = null;
        if (this.f6822h.f5601r.length() == 0) {
            J7.r rVar2 = this.f6821g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5710a.f5601r;
        } else {
            str = this.f6822h.f5601r;
        }
        String str11 = str;
        if (this.f6822h.f5566G.length() == 0) {
            J7.r rVar3 = this.f6821g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f5710a.f5566G;
        } else {
            str2 = this.f6822h.f5566G;
        }
        String str12 = str2;
        if (this.f6822h.f5570K.length() == 0) {
            J7.r rVar4 = this.f6821g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f5710a.f5570K;
        } else {
            str3 = this.f6822h.f5570K;
        }
        String str13 = str3;
        if (this.f6822h.f5571L.length() == 0) {
            J7.r rVar5 = this.f6821g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f5710a.f5571L;
        } else {
            str4 = this.f6822h.f5571L;
        }
        String str14 = str4;
        if (this.f6822h.f5572M.length() == 0) {
            J7.r rVar6 = this.f6821g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
                rVar6 = null;
            }
            str5 = rVar6.f5710a.f5572M;
        } else {
            str5 = this.f6822h.f5572M;
        }
        String str15 = str5;
        if (this.f6823i.f5635b.length() == 0) {
            J7.r rVar7 = this.f6821g;
            if (rVar7 == null) {
                AbstractC3159y.y("translationsText");
                rVar7 = null;
            }
            str6 = rVar7.f5712c.f5635b;
        } else {
            str6 = this.f6823i.f5635b;
        }
        String str16 = str6;
        if (this.f6822h.f5576Q.length() == 0) {
            J7.r rVar8 = this.f6821g;
            if (rVar8 == null) {
                AbstractC3159y.y("translationsText");
                rVar8 = null;
            }
            str7 = rVar8.f5710a.f5576Q;
        } else {
            str7 = this.f6822h.f5576Q;
        }
        String str17 = str7;
        if (this.f6822h.f5600q.length() == 0) {
            J7.r rVar9 = this.f6821g;
            if (rVar9 == null) {
                AbstractC3159y.y("translationsText");
                rVar9 = null;
            }
            str8 = rVar9.f5710a.f5600q;
        } else {
            str8 = this.f6822h.f5600q;
        }
        String str18 = str8;
        if (this.f6823i.f5637d.length() == 0) {
            J7.r rVar10 = this.f6821g;
            if (rVar10 == null) {
                AbstractC3159y.y("translationsText");
                rVar10 = null;
            }
            str9 = rVar10.f5712c.f5637d;
        } else {
            str9 = this.f6823i.f5637d;
        }
        String str19 = str9;
        if (this.f6823i.f5638e.length() == 0) {
            J7.r rVar11 = this.f6821g;
            if (rVar11 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar11;
            }
            str10 = rVar.f5712c.f5638e;
        } else {
            str10 = this.f6823i.f5638e;
        }
        return new J7.h(str11, str12, str13, str14, str15, str16, str17, str18, str19, str10, i());
    }

    @Override // L7.w
    public J7.j f() {
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
        J7.r rVar = null;
        if (this.f6822h.f5584a.length() == 0) {
            J7.r rVar2 = this.f6821g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5710a.f5584a;
        } else {
            str = this.f6822h.f5584a;
        }
        String str15 = str;
        if (this.f6823i.f5648o.isEmpty()) {
            J7.r rVar3 = this.f6821g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            w02 = AbstractC1246t.w0(rVar3.f5712c.f5648o, " ", null, null, 0, null, null, 62, null);
        } else {
            w02 = AbstractC1246t.w0(this.f6823i.f5648o, " ", null, null, 0, null, null, 62, null);
        }
        String str16 = w02;
        if (this.f6822h.f5601r.length() == 0) {
            J7.r rVar4 = this.f6821g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            str2 = rVar4.f5710a.f5601r;
        } else {
            str2 = this.f6822h.f5601r;
        }
        String str17 = str2;
        if (this.f6822h.f5576Q.length() == 0) {
            J7.r rVar5 = this.f6821g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str3 = rVar5.f5710a.f5576Q;
        } else {
            str3 = this.f6822h.f5576Q;
        }
        String str18 = str3;
        if (this.f6823i.f5639f.length() == 0) {
            J7.r rVar6 = this.f6821g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
                rVar6 = null;
            }
            str4 = rVar6.f5712c.f5639f;
        } else {
            str4 = this.f6823i.f5639f;
        }
        String str19 = str4;
        if (this.f6822h.f5598o.length() == 0) {
            J7.r rVar7 = this.f6821g;
            if (rVar7 == null) {
                AbstractC3159y.y("translationsText");
                rVar7 = null;
            }
            str5 = rVar7.f5710a.f5598o;
        } else {
            str5 = this.f6822h.f5598o;
        }
        String str20 = str5;
        if (this.f6822h.f5586c.length() == 0) {
            J7.r rVar8 = this.f6821g;
            if (rVar8 == null) {
                AbstractC3159y.y("translationsText");
                rVar8 = null;
            }
            str6 = rVar8.f5710a.f5586c;
        } else {
            str6 = this.f6822h.f5586c;
        }
        String str21 = str6;
        if (this.f6822h.f5599p.length() == 0) {
            J7.r rVar9 = this.f6821g;
            if (rVar9 == null) {
                AbstractC3159y.y("translationsText");
                rVar9 = null;
            }
            str7 = rVar9.f5710a.f5599p;
        } else {
            str7 = this.f6822h.f5599p;
        }
        String str22 = str7;
        if (this.f6822h.f5560A.length() == 0) {
            J7.r rVar10 = this.f6821g;
            if (rVar10 == null) {
                AbstractC3159y.y("translationsText");
                rVar10 = null;
            }
            str8 = rVar10.f5710a.f5560A;
        } else {
            str8 = this.f6822h.f5560A;
        }
        String str23 = str8;
        if (this.f6822h.f5600q.length() == 0) {
            J7.r rVar11 = this.f6821g;
            if (rVar11 == null) {
                AbstractC3159y.y("translationsText");
                rVar11 = null;
            }
            str9 = rVar11.f5710a.f5600q;
        } else {
            str9 = this.f6822h.f5600q;
        }
        String str24 = str9;
        if (this.f6823i.f5642i.length() == 0) {
            J7.r rVar12 = this.f6821g;
            if (rVar12 == null) {
                AbstractC3159y.y("translationsText");
                rVar12 = null;
            }
            str10 = rVar12.f5712c.f5642i;
        } else {
            str10 = this.f6823i.f5642i;
        }
        String str25 = str10;
        if (this.f6823i.f5643j.length() == 0) {
            J7.r rVar13 = this.f6821g;
            if (rVar13 == null) {
                AbstractC3159y.y("translationsText");
                rVar13 = null;
            }
            str11 = rVar13.f5712c.f5643j;
        } else {
            str11 = this.f6823i.f5643j;
        }
        String str26 = str11;
        if (this.f6823i.f5644k.length() == 0) {
            J7.r rVar14 = this.f6821g;
            if (rVar14 == null) {
                AbstractC3159y.y("translationsText");
                rVar14 = null;
            }
            str12 = rVar14.f5712c.f5644k;
        } else {
            str12 = this.f6823i.f5644k;
        }
        String str27 = str12;
        if (this.f6823i.f5645l.length() == 0) {
            J7.r rVar15 = this.f6821g;
            if (rVar15 == null) {
                AbstractC3159y.y("translationsText");
                rVar15 = null;
            }
            str13 = rVar15.f5712c.f5645l;
        } else {
            str13 = this.f6823i.f5645l;
        }
        String str28 = str13;
        String i8 = i();
        if (this.f6822h.f5561B.length() == 0) {
            J7.r rVar16 = this.f6821g;
            if (rVar16 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar16;
            }
            str14 = rVar.f5710a.f5561B;
        } else {
            str14 = this.f6822h.f5561B;
        }
        return new J7.j(str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, i8, str14);
    }

    @Override // L7.w
    public J7.k g() {
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
        J7.r rVar = null;
        if (this.f6822h.f5576Q.length() == 0) {
            J7.r rVar2 = this.f6821g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5710a.f5576Q;
        } else {
            str = this.f6822h.f5576Q;
        }
        String str13 = str;
        if (this.f6822h.f5601r.length() == 0) {
            J7.r rVar3 = this.f6821g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            upperCase = rVar3.f5710a.f5601r.toUpperCase(this.f6815a);
            AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        } else {
            upperCase = this.f6822h.f5601r.toUpperCase(this.f6815a);
            AbstractC3159y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        }
        String str14 = upperCase;
        if (this.f6822h.f5602s.length() == 0) {
            J7.r rVar4 = this.f6821g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            upperCase2 = rVar4.f5710a.f5602s.toUpperCase(this.f6815a);
            AbstractC3159y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        } else {
            upperCase2 = this.f6822h.f5602s.toUpperCase(this.f6815a);
            AbstractC3159y.h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        }
        String str15 = upperCase2;
        if (this.f6822h.f5604u.length() == 0) {
            J7.r rVar5 = this.f6821g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str2 = rVar5.f5710a.f5604u;
        } else {
            str2 = this.f6822h.f5604u;
        }
        String str16 = str2;
        if (this.f6822h.f5603t.length() == 0) {
            J7.r rVar6 = this.f6821g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
                rVar6 = null;
            }
            str3 = rVar6.f5710a.f5603t;
        } else {
            str3 = this.f6822h.f5603t;
        }
        String str17 = str3;
        if (this.f6822h.f5605v.length() == 0) {
            J7.r rVar7 = this.f6821g;
            if (rVar7 == null) {
                AbstractC3159y.y("translationsText");
                rVar7 = null;
            }
            str4 = rVar7.f5710a.f5605v;
        } else {
            str4 = this.f6822h.f5605v;
        }
        String str18 = str4;
        if (this.f6822h.f5564E.length() == 0) {
            J7.r rVar8 = this.f6821g;
            if (rVar8 == null) {
                AbstractC3159y.y("translationsText");
                rVar8 = null;
            }
            str5 = rVar8.f5710a.f5564E;
        } else {
            str5 = this.f6822h.f5564E;
        }
        String str19 = str5;
        if (this.f6822h.f5577R.length() == 0) {
            J7.r rVar9 = this.f6821g;
            if (rVar9 == null) {
                AbstractC3159y.y("translationsText");
                rVar9 = null;
            }
            str6 = rVar9.f5710a.f5577R;
        } else {
            str6 = this.f6822h.f5577R;
        }
        String str20 = str6;
        if (this.f6822h.f5578S.length() == 0) {
            J7.r rVar10 = this.f6821g;
            if (rVar10 == null) {
                AbstractC3159y.y("translationsText");
                rVar10 = null;
            }
            str7 = rVar10.f5710a.f5578S;
        } else {
            str7 = this.f6822h.f5578S;
        }
        String str21 = str7;
        if (this.f6822h.f5579T.length() == 0) {
            J7.r rVar11 = this.f6821g;
            if (rVar11 == null) {
                AbstractC3159y.y("translationsText");
                rVar11 = null;
            }
            str8 = rVar11.f5710a.f5579T;
        } else {
            str8 = this.f6822h.f5579T;
        }
        String str22 = str8;
        if (this.f6822h.f5580U.length() == 0) {
            J7.r rVar12 = this.f6821g;
            if (rVar12 == null) {
                AbstractC3159y.y("translationsText");
                rVar12 = null;
            }
            str9 = rVar12.f5710a.f5580U;
        } else {
            str9 = this.f6822h.f5580U;
        }
        String str23 = str9;
        if (this.f6822h.f5581V.length() == 0) {
            J7.r rVar13 = this.f6821g;
            if (rVar13 == null) {
                AbstractC3159y.y("translationsText");
                rVar13 = null;
            }
            str10 = rVar13.f5710a.f5581V;
        } else {
            str10 = this.f6822h.f5581V;
        }
        String str24 = str10;
        if (this.f6822h.f5582W.length() == 0) {
            J7.r rVar14 = this.f6821g;
            if (rVar14 == null) {
                AbstractC3159y.y("translationsText");
                rVar14 = null;
            }
            str11 = rVar14.f5710a.f5582W;
        } else {
            str11 = this.f6822h.f5582W;
        }
        String str25 = str11;
        if (this.f6822h.f5583X.length() == 0) {
            J7.r rVar15 = this.f6821g;
            if (rVar15 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar15;
            }
            str12 = rVar.f5710a.f5583X;
        } else {
            str12 = this.f6822h.f5583X;
        }
        return new J7.k(str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str12, str23, str24, str25, i());
    }

    @Override // L7.w
    public J7.q h() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        k();
        J7.r rVar = null;
        if (this.f6822h.f5576Q.length() == 0) {
            J7.r rVar2 = this.f6821g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5710a.f5576Q;
        } else {
            str = this.f6822h.f5576Q;
        }
        String str6 = str;
        if (this.f6822h.f5560A.length() == 0) {
            J7.r rVar3 = this.f6821g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f5710a.f5560A;
        } else {
            str2 = this.f6822h.f5560A;
        }
        String str7 = str2;
        if (this.f6822h.f5586c.length() == 0) {
            J7.r rVar4 = this.f6821g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f5710a.f5586c;
        } else {
            str3 = this.f6822h.f5586c;
        }
        String str8 = str3;
        if (this.f6823i.f5635b.length() == 0) {
            J7.r rVar5 = this.f6821g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f5712c.f5635b;
        } else {
            str4 = this.f6823i.f5635b;
        }
        String str9 = str4;
        if (this.f6823i.f5645l.length() == 0) {
            J7.r rVar6 = this.f6821g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar6;
            }
            str5 = rVar.f5712c.f5645l;
        } else {
            str5 = this.f6823i.f5645l;
        }
        return new J7.q(str6, str7, str8, str9, str5, i());
    }

    public final String i() {
        if (this.f6822h.f5606w.length() == 0) {
            J7.r rVar = this.f6821g;
            if (rVar == null) {
                AbstractC3159y.y("translationsText");
                rVar = null;
            }
            return rVar.f5710a.f5606w;
        }
        return this.f6822h.f5606w;
    }

    public final String j() {
        String language = this.f6817c.j(N7.a.PORTAL_CHOICE_LANG);
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
                language = this.f6815a.getLanguage();
                break;
            }
        }
        StringBuilder a9 = AbstractC3689a.a("https://cmp.inmobi.com/");
        a9.append(this.f6820f);
        AbstractC3159y.h(language, "language");
        String lowerCase = language.toLowerCase(this.f6815a);
        AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        a9.append(lowerCase);
        a9.append(".json");
        return a9.toString();
    }

    public final void k() {
        J7.r rVar;
        if (this.f6821g == null) {
            String j8 = this.f6817c.j(N7.a.TRANSLATIONS_TEXT);
            if (j8.length() > 0) {
                rVar = (J7.r) this.f6819e.a(j8);
            } else {
                rVar = new J7.r(null, null, null, 7);
            }
            this.f6821g = rVar;
        }
    }

    @Override // L7.w
    public J7.a b() {
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        J7.r rVar = null;
        if (this.f6824j.f5691c.length() == 0) {
            J7.r rVar2 = this.f6821g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5711b.f5691c;
        } else {
            str = this.f6824j.f5691c;
        }
        String str5 = str;
        if (this.f6824j.f5692d.isEmpty()) {
            J7.r rVar3 = this.f6821g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            list = rVar3.f5711b.f5692d;
        } else {
            list = this.f6824j.f5692d;
        }
        List list2 = list;
        if (this.f6824j.f5695g.length() == 0) {
            J7.r rVar4 = this.f6821g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            str2 = rVar4.f5711b.f5695g;
        } else {
            str2 = this.f6824j.f5695g;
        }
        String str6 = str2;
        if (this.f6824j.f5696h.length() == 0) {
            J7.r rVar5 = this.f6821g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str3 = rVar5.f5711b.f5696h;
        } else {
            str3 = this.f6824j.f5696h;
        }
        String str7 = str3;
        if (this.f6824j.f5694f.length() == 0) {
            J7.r rVar6 = this.f6821g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar6;
            }
            str4 = rVar.f5711b.f5694f;
        } else {
            str4 = this.f6824j.f5694f;
        }
        return new J7.a(str5, list2, str6, str7, str4, i());
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
    @Override // L7.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public J7.g c() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L7.x.c():J7.g");
    }

    @Override // L7.w
    public J7.l a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        k();
        J7.r rVar = null;
        if (this.f6823i.f5639f.length() == 0) {
            J7.r rVar2 = this.f6821g;
            if (rVar2 == null) {
                AbstractC3159y.y("translationsText");
                rVar2 = null;
            }
            str = rVar2.f5712c.f5639f;
        } else {
            str = this.f6823i.f5639f;
        }
        String str7 = str;
        if (this.f6822h.f5563D.length() == 0) {
            J7.r rVar3 = this.f6821g;
            if (rVar3 == null) {
                AbstractC3159y.y("translationsText");
                rVar3 = null;
            }
            str2 = rVar3.f5710a.f5563D;
        } else {
            str2 = this.f6822h.f5563D;
        }
        String str8 = str2;
        if (this.f6823i.f5635b.length() == 0) {
            J7.r rVar4 = this.f6821g;
            if (rVar4 == null) {
                AbstractC3159y.y("translationsText");
                rVar4 = null;
            }
            str3 = rVar4.f5712c.f5635b;
        } else {
            str3 = this.f6823i.f5635b;
        }
        String str9 = str3;
        if (this.f6822h.f5600q.length() == 0) {
            J7.r rVar5 = this.f6821g;
            if (rVar5 == null) {
                AbstractC3159y.y("translationsText");
                rVar5 = null;
            }
            str4 = rVar5.f5710a.f5600q;
        } else {
            str4 = this.f6822h.f5600q;
        }
        String str10 = str4;
        if (this.f6823i.f5637d.length() == 0) {
            J7.r rVar6 = this.f6821g;
            if (rVar6 == null) {
                AbstractC3159y.y("translationsText");
                rVar6 = null;
            }
            str5 = rVar6.f5712c.f5637d;
        } else {
            str5 = this.f6823i.f5637d;
        }
        String str11 = str5;
        if (this.f6823i.f5638e.length() == 0) {
            J7.r rVar7 = this.f6821g;
            if (rVar7 == null) {
                AbstractC3159y.y("translationsText");
            } else {
                rVar = rVar7;
            }
            str6 = rVar.f5712c.f5638e;
        } else {
            str6 = this.f6823i.f5638e;
        }
        return new J7.l(str7, str8, str9, str10, str11, str6, i());
    }
}
