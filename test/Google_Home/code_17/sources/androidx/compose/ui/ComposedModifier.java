package androidx.compose.ui;

import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {
    private final InterfaceC1669o factory;

    public ComposedModifier(Function1 function1, InterfaceC1669o interfaceC1669o) {
        super(function1);
        this.factory = interfaceC1669o;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return b.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return b.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, InterfaceC1668n interfaceC1668n) {
        return b.c(this, obj, interfaceC1668n);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, InterfaceC1668n interfaceC1668n) {
        return b.d(this, obj, interfaceC1668n);
    }

    public final InterfaceC1669o getFactory() {
        return this.factory;
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return a.a(this, modifier);
    }
}
