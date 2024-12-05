package androidx.navigation;

import L5.InterfaceC1227k;
import android.os.Bundle;
import androidx.navigation.NavArgs;
import e6.InterfaceC2643c;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class NavArgsLazy<Args extends NavArgs> implements InterfaceC1227k {
    private final Function0 argumentProducer;
    private Args cached;
    private final InterfaceC2643c navArgsClass;

    public NavArgsLazy(InterfaceC2643c navArgsClass, Function0 argumentProducer) {
        AbstractC3159y.i(navArgsClass, "navArgsClass");
        AbstractC3159y.i(argumentProducer, "argumentProducer");
        this.navArgsClass = navArgsClass;
        this.argumentProducer = argumentProducer;
    }

    @Override // L5.InterfaceC1227k
    public boolean isInitialized() {
        if (this.cached != null) {
            return true;
        }
        return false;
    }

    @Override // L5.InterfaceC1227k
    public Args getValue() {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle bundle = (Bundle) this.argumentProducer.invoke();
        Method method = NavArgsLazyKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class a8 = W5.a.a(this.navArgsClass);
            Class<Bundle>[] methodSignature = NavArgsLazyKt.getMethodSignature();
            method = a8.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazyKt.getMethodMap().put(this.navArgsClass, method);
            AbstractC3159y.h(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Object invoke = method.invoke(null, bundle);
        AbstractC3159y.g(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        Args args2 = (Args) invoke;
        this.cached = args2;
        return args2;
    }
}
