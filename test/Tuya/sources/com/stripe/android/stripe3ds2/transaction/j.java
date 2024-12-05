package com.stripe.android.stripe3ds2.transaction;

import androidx.core.view.PointerIconCompat;
import com.stripe.android.stripe3ds2.transaction.k;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class j implements X3.n {

    /* renamed from: a, reason: collision with root package name */
    private final X3.q f26858a;

    /* renamed from: b, reason: collision with root package name */
    private final X3.p f26859b;

    /* renamed from: c, reason: collision with root package name */
    private final X3.o f26860c;

    /* renamed from: d, reason: collision with root package name */
    private final V3.k f26861d;

    /* renamed from: e, reason: collision with root package name */
    private final X3.b f26862e;

    /* renamed from: f, reason: collision with root package name */
    private final e f26863f;

    /* renamed from: g, reason: collision with root package name */
    private final k.a f26864g;

    /* renamed from: h, reason: collision with root package name */
    private final T3.m f26865h;

    /* renamed from: i, reason: collision with root package name */
    private final U3.c f26866i;

    /* renamed from: j, reason: collision with root package name */
    private final o f26867j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26868a;

        /* renamed from: b, reason: collision with root package name */
        Object f26869b;

        /* renamed from: c, reason: collision with root package name */
        Object f26870c;

        /* renamed from: d, reason: collision with root package name */
        Object f26871d;

        /* renamed from: e, reason: collision with root package name */
        Object f26872e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f26873f;

        /* renamed from: h, reason: collision with root package name */
        int f26875h;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26873f = obj;
            this.f26875h |= Integer.MIN_VALUE;
            return j.this.a(null, this);
        }
    }

    public j(X3.q sdkTransactionId, X3.p messageVersionRegistry, X3.o jwsValidator, V3.k messageTransformer, X3.b acsDataParser, e challengeRequestResultRepository, k.a errorRequestExecutorFactory, T3.m uiCustomization, U3.c errorReporter, o logger) {
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(messageVersionRegistry, "messageVersionRegistry");
        AbstractC3159y.i(jwsValidator, "jwsValidator");
        AbstractC3159y.i(messageTransformer, "messageTransformer");
        AbstractC3159y.i(acsDataParser, "acsDataParser");
        AbstractC3159y.i(challengeRequestResultRepository, "challengeRequestResultRepository");
        AbstractC3159y.i(errorRequestExecutorFactory, "errorRequestExecutorFactory");
        AbstractC3159y.i(uiCustomization, "uiCustomization");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(logger, "logger");
        this.f26858a = sdkTransactionId;
        this.f26859b = messageVersionRegistry;
        this.f26860c = jwsValidator;
        this.f26861d = messageTransformer;
        this.f26862e = acsDataParser;
        this.f26863f = challengeRequestResultRepository;
        this.f26864g = errorRequestExecutorFactory;
        this.f26865h = uiCustomization;
        this.f26866i = errorReporter;
        this.f26867j = logger;
    }

    private final Y3.a b(X3.q qVar, X3.e eVar) {
        String c8 = eVar.c();
        if (c8 != null) {
            String e8 = eVar.e();
            if (e8 != null) {
                return new Y3.a(this.f26859b.a(), e8, c8, qVar, null, null, null, null, null, null, PointerIconCompat.TYPE_TEXT, null);
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
    @Override // X3.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(X3.m r17, P5.d r18) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.j.a(X3.m, P5.d):java.lang.Object");
    }
}
