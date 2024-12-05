package j3;

import O5.q;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import j3.C3192d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: j3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3192d implements InterfaceC3193e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f33931d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f33932e = 8;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityResultLauncher f33933b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33934c;

    /* renamed from: j3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function1 callback, com.stripe.android.payments.bankaccount.navigation.d dVar) {
            AbstractC3255y.i(callback, "$callback");
            AbstractC3255y.f(dVar);
            callback.invoke(com.stripe.android.payments.bankaccount.navigation.b.a(dVar));
        }

        public final InterfaceC3193e b(String hostedSurface, ActivityResultRegistryOwner activityResultRegistryOwner, final Function1 callback) {
            AbstractC3255y.i(hostedSurface, "hostedSurface");
            AbstractC3255y.i(activityResultRegistryOwner, "activityResultRegistryOwner");
            AbstractC3255y.i(callback, "callback");
            ActivityResultLauncher register = activityResultRegistryOwner.getActivityResultRegistry().register("CollectBankAccountForInstantDebitsLauncher", new CollectBankAccountContract(), new ActivityResultCallback() { // from class: j3.c
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    C3192d.a.c(Function1.this, (com.stripe.android.payments.bankaccount.navigation.d) obj);
                }
            });
            AbstractC3255y.f(register);
            return new C3192d(register, hostedSurface);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C3192d(ActivityResultLauncher hostActivityLauncher, String str) {
        AbstractC3255y.i(hostActivityLauncher, "hostActivityLauncher");
        this.f33933b = hostActivityLauncher;
        this.f33934c = str;
    }

    @Override // j3.InterfaceC3193e
    public void a(String publishableKey, String str, String clientSecret, InterfaceC3189a configuration) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(clientSecret, "clientSecret");
        AbstractC3255y.i(configuration, "configuration");
        this.f33933b.launch(new CollectBankAccountContract.a.d(publishableKey, str, clientSecret, configuration, true, this.f33934c));
    }

    @Override // j3.InterfaceC3193e
    public void b(String publishableKey, String str, InterfaceC3189a configuration, String elementsSessionId, String str2, String str3) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(elementsSessionId, "elementsSessionId");
        throw new q("An operation is not implemented: Instant Debits do not support deferred payments yet");
    }

    @Override // j3.InterfaceC3193e
    public void c(String publishableKey, String str, InterfaceC3189a configuration, String elementsSessionId, String str2, String str3, Integer num, String str4) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(elementsSessionId, "elementsSessionId");
        throw new q("An operation is not implemented: Instant Debits do not support deferred payments yet");
    }

    @Override // j3.InterfaceC3193e
    public void d(String publishableKey, String str, String clientSecret, InterfaceC3189a configuration) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(clientSecret, "clientSecret");
        AbstractC3255y.i(configuration, "configuration");
        this.f33933b.launch(new CollectBankAccountContract.a.e(publishableKey, str, clientSecret, configuration, true, this.f33934c));
    }

    @Override // j3.InterfaceC3193e
    public void unregister() {
        this.f33933b.unregister();
    }
}
