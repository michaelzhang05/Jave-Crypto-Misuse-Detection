package g3;

import L5.InterfaceC1223g;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.InterfaceC3153s;

/* renamed from: g3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2716e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31208a = a.f31209a;

    /* renamed from: g3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f31209a = new a();

        private a() {
        }

        public final InterfaceC2716e a(String hostedSurface, ActivityResultRegistryOwner activityResultRegistryOwner, Function1 callback) {
            AbstractC3159y.i(hostedSurface, "hostedSurface");
            AbstractC3159y.i(activityResultRegistryOwner, "activityResultRegistryOwner");
            AbstractC3159y.i(callback, "callback");
            ActivityResultLauncher register = activityResultRegistryOwner.getActivityResultRegistry().register("CollectBankAccountLauncher", new CollectBankAccountContract(), new b(callback));
            AbstractC3159y.f(register);
            return new C2713b(register, hostedSurface);
        }
    }

    /* renamed from: g3.e$b */
    /* loaded from: classes4.dex */
    static final class b implements ActivityResultCallback, InterfaceC3153s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f31210a;

        b(Function1 function) {
            AbstractC3159y.i(function, "function");
            this.f31210a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ActivityResultCallback) || !(obj instanceof InterfaceC3153s)) {
                return false;
            }
            return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.InterfaceC3153s
        public final InterfaceC1223g getFunctionDelegate() {
            return this.f31210a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final /* synthetic */ void onActivityResult(Object obj) {
            this.f31210a.invoke(obj);
        }
    }

    void a(String str, String str2, String str3, InterfaceC2712a interfaceC2712a);

    void b(String str, String str2, InterfaceC2712a interfaceC2712a, String str3, String str4, String str5);

    void c(String str, String str2, String str3, InterfaceC2712a interfaceC2712a);

    void d(String str, String str2, InterfaceC2712a interfaceC2712a, String str3, String str4, String str5, Integer num, String str6);

    void unregister();
}
