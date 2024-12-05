package g3;

import L5.q;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import g3.C2715d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: g3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2715d implements InterfaceC2716e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f31204d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f31205e = 8;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityResultLauncher f31206b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31207c;

    /* renamed from: g3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function1 callback, com.stripe.android.payments.bankaccount.navigation.d dVar) {
            AbstractC3159y.i(callback, "$callback");
            AbstractC3159y.f(dVar);
            callback.invoke(com.stripe.android.payments.bankaccount.navigation.b.a(dVar));
        }

        public final InterfaceC2716e b(String hostedSurface, ActivityResultRegistryOwner activityResultRegistryOwner, final Function1 callback) {
            AbstractC3159y.i(hostedSurface, "hostedSurface");
            AbstractC3159y.i(activityResultRegistryOwner, "activityResultRegistryOwner");
            AbstractC3159y.i(callback, "callback");
            ActivityResultLauncher register = activityResultRegistryOwner.getActivityResultRegistry().register("CollectBankAccountForInstantDebitsLauncher", new CollectBankAccountContract(), new ActivityResultCallback() { // from class: g3.c
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    C2715d.a.c(Function1.this, (com.stripe.android.payments.bankaccount.navigation.d) obj);
                }
            });
            AbstractC3159y.f(register);
            return new C2715d(register, hostedSurface);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C2715d(ActivityResultLauncher hostActivityLauncher, String str) {
        AbstractC3159y.i(hostActivityLauncher, "hostActivityLauncher");
        this.f31206b = hostActivityLauncher;
        this.f31207c = str;
    }

    @Override // g3.InterfaceC2716e
    public void a(String publishableKey, String str, String clientSecret, InterfaceC2712a configuration) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(clientSecret, "clientSecret");
        AbstractC3159y.i(configuration, "configuration");
        this.f31206b.launch(new CollectBankAccountContract.a.d(publishableKey, str, clientSecret, configuration, true, this.f31207c));
    }

    @Override // g3.InterfaceC2716e
    public void b(String publishableKey, String str, InterfaceC2712a configuration, String elementsSessionId, String str2, String str3) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(elementsSessionId, "elementsSessionId");
        throw new q("An operation is not implemented: Instant Debits do not support deferred payments yet");
    }

    @Override // g3.InterfaceC2716e
    public void c(String publishableKey, String str, String clientSecret, InterfaceC2712a configuration) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(clientSecret, "clientSecret");
        AbstractC3159y.i(configuration, "configuration");
        this.f31206b.launch(new CollectBankAccountContract.a.e(publishableKey, str, clientSecret, configuration, true, this.f31207c));
    }

    @Override // g3.InterfaceC2716e
    public void d(String publishableKey, String str, InterfaceC2712a configuration, String elementsSessionId, String str2, String str3, Integer num, String str4) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(elementsSessionId, "elementsSessionId");
        throw new q("An operation is not implemented: Instant Debits do not support deferred payments yet");
    }

    @Override // g3.InterfaceC2716e
    public void unregister() {
        this.f31206b.unregister();
    }
}
