package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes2.dex */
public class c0 {
    public KFunction a(i iVar) {
        return iVar;
    }

    public KClass b(Class cls) {
        return new ClassReference(cls);
    }

    public KDeclarationContainer c(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    public KMutableProperty0 d(o oVar) {
        return oVar;
    }

    public KMutableProperty1 e(q qVar) {
        return qVar;
    }

    public KProperty1 f(u uVar) {
        return uVar;
    }

    public String g(FunctionBase functionBase) {
        String obj = functionBase.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String h(Lambda lambda) {
        return g(lambda);
    }
}
