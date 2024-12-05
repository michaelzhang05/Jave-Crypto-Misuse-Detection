package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, Function1 initializer) {
        AbstractC3255y.i(initializerViewModelFactoryBuilder, "<this>");
        AbstractC3255y.i(initializer, "initializer");
        AbstractC3255y.n(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(U.b(ViewModel.class), initializer);
    }

    public static final ViewModelProvider.Factory viewModelFactory(Function1 builder) {
        AbstractC3255y.i(builder, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        builder.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
