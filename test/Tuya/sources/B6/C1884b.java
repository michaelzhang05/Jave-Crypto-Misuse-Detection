package b6;

import java.util.Random;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1884b extends AbstractC1883a {

    /* renamed from: c, reason: collision with root package name */
    private final a f14790c = new a();

    /* renamed from: b6.b$a */
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

    @Override // b6.AbstractC1883a
    public Random d() {
        Object obj = this.f14790c.get();
        AbstractC3159y.h(obj, "get(...)");
        return (Random) obj;
    }
}
