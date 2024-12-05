package g3;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2713b implements InterfaceC2716e {

    /* renamed from: b, reason: collision with root package name */
    private final ActivityResultLauncher f31201b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31202c;

    public C2713b(ActivityResultLauncher hostActivityLauncher, String str) {
        AbstractC3159y.i(hostActivityLauncher, "hostActivityLauncher");
        this.f31201b = hostActivityLauncher;
        this.f31202c = str;
    }

    @Override // g3.InterfaceC2716e
    public void a(String publishableKey, String str, String clientSecret, InterfaceC2712a configuration) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(clientSecret, "clientSecret");
        AbstractC3159y.i(configuration, "configuration");
        this.f31201b.launch(new CollectBankAccountContract.a.d(publishableKey, str, clientSecret, configuration, true, this.f31202c));
    }

    @Override // g3.InterfaceC2716e
    public void b(String publishableKey, String str, InterfaceC2712a configuration, String elementsSessionId, String str2, String str3) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(elementsSessionId, "elementsSessionId");
        this.f31201b.launch(new CollectBankAccountContract.a.c(publishableKey, str, configuration, this.f31202c, elementsSessionId, str2, str3));
    }

    @Override // g3.InterfaceC2716e
    public void c(String publishableKey, String str, String clientSecret, InterfaceC2712a configuration) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(clientSecret, "clientSecret");
        AbstractC3159y.i(configuration, "configuration");
        this.f31201b.launch(new CollectBankAccountContract.a.e(publishableKey, str, clientSecret, configuration, true, this.f31202c));
    }

    @Override // g3.InterfaceC2716e
    public void d(String publishableKey, String str, InterfaceC2712a configuration, String elementsSessionId, String str2, String str3, Integer num, String str4) {
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(elementsSessionId, "elementsSessionId");
        this.f31201b.launch(new CollectBankAccountContract.a.b(publishableKey, str, configuration, this.f31202c, elementsSessionId, str2, str3, num, str4));
    }

    @Override // g3.InterfaceC2716e
    public void unregister() {
        this.f31201b.unregister();
    }
}
