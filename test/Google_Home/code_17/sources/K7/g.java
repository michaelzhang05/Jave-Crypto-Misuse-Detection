package K7;

import B5.s;
import P5.AbstractC1378t;
import com.inmobi.cmp.ChoiceCmpCallback;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final s f5224a;

    /* renamed from: b, reason: collision with root package name */
    public H6.a f5225b;

    /* renamed from: c, reason: collision with root package name */
    public final N7.a f5226c;

    /* renamed from: d, reason: collision with root package name */
    public N7.b f5227d;

    /* renamed from: e, reason: collision with root package name */
    public final ChoiceCmpCallback f5228e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5229f;

    /* renamed from: g, reason: collision with root package name */
    public final List f5230g;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f5231a;

        /* renamed from: c, reason: collision with root package name */
        public int f5233c;

        public a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5231a = obj;
            this.f5233c |= Integer.MIN_VALUE;
            return g.this.a(null, null, null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f5234a;

        /* renamed from: c, reason: collision with root package name */
        public int f5236c;

        public b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5234a = obj;
            this.f5236c |= Integer.MIN_VALUE;
            return g.this.b(null, null, this);
        }
    }

    static {
        AbstractC3255y.h(g.class.getSimpleName(), "Tracking::class.java.simpleName");
    }

    public g(s tcModel, H6.a aVar, N7.a networkUtil, N7.b requestApi, ChoiceCmpCallback choiceCmpCallback, String domain) {
        AbstractC3255y.i(tcModel, "tcModel");
        AbstractC3255y.i(networkUtil, "networkUtil");
        AbstractC3255y.i(requestApi, "requestApi");
        AbstractC3255y.i(domain, "domain");
        this.f5224a = tcModel;
        this.f5225b = aVar;
        this.f5226c = networkUtil;
        this.f5227d = requestApi;
        this.f5228e = choiceCmpCallback;
        this.f5229f = domain;
        this.f5230g = new ArrayList();
    }

    public static Object c(g gVar, Boolean bool, String str, String str2, String str3, String str4, f fVar, S5.d dVar, int i8) {
        String str5;
        String str6;
        String str7;
        String str8;
        String d8;
        String d9;
        if ((i8 & 2) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i8 & 4) != 0) {
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i8 & 8) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i8 & 16) != 0) {
            str8 = null;
        } else {
            str8 = str4;
        }
        gVar.getClass();
        if (AbstractC3255y.d(bool, kotlin.coroutines.jvm.internal.b.a(true))) {
            d8 = "All";
        } else {
            d8 = gVar.d(null);
        }
        String str9 = d8;
        if (AbstractC3255y.d(bool, kotlin.coroutines.jvm.internal.b.a(true))) {
            d9 = "none";
        } else {
            d9 = gVar.d("legitimate");
        }
        String str10 = d9;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(gVar.f5230g);
        j jVar = new j(arrayList, str9, str10, str5, str6, null, null, str7, str8, 96);
        gVar.f5230g.clear();
        return gVar.a(e.DONE, jVar, fVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(K7.e r12, K7.h r13, K7.f r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof K7.g.a
            if (r0 == 0) goto L13
            r0 = r15
            K7.g$a r0 = (K7.g.a) r0
            int r1 = r0.f5233c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5233c = r1
            goto L18
        L13:
            K7.g$a r0 = new K7.g$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f5231a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f5233c
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            O5.t.b(r15)     // Catch: y5.C4208a -> Lc0
            goto Lb2
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            O5.t.b(r15)
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            long r5 = r15.getTimeInMillis()
            r13.b(r5)
            java.lang.String r15 = "<set-?>"
            kotlin.jvm.internal.AbstractC3255y.i(r12, r15)
            r13.f5238b = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = r14.f5223a
            r12.append(r14)
            r14 = 45
            r12.append(r14)
            java.util.UUID r14 = K7.m.f5261b
            java.lang.String r14 = r14.toString()
            java.lang.String r2 = "sessionID.toString()"
            kotlin.jvm.internal.AbstractC3255y.h(r14, r2)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r13.f5239c = r12
            java.lang.String r12 = r11.f5229f
            kotlin.jvm.internal.AbstractC3255y.i(r12, r15)
            r13.f5240d = r12
            java.lang.String r12 = "https://api.cmp.inmobi.com/"
            android.net.Uri r12 = android.net.Uri.parse(r12)
            android.net.Uri$Builder r12 = r12.buildUpon()
            java.lang.String r5 = r13.a()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "\\"
            java.lang.String r7 = ""
            r8 = 0
            java.lang.String r13 = j6.n.A(r5, r6, r7, r8, r9, r10)
            java.lang.String r14 = "log"
            android.net.Uri$Builder r12 = r12.appendQueryParameter(r14, r13)
            android.net.Uri r12 = r12.build()
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "parse(BuildConfig.INMOBI…      .build().toString()"
            kotlin.jvm.internal.AbstractC3255y.h(r12, r13)
            N7.a r13 = r11.f5226c     // Catch: y5.C4208a -> Lc0
            boolean r13 = r13.a()     // Catch: y5.C4208a -> Lc0
            if (r13 == 0) goto Lb6
            N7.b r13 = r11.f5227d     // Catch: y5.C4208a -> Lc0
            r0.f5233c = r4     // Catch: y5.C4208a -> Lc0
            java.lang.Object r15 = r13.b(r12, r0)     // Catch: y5.C4208a -> Lc0
            if (r15 != r1) goto Lb2
            return r1
        Lb2:
            java.lang.String r15 = (java.lang.String) r15     // Catch: y5.C4208a -> Lc0
            r3 = r15
            goto Lc0
        Lb6:
            com.inmobi.cmp.ChoiceCmpCallback r12 = r11.f5228e     // Catch: y5.C4208a -> Lc0
            if (r12 != 0) goto Lbb
            goto Lc0
        Lbb:
            com.inmobi.cmp.model.ChoiceError r13 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: y5.C4208a -> Lc0
            r12.onCmpError(r13)     // Catch: y5.C4208a -> Lc0
        Lc0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: K7.g.a(K7.e, K7.h, K7.f, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(K7.f r12, K7.c r13, S5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof K7.g.b
            if (r0 == 0) goto L13
            r0 = r14
            K7.g$b r0 = (K7.g.b) r0
            int r1 = r0.f5236c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5236c = r1
            goto L18
        L13:
            K7.g$b r0 = new K7.g$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f5234a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f5236c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r14)
            goto L62
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            O5.t.b(r14)
            H6.a r14 = r11.f5225b
            if (r14 != 0) goto L39
            goto L66
        L39:
            K7.i r2 = new K7.i
            java.lang.String r5 = r14.f3883a
            java.lang.String r6 = r14.f3889g
            B5.s r4 = r11.f5224a
            int r7 = r4.f988m
            int r4 = r4.f989n
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.c(r4)
            java.lang.String r8 = "2."
            java.lang.String r8 = kotlin.jvm.internal.AbstractC3255y.q(r8, r4)
            java.lang.String r9 = r13.f5209a
            java.lang.String r10 = r14.f3887e
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            K7.e r13 = K7.e.INIT
            r0.f5236c = r3
            java.lang.Object r14 = r11.a(r13, r2, r12, r0)
            if (r14 != r1) goto L62
            return r1
        L62:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L68
        L66:
            java.lang.String r14 = "Error sending init log: CMP configuration have not been initialized yet"
        L68:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: K7.g.b(K7.f, K7.c, S5.d):java.lang.Object");
    }

    public final String d(String str) {
        List z8;
        boolean d8 = AbstractC3255y.d(str, "legitimate");
        if (d8) {
            z8 = AbstractC1378t.z(AbstractC1378t.p(this.f5224a.f972D.getMap().values(), this.f5224a.f971C.getMap().values(), this.f5224a.f994s.getMap().values()));
        } else {
            z8 = AbstractC1378t.z(AbstractC1378t.p(this.f5224a.f993r.getMap().values(), this.f5224a.f1001z.getMap().values(), this.f5224a.f969A.getMap().values()));
        }
        boolean z9 = z8 instanceof Collection;
        if (!z9 || !z8.isEmpty()) {
            Iterator it = z8.iterator();
            while (it.hasNext()) {
                if (!((Boolean) it.next()).booleanValue()) {
                    if (!z9 || !z8.isEmpty()) {
                        Iterator it2 = z8.iterator();
                        while (it2.hasNext()) {
                            if (!(!((Boolean) it2.next()).booleanValue())) {
                                return "Partial";
                            }
                        }
                    }
                    if (d8) {
                        return "all";
                    }
                    return "Reject";
                }
            }
        }
        if (d8) {
            return "none";
        }
        return "All";
    }

    public final void e(String identifier, String value) {
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(value, "value");
        this.f5230g.add(new o(Calendar.getInstance().getTimeInMillis(), identifier + ':' + value));
    }
}
