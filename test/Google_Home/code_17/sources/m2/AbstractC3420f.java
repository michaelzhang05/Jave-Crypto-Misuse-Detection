package m2;

import com.stripe.android.model.o;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3247p;

/* renamed from: m2.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3420f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34947a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f34948b = 8;

    /* renamed from: c, reason: collision with root package name */
    private static final TimeUnit f34949c = TimeUnit.SECONDS;

    /* renamed from: d, reason: collision with root package name */
    private static final long f34950d = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: m2.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final AbstractC3420f a() {
            b();
            throw new IllegalStateException("Attempted to get instance of CustomerSession without initialization.".toString());
        }

        public final AbstractC3420f b() {
            AbstractC3420f.a();
            return null;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: m2.f$b */
    /* loaded from: classes4.dex */
    public interface b {
    }

    public static final /* synthetic */ AbstractC3420f a() {
        return null;
    }

    public static /* synthetic */ void b(AbstractC3420f abstractC3420f, o.p pVar, Integer num, String str, String str2, Set set, b bVar, int i8, Object obj) {
        throw null;
    }
}
