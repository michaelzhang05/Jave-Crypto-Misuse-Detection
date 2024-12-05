package Z3;

import S5.g;
import V3.d;
import V3.k;
import W3.m;
import X3.c;
import Y3.l;
import Y3.n;
import a4.p;
import a4.q;
import a4.s;
import a4.t;
import android.content.Context;
import c4.InterfaceC2044b;
import java.security.PublicKey;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class b implements Z3.a {

    /* renamed from: g, reason: collision with root package name */
    private static final a f13640g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final p f13641a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2044b f13642b;

    /* renamed from: c, reason: collision with root package name */
    private final c f13643c;

    /* renamed from: d, reason: collision with root package name */
    private final t f13644d;

    /* renamed from: e, reason: collision with root package name */
    private final l f13645e;

    /* renamed from: f, reason: collision with root package name */
    private final List f13646f;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public b(p messageVersionRegistry, InterfaceC2044b imageCache, c errorReporter, t transactionFactory, l publicKeyFactory, List warnings) {
        AbstractC3255y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3255y.i(imageCache, "imageCache");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(transactionFactory, "transactionFactory");
        AbstractC3255y.i(publicKeyFactory, "publicKeyFactory");
        AbstractC3255y.i(warnings, "warnings");
        this.f13641a = messageVersionRegistry;
        this.f13642b = imageCache;
        this.f13643c = errorReporter;
        this.f13644d = transactionFactory;
        this.f13645e = publicKeyFactory;
        this.f13646f = warnings;
    }

    private final s b(String str, String str2, boolean z8, String str3, List list, PublicKey publicKey, String str4, q qVar) {
        String str5 = str2;
        if (!this.f13641a.b(str2)) {
            if (str5 == null) {
                str5 = "";
            }
            throw new U3.a("Message version is unsupported: " + str5, null, 2, null);
        }
        return this.f13644d.a(str, list, publicKey, str4, qVar, z8, com.stripe.android.stripe3ds2.views.a.f28056e.a(str3, this.f13643c));
    }

    @Override // Z3.a
    public s a(q sdkTransactionId, String directoryServerID, String str, boolean z8, String directoryServerName, List rootCerts, PublicKey dsPublicKey, String str2, m uiCustomization) {
        AbstractC3255y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3255y.i(directoryServerID, "directoryServerID");
        AbstractC3255y.i(directoryServerName, "directoryServerName");
        AbstractC3255y.i(rootCerts, "rootCerts");
        AbstractC3255y.i(dsPublicKey, "dsPublicKey");
        AbstractC3255y.i(uiCustomization, "uiCustomization");
        return b(directoryServerID, str, z8, directoryServerName, rootCerts, dsPublicKey, str2, sdkTransactionId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, boolean z8, g workContext) {
        this(context, "3DS_LOA_SDK_STIN_020100_00142", z8, workContext);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, String sdkReferenceNumber, boolean z8, g workContext) {
        this(context, InterfaceC2044b.a.f15725a, sdkReferenceNumber, z8, workContext);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3255y.i(workContext, "workContext");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b(android.content.Context r13, c4.InterfaceC2044b r14, java.lang.String r15, boolean r16, S5.g r17) {
        /*
            r12 = this;
            X3.a r11 = new X3.a
            android.content.Context r1 = r13.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r1, r0)
            com.stripe.android.stripe3ds2.transaction.o$a r0 = com.stripe.android.stripe3ds2.transaction.o.f27947a
            r2 = r16
            com.stripe.android.stripe3ds2.transaction.o r4 = r0.a(r2)
            r9 = 246(0xf6, float:3.45E-43)
            r10 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r11
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.b.<init>(android.content.Context, c4.b, java.lang.String, boolean, S5.g):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(Context context, InterfaceC2044b interfaceC2044b, String str, c cVar, g gVar) {
        this(context, interfaceC2044b, str, cVar, new n(cVar), new k(context), new d(null, 1, 0 == true ? 1 : 0), new p(), gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b(android.content.Context r16, c4.InterfaceC2044b r17, java.lang.String r18, X3.c r19, Y3.g r20, V3.k r21, V3.m r22, a4.p r23, S5.g r24) {
        /*
            r15 = this;
            r0 = r16
            r1 = r21
            a4.i r4 = new a4.i
            a4.g r2 = new a4.g
            V3.f r6 = new V3.f
            android.content.Context r3 = r16.getApplicationContext()
            java.lang.String r5 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r3, r5)
            r6.<init>(r3, r1)
            V3.i r7 = new V3.i
            r7.<init>(r1)
            V3.c r10 = new V3.c
            r1 = r24
            r10.<init>(r0, r1)
            r5 = r2
            r8 = r22
            r9 = r20
            r11 = r23
            r12 = r18
            r13 = r19
            r14 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = r18
            r3 = r20
            r4.<init>(r2, r3, r1)
            java.util.List r6 = r22.a()
            Y3.l r5 = new Y3.l
            r3 = r19
            r5.<init>(r0, r3)
            r0 = r15
            r1 = r23
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.b.<init>(android.content.Context, c4.b, java.lang.String, X3.c, Y3.g, V3.k, V3.m, a4.p, S5.g):void");
    }
}
