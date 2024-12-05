package j2;

import com.stripe.android.model.o;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3151p;

/* renamed from: j2.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3066f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32971a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f32972b = 8;

    /* renamed from: c, reason: collision with root package name */
    private static final TimeUnit f32973c = TimeUnit.SECONDS;

    /* renamed from: d, reason: collision with root package name */
    private static final long f32974d = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: j2.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final AbstractC3066f a() {
            b();
            throw new IllegalStateException("Attempted to get instance of CustomerSession without initialization.".toString());
        }

        public final AbstractC3066f b() {
            AbstractC3066f.a();
            return null;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: j2.f$b */
    /* loaded from: classes4.dex */
    public interface b {
    }

    public static final /* synthetic */ AbstractC3066f a() {
        return null;
    }

    public static /* synthetic */ void b(AbstractC3066f abstractC3066f, o.p pVar, Integer num, String str, String str2, Set set, b bVar, int i8, Object obj) {
        throw null;
    }
}
