package q3;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.a;
import com.stripe.android.view.InterfaceC2658p;
import i3.C2978a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.q;
import o3.C3519a;
import w5.InterfaceC4149a;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38238a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: q3.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0861a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC4149a f38239a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2978a f38240b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0861a(InterfaceC4149a interfaceC4149a, C2978a c2978a) {
                super(1);
                this.f38239a = interfaceC4149a;
                this.f38240b = c2978a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m2.q invoke(InterfaceC2658p host) {
                AbstractC3255y.i(host, "host");
                ActivityResultLauncher f8 = ((C3519a) this.f38239a.get()).f();
                if (f8 != null) {
                    return new q.b(f8);
                }
                return new q.a(host, this.f38240b);
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC4149a f38241a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC4149a interfaceC4149a) {
                super(1);
                this.f38241a = interfaceC4149a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.a invoke(InterfaceC2658p host) {
                AbstractC3255y.i(host, "host");
                ActivityResultLauncher g8 = ((C3519a) this.f38241a.get()).g();
                if (g8 != null) {
                    return new a.c(g8);
                }
                return new a.b(host);
            }
        }

        private a() {
        }

        public final C2978a a(Context context) {
            AbstractC3255y.i(context, "context");
            return C2978a.f32872b.a(context);
        }

        public final Function1 b(InterfaceC4149a lazyRegistry, C2978a defaultReturnUrl) {
            AbstractC3255y.i(lazyRegistry, "lazyRegistry");
            AbstractC3255y.i(defaultReturnUrl, "defaultReturnUrl");
            return new C0861a(lazyRegistry, defaultReturnUrl);
        }

        public final Function1 c(InterfaceC4149a lazyRegistry) {
            AbstractC3255y.i(lazyRegistry, "lazyRegistry");
            return new b(lazyRegistry);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }
}
