package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;

/* compiled from: ReflectJavaAnnotationOwner.kt */
/* loaded from: classes2.dex */
public interface h extends kotlin.reflect.x.internal.l0.d.a.n0.d {

    /* compiled from: ReflectJavaAnnotationOwner.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static e a(h hVar, kotlin.reflect.x.internal.l0.f.c cVar) {
            Annotation[] declaredAnnotations;
            kotlin.jvm.internal.l.f(cVar, "fqName");
            AnnotatedElement v = hVar.v();
            if (v == null || (declaredAnnotations = v.getDeclaredAnnotations()) == null) {
                return null;
            }
            return i.a(declaredAnnotations, cVar);
        }

        public static List<e> b(h hVar) {
            List<e> i2;
            Annotation[] declaredAnnotations;
            List<e> b2;
            AnnotatedElement v = hVar.v();
            if (v != null && (declaredAnnotations = v.getDeclaredAnnotations()) != null && (b2 = i.b(declaredAnnotations)) != null) {
                return b2;
            }
            i2 = kotlin.collections.t.i();
            return i2;
        }

        public static boolean c(h hVar) {
            return false;
        }
    }

    AnnotatedElement v();
}
