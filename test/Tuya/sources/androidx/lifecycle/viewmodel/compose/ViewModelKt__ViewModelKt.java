package androidx.lifecycle.viewmodel.compose;

import L5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import e6.InterfaceC2643c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final /* synthetic */ class ViewModelKt__ViewModelKt {
    public static final <VM extends ViewModel> VM get(ViewModelStoreOwner viewModelStoreOwner, InterfaceC2643c modelClass, String str, ViewModelProvider.Factory factory, CreationExtras extras) {
        ViewModelProvider create$default;
        AbstractC3159y.i(viewModelStoreOwner, "<this>");
        AbstractC3159y.i(modelClass, "modelClass");
        AbstractC3159y.i(extras, "extras");
        if (factory != null) {
            create$default = ViewModelProvider.Companion.create(viewModelStoreOwner.getViewModelStore(), factory, extras);
        } else if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            create$default = ViewModelProvider.Companion.create(viewModelStoreOwner.getViewModelStore(), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory(), extras);
        } else {
            create$default = ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, viewModelStoreOwner, (ViewModelProvider.Factory) null, (CreationExtras) null, 6, (Object) null);
        }
        if (str != null) {
            return (VM) create$default.get(str, modelClass);
        }
        return (VM) create$default.get(modelClass);
    }

    public static /* synthetic */ ViewModel get$default(ViewModelStoreOwner viewModelStoreOwner, InterfaceC2643c interfaceC2643c, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        if ((i8 & 4) != 0) {
            factory = null;
        }
        if ((i8 & 8) != 0) {
            if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
        }
        return ViewModelKt.get(viewModelStoreOwner, interfaceC2643c, str, factory, creationExtras);
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i8, int i9) {
        CreationExtras creationExtras2;
        composer.startReplaceableGroup(1729797275);
        if ((i9 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        String str2 = (i9 & 2) != 0 ? null : str;
        ViewModelProvider.Factory factory2 = (i9 & 4) != 0 ? null : factory;
        if ((i9 & 8) != 0) {
            if (viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory) {
                creationExtras2 = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras();
            } else {
                creationExtras2 = CreationExtras.Empty.INSTANCE;
            }
            creationExtras = creationExtras2;
        }
        AbstractC3159y.n(4, "VM");
        VM vm = (VM) ViewModelKt.viewModel(U.b(ViewModel.class), viewModelStoreOwner2, str2, factory2, creationExtras, composer, (i8 << 3) & 65520, 0);
        composer.endReplaceableGroup();
        return vm;
    }

    @Composable
    public static final <VM extends ViewModel> VM viewModel(InterfaceC2643c modelClass, ViewModelStoreOwner viewModelStoreOwner, String str, ViewModelProvider.Factory factory, CreationExtras creationExtras, Composer composer, int i8, int i9) {
        AbstractC3159y.i(modelClass, "modelClass");
        composer.startReplaceableGroup(1673618944);
        if ((i9 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i9 & 4) != 0) {
            str = null;
        }
        if ((i9 & 8) != 0) {
            factory = null;
        }
        if ((i9 & 16) != 0) {
            if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = CreationExtras.Empty.INSTANCE;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1673618944, i8, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:102)");
        }
        VM vm = (VM) ViewModelKt.get(viewModelStoreOwner, modelClass, str, factory, creationExtras);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vm;
    }

    @Composable
    public static final /* synthetic */ <VM extends ViewModel> VM viewModel(ViewModelStoreOwner viewModelStoreOwner, String str, Function1 initializer, Composer composer, int i8, int i9) {
        CreationExtras creationExtras;
        AbstractC3159y.i(initializer, "initializer");
        composer.startReplaceableGroup(419377738);
        if ((i9 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i9 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        AbstractC3159y.n(4, "VM");
        InterfaceC2643c b8 = U.b(ViewModel.class);
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        AbstractC3159y.n(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(U.b(ViewModel.class), initializer);
        I i10 = I.f6487a;
        ViewModelProvider.Factory build = initializerViewModelFactoryBuilder.build();
        if (viewModelStoreOwner2 instanceof HasDefaultViewModelProviderFactory) {
            creationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras();
        } else {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        VM vm = (VM) ViewModelKt.viewModel(b8, viewModelStoreOwner2, str2, build, creationExtras, composer, (i8 << 3) & PointerIconCompat.TYPE_TEXT, 0);
        composer.endReplaceableGroup();
        return vm;
    }
}
