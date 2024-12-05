package com.stripe.android.stripe3ds2.transaction;

import a4.InterfaceC1628b;
import androidx.core.view.PointerIconCompat;
import b4.C1975a;
import com.stripe.android.stripe3ds2.transaction.k;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class j implements a4.n {

    /* renamed from: a, reason: collision with root package name */
    private final a4.q f27913a;

    /* renamed from: b, reason: collision with root package name */
    private final a4.p f27914b;

    /* renamed from: c, reason: collision with root package name */
    private final a4.o f27915c;

    /* renamed from: d, reason: collision with root package name */
    private final Y3.k f27916d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1628b f27917e;

    /* renamed from: f, reason: collision with root package name */
    private final e f27918f;

    /* renamed from: g, reason: collision with root package name */
    private final k.a f27919g;

    /* renamed from: h, reason: collision with root package name */
    private final W3.m f27920h;

    /* renamed from: i, reason: collision with root package name */
    private final X3.c f27921i;

    /* renamed from: j, reason: collision with root package name */
    private final o f27922j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27923a;

        /* renamed from: b, reason: collision with root package name */
        Object f27924b;

        /* renamed from: c, reason: collision with root package name */
        Object f27925c;

        /* renamed from: d, reason: collision with root package name */
        Object f27926d;

        /* renamed from: e, reason: collision with root package name */
        Object f27927e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f27928f;

        /* renamed from: h, reason: collision with root package name */
        int f27930h;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27928f = obj;
            this.f27930h |= Integer.MIN_VALUE;
            return j.this.a(null, this);
        }
    }

    public j(a4.q sdkTransactionId, a4.p messageVersionRegistry, a4.o jwsValidator, Y3.k messageTransformer, InterfaceC1628b acsDataParser, e challengeRequestResultRepository, k.a errorRequestExecutorFactory, W3.m uiCustomization, X3.c errorReporter, o logger) {
        AbstractC3255y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3255y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3255y.i(jwsValidator, "jwsValidator");
        AbstractC3255y.i(messageTransformer, "messageTransformer");
        AbstractC3255y.i(acsDataParser, "acsDataParser");
        AbstractC3255y.i(challengeRequestResultRepository, "challengeRequestResultRepository");
        AbstractC3255y.i(errorRequestExecutorFactory, "errorRequestExecutorFactory");
        AbstractC3255y.i(uiCustomization, "uiCustomization");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(logger, "logger");
        this.f27913a = sdkTransactionId;
        this.f27914b = messageVersionRegistry;
        this.f27915c = jwsValidator;
        this.f27916d = messageTransformer;
        this.f27917e = acsDataParser;
        this.f27918f = challengeRequestResultRepository;
        this.f27919g = errorRequestExecutorFactory;
        this.f27920h = uiCustomization;
        this.f27921i = errorReporter;
        this.f27922j = logger;
    }

    private final C1975a b(a4.q qVar, a4.e eVar) {
        String b8 = eVar.b();
        if (b8 != null) {
            String g8 = eVar.g();
            if (g8 != null) {
                return new C1975a(this.f27914b.a(), g8, b8, qVar, null, null, null, null, null, null, PointerIconCompat.TYPE_TEXT, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|(1:(4:9|10|11|12)(2:41|42))(5:43|44|45|46|(4:48|49|50|(1:52)(1:53))(3:55|56|57))|13|14|(1:16)(2:24|(1:26)(2:27|(1:29)(2:30|(1:32)(2:33|34))))|17|18|(1:23)(2:20|21)))|62|6|(0)(0)|13|14|(0)(0)|17|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0100, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d8 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:14:0x00d2, B:16:0x00d8, B:17:0x015a, B:24:0x0103, B:26:0x0107, B:27:0x0126, B:29:0x012a, B:30:0x0142, B:32:0x0146, B:33:0x015f, B:34:0x0164), top: B:13:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0103 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:14:0x00d2, B:16:0x00d8, B:17:0x015a, B:24:0x0103, B:26:0x0107, B:27:0x0126, B:29:0x012a, B:30:0x0142, B:32:0x0146, B:33:0x015f, B:34:0x0164), top: B:13:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // a4.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a4.m r17, S5.d r18) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.j.a(a4.m, S5.d):java.lang.Object");
    }
}
