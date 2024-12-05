package com.stripe.android.view;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2628a implements InterfaceC2658p {

    /* renamed from: b, reason: collision with root package name */
    private final ComponentActivity f28699b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f28700c;

    /* renamed from: d, reason: collision with root package name */
    private final LifecycleOwner f28701d;

    public C2628a(ComponentActivity activity, Integer num) {
        AbstractC3255y.i(activity, "activity");
        this.f28699b = activity;
        this.f28700c = num;
        this.f28701d = activity;
    }

    @Override // com.stripe.android.view.InterfaceC2658p
    public Integer a() {
        return this.f28700c;
    }

    @Override // com.stripe.android.view.InterfaceC2658p
    public void b(Class target, Bundle extras, int i8) {
        AbstractC3255y.i(target, "target");
        AbstractC3255y.i(extras, "extras");
        Intent putExtras = new Intent(this.f28699b, (Class<?>) target).putExtras(extras);
        AbstractC3255y.h(putExtras, "putExtras(...)");
        this.f28699b.startActivityForResult(putExtras, i8);
    }

    @Override // com.stripe.android.view.InterfaceC2658p
    public Application c() {
        Application application = this.f28699b.getApplication();
        AbstractC3255y.h(application, "getApplication(...)");
        return application;
    }

    @Override // com.stripe.android.view.InterfaceC2658p
    public LifecycleOwner d() {
        return this.f28701d;
    }
}
