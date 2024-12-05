package h4;

import f4.InterfaceC2835a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import o2.InterfaceC3515b;
import o6.InterfaceC3698L;

/* renamed from: h4.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2914H implements p4.D {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32289a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2835a f32290b;

    /* renamed from: c, reason: collision with root package name */
    private final p4.G f32291c;

    /* renamed from: d, reason: collision with root package name */
    private final C2913G f32292d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32293e;

    /* renamed from: f, reason: collision with root package name */
    private final B2.b f32294f;

    public C2914H(InterfaceC3515b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC2835a cbcEligibility, p4.G identifier, C2913G controller) {
        AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3255y.i(initialValues, "initialValues");
        AbstractC3255y.i(cbcEligibility, "cbcEligibility");
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f32289a = z8;
        this.f32290b = cbcEligibility;
        this.f32291c = identifier;
        this.f32292d = controller;
        this.f32293e = true;
    }

    @Override // p4.D
    public p4.G a() {
        return this.f32291c;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f32294f;
    }

    @Override // p4.D
    public boolean c() {
        return this.f32293e;
    }

    @Override // p4.D
    public InterfaceC3698L d() {
        return f().v().d();
    }

    @Override // p4.D
    public InterfaceC3698L e() {
        return f().v().e();
    }

    public C2913G f() {
        return this.f32292d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2914H(o2.InterfaceC3515b.a r8, java.util.Map r9, boolean r10, f4.InterfaceC2835a r11, p4.G r12, h4.C2913G r13, int r14, kotlin.jvm.internal.AbstractC3247p r15) {
        /*
            r7 = this;
            r15 = r14 & 4
            if (r15 == 0) goto L7
            r10 = 0
            r3 = 0
            goto L8
        L7:
            r3 = r10
        L8:
            r10 = r14 & 8
            if (r10 == 0) goto Le
            f4.a$c r11 = f4.InterfaceC2835a.c.f31958a
        Le:
            r4 = r11
            r10 = r14 & 32
            if (r10 == 0) goto L18
            h4.G r13 = new h4.G
            r13.<init>(r8, r9, r3, r4)
        L18:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.C2914H.<init>(o2.b$a, java.util.Map, boolean, f4.a, p4.G, h4.G, int, kotlin.jvm.internal.p):void");
    }
}
