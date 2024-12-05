package androidx.fragment.app;

import O5.InterfaceC1355k;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStoreOwner;
import h6.InterfaceC2963c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC1355k activityViewModels(Fragment fragment, Function0 function0) {
        AbstractC3255y.i(fragment, "<this>");
        AbstractC3255y.n(4, "VM");
        InterfaceC2963c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, function0);
    }

    public static /* synthetic */ InterfaceC1355k activityViewModels$default(Fragment fragment, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        AbstractC3255y.i(fragment, "<this>");
        AbstractC3255y.n(4, "VM");
        InterfaceC2963c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, function0);
    }

    @MainThread
    public static final /* synthetic */ InterfaceC1355k createViewModelLazy(Fragment fragment, InterfaceC2963c viewModelClass, Function0 storeProducer, Function0 function0) {
        AbstractC3255y.i(fragment, "<this>");
        AbstractC3255y.i(viewModelClass, "viewModelClass");
        AbstractC3255y.i(storeProducer, "storeProducer");
        return createViewModelLazy(fragment, viewModelClass, storeProducer, new FragmentViewModelLazyKt$createViewModelLazy$1(fragment), function0);
    }

    public static /* synthetic */ InterfaceC1355k createViewModelLazy$default(Fragment fragment, InterfaceC2963c interfaceC2963c, Function0 function0, Function0 function02, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            function02 = null;
        }
        return createViewModelLazy(fragment, interfaceC2963c, function0, function02);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC1355k viewModels(Fragment fragment, Function0 ownerProducer, Function0 function0) {
        AbstractC3255y.i(fragment, "<this>");
        AbstractC3255y.i(ownerProducer, "ownerProducer");
        InterfaceC1355k a8 = O5.l.a(O5.o.f8297c, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        AbstractC3255y.n(4, "VM");
        InterfaceC2963c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(a8);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(a8);
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$viewModels$4(fragment, a8);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, function0);
    }

    public static /* synthetic */ InterfaceC1355k viewModels$default(Fragment fragment, Function0 ownerProducer, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            ownerProducer = new FragmentViewModelLazyKt$viewModels$1(fragment);
        }
        if ((i8 & 2) != 0) {
            function0 = null;
        }
        AbstractC3255y.i(fragment, "<this>");
        AbstractC3255y.i(ownerProducer, "ownerProducer");
        InterfaceC1355k a8 = O5.l.a(O5.o.f8297c, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        AbstractC3255y.n(4, "VM");
        InterfaceC2963c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(a8);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(a8);
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$viewModels$4(fragment, a8);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m5457viewModels$lambda0(InterfaceC1355k interfaceC1355k) {
        return (ViewModelStoreOwner) interfaceC1355k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m5458viewModels$lambda1(InterfaceC1355k interfaceC1355k) {
        return (ViewModelStoreOwner) interfaceC1355k.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC1355k activityViewModels(Fragment fragment, Function0 function0, Function0 function02) {
        AbstractC3255y.i(fragment, "<this>");
        AbstractC3255y.n(4, "VM");
        InterfaceC2963c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(function0, fragment);
        if (function02 == null) {
            function02 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, function02);
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1355k createViewModelLazy(Fragment fragment, InterfaceC2963c viewModelClass, Function0 storeProducer, Function0 extrasProducer, Function0 function0) {
        AbstractC3255y.i(fragment, "<this>");
        AbstractC3255y.i(viewModelClass, "viewModelClass");
        AbstractC3255y.i(storeProducer, "storeProducer");
        AbstractC3255y.i(extrasProducer, "extrasProducer");
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(viewModelClass, storeProducer, function0, extrasProducer);
    }

    public static /* synthetic */ InterfaceC1355k createViewModelLazy$default(Fragment fragment, InterfaceC2963c interfaceC2963c, Function0 function0, Function0 function02, Function0 function03, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            function02 = new FragmentViewModelLazyKt$createViewModelLazy$2(fragment);
        }
        if ((i8 & 8) != 0) {
            function03 = null;
        }
        return createViewModelLazy(fragment, interfaceC2963c, function0, function02, function03);
    }

    public static /* synthetic */ InterfaceC1355k activityViewModels$default(Fragment fragment, Function0 function0, Function0 function02, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        if ((i8 & 2) != 0) {
            function02 = null;
        }
        AbstractC3255y.i(fragment, "<this>");
        AbstractC3255y.n(4, "VM");
        InterfaceC2963c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(function0, fragment);
        if (function02 == null) {
            function02 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, function02);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC1355k viewModels(Fragment fragment, Function0 ownerProducer, Function0 function0, Function0 function02) {
        AbstractC3255y.i(fragment, "<this>");
        AbstractC3255y.i(ownerProducer, "ownerProducer");
        InterfaceC1355k a8 = O5.l.a(O5.o.f8297c, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        AbstractC3255y.n(4, "VM");
        InterfaceC2963c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(a8);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(function0, a8);
        if (function02 == null) {
            function02 = new FragmentViewModelLazyKt$viewModels$8(fragment, a8);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, function02);
    }

    public static /* synthetic */ InterfaceC1355k viewModels$default(Fragment fragment, Function0 ownerProducer, Function0 function0, Function0 function02, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            ownerProducer = new FragmentViewModelLazyKt$viewModels$5(fragment);
        }
        if ((i8 & 2) != 0) {
            function0 = null;
        }
        if ((i8 & 4) != 0) {
            function02 = null;
        }
        AbstractC3255y.i(fragment, "<this>");
        AbstractC3255y.i(ownerProducer, "ownerProducer");
        InterfaceC1355k a8 = O5.l.a(O5.o.f8297c, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        AbstractC3255y.n(4, "VM");
        InterfaceC2963c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(a8);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(function0, a8);
        if (function02 == null) {
            function02 = new FragmentViewModelLazyKt$viewModels$8(fragment, a8);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, function02);
    }
}
