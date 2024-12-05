package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.stripe.android.model.o;
import j2.AbstractC3053E;
import j2.AbstractC3054F;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2437b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27649a;

    /* renamed from: b, reason: collision with root package name */
    private final C0 f27650b;

    /* renamed from: c, reason: collision with root package name */
    private final C2477z f27651c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f27652d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f27653e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f27654f;

    public C2437b0(Context context, C0 adapter, C2477z cardDisplayTextFactory, Object obj, Set productUsage, Function1 onDeletedPaymentMethodCallback) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(adapter, "adapter");
        AbstractC3159y.i(cardDisplayTextFactory, "cardDisplayTextFactory");
        AbstractC3159y.i(productUsage, "productUsage");
        AbstractC3159y.i(onDeletedPaymentMethodCallback, "onDeletedPaymentMethodCallback");
        this.f27649a = context;
        this.f27650b = adapter;
        this.f27651c = cardDisplayTextFactory;
        this.f27652d = obj;
        this.f27653e = productUsage;
        this.f27654f = onDeletedPaymentMethodCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C2437b0 this$0, com.stripe.android.model.o paymentMethod, DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(paymentMethod, "$paymentMethod");
        this$0.h(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C2437b0 this$0, com.stripe.android.model.o paymentMethod, DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(paymentMethod, "$paymentMethod");
        this$0.f27650b.x(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C2437b0 this$0, com.stripe.android.model.o paymentMethod, DialogInterface dialogInterface) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(paymentMethod, "$paymentMethod");
        this$0.f27650b.x(paymentMethod);
    }

    public final /* synthetic */ AlertDialog d(final com.stripe.android.model.o paymentMethod) {
        String str;
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        o.g gVar = paymentMethod.f24415h;
        if (gVar != null) {
            str = this.f27651c.b(gVar);
        } else {
            str = null;
        }
        AlertDialog create = new AlertDialog.Builder(this.f27649a, AbstractC3054F.f32920a).setTitle(AbstractC3053E.f32881g0).setMessage(str).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.Y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C2437b0.e(C2437b0.this, paymentMethod, dialogInterface, i8);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.Z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C2437b0.f(C2437b0.this, paymentMethod, dialogInterface, i8);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.stripe.android.view.a0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C2437b0.g(C2437b0.this, paymentMethod, dialogInterface);
            }
        }).create();
        AbstractC3159y.h(create, "create(...)");
        return create;
    }

    public final /* synthetic */ void h(com.stripe.android.model.o paymentMethod) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        this.f27650b.k(paymentMethod);
        if (paymentMethod.f24408a != null) {
            Object obj = this.f27652d;
            if (L5.s.g(obj)) {
                obj = null;
            }
            android.support.v4.media.a.a(obj);
        }
        this.f27654f.invoke(paymentMethod);
    }
}
