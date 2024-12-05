package n3;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.a;
import com.stripe.android.view.InterfaceC2464p;
import f3.C2660a;
import j2.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l3.C3171a;
import t5.InterfaceC3795a;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36110a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: n3.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0831a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3795a f36111a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2660a f36112b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0831a(InterfaceC3795a interfaceC3795a, C2660a c2660a) {
                super(1);
                this.f36111a = interfaceC3795a;
                this.f36112b = c2660a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j2.q invoke(InterfaceC2464p host) {
                AbstractC3159y.i(host, "host");
                ActivityResultLauncher f8 = ((C3171a) this.f36111a.get()).f();
                if (f8 != null) {
                    return new q.b(f8);
                }
                return new q.a(host, this.f36112b);
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC3795a f36113a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC3795a interfaceC3795a) {
                super(1);
                this.f36113a = interfaceC3795a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.a invoke(InterfaceC2464p host) {
                AbstractC3159y.i(host, "host");
                ActivityResultLauncher g8 = ((C3171a) this.f36113a.get()).g();
                if (g8 != null) {
                    return new a.c(g8);
                }
                return new a.b(host);
            }
        }

        private a() {
        }

        public final C2660a a(Context context) {
            AbstractC3159y.i(context, "context");
            return C2660a.f31009b.a(context);
        }

        public final Function1 b(InterfaceC3795a lazyRegistry, C2660a defaultReturnUrl) {
            AbstractC3159y.i(lazyRegistry, "lazyRegistry");
            AbstractC3159y.i(defaultReturnUrl, "defaultReturnUrl");
            return new C0831a(lazyRegistry, defaultReturnUrl);
        }

        public final Function1 c(InterfaceC3795a lazyRegistry) {
            AbstractC3159y.i(lazyRegistry, "lazyRegistry");
            return new b(lazyRegistry);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }
}
