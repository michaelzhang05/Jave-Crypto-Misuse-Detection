package kotlin.reflect.x;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.x.internal.KTypeImpl;
import kotlin.reflect.x.internal.KotlinReflectionInternalError;

/* compiled from: KTypesJvm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "getJvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final KClass<?> a(KClassifier kClassifier) {
        e eVar;
        KClass<?> b2;
        l.f(kClassifier, "<this>");
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (kClassifier instanceof KTypeParameter) {
            List<KType> upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
            Iterator<T> it = upperBounds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                KType kType = (KType) next;
                l.d(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                h w = ((KTypeImpl) kType).getF21512g().O0().w();
                eVar = w instanceof e ? (e) w : null;
                if ((eVar == null || eVar.i() == f.INTERFACE || eVar.i() == f.ANNOTATION_CLASS) ? false : true) {
                    eVar = next;
                    break;
                }
            }
            KType kType2 = (KType) eVar;
            if (kType2 == null) {
                kType2 = (KType) r.T(upperBounds);
            }
            return (kType2 == null || (b2 = b(kType2)) == null) ? b0.b(Object.class) : b2;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kClassifier);
    }

    public static final KClass<?> b(KType kType) {
        KClass<?> a;
        l.f(kType, "<this>");
        KClassifier b2 = kType.b();
        if (b2 != null && (a = a(b2)) != null) {
            return a;
        }
        throw new KotlinReflectionInternalError("Cannot calculate JVM erasure for type: " + kType);
    }
}
