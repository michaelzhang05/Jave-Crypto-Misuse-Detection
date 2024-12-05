package f6;

import e6.AbstractC2804a;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: f6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2844a extends AbstractC2804a {
    @Override // e6.AbstractC2804a
    public Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC3255y.h(current, "current(...)");
        return current;
    }
}
