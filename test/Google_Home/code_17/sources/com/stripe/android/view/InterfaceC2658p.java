package com.stripe.android.view;

import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2658p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28950a = a.f28951a;

    /* renamed from: com.stripe.android.view.p$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f28951a = new a();

        private a() {
        }

        public static /* synthetic */ InterfaceC2658p b(a aVar, ComponentActivity componentActivity, Integer num, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                Window window = componentActivity.getWindow();
                if (window != null) {
                    num = Integer.valueOf(window.getStatusBarColor());
                } else {
                    num = null;
                }
            }
            return aVar.a(componentActivity, num);
        }

        public final /* synthetic */ InterfaceC2658p a(ComponentActivity activity, Integer num) {
            AbstractC3255y.i(activity, "activity");
            return new C2628a(activity, num);
        }
    }

    Integer a();

    void b(Class cls, Bundle bundle, int i8);

    Application c();

    LifecycleOwner d();
}
