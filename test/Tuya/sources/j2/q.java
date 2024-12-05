package j2;

import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.InterfaceC2462o;
import com.stripe.android.view.InterfaceC2464p;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import f3.C2660a;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface q extends InterfaceC2462o {

    /* loaded from: classes4.dex */
    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2464p f33058a;

        /* renamed from: b, reason: collision with root package name */
        private final C2660a f33059b;

        public a(InterfaceC2464p host, C2660a defaultReturnUrl) {
            AbstractC3159y.i(host, "host");
            AbstractC3159y.i(defaultReturnUrl, "defaultReturnUrl");
            this.f33058a = host;
            this.f33059b = defaultReturnUrl;
        }

        @Override // com.stripe.android.view.InterfaceC2462o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentBrowserAuthContract.a args) {
            Class cls;
            AbstractC3159y.i(args, "args");
            Bundle Q8 = PaymentBrowserAuthContract.a.c(args, null, 0, null, null, null, false, null, null, false, false, this.f33058a.b(), null, false, null, false, 31743, null).Q();
            if (!args.I(this.f33059b) && !args.L()) {
                cls = PaymentAuthWebViewActivity.class;
            } else {
                cls = StripeBrowserLauncherActivity.class;
            }
            this.f33058a.a(cls, Q8, args.k());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityResultLauncher f33060a;

        public b(ActivityResultLauncher launcher) {
            AbstractC3159y.i(launcher, "launcher");
            this.f33060a = launcher;
        }

        @Override // com.stripe.android.view.InterfaceC2462o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentBrowserAuthContract.a args) {
            AbstractC3159y.i(args, "args");
            this.f33060a.launch(args);
        }
    }
}
