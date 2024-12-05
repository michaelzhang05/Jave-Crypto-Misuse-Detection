package kotlin.reflect.x.internal.l0.d.a.k0;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.u;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.d.a.o0.r;
import kotlin.reflect.x.internal.l0.i.c;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: JavaPropertyDescriptor.java */
/* loaded from: classes2.dex */
public class f extends c0 implements a {
    private final boolean H;
    private final Pair<a.InterfaceC0365a<?>, ?> I;
    private e0 J;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, g gVar, d0 d0Var, u uVar, boolean z, kotlin.reflect.x.internal.l0.f.f fVar, z0 z0Var, t0 t0Var, b.a aVar, boolean z2, Pair<a.InterfaceC0365a<?>, ?> pair) {
        super(mVar, t0Var, gVar, d0Var, uVar, z, fVar, aVar, z0Var, false, false, false, false, false, false);
        if (mVar == null) {
            v(0);
        }
        if (gVar == null) {
            v(1);
        }
        if (d0Var == null) {
            v(2);
        }
        if (uVar == null) {
            v(3);
        }
        if (fVar == null) {
            v(4);
        }
        if (z0Var == null) {
            v(5);
        }
        if (aVar == null) {
            v(6);
        }
        this.J = null;
        this.H = z2;
        this.I = pair;
    }

    public static f g1(m mVar, g gVar, d0 d0Var, u uVar, boolean z, kotlin.reflect.x.internal.l0.f.f fVar, z0 z0Var, boolean z2) {
        if (mVar == null) {
            v(7);
        }
        if (gVar == null) {
            v(8);
        }
        if (d0Var == null) {
            v(9);
        }
        if (uVar == null) {
            v(10);
        }
        if (fVar == null) {
            v(11);
        }
        if (z0Var == null) {
            v(12);
        }
        return new f(mVar, gVar, d0Var, uVar, z, fVar, z0Var, null, b.a.DECLARATION, z2, null);
    }

    private static /* synthetic */ void v(int i2) {
        String str = i2 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 21 ? 3 : 2];
        switch (i2) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i2 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 == 21) {
            throw new IllegalStateException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.m0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.c0
    protected c0 Q0(m mVar, d0 d0Var, u uVar, t0 t0Var, b.a aVar, kotlin.reflect.x.internal.l0.f.f fVar, z0 z0Var) {
        if (mVar == null) {
            v(13);
        }
        if (d0Var == null) {
            v(14);
        }
        if (uVar == null) {
            v(15);
        }
        if (aVar == null) {
            v(16);
        }
        if (fVar == null) {
            v(17);
        }
        if (z0Var == null) {
            v(18);
        }
        return new f(mVar, getAnnotations(), d0Var, uVar, j0(), fVar, z0Var, t0Var, aVar, this.H, this.I);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.c0
    public void a1(e0 e0Var) {
        if (e0Var == null) {
            v(22);
        }
        this.J = e0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.c0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public <V> V i0(a.InterfaceC0365a<V> interfaceC0365a) {
        Pair<a.InterfaceC0365a<?>, ?> pair = this.I;
        if (pair == null || !pair.c().equals(interfaceC0365a)) {
            return null;
        }
        return (V) this.I.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.c0, kotlin.reflect.jvm.internal.impl.descriptors.j1
    public boolean isConst() {
        e0 type = getType();
        return this.H && j.a(type) && (!r.i(type) || h.u0(type));
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.k0.a
    public a y(e0 e0Var, List<e0> list, e0 e0Var2, Pair<a.InterfaceC0365a<?>, ?> pair) {
        kotlin.reflect.jvm.internal.impl.descriptors.p1.d0 d0Var;
        kotlin.reflect.jvm.internal.impl.descriptors.p1.e0 e0Var3;
        List<w0> i2;
        if (list == null) {
            v(19);
        }
        if (e0Var2 == null) {
            v(20);
        }
        t0 a = a() == this ? null : a();
        f fVar = new f(b(), getAnnotations(), j(), getVisibility(), j0(), getName(), t(), a, i(), this.H, pair);
        kotlin.reflect.jvm.internal.impl.descriptors.p1.d0 getter = getGetter();
        if (getter != null) {
            d0Var = r15;
            kotlin.reflect.jvm.internal.impl.descriptors.p1.d0 d0Var2 = new kotlin.reflect.jvm.internal.impl.descriptors.p1.d0(fVar, getter.getAnnotations(), getter.j(), getter.getVisibility(), getter.V(), getter.z(), getter.isInline(), i(), a == null ? null : a.getGetter(), getter.t());
            d0Var.O0(getter.d0());
            d0Var.R0(e0Var2);
        } else {
            d0Var = null;
        }
        v0 setter = getSetter();
        if (setter != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.p1.e0 e0Var4 = new kotlin.reflect.jvm.internal.impl.descriptors.p1.e0(fVar, setter.getAnnotations(), setter.j(), setter.getVisibility(), setter.V(), setter.z(), setter.isInline(), i(), a == null ? null : a.getSetter(), setter.t());
            e0Var4.O0(e0Var4.d0());
            e0Var4.S0(setter.h().get(0));
            e0Var3 = e0Var4;
        } else {
            e0Var3 = null;
        }
        fVar.W0(d0Var, e0Var3, q0(), n0());
        fVar.b1(X0());
        Function0<kotlin.reflect.x.internal.l0.k.j<kotlin.reflect.x.internal.l0.i.r.g<?>>> function0 = this.m;
        if (function0 != null) {
            fVar.L0(this.l, function0);
        }
        fVar.x0(e());
        w0 h2 = e0Var == null ? null : c.h(this, e0Var, g.f21674c.b());
        List<e1> typeParameters = getTypeParameters();
        w0 f0 = f0();
        i2 = t.i();
        fVar.c1(e0Var2, typeParameters, f0, h2, i2);
        return fVar;
    }
}
