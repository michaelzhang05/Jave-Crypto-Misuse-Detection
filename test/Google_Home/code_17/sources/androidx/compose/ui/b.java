package androidx.compose.ui;

import a6.InterfaceC1668n;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static boolean a(Modifier.Element element, Function1 function1) {
        return ((Boolean) function1.invoke(element)).booleanValue();
    }

    public static boolean b(Modifier.Element element, Function1 function1) {
        return ((Boolean) function1.invoke(element)).booleanValue();
    }

    public static Object c(Modifier.Element element, Object obj, InterfaceC1668n interfaceC1668n) {
        return interfaceC1668n.invoke(obj, element);
    }

    public static Object d(Modifier.Element element, Object obj, InterfaceC1668n interfaceC1668n) {
        return interfaceC1668n.invoke(element, obj);
    }

    public static /* synthetic */ boolean e(Modifier.Element element, Function1 function1) {
        return a(element, function1);
    }

    public static /* synthetic */ boolean f(Modifier.Element element, Function1 function1) {
        return b(element, function1);
    }

    public static /* synthetic */ Object g(Modifier.Element element, Object obj, InterfaceC1668n interfaceC1668n) {
        return c(element, obj, interfaceC1668n);
    }

    public static /* synthetic */ Object h(Modifier.Element element, Object obj, InterfaceC1668n interfaceC1668n) {
        return d(element, obj, interfaceC1668n);
    }

    public static /* synthetic */ Modifier i(Modifier.Element element, Modifier modifier) {
        return a.a(element, modifier);
    }
}
