package kotlin.reflect.x.internal;

import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;
import kotlin.reflect.x.d;

/* compiled from: ReflectionFactoryImpl.java */
/* loaded from: classes2.dex */
public class d0 extends c0 {
    private static KDeclarationContainerImpl i(c cVar) {
        KDeclarationContainer owner = cVar.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : EmptyContainerForLocal.f19526i;
    }

    @Override // kotlin.jvm.internal.c0
    public KFunction a(i iVar) {
        return new KFunctionImpl(i(iVar), iVar.getM(), iVar.getSignature(), iVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.c0
    public KClass b(Class cls) {
        return g.a(cls);
    }

    @Override // kotlin.jvm.internal.c0
    public KDeclarationContainer c(Class cls, String str) {
        return new KPackageImpl(cls, str);
    }

    @Override // kotlin.jvm.internal.c0
    public KMutableProperty0 d(o oVar) {
        return new KMutableProperty0Impl(i(oVar), oVar.getM(), oVar.getSignature(), oVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.c0
    public KMutableProperty1 e(q qVar) {
        return new KMutableProperty1Impl(i(qVar), qVar.getM(), qVar.getSignature(), qVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.c0
    public KProperty1 f(u uVar) {
        return new KProperty1Impl(i(uVar), uVar.getM(), uVar.getSignature(), uVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.c0
    public String g(FunctionBase functionBase) {
        KFunctionImpl c2;
        KFunction a = d.a(functionBase);
        if (a != null && (c2 = i0.c(a)) != null) {
            return ReflectionObjectRenderer.a.e(c2.D());
        }
        return super.g(functionBase);
    }

    @Override // kotlin.jvm.internal.c0
    public String h(Lambda lambda) {
        return g(lambda);
    }
}
