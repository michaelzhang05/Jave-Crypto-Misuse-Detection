package com.stripe.android.paymentsheet.addresselement;

import L5.I;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import com.stripe.android.paymentsheet.addresselement.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0587a f25569c = new C0587a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f25570d = 8;

    /* renamed from: a, reason: collision with root package name */
    private NavHostController f25571a;

    /* renamed from: b, reason: collision with root package name */
    private Function1 f25572b;

    /* renamed from: com.stripe.android.paymentsheet.addresselement.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0587a {
        private C0587a() {
        }

        public /* synthetic */ C0587a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public static /* synthetic */ void b(a aVar, d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            dVar = d.a.f25582a;
        }
        aVar.a(dVar);
    }

    public final void a(d result) {
        AbstractC3159y.i(result, "result");
        Function1 function1 = this.f25572b;
        if (function1 != null) {
            function1.invoke(result);
        }
    }

    public final InterfaceC3358f c(String key) {
        NavBackStackEntry currentBackStackEntry;
        AbstractC3159y.i(key, "key");
        NavHostController navHostController = this.f25571a;
        if (navHostController == null || (currentBackStackEntry = navHostController.getCurrentBackStackEntry()) == null) {
            return null;
        }
        return AbstractC3360h.t(currentBackStackEntry.getSavedStateHandle().getStateFlow(key, null));
    }

    public final I d(b target) {
        AbstractC3159y.i(target, "target");
        NavHostController navHostController = this.f25571a;
        if (navHostController != null) {
            NavController.navigate$default(navHostController, target.a(), null, null, 6, null);
            return I.f6487a;
        }
        return null;
    }

    public final void e() {
        NavHostController navHostController = this.f25571a;
        if (navHostController != null && !navHostController.popBackStack()) {
            b(this, null, 1, null);
        }
    }

    public final void f(NavHostController navHostController) {
        this.f25571a = navHostController;
    }

    public final void g(Function1 function1) {
        this.f25572b = function1;
    }

    public final I h(String key, Object obj) {
        NavBackStackEntry previousBackStackEntry;
        SavedStateHandle savedStateHandle;
        AbstractC3159y.i(key, "key");
        NavHostController navHostController = this.f25571a;
        if (navHostController != null && (previousBackStackEntry = navHostController.getPreviousBackStackEntry()) != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set(key, obj);
            return I.f6487a;
        }
        return null;
    }
}
