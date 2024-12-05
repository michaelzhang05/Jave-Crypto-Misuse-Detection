package kotlin.reflect.x.internal.l0.d.a.k0;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.f;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.i.c;
import kotlin.reflect.x.internal.l0.l.e0;

/* compiled from: JavaClassConstructorDescriptor.java */
/* loaded from: classes2.dex */
public class b extends f implements a {
    private Boolean K;
    private Boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(e eVar, b bVar, g gVar, boolean z, b.a aVar, z0 z0Var) {
        super(eVar, bVar, gVar, z, aVar, z0Var);
        if (eVar == null) {
            v(0);
        }
        if (gVar == null) {
            v(1);
        }
        if (aVar == null) {
            v(2);
        }
        if (z0Var == null) {
            v(3);
        }
        this.K = null;
        this.L = null;
    }

    public static b u1(e eVar, g gVar, boolean z, z0 z0Var) {
        if (eVar == null) {
            v(4);
        }
        if (gVar == null) {
            v(5);
        }
        if (z0Var == null) {
            v(6);
        }
        return new b(eVar, null, gVar, z, b.a.DECLARATION, z0Var);
    }

    private static /* synthetic */ void v(int i2) {
        String str = (i2 == 11 || i2 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 11 || i2 == 18) ? 2 : 3];
        switch (i2) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i2 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i2 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 != 11 && i2 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean G() {
        return this.L.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p
    public boolean R0() {
        return this.K.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p
    public void Z0(boolean z) {
        this.K = Boolean.valueOf(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p
    public void a1(boolean z) {
        this.L = Boolean.valueOf(z);
    }

    protected b t1(e eVar, b bVar, b.a aVar, z0 z0Var, g gVar) {
        if (eVar == null) {
            v(12);
        }
        if (aVar == null) {
            v(13);
        }
        if (z0Var == null) {
            v(14);
        }
        if (gVar == null) {
            v(15);
        }
        return new b(eVar, bVar, gVar, this.J, aVar, z0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.f
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public b M0(m mVar, y yVar, b.a aVar, kotlin.reflect.x.internal.l0.f.f fVar, g gVar, z0 z0Var) {
        if (mVar == null) {
            v(7);
        }
        if (aVar == null) {
            v(8);
        }
        if (gVar == null) {
            v(9);
        }
        if (z0Var == null) {
            v(10);
        }
        if (aVar != b.a.DECLARATION && aVar != b.a.SYNTHESIZED) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
        }
        b t1 = t1((e) mVar, (b) yVar, aVar, z0Var, gVar);
        t1.Z0(R0());
        t1.a1(G());
        return t1;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.k0.a
    /* renamed from: w1, reason: merged with bridge method [inline-methods] */
    public b y(e0 e0Var, List<e0> list, e0 e0Var2, Pair<a.InterfaceC0365a<?>, ?> pair) {
        List<w0> i2;
        if (list == null) {
            v(16);
        }
        if (e0Var2 == null) {
            v(17);
        }
        b M0 = M0(b(), null, i(), null, getAnnotations(), t());
        w0 h2 = e0Var == null ? null : c.h(M0, e0Var, g.f21674c.b());
        w0 f0 = f0();
        i2 = t.i();
        M0.S0(h2, f0, i2, getTypeParameters(), h.a(list, h(), M0), e0Var2, j(), getVisibility());
        if (pair != null) {
            M0.V0(pair.c(), pair.d());
        }
        return M0;
    }
}
