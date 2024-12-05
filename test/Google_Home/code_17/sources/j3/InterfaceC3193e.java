package j3;

import O5.InterfaceC1351g;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.InterfaceC3249s;

/* renamed from: j3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3193e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33935a = a.f33936a;

    /* renamed from: j3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f33936a = new a();

        private a() {
        }

        public final InterfaceC3193e a(String hostedSurface, ActivityResultRegistryOwner activityResultRegistryOwner, Function1 callback) {
            AbstractC3255y.i(hostedSurface, "hostedSurface");
            AbstractC3255y.i(activityResultRegistryOwner, "activityResultRegistryOwner");
            AbstractC3255y.i(callback, "callback");
            ActivityResultLauncher register = activityResultRegistryOwner.getActivityResultRegistry().register("CollectBankAccountLauncher", new CollectBankAccountContract(), new b(callback));
            AbstractC3255y.f(register);
            return new C3190b(register, hostedSurface);
        }
    }

    /* renamed from: j3.e$b */
    /* loaded from: classes4.dex */
    static final class b implements ActivityResultCallback, InterfaceC3249s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f33937a;

        b(Function1 function) {
            AbstractC3255y.i(function, "function");
            this.f33937a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ActivityResultCallback) || !(obj instanceof InterfaceC3249s)) {
                return false;
            }
            return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.InterfaceC3249s
        public final InterfaceC1351g getFunctionDelegate() {
            return this.f33937a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final /* synthetic */ void onActivityResult(Object obj) {
            this.f33937a.invoke(obj);
        }
    }

    void a(String str, String str2, String str3, InterfaceC3189a interfaceC3189a);

    void b(String str, String str2, InterfaceC3189a interfaceC3189a, String str3, String str4, String str5);

    void c(String str, String str2, InterfaceC3189a interfaceC3189a, String str3, String str4, String str5, Integer num, String str6);

    void d(String str, String str2, String str3, InterfaceC3189a interfaceC3189a);

    void unregister();
}
