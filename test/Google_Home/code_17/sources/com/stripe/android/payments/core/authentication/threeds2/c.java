package com.stripe.android.payments.core.authentication.threeds2;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.view.InterfaceC2656o;
import com.stripe.android.view.InterfaceC2658p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface c extends InterfaceC2656o {

    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2658p f26266a;

        public a(InterfaceC2658p host) {
            AbstractC3255y.i(host, "host");
            this.f26266a = host;
        }

        @Override // com.stripe.android.view.InterfaceC2656o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Stripe3ds2TransactionContract.a args) {
            AbstractC3255y.i(args, "args");
            this.f26266a.b(Stripe3ds2TransactionActivity.class, args.w(), com.stripe.android.b.f24521q.b(args.v()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityResultLauncher f26267a;

        public b(ActivityResultLauncher launcher) {
            AbstractC3255y.i(launcher, "launcher");
            this.f26267a = launcher;
        }

        @Override // com.stripe.android.view.InterfaceC2656o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Stripe3ds2TransactionContract.a args) {
            AbstractC3255y.i(args, "args");
            this.f26267a.launch(args);
        }
    }
}
