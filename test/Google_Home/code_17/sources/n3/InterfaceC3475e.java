package n3;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.C3347b0;
import m2.r;
import u2.InterfaceC4057d;

/* renamed from: n3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3475e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35383a = a.f35384a;

    /* renamed from: n3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f35384a = new a();

        /* renamed from: n3.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0805a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f35385a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0805a(Context context) {
                super(0);
                this.f35385a = context;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f35037c.a(this.f35385a).g();
            }
        }

        private a() {
        }

        public final S5.g a() {
            return C3347b0.b();
        }

        public final InterfaceC4057d b() {
            return InterfaceC4057d.f39950a.a(false);
        }

        public final Function0 c(Context context) {
            AbstractC3255y.i(context, "context");
            return new C0805a(context);
        }
    }
}
