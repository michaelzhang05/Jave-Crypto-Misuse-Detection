package androidx.fragment.app;

import L5.InterfaceC1227k;
import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStoreOwner;
import e6.InterfaceC2643c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final class FragmentViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC1227k activityViewModels(Fragment fragment, Function0 function0) {
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.n(4, "VM");
        InterfaceC2643c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, function0);
    }

    public static /* synthetic */ InterfaceC1227k activityViewModels$default(Fragment fragment, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.n(4, "VM");
        InterfaceC2643c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, function0);
    }

    @MainThread
    public static final /* synthetic */ InterfaceC1227k createViewModelLazy(Fragment fragment, InterfaceC2643c viewModelClass, Function0 storeProducer, Function0 function0) {
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.i(viewModelClass, "viewModelClass");
        AbstractC3159y.i(storeProducer, "storeProducer");
        return createViewModelLazy(fragment, viewModelClass, storeProducer, new FragmentViewModelLazyKt$createViewModelLazy$1(fragment), function0);
    }

    public static /* synthetic */ InterfaceC1227k createViewModelLazy$default(Fragment fragment, InterfaceC2643c interfaceC2643c, Function0 function0, Function0 function02, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            function02 = null;
        }
        return createViewModelLazy(fragment, interfaceC2643c, function0, function02);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC1227k viewModels(Fragment fragment, Function0 ownerProducer, Function0 function0) {
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.i(ownerProducer, "ownerProducer");
        InterfaceC1227k a8 = L5.l.a(L5.o.f6506c, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        AbstractC3159y.n(4, "VM");
        InterfaceC2643c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(a8);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(a8);
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$viewModels$4(fragment, a8);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, function0);
    }

    public static /* synthetic */ InterfaceC1227k viewModels$default(Fragment fragment, Function0 ownerProducer, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            ownerProducer = new FragmentViewModelLazyKt$viewModels$1(fragment);
        }
        if ((i8 & 2) != 0) {
            function0 = null;
        }
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.i(ownerProducer, "ownerProducer");
        InterfaceC1227k a8 = L5.l.a(L5.o.f6506c, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        AbstractC3159y.n(4, "VM");
        InterfaceC2643c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(a8);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(a8);
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$viewModels$4(fragment, a8);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-0, reason: not valid java name */
    public static final ViewModelStoreOwner m5452viewModels$lambda0(InterfaceC1227k interfaceC1227k) {
        return (ViewModelStoreOwner) interfaceC1227k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: viewModels$lambda-1, reason: not valid java name */
    public static final ViewModelStoreOwner m5453viewModels$lambda1(InterfaceC1227k interfaceC1227k) {
        return (ViewModelStoreOwner) interfaceC1227k.getValue();
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC1227k activityViewModels(Fragment fragment, Function0 function0, Function0 function02) {
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.n(4, "VM");
        InterfaceC2643c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(function0, fragment);
        if (function02 == null) {
            function02 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, function02);
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC1227k createViewModelLazy(Fragment fragment, InterfaceC2643c viewModelClass, Function0 storeProducer, Function0 extrasProducer, Function0 function0) {
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.i(viewModelClass, "viewModelClass");
        AbstractC3159y.i(storeProducer, "storeProducer");
        AbstractC3159y.i(extrasProducer, "extrasProducer");
        if (function0 == null) {
            function0 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(viewModelClass, storeProducer, function0, extrasProducer);
    }

    public static /* synthetic */ InterfaceC1227k createViewModelLazy$default(Fragment fragment, InterfaceC2643c interfaceC2643c, Function0 function0, Function0 function02, Function0 function03, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            function02 = new FragmentViewModelLazyKt$createViewModelLazy$2(fragment);
        }
        if ((i8 & 8) != 0) {
            function03 = null;
        }
        return createViewModelLazy(fragment, interfaceC2643c, function0, function02, function03);
    }

    public static /* synthetic */ InterfaceC1227k activityViewModels$default(Fragment fragment, Function0 function0, Function0 function02, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function0 = null;
        }
        if ((i8 & 2) != 0) {
            function02 = null;
        }
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.n(4, "VM");
        InterfaceC2643c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(function0, fragment);
        if (function02 == null) {
            function02 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, function02);
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC1227k viewModels(Fragment fragment, Function0 ownerProducer, Function0 function0, Function0 function02) {
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.i(ownerProducer, "ownerProducer");
        InterfaceC1227k a8 = L5.l.a(L5.o.f6506c, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        AbstractC3159y.n(4, "VM");
        InterfaceC2643c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(a8);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(function0, a8);
        if (function02 == null) {
            function02 = new FragmentViewModelLazyKt$viewModels$8(fragment, a8);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, function02);
    }

    public static /* synthetic */ InterfaceC1227k viewModels$default(Fragment fragment, Function0 ownerProducer, Function0 function0, Function0 function02, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            ownerProducer = new FragmentViewModelLazyKt$viewModels$5(fragment);
        }
        if ((i8 & 2) != 0) {
            function0 = null;
        }
        if ((i8 & 4) != 0) {
            function02 = null;
        }
        AbstractC3159y.i(fragment, "<this>");
        AbstractC3159y.i(ownerProducer, "ownerProducer");
        InterfaceC1227k a8 = L5.l.a(L5.o.f6506c, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        AbstractC3159y.n(4, "VM");
        InterfaceC2643c b8 = U.b(ViewModel.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(a8);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(function0, a8);
        if (function02 == null) {
            function02 = new FragmentViewModelLazyKt$viewModels$8(fragment, a8);
        }
        return createViewModelLazy(fragment, b8, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, function02);
    }
}
