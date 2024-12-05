package h4;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.InterfaceC3698L;
import p4.D;
import u4.C4061a;

/* loaded from: classes4.dex */
public final class C0 implements p4.D {

    /* renamed from: g, reason: collision with root package name */
    public static final int f32231g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32232a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32233b;

    /* renamed from: d, reason: collision with root package name */
    private final B2.b f32235d;

    /* renamed from: e, reason: collision with root package name */
    private final B0 f32236e;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32234c = true;

    /* renamed from: f, reason: collision with root package name */
    private final p4.G f32237f = p4.G.Companion.x();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(C4061a it) {
            AbstractC3255y.i(it, "it");
            return AbstractC1378t.e(O5.x.a(C0.this.a(), it));
        }
    }

    public C0(boolean z8, String str) {
        this.f32232a = z8;
        this.f32233b = str;
        this.f32236e = new B0(z8);
    }

    @Override // p4.D
    public p4.G a() {
        return this.f32237f;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f32235d;
    }

    @Override // p4.D
    public boolean c() {
        return this.f32234c;
    }

    @Override // p4.D
    public InterfaceC3698L d() {
        return y4.g.m(f().m(), new a());
    }

    @Override // p4.D
    public InterfaceC3698L e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (this.f32232a == c02.f32232a && AbstractC3255y.d(this.f32233b, c02.f32233b)) {
            return true;
        }
        return false;
    }

    public B0 f() {
        return this.f32236e;
    }

    public final String g() {
        return this.f32233b;
    }

    public int hashCode() {
        int hashCode;
        int a8 = androidx.compose.foundation.a.a(this.f32232a) * 31;
        String str = this.f32233b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a8 + hashCode;
    }

    public String toString() {
        return "SaveForFutureUseElement(initialValue=" + this.f32232a + ", merchantName=" + this.f32233b + ")";
    }
}
