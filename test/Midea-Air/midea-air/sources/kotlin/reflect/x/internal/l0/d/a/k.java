package kotlin.reflect.x.internal.l0.d.a;

import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.x.internal.l0.b.c;
import kotlin.reflect.x.internal.l0.i.d;

/* compiled from: DescriptorsJvmAbiUtil.java */
/* loaded from: classes2.dex */
public final class k {
    private static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1 || i2 == 2) {
            objArr[0] = "companionObject";
        } else if (i2 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i2 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i2 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i2 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(b bVar) {
        w q0;
        if (bVar == null) {
            a(3);
        }
        if ((bVar instanceof t0) && (q0 = ((t0) bVar).q0()) != null && q0.getAnnotations().A(z.f20214b)) {
            return true;
        }
        return bVar.getAnnotations().A(z.f20214b);
    }

    public static boolean c(m mVar) {
        if (mVar == null) {
            a(1);
        }
        return d.x(mVar) && d.w(mVar.b()) && !d((e) mVar);
    }

    public static boolean d(e eVar) {
        if (eVar == null) {
            a(2);
        }
        return kotlin.reflect.x.internal.l0.b.d.a(c.a, eVar);
    }

    public static boolean e(t0 t0Var) {
        if (t0Var == null) {
            a(0);
        }
        if (t0Var.i() == b.a.FAKE_OVERRIDE) {
            return false;
        }
        if (c(t0Var.b())) {
            return true;
        }
        return d.x(t0Var.b()) && b(t0Var);
    }
}
