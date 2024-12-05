package e6;

import java.util.Random;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2805b extends AbstractC2804a {

    /* renamed from: c, reason: collision with root package name */
    private final a f31796c = new a();

    /* renamed from: e6.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // e6.AbstractC2804a
    public Random d() {
        Object obj = this.f31796c.get();
        AbstractC3255y.h(obj, "get(...)");
        return (Random) obj;
    }
}
