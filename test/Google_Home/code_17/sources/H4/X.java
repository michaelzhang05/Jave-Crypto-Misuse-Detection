package h4;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class X extends p4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final p4.G f32540b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32541c;

    /* renamed from: d, reason: collision with root package name */
    private final p4.w0 f32542d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f32543e;

    /* renamed from: f, reason: collision with root package name */
    private final B2.b f32544f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ X(p4.G r7, java.lang.String r8, p4.w0 r9, int r10, kotlin.jvm.internal.AbstractC3247p r11) {
        /*
            r6 = this;
            r11 = r10 & 1
            if (r11 == 0) goto La
            p4.G$b r7 = p4.G.Companion
            p4.G r7 = r7.n()
        La:
            r11 = r10 & 2
            if (r11 == 0) goto L10
            java.lang.String r8 = ""
        L10:
            r10 = r10 & 4
            if (r10 == 0) goto L26
            p4.s0 r9 = new p4.s0
            p4.A r1 = new p4.A
            r10 = 0
            r11 = 0
            r0 = 1
            r1.<init>(r10, r0, r11)
            r4 = 2
            r5 = 0
            r2 = 0
            r0 = r9
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L26:
            r6.<init>(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.X.<init>(p4.G, java.lang.String, p4.w0, int, kotlin.jvm.internal.p):void");
    }

    @Override // p4.o0, p4.k0
    public p4.G a() {
        return this.f32540b;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f32544f;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f32543e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x8 = (X) obj;
        if (AbstractC3255y.d(this.f32540b, x8.f32540b) && AbstractC3255y.d(this.f32541c, x8.f32541c) && AbstractC3255y.d(this.f32542d, x8.f32542d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f32540b.hashCode() * 31;
        String str = this.f32541c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.f32542d.hashCode();
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public p4.w0 i() {
        return this.f32542d;
    }

    public String toString() {
        return "EmailElement(identifier=" + this.f32540b + ", initialValue=" + this.f32541c + ", controller=" + this.f32542d + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(p4.G identifier, String str, p4.w0 controller) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f32540b = identifier;
        this.f32541c = str;
        this.f32542d = controller;
        this.f32543e = true;
    }
}
