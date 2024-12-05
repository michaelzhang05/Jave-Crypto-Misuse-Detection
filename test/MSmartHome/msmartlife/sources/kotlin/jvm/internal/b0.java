package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;
import okhttp3.HttpUrl;

/* compiled from: Reflection.java */
/* loaded from: classes2.dex */
public class b0 {
    private static final c0 a;

    /* renamed from: b, reason: collision with root package name */
    private static final KClass[] f19461b;

    static {
        c0 c0Var = null;
        try {
            c0Var = (c0) Class.forName("kotlin.f0.x.e.d0").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0Var == null) {
            c0Var = new c0();
        }
        a = c0Var;
        f19461b = new KClass[0];
    }

    public static KFunction a(i iVar) {
        return a.a(iVar);
    }

    public static KClass b(Class cls) {
        return a.b(cls);
    }

    public static KDeclarationContainer c(Class cls) {
        return a.c(cls, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public static KDeclarationContainer d(Class cls, String str) {
        return a.c(cls, str);
    }

    public static KMutableProperty0 e(o oVar) {
        return a.d(oVar);
    }

    public static KMutableProperty1 f(q qVar) {
        return a.e(qVar);
    }

    public static KProperty1 g(u uVar) {
        return a.f(uVar);
    }

    public static String h(FunctionBase functionBase) {
        return a.g(functionBase);
    }

    public static String i(Lambda lambda) {
        return a.h(lambda);
    }
}
