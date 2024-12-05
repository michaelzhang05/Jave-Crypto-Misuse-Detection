package kotlin.reflect.x.internal;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.l;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.u;
import okhttp3.HttpUrl;

/* compiled from: util.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/CreateKCallableVisitor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", HttpUrl.FRAGMENT_ENCODE_SET, "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "visitFunctionDescriptor", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "data", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitPropertyDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.f0.x.e.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public class CreateKCallableVisitor extends l<KCallableImpl<?>, u> {
    private final KDeclarationContainerImpl a;

    public CreateKCallableVisitor(KDeclarationContainerImpl kDeclarationContainerImpl) {
        kotlin.jvm.internal.l.f(kDeclarationContainerImpl, "container");
        this.a = kDeclarationContainerImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.l, kotlin.reflect.jvm.internal.impl.descriptors.o
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public KCallableImpl<?> g(y yVar, u uVar) {
        kotlin.jvm.internal.l.f(yVar, "descriptor");
        kotlin.jvm.internal.l.f(uVar, "data");
        return new KFunctionImpl(this.a, yVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public KCallableImpl<?> d(t0 t0Var, u uVar) {
        kotlin.jvm.internal.l.f(t0Var, "descriptor");
        kotlin.jvm.internal.l.f(uVar, "data");
        int i2 = (t0Var.f0() != null ? 1 : 0) + (t0Var.m0() != null ? 1 : 0);
        if (t0Var.j0()) {
            if (i2 == 0) {
                return new KMutableProperty0Impl(this.a, t0Var);
            }
            if (i2 == 1) {
                return new KMutableProperty1Impl(this.a, t0Var);
            }
            if (i2 == 2) {
                return new KMutableProperty2Impl(this.a, t0Var);
            }
        } else {
            if (i2 == 0) {
                return new KProperty0Impl(this.a, t0Var);
            }
            if (i2 == 1) {
                return new KProperty1Impl(this.a, t0Var);
            }
            if (i2 == 2) {
                return new KProperty2Impl(this.a, t0Var);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + t0Var);
    }
}
