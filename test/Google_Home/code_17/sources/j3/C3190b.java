package j3;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3190b implements InterfaceC3193e {

    /* renamed from: b, reason: collision with root package name */
    private final ActivityResultLauncher f33928b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33929c;

    public C3190b(ActivityResultLauncher hostActivityLauncher, String str) {
        AbstractC3255y.i(hostActivityLauncher, "hostActivityLauncher");
        this.f33928b = hostActivityLauncher;
        this.f33929c = str;
    }

    @Override // j3.InterfaceC3193e
    public void a(String publishableKey, String str, String clientSecret, InterfaceC3189a configuration) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(clientSecret, "clientSecret");
        AbstractC3255y.i(configuration, "configuration");
        this.f33928b.launch(new CollectBankAccountContract.a.d(publishableKey, str, clientSecret, configuration, true, this.f33929c));
    }

    @Override // j3.InterfaceC3193e
    public void b(String publishableKey, String str, InterfaceC3189a configuration, String elementsSessionId, String str2, String str3) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(elementsSessionId, "elementsSessionId");
        this.f33928b.launch(new CollectBankAccountContract.a.c(publishableKey, str, configuration, this.f33929c, elementsSessionId, str2, str3));
    }

    @Override // j3.InterfaceC3193e
    public void c(String publishableKey, String str, InterfaceC3189a configuration, String elementsSessionId, String str2, String str3, Integer num, String str4) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(elementsSessionId, "elementsSessionId");
        this.f33928b.launch(new CollectBankAccountContract.a.b(publishableKey, str, configuration, this.f33929c, elementsSessionId, str2, str3, num, str4));
    }

    @Override // j3.InterfaceC3193e
    public void d(String publishableKey, String str, String clientSecret, InterfaceC3189a configuration) {
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(clientSecret, "clientSecret");
        AbstractC3255y.i(configuration, "configuration");
        this.f33928b.launch(new CollectBankAccountContract.a.e(publishableKey, str, clientSecret, configuration, true, this.f33929c));
    }

    @Override // j3.InterfaceC3193e
    public void unregister() {
        this.f33928b.unregister();
    }
}
