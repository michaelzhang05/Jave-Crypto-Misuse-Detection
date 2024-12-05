package j2;

import e3.C2582d;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;
import x2.AbstractC3863A;
import x2.C3870H;

/* renamed from: j2.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3070j {

    /* renamed from: a, reason: collision with root package name */
    private static final Function0 f32995a;

    /* renamed from: b, reason: collision with root package name */
    private static final c3.r f32996b;

    /* renamed from: j2.j$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32997a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(Calendar.getInstance().getTimeInMillis());
        }
    }

    static {
        a aVar = a.f32997a;
        f32995a = aVar;
        f32996b = new c3.r(aVar);
    }

    public static final /* synthetic */ C2582d a(C3870H c3870h) {
        return c(c3870h);
    }

    public static final /* synthetic */ Function0 b() {
        return f32995a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2582d c(C3870H c3870h) {
        if (!c3870h.f()) {
            c3870h = null;
        }
        if (c3870h == null) {
            return null;
        }
        return f32996b.a(AbstractC3863A.a(c3870h));
    }
}
