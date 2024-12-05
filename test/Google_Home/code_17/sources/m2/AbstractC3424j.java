package m2;

import h3.C2902d;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: m2.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3424j {

    /* renamed from: a, reason: collision with root package name */
    private static final Function0 f34971a;

    /* renamed from: b, reason: collision with root package name */
    private static final f3.r f34972b;

    /* renamed from: m2.j$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34973a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(Calendar.getInstance().getTimeInMillis());
        }
    }

    static {
        a aVar = a.f34973a;
        f34971a = aVar;
        f34972b = new f3.r(aVar);
    }

    public static final /* synthetic */ C2902d a(A2.H h8) {
        return c(h8);
    }

    public static final /* synthetic */ Function0 b() {
        return f34971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2902d c(A2.H h8) {
        if (!h8.f()) {
            h8 = null;
        }
        if (h8 == null) {
            return null;
        }
        return f34972b.a(A2.A.a(h8));
    }
}
