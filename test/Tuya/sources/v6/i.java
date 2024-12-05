package v6;

import L5.I;
import M5.AbstractC1239l;
import g6.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import v6.k;
import x6.l0;

/* loaded from: classes5.dex */
public abstract class i {

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a */
        public static final a f38923a = new a();

        a() {
            super(1);
        }

        public final void a(C3834a c3834a) {
            AbstractC3159y.i(c3834a, "$this$null");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3834a) obj);
            return I.f6487a;
        }
    }

    public static final f a(String serialName, e kind) {
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(kind, "kind");
        if (!n.u(serialName)) {
            return l0.a(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final f b(String serialName, j kind, f[] typeParameters, Function1 builder) {
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(kind, "kind");
        AbstractC3159y.i(typeParameters, "typeParameters");
        AbstractC3159y.i(builder, "builder");
        if (!n.u(serialName)) {
            if (!AbstractC3159y.d(kind, k.a.f38926a)) {
                C3834a c3834a = new C3834a(serialName);
                builder.invoke(c3834a);
                return new g(serialName, kind, c3834a.f().size(), AbstractC1239l.V0(typeParameters), c3834a);
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static /* synthetic */ f c(String str, j jVar, f[] fVarArr, Function1 function1, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            function1 = a.f38923a;
        }
        return b(str, jVar, fVarArr, function1);
    }
}
