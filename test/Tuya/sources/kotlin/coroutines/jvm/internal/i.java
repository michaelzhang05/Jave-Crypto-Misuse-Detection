package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f33748a = new i();

    /* renamed from: b, reason: collision with root package name */
    private static final a f33749b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    private static a f33750c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f33751a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f33752b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f33753c;

        public a(Method method, Method method2, Method method3) {
            this.f33751a = method;
            this.f33752b = method2;
            this.f33753c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f33750c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f33749b;
            f33750c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC3159y.i(continuation, "continuation");
        a aVar = f33750c;
        if (aVar == null) {
            aVar = a(continuation);
        }
        if (aVar == f33749b) {
            return null;
        }
        Method method = aVar.f33751a;
        if (method != null) {
            obj = method.invoke(continuation.getClass(), null);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar.f33752b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, null);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar.f33753c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, null);
        } else {
            obj3 = null;
        }
        if (!(obj3 instanceof String)) {
            return null;
        }
        return (String) obj3;
    }
}
