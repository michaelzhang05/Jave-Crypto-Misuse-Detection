package H7;

import M5.AbstractC1246t;
import com.inmobi.cmp.ChoiceCmpCallback;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import y5.s;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final s f3621a;

    /* renamed from: b, reason: collision with root package name */
    public E6.a f3622b;

    /* renamed from: c, reason: collision with root package name */
    public final K7.a f3623c;

    /* renamed from: d, reason: collision with root package name */
    public K7.b f3624d;

    /* renamed from: e, reason: collision with root package name */
    public final ChoiceCmpCallback f3625e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3626f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3627g;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f3628a;

        /* renamed from: c, reason: collision with root package name */
        public int f3630c;

        public a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3628a = obj;
            this.f3630c |= Integer.MIN_VALUE;
            return g.this.a(null, null, null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f3631a;

        /* renamed from: c, reason: collision with root package name */
        public int f3633c;

        public b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3631a = obj;
            this.f3633c |= Integer.MIN_VALUE;
            return g.this.b(null, null, this);
        }
    }

    static {
        AbstractC3159y.h(g.class.getSimpleName(), "Tracking::class.java.simpleName");
    }

    public g(s tcModel, E6.a aVar, K7.a networkUtil, K7.b requestApi, ChoiceCmpCallback choiceCmpCallback, String domain) {
        AbstractC3159y.i(tcModel, "tcModel");
        AbstractC3159y.i(networkUtil, "networkUtil");
        AbstractC3159y.i(requestApi, "requestApi");
        AbstractC3159y.i(domain, "domain");
        this.f3621a = tcModel;
        this.f3622b = aVar;
        this.f3623c = networkUtil;
        this.f3624d = requestApi;
        this.f3625e = choiceCmpCallback;
        this.f3626f = domain;
        this.f3627g = new ArrayList();
    }

    public static Object c(g gVar, Boolean bool, String str, String str2, String str3, String str4, f fVar, P5.d dVar, int i8) {
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
        if (AbstractC3159y.d(bool, kotlin.coroutines.jvm.internal.b.a(true))) {
            d8 = "All";
        } else {
            d8 = gVar.d(null);
        }
        String str9 = d8;
        if (AbstractC3159y.d(bool, kotlin.coroutines.jvm.internal.b.a(true))) {
            d9 = "none";
        } else {
            d9 = gVar.d("legitimate");
        }
        String str10 = d9;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(gVar.f3627g);
        j jVar = new j(arrayList, str9, str10, str5, str6, null, null, str7, str8, 96);
        gVar.f3627g.clear();
        return gVar.a(e.DONE, jVar, fVar, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(H7.e r12, H7.h r13, H7.f r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof H7.g.a
            if (r0 == 0) goto L13
            r0 = r15
            H7.g$a r0 = (H7.g.a) r0
            int r1 = r0.f3630c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3630c = r1
            goto L18
        L13:
            H7.g$a r0 = new H7.g$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f3628a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f3630c
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            L5.t.b(r15)     // Catch: v5.C3831a -> Lc0
            goto Lb2
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            L5.t.b(r15)
            java.util.Calendar r15 = java.util.Calendar.getInstance()
            long r5 = r15.getTimeInMillis()
            r13.b(r5)
            java.lang.String r15 = "<set-?>"
            kotlin.jvm.internal.AbstractC3159y.i(r12, r15)
            r13.f3635b = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = r14.f3620a
            r12.append(r14)
            r14 = 45
            r12.append(r14)
            java.util.UUID r14 = H7.m.f3658b
            java.lang.String r14 = r14.toString()
            java.lang.String r2 = "sessionID.toString()"
            kotlin.jvm.internal.AbstractC3159y.h(r14, r2)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r13.f3636c = r12
            java.lang.String r12 = r11.f3626f
            kotlin.jvm.internal.AbstractC3159y.i(r12, r15)
            r13.f3637d = r12
            java.lang.String r12 = "https://api.cmp.inmobi.com/"
            android.net.Uri r12 = android.net.Uri.parse(r12)
            android.net.Uri$Builder r12 = r12.buildUpon()
            java.lang.String r5 = r13.a()
            r9 = 4
            r10 = 0
            java.lang.String r6 = "\\"
            java.lang.String r7 = ""
            r8 = 0
            java.lang.String r13 = g6.n.A(r5, r6, r7, r8, r9, r10)
            java.lang.String r14 = "log"
            android.net.Uri$Builder r12 = r12.appendQueryParameter(r14, r13)
            android.net.Uri r12 = r12.build()
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "parse(BuildConfig.INMOBI…      .build().toString()"
            kotlin.jvm.internal.AbstractC3159y.h(r12, r13)
            K7.a r13 = r11.f3623c     // Catch: v5.C3831a -> Lc0
            boolean r13 = r13.a()     // Catch: v5.C3831a -> Lc0
            if (r13 == 0) goto Lb6
            K7.b r13 = r11.f3624d     // Catch: v5.C3831a -> Lc0
            r0.f3630c = r4     // Catch: v5.C3831a -> Lc0
            java.lang.Object r15 = r13.b(r12, r0)     // Catch: v5.C3831a -> Lc0
            if (r15 != r1) goto Lb2
            return r1
        Lb2:
            java.lang.String r15 = (java.lang.String) r15     // Catch: v5.C3831a -> Lc0
            r3 = r15
            goto Lc0
        Lb6:
            com.inmobi.cmp.ChoiceCmpCallback r12 = r11.f3625e     // Catch: v5.C3831a -> Lc0
            if (r12 != 0) goto Lbb
            goto Lc0
        Lbb:
            com.inmobi.cmp.model.ChoiceError r13 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: v5.C3831a -> Lc0
            r12.onCmpError(r13)     // Catch: v5.C3831a -> Lc0
        Lc0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: H7.g.a(H7.e, H7.h, H7.f, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(H7.f r12, H7.c r13, P5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof H7.g.b
            if (r0 == 0) goto L13
            r0 = r14
            H7.g$b r0 = (H7.g.b) r0
            int r1 = r0.f3633c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3633c = r1
            goto L18
        L13:
            H7.g$b r0 = new H7.g$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f3631a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f3633c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r14)
            goto L62
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            L5.t.b(r14)
            E6.a r14 = r11.f3622b
            if (r14 != 0) goto L39
            goto L66
        L39:
            H7.i r2 = new H7.i
            java.lang.String r5 = r14.f2333a
            java.lang.String r6 = r14.f2339g
            y5.s r4 = r11.f3621a
            int r7 = r4.f39944m
            int r4 = r4.f39945n
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.c(r4)
            java.lang.String r8 = "2."
            java.lang.String r8 = kotlin.jvm.internal.AbstractC3159y.q(r8, r4)
            java.lang.String r9 = r13.f3606a
            java.lang.String r10 = r14.f2337e
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            H7.e r13 = H7.e.INIT
            r0.f3633c = r3
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
        throw new UnsupportedOperationException("Method not decompiled: H7.g.b(H7.f, H7.c, P5.d):java.lang.Object");
    }

    public final String d(String str) {
        List z8;
        boolean d8 = AbstractC3159y.d(str, "legitimate");
        if (d8) {
            z8 = AbstractC1246t.z(AbstractC1246t.p(this.f3621a.f39928D.getMap().values(), this.f3621a.f39927C.getMap().values(), this.f3621a.f39950s.getMap().values()));
        } else {
            z8 = AbstractC1246t.z(AbstractC1246t.p(this.f3621a.f39949r.getMap().values(), this.f3621a.f39957z.getMap().values(), this.f3621a.f39925A.getMap().values()));
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
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(value, "value");
        this.f3627g.add(new o(Calendar.getInstance().getTimeInMillis(), identifier + ':' + value));
    }
}
