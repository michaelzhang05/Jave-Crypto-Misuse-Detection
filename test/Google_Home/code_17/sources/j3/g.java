package J3;

import P5.a0;
import android.app.Application;
import android.content.Context;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.r;

/* loaded from: classes4.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4920a = a.f4921a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f4921a = new a();

        /* renamed from: J3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0074a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f4922a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0074a(Context context) {
                super(0);
                this.f4922a = context;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f35037c.a(this.f4922a).g();
            }
        }

        private a() {
        }

        public final r a(Context appContext) {
            AbstractC3255y.i(appContext, "appContext");
            return r.f35037c.a(appContext);
        }

        public final Function0 b(Context appContext) {
            AbstractC3255y.i(appContext, "appContext");
            return new C0074a(appContext);
        }

        public final Context c(Application application) {
            AbstractC3255y.i(application, "application");
            return application;
        }

        public final boolean d() {
            return false;
        }

        public final Set e() {
            return a0.f();
        }
    }
}
