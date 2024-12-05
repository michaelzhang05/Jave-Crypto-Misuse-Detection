package x6;

import L5.InterfaceC1227k;
import M5.AbstractC1246t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v6.j;
import v6.k;

/* renamed from: x6.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3962w extends C3944e0 {

    /* renamed from: m, reason: collision with root package name */
    private final v6.j f39626m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1227k f39627n;

    /* renamed from: x6.w$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f39628a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39629b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3962w f39630c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, String str, C3962w c3962w) {
            super(0);
            this.f39628a = i8;
            this.f39629b = str;
            this.f39630c = c3962w;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v6.f[] invoke() {
            int i8 = this.f39628a;
            v6.f[] fVarArr = new v6.f[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                fVarArr[i9] = v6.i.c(this.f39629b + '.' + this.f39630c.f(i9), k.d.f38929a, new v6.f[0], null, 8, null);
            }
            return fVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3962w(String name, int i8) {
        super(name, null, i8, 2, null);
        AbstractC3159y.i(name, "name");
        this.f39626m = j.b.f38925a;
        this.f39627n = L5.l.b(new a(i8, name, this));
    }

    private final v6.f[] s() {
        return (v6.f[]) this.f39627n.getValue();
    }

    @Override // x6.C3944e0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v6.f)) {
            return false;
        }
        v6.f fVar = (v6.f) obj;
        if (fVar.getKind() == j.b.f38925a && AbstractC3159y.d(a(), fVar.a()) && AbstractC3159y.d(AbstractC3940c0.a(this), AbstractC3940c0.a(fVar))) {
            return true;
        }
        return false;
    }

    @Override // x6.C3944e0, v6.f
    public v6.j getKind() {
        return this.f39626m;
    }

    @Override // x6.C3944e0, v6.f
    public v6.f h(int i8) {
        return s()[i8];
    }

    @Override // x6.C3944e0
    public int hashCode() {
        int i8;
        int hashCode = a().hashCode();
        int i9 = 1;
        for (String str : v6.h.b(this)) {
            int i10 = i9 * 31;
            if (str != null) {
                i8 = str.hashCode();
            } else {
                i8 = 0;
            }
            i9 = i10 + i8;
        }
        return (hashCode * 31) + i9;
    }

    @Override // x6.C3944e0
    public String toString() {
        return AbstractC1246t.w0(v6.h.b(this), ", ", a() + '(', ")", 0, null, null, 56, null);
    }
}
