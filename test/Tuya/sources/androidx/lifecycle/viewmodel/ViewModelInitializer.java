package androidx.lifecycle.viewmodel;

import W5.a;
import androidx.lifecycle.ViewModel;
import e6.InterfaceC2643c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final InterfaceC2643c clazz;
    private final Function1 initializer;

    public ViewModelInitializer(InterfaceC2643c clazz, Function1 initializer) {
        AbstractC3159y.i(clazz, "clazz");
        AbstractC3159y.i(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    public final InterfaceC2643c getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final Function1 getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelInitializer(Class<T> clazz, Function1 initializer) {
        this(a.c(clazz), initializer);
        AbstractC3159y.i(clazz, "clazz");
        AbstractC3159y.i(initializer, "initializer");
    }
}
