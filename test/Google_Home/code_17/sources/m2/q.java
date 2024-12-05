package m2;

import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.InterfaceC2656o;
import com.stripe.android.view.InterfaceC2658p;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import i3.C2978a;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface q extends InterfaceC2656o {

    /* loaded from: classes4.dex */
    public static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2658p f35034a;

        /* renamed from: b, reason: collision with root package name */
        private final C2978a f35035b;

        public a(InterfaceC2658p host, C2978a defaultReturnUrl) {
            AbstractC3255y.i(host, "host");
            AbstractC3255y.i(defaultReturnUrl, "defaultReturnUrl");
            this.f35034a = host;
            this.f35035b = defaultReturnUrl;
        }

        @Override // com.stripe.android.view.InterfaceC2656o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentBrowserAuthContract.a args) {
            Class cls;
            AbstractC3255y.i(args, "args");
            Bundle J8 = PaymentBrowserAuthContract.a.b(args, null, 0, null, null, null, false, null, null, false, false, this.f35034a.a(), null, false, null, false, 31743, null).J();
            if (!args.z(this.f35035b) && !args.H()) {
                cls = PaymentAuthWebViewActivity.class;
            } else {
                cls = StripeBrowserLauncherActivity.class;
            }
            this.f35034a.b(cls, J8, args.p());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityResultLauncher f35036a;

        public b(ActivityResultLauncher launcher) {
            AbstractC3255y.i(launcher, "launcher");
            this.f35036a = launcher;
        }

        @Override // com.stripe.android.view.InterfaceC2656o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(PaymentBrowserAuthContract.a args) {
            AbstractC3255y.i(args, "args");
            this.f35036a.launch(args);
        }
    }
}
