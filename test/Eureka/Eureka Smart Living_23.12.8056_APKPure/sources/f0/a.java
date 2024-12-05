package f0;

import f5.h;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6574a = new LinkedHashMap();

    /* renamed from: f0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0099a extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0099a f6575b = new C0099a();

        private C0099a() {
        }

        @Override // f0.a
        public Object a(b bVar) {
            h.e(bVar, "key");
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f6574a;
    }
}
