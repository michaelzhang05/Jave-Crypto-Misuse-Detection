package G3;

import M5.a0;
import android.app.Application;
import android.content.Context;
import j2.r;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3201a = a.f3202a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f3202a = new a();

        /* renamed from: G3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0048a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f3203a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0048a(Context context) {
                super(0);
                this.f3203a = context;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f33061c.a(this.f3203a).e();
            }
        }

        private a() {
        }

        public final r a(Context appContext) {
            AbstractC3159y.i(appContext, "appContext");
            return r.f33061c.a(appContext);
        }

        public final Function0 b(Context appContext) {
            AbstractC3159y.i(appContext, "appContext");
            return new C0048a(appContext);
        }

        public final Context c(Application application) {
            AbstractC3159y.i(application, "application");
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
