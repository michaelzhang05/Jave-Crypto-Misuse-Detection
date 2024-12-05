package y6;

import A6.l0;
import O5.I;
import P5.AbstractC1371l;
import j6.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import y6.k;

/* loaded from: classes5.dex */
public abstract class i {

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a */
        public static final a f41054a = new a();

        a() {
            super(1);
        }

        public final void a(C4211a c4211a) {
            AbstractC3255y.i(c4211a, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4211a) obj);
            return I.f8278a;
        }
    }

    public static final f a(String serialName, e kind) {
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(kind, "kind");
        if (!n.u(serialName)) {
            return l0.a(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final f b(String serialName, j kind, f[] typeParameters, Function1 builder) {
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(kind, "kind");
        AbstractC3255y.i(typeParameters, "typeParameters");
        AbstractC3255y.i(builder, "builder");
        if (!n.u(serialName)) {
            if (!AbstractC3255y.d(kind, k.a.f41057a)) {
                C4211a c4211a = new C4211a(serialName);
                builder.invoke(c4211a);
                return new g(serialName, kind, c4211a.f().size(), AbstractC1371l.V0(typeParameters), c4211a);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static /* synthetic */ f c(String str, j jVar, f[] fVarArr, Function1 function1, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            function1 = a.f41054a;
        }
        return b(str, jVar, fVarArr, function1);
    }
}
