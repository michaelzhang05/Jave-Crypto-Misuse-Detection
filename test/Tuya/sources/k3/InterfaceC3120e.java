package k3;

import android.content.Context;
import i6.C2812b0;
import j2.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import r2.InterfaceC3684d;

/* renamed from: k3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3120e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f33391a = a.f33392a;

    /* renamed from: k3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f33392a = new a();

        /* renamed from: k3.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0775a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f33393a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0775a(Context context) {
                super(0);
                this.f33393a = context;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f33061c.a(this.f33393a).e();
            }
        }

        private a() {
        }

        public final P5.g a() {
            return C2812b0.b();
        }

        public final InterfaceC3684d b() {
            return InterfaceC3684d.f37570a.a(false);
        }

        public final Function0 c(Context context) {
            AbstractC3159y.i(context, "context");
            return new C0775a(context);
        }
    }
}
