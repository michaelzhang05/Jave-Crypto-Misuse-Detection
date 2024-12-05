package W3;

import P5.g;
import S3.d;
import S3.k;
import T3.m;
import U3.c;
import V3.l;
import V3.n;
import X3.p;
import X3.q;
import X3.s;
import X3.t;
import Z3.b;
import android.content.Context;
import java.security.PublicKey;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b implements W3.a {

    /* renamed from: g, reason: collision with root package name */
    private static final a f12002g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final p f12003a;

    /* renamed from: b, reason: collision with root package name */
    private final Z3.b f12004b;

    /* renamed from: c, reason: collision with root package name */
    private final c f12005c;

    /* renamed from: d, reason: collision with root package name */
    private final t f12006d;

    /* renamed from: e, reason: collision with root package name */
    private final l f12007e;

    /* renamed from: f, reason: collision with root package name */
    private final List f12008f;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public b(p messageVersionRegistry, Z3.b imageCache, c errorReporter, t transactionFactory, l publicKeyFactory, List warnings) {
        AbstractC3159y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3159y.i(imageCache, "imageCache");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(transactionFactory, "transactionFactory");
        AbstractC3159y.i(publicKeyFactory, "publicKeyFactory");
        AbstractC3159y.i(warnings, "warnings");
        this.f12003a = messageVersionRegistry;
        this.f12004b = imageCache;
        this.f12005c = errorReporter;
        this.f12006d = transactionFactory;
        this.f12007e = publicKeyFactory;
        this.f12008f = warnings;
    }

    private final s b(String str, String str2, boolean z8, String str3, List list, PublicKey publicKey, String str4, q qVar) {
        String str5 = str2;
        if (!this.f12003a.b(str2)) {
            if (str5 == null) {
                str5 = "";
            }
            throw new R3.a("Message version is unsupported: " + str5, null, 2, null);
        }
        return this.f12006d.a(str, list, publicKey, str4, qVar, z8, com.stripe.android.stripe3ds2.views.a.f27001e.a(str3, this.f12005c));
    }

    @Override // W3.a
    public s a(q sdkTransactionId, String directoryServerID, String str, boolean z8, String directoryServerName, List rootCerts, PublicKey dsPublicKey, String str2, m uiCustomization) {
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(directoryServerID, "directoryServerID");
        AbstractC3159y.i(directoryServerName, "directoryServerName");
        AbstractC3159y.i(rootCerts, "rootCerts");
        AbstractC3159y.i(dsPublicKey, "dsPublicKey");
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        return b(directoryServerID, str, z8, directoryServerName, rootCerts, dsPublicKey, str2, sdkTransactionId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, boolean z8, g workContext) {
        this(context, "3DS_LOA_SDK_STIN_020100_00142", z8, workContext);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, String sdkReferenceNumber, boolean z8, g workContext) {
        this(context, b.a.f13401a, sdkReferenceNumber, z8, workContext);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3159y.i(workContext, "workContext");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b(android.content.Context r13, Z3.b r14, java.lang.String r15, boolean r16, P5.g r17) {
        /*
            r12 = this;
            U3.a r11 = new U3.a
            android.content.Context r1 = r13.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r1, r0)
            com.stripe.android.stripe3ds2.transaction.o$a r0 = com.stripe.android.stripe3ds2.transaction.o.f26892a
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
        throw new UnsupportedOperationException("Method not decompiled: W3.b.<init>(android.content.Context, Z3.b, java.lang.String, boolean, P5.g):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(Context context, Z3.b bVar, String str, c cVar, g gVar) {
        this(context, bVar, str, cVar, new n(cVar), new k(context), new d(null, 1, 0 == true ? 1 : 0), new p(), gVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private b(android.content.Context r16, Z3.b r17, java.lang.String r18, U3.c r19, V3.g r20, S3.k r21, S3.m r22, X3.p r23, P5.g r24) {
        /*
            r15 = this;
            r0 = r16
            r1 = r21
            X3.i r4 = new X3.i
            X3.g r2 = new X3.g
            S3.f r6 = new S3.f
            android.content.Context r3 = r16.getApplicationContext()
            java.lang.String r5 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r3, r5)
            r6.<init>(r3, r1)
            S3.i r7 = new S3.i
            r7.<init>(r1)
            S3.c r10 = new S3.c
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
            V3.l r5 = new V3.l
            r3 = r19
            r5.<init>(r0, r3)
            r0 = r15
            r1 = r23
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.b.<init>(android.content.Context, Z3.b, java.lang.String, U3.c, V3.g, S3.k, S3.m, X3.p, P5.g):void");
    }
}
