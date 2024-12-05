package e4;

import c4.InterfaceC1925a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import l2.InterfaceC3167b;
import l6.InterfaceC3349K;
import y2.InterfaceC3983b;

/* renamed from: e4.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2594H implements m4.D {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f30368a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1925a f30369b;

    /* renamed from: c, reason: collision with root package name */
    private final m4.G f30370c;

    /* renamed from: d, reason: collision with root package name */
    private final C2593G f30371d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f30372e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3983b f30373f;

    public C2594H(InterfaceC3167b.a cardAccountRangeRepositoryFactory, Map initialValues, boolean z8, InterfaceC1925a cbcEligibility, m4.G identifier, C2593G controller) {
        AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3159y.i(initialValues, "initialValues");
        AbstractC3159y.i(cbcEligibility, "cbcEligibility");
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f30368a = z8;
        this.f30369b = cbcEligibility;
        this.f30370c = identifier;
        this.f30371d = controller;
        this.f30372e = true;
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30370c;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30373f;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30372e;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        return f().v().d();
    }

    @Override // m4.D
    public InterfaceC3349K e() {
        return f().v().e();
    }

    public C2593G f() {
        return this.f30371d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2594H(l2.InterfaceC3167b.a r8, java.util.Map r9, boolean r10, c4.InterfaceC1925a r11, m4.G r12, e4.C2593G r13, int r14, kotlin.jvm.internal.AbstractC3151p r15) {
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
            c4.a$c r11 = c4.InterfaceC1925a.c.f14983a
        Le:
            r4 = r11
            r10 = r14 & 32
            if (r10 == 0) goto L18
            e4.G r13 = new e4.G
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
        throw new UnsupportedOperationException("Method not decompiled: e4.C2594H.<init>(l2.b$a, java.util.Map, boolean, c4.a, m4.G, e4.G, int, kotlin.jvm.internal.p):void");
    }
}
