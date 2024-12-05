package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.stripe.android.model.o;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;
import m2.AbstractC3408F;

/* renamed from: com.stripe.android.view.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2631b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28704a;

    /* renamed from: b, reason: collision with root package name */
    private final C0 f28705b;

    /* renamed from: c, reason: collision with root package name */
    private final C2671z f28706c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f28707d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f28708e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f28709f;

    public C2631b0(Context context, C0 adapter, C2671z cardDisplayTextFactory, Object obj, Set productUsage, Function1 onDeletedPaymentMethodCallback) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(adapter, "adapter");
        AbstractC3255y.i(cardDisplayTextFactory, "cardDisplayTextFactory");
        AbstractC3255y.i(productUsage, "productUsage");
        AbstractC3255y.i(onDeletedPaymentMethodCallback, "onDeletedPaymentMethodCallback");
        this.f28704a = context;
        this.f28705b = adapter;
        this.f28706c = cardDisplayTextFactory;
        this.f28707d = obj;
        this.f28708e = productUsage;
        this.f28709f = onDeletedPaymentMethodCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C2631b0 this$0, com.stripe.android.model.o paymentMethod, DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(paymentMethod, "$paymentMethod");
        this$0.h(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C2631b0 this$0, com.stripe.android.model.o paymentMethod, DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(paymentMethod, "$paymentMethod");
        this$0.f28705b.x(paymentMethod);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C2631b0 this$0, com.stripe.android.model.o paymentMethod, DialogInterface dialogInterface) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(paymentMethod, "$paymentMethod");
        this$0.f28705b.x(paymentMethod);
    }

    public final /* synthetic */ AlertDialog d(final com.stripe.android.model.o paymentMethod) {
        String str;
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        o.g gVar = paymentMethod.f25470h;
        if (gVar != null) {
            str = this.f28706c.b(gVar);
        } else {
            str = null;
        }
        AlertDialog create = new AlertDialog.Builder(this.f28704a, AbstractC3408F.f34896a).setTitle(AbstractC3407E.f34857g0).setMessage(str).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.Y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C2631b0.e(C2631b0.this, paymentMethod, dialogInterface, i8);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.Z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                C2631b0.f(C2631b0.this, paymentMethod, dialogInterface, i8);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.stripe.android.view.a0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C2631b0.g(C2631b0.this, paymentMethod, dialogInterface);
            }
        }).create();
        AbstractC3255y.h(create, "create(...)");
        return create;
    }

    public final /* synthetic */ void h(com.stripe.android.model.o paymentMethod) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        this.f28705b.k(paymentMethod);
        if (paymentMethod.f25463a != null) {
            Object obj = this.f28707d;
            if (O5.s.g(obj)) {
                obj = null;
            }
            android.support.v4.media.a.a(obj);
        }
        this.f28709f.invoke(paymentMethod);
    }
}
