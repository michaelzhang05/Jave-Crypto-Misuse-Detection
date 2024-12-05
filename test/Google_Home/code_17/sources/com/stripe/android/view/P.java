package com.stripe.android.view;

import a6.InterfaceC1668n;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.stripe.android.view.O;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class P {
    public static final void a(View view, ViewModelStoreOwner viewModelStoreOwner, InterfaceC1668n action) {
        AbstractC3255y.i(view, "<this>");
        AbstractC3255y.i(action, "action");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        if (viewModelStoreOwner == null) {
            viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(view);
        }
        if (lifecycleOwner != null && viewModelStoreOwner != null) {
            Context applicationContext = view.getContext().getApplicationContext();
            AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
            action.invoke(lifecycleOwner, (O) new ViewModelProvider(viewModelStoreOwner, new O.a(applicationContext)).get(O.class));
        }
    }
}
