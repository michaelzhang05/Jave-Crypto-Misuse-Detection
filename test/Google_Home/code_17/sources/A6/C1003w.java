package A6;

import O5.InterfaceC1355k;
import P5.AbstractC1378t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import y6.j;
import y6.k;

/* renamed from: A6.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1003w extends C0985e0 {

    /* renamed from: m, reason: collision with root package name */
    private final y6.j f621m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1355k f622n;

    /* renamed from: A6.w$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f623a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f624b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1003w f625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, String str, C1003w c1003w) {
            super(0);
            this.f623a = i8;
            this.f624b = str;
            this.f625c = c1003w;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.f[] invoke() {
            int i8 = this.f623a;
            y6.f[] fVarArr = new y6.f[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                fVarArr[i9] = y6.i.c(this.f624b + '.' + this.f625c.f(i9), k.d.f41060a, new y6.f[0], null, 8, null);
            }
            return fVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1003w(String name, int i8) {
        super(name, null, i8, 2, null);
        AbstractC3255y.i(name, "name");
        this.f621m = j.b.f41056a;
        this.f622n = O5.l.b(new a(i8, name, this));
    }

    private final y6.f[] s() {
        return (y6.f[]) this.f622n.getValue();
    }

    @Override // A6.C0985e0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y6.f)) {
            return false;
        }
        y6.f fVar = (y6.f) obj;
        if (fVar.getKind() == j.b.f41056a && AbstractC3255y.d(a(), fVar.a()) && AbstractC3255y.d(AbstractC0981c0.a(this), AbstractC0981c0.a(fVar))) {
            return true;
        }
        return false;
    }

    @Override // A6.C0985e0, y6.f
    public y6.j getKind() {
        return this.f621m;
    }

    @Override // A6.C0985e0, y6.f
    public y6.f h(int i8) {
        return s()[i8];
    }

    @Override // A6.C0985e0
    public int hashCode() {
        int i8;
        int hashCode = a().hashCode();
        int i9 = 1;
        for (String str : y6.h.b(this)) {
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

    @Override // A6.C0985e0
    public String toString() {
        return AbstractC1378t.w0(y6.h.b(this), ", ", a() + '(', ")", 0, null, null, 56, null);
    }
}
