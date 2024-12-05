package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.reflect.Modifier;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.m1;

/* compiled from: ReflectJavaModifierListOwner.kt */
/* loaded from: classes2.dex */
public interface v extends kotlin.reflect.x.internal.l0.d.a.n0.s {

    /* compiled from: ReflectJavaModifierListOwner.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static m1 a(v vVar) {
            int E = vVar.E();
            if (Modifier.isPublic(E)) {
                return l1.h.f21655c;
            }
            if (Modifier.isPrivate(E)) {
                return l1.e.f21652c;
            }
            if (Modifier.isProtected(E)) {
                return Modifier.isStatic(E) ? kotlin.reflect.jvm.internal.impl.descriptors.q1.c.f21805c : kotlin.reflect.jvm.internal.impl.descriptors.q1.b.f21804c;
            }
            return kotlin.reflect.jvm.internal.impl.descriptors.q1.a.f21803c;
        }

        public static boolean b(v vVar) {
            return Modifier.isAbstract(vVar.E());
        }

        public static boolean c(v vVar) {
            return Modifier.isFinal(vVar.E());
        }

        public static boolean d(v vVar) {
            return Modifier.isStatic(vVar.E());
        }
    }

    int E();
}
